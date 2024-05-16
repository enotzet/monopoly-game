package semestralka.semestralka.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 * Represents an Avenue property cell in the Monopoly game.
 * Extends the PropertyCell class.
 */
public class Avenue extends PropertyCell {

    /** The price of building a house on this Avenue. */
    public int price_of_building;

    /** Array of Rectangles representing houses on this Avenue. */
    @JsonIgnore
    public Rectangle[] houses;

    /**
     * Constructor for the Avenue class.
     *
     * @param name The name of the Avenue.
     * @param price_of_buying The price of buying the Avenue.
     * @param price_of_rent An array containing the prices of rent for different levels of property.
     * @param number_of_street The number of the street.
     * @param price_of_building The price of building a house on this Avenue.
     */
    public Avenue(String name, int price_of_buying, int[] price_of_rent, int number_of_street, int price_of_building) {
        name_of_cell = name;
        level_of_property = 0;
        this.owner = null;
        this.price_of_buying = price_of_buying;
        this.price_of_rent = price_of_rent;
        this.number_of_street = number_of_street;
        this.price_of_building = price_of_building;
        SetHouses();
    }

    /**
     * Initializes the array of rectangles representing houses on this Avenue.
     * Sets properties of each rectangle.
     */
    public void SetHouses() {
        Rectangle rectangle = new Rectangle();
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle();
        Rectangle rectangle3 = new Rectangle();
        Rectangle rectangle4 = new Rectangle();
        houses = new Rectangle[]{rectangle, rectangle1, rectangle2, rectangle3, rectangle4};
        for (int i = 0; i < houses.length; i++) {
            houses[i].setFill(Color.YELLOW);
            houses[i].setWidth(10);
            houses[i].setHeight(10);
            houses[i].setVisible(false);
        }
    }

    /**
     * Retrieves the name of the cell.
     *
     * @return The name of the Avenue.
     */
    public String getName_of_cell() {
        return name_of_cell;
    }

    /**
     * Retrieves the price of building a house on this Avenue.
     *
     * @return The price of building a house on this Avenue.
     */
    public int getPrice_of_building() {
        return price_of_building;
    }
}
