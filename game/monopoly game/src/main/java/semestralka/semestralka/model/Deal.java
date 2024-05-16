package semestralka.semestralka.model;

import java.util.ArrayList;

/**
 * Represents a deal context between two players in the Monopoly game.
 */
public class Deal {

    /** The deal sender. */
    public Player player1;

    /** The deal receiver. */
    public Player player2;

    /** List of properties offered by player1 in the deal. */
    public ArrayList<PropertyCell> property1;

    /** List of properties offered by player2 in the deal. */
    public ArrayList<PropertyCell> property2;

    /** The amount of money offered by player1 in the deal. */
    public int money1;

    /** The amount of money offered by player2 in the deal. */
    public int money2;

    /**
     * Constructor for the Deal class.
     *
     * @param player1 The first player involved in the deal.
     * @param player2 The second player involved in the deal.
     */
    public Deal(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        property1 = new ArrayList<>();
        property2 = new ArrayList<>();
        money1 = 0;
        money2 = 0;
    }

    /**
     * Checks if the deal is profitable for the receiver.
     *
     * @return true if the deal is profitable, false otherwise.
     */
    public boolean IsDealProfitable() {
        int sum1 = money1;
        int sum2 = money2;

        for (int i = 0; i < property1.size(); i++) {
            if (property1.get(i).isPledged)
                sum1 += property1.get(i).price_of_buying * 0.5;
            else
                sum1 += property1.get(i).price_of_buying;
        }

        for (int i = 0; i < property2.size(); i++) {
            if (property2.get(i).isPledged)
                sum2 += property2.get(i).price_of_buying * 0.5;
            else
                sum2 += property2.get(i).price_of_buying;
        }

        return sum2 <= sum1;
    }
}
