package semestralka.semestralka.model;

/**
 * Represents a Community Chest card in the Monopoly game.
 * Extends the Cell class.
 */
public class CommunityChest extends Cell{
    /**
     * Constructor for the CommunityChest class.
     * Initializes the name_of_cell property to "Community Chest".
     */
    public CommunityChest() {
        name_of_cell = "Community Chest";
    }
    /**The description of all Communitychest cards*/
    String[] script = new String[]{
            "Advance to Start (Collect $200)", "Bank error in your favor. Collect $200",
            "From sale of stock you get $50", "Get Out of Jail for free", "Go to Jail. Go directly to jail, do not pass Go, do not collect $200",
            "Holiday fund matures. Receive $100", "Income tax refund. Collect $20", "It is your birthday. Collect 30$",
            "Life insurance matures. Collect $100", "Pay hospital fees of $100", "Doctor’s fee. Pay $50", "Pay school fees of $50", "Receive $25 consultancy fee",
            "You are assessed for street repair. $40 per house. $115 per hotel", "You have won second prize in a beauty contest. Collect $10",
            "You inherit $100"
    };
    /**
     * Gets the Community Chest card script based on the provided index.
     *
     * @param n The index of the Community Chest card script to retrieve.
     * @return The Community Chest card script.
     */
    public String getCommunityChestCard(int n)
    {
        return script[n];
    }
}
