package fr.diginamic.recensement;

/**
 * TP Autonomie - Exercice Recensement Population
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 14 /10/2021
 */
public class Ville {
    private int code;
    private String nom;
    private int population;
    private Departement departement;

    /**
     * Instantiates a new Ville.
     *
     * @param code        the code
     * @param nom         the nom
     * @param population  the population
     * @param departement the departement
     */
    public Ville(int code, String nom, int population, Departement departement) {
        this.code = code;
        this.nom = nom;
        this.population = population;
        this.departement = departement;
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

    /**
     * Gets population.
     *
     * @return the population
     */
    public int getPopulation() {
        return population;
    }

    /**
     * Sets population.
     *
     * @param population the population
     */
    public void setPopulation(int population) {
        this.population = population;
    }

    /**
     * Gets departement.
     *
     * @return the departement
     */
    public Departement getDepartement() {
        return departement;
    }

    /**
     * Sets departement.
     *
     * @param departement the departement
     */
    public void setDepartement(Departement departement) {
        this.departement = departement;
    }
}
