package semestralka.semestralka.model;

import java.util.Random;

/**
 * Represents a Chance card in the Monopoly game.
 * Extends the Cell class.
 */
public class ChanceCard extends Cell{
    /**
     * Constructor for the ChanceCard class.
     * Initializes the name_of_cell property to "Chance".
     */
    public ChanceCard() {
        name_of_cell = "Chance";
    }
    /**The descriptions of all chance cards*/
    String[] script = new String[]{
            "Advance to Start (Collect 200$)", "Advance to Ventor Avenue. If you pass Start, collect 200$",
            "Advance to Boardwalk", "Advance to St. James place. If you pass Start, collect 200$",
            "Advance to the nearest Station. If unowned, you may buy it from the Bank",
            "Advance to the nearest Community service. If unowned, you may buy it from the Bank. If owned, throw dice and pay owner a total ten times amount thrown",
            "Advance to nearest Tax Cell and pay taxes.", "Bank pays you dividend of 50$",
            "Get Out of Jail Free", "Go Back 3 Spaces", "Go to Jail. Go directly to Jail, do not pass Go, do not collect $200",
            "Make general repairs on all your property. For each house pay $25. For each hotel pay $100", "Speeding fine $15",
            "Take a trip to Reading station. If you pass Go, collect $200", "You have been elected Chairman of the Board. Pay $150 to a random player",
            "Your building loan matures. You get $150"
    };

    /**
     * Gets the chance card script based on the provided index.
     *
     * @param i The index of the chance card script to retrieve.
     * @return The chance card script.
     */
    public String getChanceCard(int i)
    {
        return script[i];
    }
}
