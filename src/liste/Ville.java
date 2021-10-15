package liste;

/**
 * TP 10 - Apprendre à utiliser List et ArrayList
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 13/10/2021
 */
public class Ville implements Comparable{
//    Exercice 5
//    Se référer à la classe TestVille pour le côté fonctionnel
    /**
     * Attributs
     */
    String nom;
    int habitants;

    /**
     * Constructeur
     * @param nom
     * @param habitants
     */
    public Ville(String nom, int habitants) {
        this.nom = nom;
        this.habitants = habitants;
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
    public int getHabitants() {
        return habitants;
    }

    /**
     * Setter de habitants
     * @param habitants
     */
    public void setHabitants(int habitants) {
        this.habitants = habitants;
    }

    /**
     * Méthode hérité de l'interface Comparable et adapté à l'exercice 5
     * @param ville
     * @return triAscendant
     */
    @Override
    public int compareTo(Object ville) {
        int compareHabitants = ((Ville)ville).getHabitants();
        return this.habitants-compareHabitants;
    }
}
