package semestralka.semestralka.model;

import java.util.ArrayList;
import java.util.List;
/**
 * Represents a player in the Monopoly game.
 */
public class Player {
    /** The name of the player. */
    public String name;
    /** The current position of the player on the game board. */
    public int current_position;
    /** Indicates if the player is in game or not. */
    public boolean active;
    /** The amount of money the player has. */
    private int money;
    /** List of properties owned by the player. */
    public List<PropertyCell> property;
    /** Amount of throw during which the player is in jail. */
    public int inJail;
    /** Number of consecutive times the player rolled doubles. */
    public int count_of_doubles_in_a_row;
    /** The player number int the game. */
    public int number;
    /** Number of "Get Out of Jail Free" cards the player holds. */
    public int card_get_out_of_jail;
    /** X-coordinates, Y-coordinates of the player's token position on the game board. */
    public int[] positionX,positionY;
    /** List of streets numbers owned by the player. */
    public ArrayList<Integer> player_streets;
    /** Indicates if the player is a bot or not. */
    public boolean isBot;
    /** Initial X,Y-coordinates of the player's position on the game board used when tha game was loaded. */
    public int first_positionX,first_positionY;
    /** Indicates if it's the player's turn. */
    public boolean IsHisTurn = false;
    /**
     * Gets the amount of money the player has.
     * @return The amount of money the player has.
     */
    public int getMoney() {
        return money;
    }
    /** Default constructor. */
    public Player()
    {}
    /**
     * Constructor for the Player class.
     * @param name The name of the player.
     * @param n The player number.
     * @param Isbot Indicates if the player is a bot.
     */
    public Player(String name,int n, boolean Isbot)
    {
        player_streets=new ArrayList<>();
        this.name = name;
        money = 1500;
        current_position = 0;
        property = new ArrayList<PropertyCell>();
        active = true;
        inJail = 0;
        count_of_doubles_in_a_row = 0;
        number = n;
        card_get_out_of_jail=0;
        isBot = Isbot;
        positionX = new int[]{327+n*32,468,523,576,630,685,738,792,848,900,951+n*32,951+n*32,951+n*32,951+n*32,951+n*32,951+n*32,951+n*32,951+n*32,951+n*32,951+n*32,951+n*32,900,848,792,738,685,630,576,523,468,327+n*32,327+n*32,327+n*32,327+n*32,327+n*32,327+n*32,327+n*32,327+n*32,327+n*32,327+n*32};
        positionY = new int[]{48+n*32,48+n*32,48+n*32,48+n*32,48+n*32,48+n*32,48+n*32,48+n*32,48+n*32,48+n*32,48+n*32,191,243,300,352,405,457,513,565,617,669+32*n,669+32*n,669+32*n,669+32*n,669+32*n,669+32*n,669+32*n,669+32*n,669+32*n,669+32*n,669+32*n,617,565,513,457,405,352,300,243,191};
        first_positionX=positionX[0];
        first_positionY=positionY[0];
    }
    /**
     * Adds money to the player.
     * @param amount_money The amount of money to add.
     */
    public void AddMoneyToPlayer(int amount_money)
    {
        money += amount_money;
    }
    /**
     * Takes money from the player.
     * @param amount_of_money The amount of money to take.
     */
    public void TakeMoneyFromPlayer(int amount_of_money)
    {
        money-=amount_of_money;
    }
    /**
     * Checks if the player has enough money.
     * @param amount_money The amount of money to check.
     * @return true if the player has enough money, false otherwise.
     */
    public boolean PlayerHasEnoughMoney(int amount_money)
    {
        return money-amount_money>=0;
    }
    /**
     * Adds a property to the player.
     * @param pr The property to add.
     */
    public void AddProperty(PropertyCell pr)
    {
        property.add(pr);
       if (pr instanceof Avenue)
       {
           int street = pr.number_of_street;
           int count1 = 0;
           for (int i = 0; i < property.size(); i++) {
               if (property.get(i).number_of_street == street) {
                   count1++;
               }
           }
           if ((pr.number_of_street==8||pr.number_of_street==1)&&count1==2)
               player_streets.add(street);
           if (pr.number_of_street!=8&&pr.number_of_street!=1&&count1==3)
               player_streets.add(street);
       }
    }
    /**
     * Removes a property from the player.
     * @param pr The property to remove.
     */
    public void RemoveProperty(PropertyCell pr)
    {
        if (pr instanceof Avenue)
        {
            int street = pr.number_of_street;
            if (player_streets.contains(street))
                player_streets.remove(street);
        }
        property.remove(pr);
    }
    /**
     * Checks if the player is active.
     * @return true if the player is active, false otherwise.
     */
    public boolean isActive() {
        return active;
    }
    /**
     * Compares the player's possessions with a given price.
     * @param price The price to compare with.
     * @return true if the player's possessions are greater or equal to the price, false otherwise.
     */
    public boolean ComparePlayersPossessions(int price)
    {
        int sum = money;
        for (int i = 0; i < property.size(); i++) {
            if(!property.get(i).isPledged)
            {
                if(property.get(i) instanceof Avenue)
                {
                    sum+=((Avenue)property.get(i)).level_of_property*((Avenue)property.get(i)).price_of_building;
                }
                sum+= (int) (property.get(i).price_of_buying*0.5);
            }
        }
        return sum>=price;
    }
    /**
     * Retrieves name of the player.
     *
     * @return Name of the player.
     */
    public String getName() {
        return name;
    }
}