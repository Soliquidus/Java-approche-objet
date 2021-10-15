package fr.diginamic.recensement;

/**
 * TP Autonomie - Exercice Recensement Population
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 14 /10/2021
 */
public class Departement {
    private String code;
    private Region region;

    /**
     * Instantiates a new Departement.
     *
     * @param code   the code
     * @param region the region
     */
    public Departement(String code, Region region) {
        this.code = code;
        this.region = region;
    }

    /**
     * Gets code.
     *
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets code.
     *
     * @param code the code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Gets region.
     *
     * @return the region
     */
    public Region getRegion() {
        return region;
    }

    /**
     * Sets region.
     *
     * @param region the region
     */
    public void setRegion(Region region) {
        this.region = region;
    }
}