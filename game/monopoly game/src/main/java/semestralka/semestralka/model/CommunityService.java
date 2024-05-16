    package semestralka.semestralka.model;

    /**
     * Represents a Community Service property cell in the Monopoly game.
     * Extends the PropertyCell class.
     */
    public class CommunityService extends PropertyCell{

        /**
         * Constructor for the CommunityService class.
         *
         * @param name The name of the Community Service.
         * @param price_of_buying The price of buying the Community Service.
         * @param price_of_rent An array containing the prices of rent for different levels of property.
         * @param number_of_street The number of the street.
         */
        public CommunityService(String name, int price_of_buying, int[] price_of_rent, int number_of_street) {
            name_of_cell = name;
            level_of_property = 0;
            this.owner = null;
            this.price_of_buying = price_of_buying;
            this.price_of_rent = price_of_rent;
            this.number_of_street = number_of_street;
        }
    }
