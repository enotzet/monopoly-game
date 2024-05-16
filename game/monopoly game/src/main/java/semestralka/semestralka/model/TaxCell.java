package semestralka.semestralka.model;

/**
 * Represents a Tax Cell in the Monopoly game.
 * Extends the Cell class.
 */
public class TaxCell extends Cell {

    /**
     * Constructor for the TaxCell class.
     * Initializes the name_of_cell property.
     * @param name The name of the tax cell.
     */
    public TaxCell(String name) {
        name_of_cell = name;
    }
}
