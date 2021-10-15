package fr.diginamic.recensement;

/**
 * TP Autonomie - Exercice Recensement Population
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 14 /10/2021
 */
public class Region {
    private int code;
    private String nom;

    /**
     * Instantiates a new Region.
     *
     * @param code the code
     * @param nom  the nom
     */
    public Region(int code, String nom) {
        this.code = code;
        this.nom = nom;
    }

    /**
     * Gets code.
     *
     * @return the code
     */
    public int getCode() {
        return code;
    }

    /**
     * Sets code.
     *
     * @param code the code
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * Gets nom.
     *
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Sets nom.
     *
     * @param nom the nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
}