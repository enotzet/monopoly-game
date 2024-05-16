package semestralka.semestralka.model;

import java.util.ArrayList;

/**
 * Represents the information of players to be saved.
 */
public class PlayersInfoToSave {
    /** List of players. */
    public ArrayList<Player> players = new ArrayList<>();
    /** Default constructor. */
    public PlayersInfoToSave()
    {
    }
    /**
     * Constructor for the PlayersInfoToSave class.
     * @param players The list of players to save.
     */
    public PlayersInfoToSave(ArrayList<Player> players) {
        this.players = players;
    }
}
