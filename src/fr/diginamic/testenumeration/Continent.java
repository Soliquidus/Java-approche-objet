package fr.diginamic.testenumeration;

/**
 * TP 3 - Les Enumerations
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 18 /10/2021
 */
public enum Continent {

    EUROPE("Europe"),
    AFRIQUE("Afrique"),
    AMERIQUE("Amérique"),
    ASIE("Asie"),
    OCEANIE("Océanie");

    private String continent;

    Continent(String continent) {
        this.continent = continent;
    }

    /**
     * Gets continent.
     *
     * @return the continent
     */
    public String getContinent() {
        return continent;
    }

    /**
     * Sets continent.
     *
     * @param continent the continent
     */
    public void setContinent(String continent) {
        this.continent = continent;
    }
}
