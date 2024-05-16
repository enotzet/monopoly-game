package semestralka.semestralka.model;

/**
 * Represents a Station property in the Monopoly game.
 * Extends the PropertyCell class.
 */
public class Station extends PropertyCell {

    /**
     * Constructor for the Station class.
     * Initializes the properties of the station.
     * @param name The name of the station.
     * @param price_of_buying The price of buying the station.
     * @param price_of_rent The array of rent prices for the station.
     * @param number_of_street The number of the street where the station is located.
     */
    public Station(String name, int price_of_buying, int[] price_of_rent, int number_of_street) {
        name_of_cell = name;
        level_of_property = 0;
        this.owner = null;
        this.price_of_buying = price_of_buying;
        this.price_of_rent = price_of_rent;
        this.number_of_street = number_of_street;
    }

}
