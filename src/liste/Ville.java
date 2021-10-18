package liste;

import fr.diginamic.testenumeration.Continent;

/**
 * TP 10 - Apprendre à utiliser List et ArrayList
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 13 /10/2021
 */
public class Ville implements Comparable<Ville> {
//    Exercice 5
//    Se référer à la classe TestVille pour le côté fonctionnel
    /**
     * Attributs
     */
    String nom;
    /**
     * The Habitants.
     */
    int habitants;

    //TP - Les Enumerations
    /**
     * The continent.
     */
    Continent continent;

    /**
     * Constructeur
     *
     * @param nom       the nom
     * @param habitants the habitants
     */
    public Ville(String nom, int habitants, Continent continent) {
        this.nom = nom;
        this.habitants = habitants;
        this.continent = continent;
    }

    /**
     * Getter de nom
     *
     * @return nom nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter de nom
     *
     * @param nom the nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Getter de habitants
     *
     * @return habitants habitants
     */
    public int getHabitants() {
        return habitants;
    }

    /**
     * Setter de habitants
     *
     * @param habitants the habitants
     */
    public void setHabitants(int habitants) {
        this.habitants = habitants;
    }

    /**
     * Méthode hérité de l'interface Comparable et adapté à l'exercice 5
     *
     * @param ville
     * @return triAscendant
     */
    @Override
    public int compareTo(Ville ville) {
        int compareHabitants = ((Ville) ville).getHabitants();
        return this.habitants - compareHabitants;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    @Override
    public String toString() {
        return "Ville : " + nom + ", habitants : " + habitants + ", continent : " + continent + ".";
    }

    //TP - Apprendre à redéfinir EQUALS

    /**
     * Méthode hérité de equals qui permet de vérifier si deux instances de Ville ont les mêmes attributs.
     * @param objet
     * @return
     */
    @Override
    public boolean equals(Object objet) {
        if (!(objet instanceof Ville)) {
            return false;
        }
        Ville autreObjet = (Ville) objet;
        return nom.equals(autreObjet.getNom()) && habitants == autreObjet.getHabitants();
    }
}
