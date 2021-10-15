package maps;
/**
 * TP 12 - Apprendre à utiliser Map et HashMap
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 14/10/2021
 */
public class Pays {
    /**
     * Attributs
     */
    private String nom;
    private long habitants;
    private String continent;

    /**
     * Constructeur
     * @param nom
     * @param habitants
     * @param continent
     */
    public Pays(String nom,long habitants, String continent) {
        this.nom = nom;
        this.habitants = habitants;
        this.continent = continent;
    }

    /**
     * Getter de nom
     * @return nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter de nom
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Getter de habitants
     * @return habitants
     */
    public long getHabitants() {
        return habitants;
    }

    /**
     * Setter de habitants
     * @param habitants
     */
    public void setHabitants(long habitants) {
        this.habitants = habitants;
    }

    /**
     * Getter de continent
     * @return continent
     */
    public String getContinent() {
        return continent;
    }

    /**
     * Setter de continent
     * @param continent
     */
    public void setContinent(String continent) {
        this.continent = continent;
    }
}
