package semestralka.semestralka.model;

import java.util.Random;
/**
 * Represents a pair of dices used in the Monopoly game.
 */
public class Dices{
    /** The value of the first dice. */

    public int dice1;
    /** The value of the second dice. */
    public int dice2;
    /**
     * Simulates throwing the dice.
     * Generates random values for both dice between 1 and 6 (inclusive).
     */
    public void ThrowDices()
    {
        Random rand = new Random();
        dice1 = rand.nextInt(1,7);
        dice2 = rand.nextInt(1,7);
    }
}
