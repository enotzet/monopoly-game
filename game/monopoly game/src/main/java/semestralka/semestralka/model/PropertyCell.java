package semestralka.semestralka.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Represents a property cell in the Monopoly game.
 * Extends the Cell class.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PropertyCell extends Cell {

    /** The owner of the property. */
    @JsonIgnore
    public Player owner;

    /** The price of buying the property. */
    public int price_of_buying;

    /** The array of rent prices for the property at different levels. */
    public int[] price_of_rent;

    /** The number of the street where the property is located. */
    public int number_of_street;

    /** The level of development of the property. */
    public int level_of_property;

    /** Indicates if the property is pledged or not. */
    public boolean isPledged = false;

    /** Default constructor. */
    public PropertyCell() {}
    /**
     * Retrieves the level of property cell.
     *
     * @return The level of property cell.
     */

    public int getLevel_of_property() {
        return level_of_property;
    }
}
