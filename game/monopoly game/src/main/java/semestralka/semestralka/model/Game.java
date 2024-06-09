package semestralka.semestralka.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
/**
 * Represents the game state of Monopoly.
 */
public class Game{
    /** List of players participating in the game. */
    public ArrayList<Player> players;
    /** Number of active players in the game. */
    public int count_of_active_players;
    /** The game board. */
    public GameBoard game_board;
    /** The pair of dice used in the game. */
    public Dices dices;
    /** The total number of players in the game. */
    public static int number_of_players;
    /** Singleton instance of the Game class. */
    private static Game instance;
    /** Indicates whether the game is loaded. */
    public static boolean IsGameLoaded;
    /**
     * Sets the value of IsGameLoaded.
     *
     * @param isGameLoaded Boolean value indicating if the game is loaded.
     */
    public void setIsGameLoaded(boolean isGameLoaded) {
        IsGameLoaded = isGameLoaded;
    }
    /**
     * Gets the value of IsGameLoaded.
     *
     * @return Boolean value indicating if the game is loaded.
     */
    public boolean getIsGameLoaded() {
        return IsGameLoaded;
    }
    /**
     * Retrieves the singleton instance of the Game class.
     *
     * @return The singleton instance of the Game class.
     */
    public static Game getInstance() {
        if (instance == null) {
            instance = new Game();
        }
        return instance;
    }
    /**
     * Default constructor for the Game class.
     */
    public  Game() {}

    /**
     * Sets the number of players in the game.
     *
     * @param numberOfPlayers The number of players in the game.
     */
    public void setNumberOfPlayers(int numberOfPlayers) {
        this.number_of_players = numberOfPlayers;
    }
    /**
     * Gets the number of players in the game.
     *
     * @return The number of players in the game.
     */
    public int getNumberOfPlayers() {
        return number_of_players;
    }
    /**
     * Constructor for the Game class with players used when the game is loaded.
     *
     * @param pls The list of players.
     */
    public Game(ArrayList<Player> pls)
    {
        dices = new Dices();
        game_board = new GameBoard();
        players = pls;
        count_of_active_players = 0;
        for (int i = 0; i < players.size(); i++) {
            if (players.get(i).isActive())
                count_of_active_players++;
        }
    }
    /**
     * Constructor for the Game class with number of real players and their names.
     *
     * @param number_of_real_players The number of real players.
     * @param names The list of player names.
     */
    public Game(int number_of_real_players, ArrayList<String> names) {
        dices = new Dices();
        game_board = new GameBoard();
        players = new ArrayList<Player>();
        if (number_of_real_players == 1) {
            Player p;
            for (int i = 0; i < number_of_real_players; i++) {
                p = new Player(names.get(i),i,false);
                players.add(p);
            }
            if (Objects.equals(names.get(0), "Bob"))
                p = new Player("Edward",1, true);
            else
                p = new Player("Bob",1, true);
            players.add(p);
            if (Objects.equals(names.get(0), "John"))
                p = new Player("Edward",2, true);
            else
                p = new Player("John",2, true);
            players.add(p);
            if (Objects.equals(names.get(0), "Steve"))
                p = new Player("Edward",3,true);
            else
                p = new Player("Steve",3, true);
            players.add(p);
            count_of_active_players = 4;
        }
        else
        {
            Player p;
            count_of_active_players = number_of_real_players;
            for (int i = 0; i < number_of_real_players; i++) {
                p = new Player(names.get(i),i,false);
                players.add(p);
            }
        }
    }
}