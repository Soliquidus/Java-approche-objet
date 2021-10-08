package fr.diginamic.entites;

/**
 * TP - Autonomie - Exercice ManipulationChaine
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 08/10/2021
 */
public class Salarie {

    /**
     * Attributs
     */
    public String nom;
    public String prenom;
    public double salaire;

    /**
     * Constructeur
     *
     * @param nom
     * @param prenom
     * @param salaire
     */
    public Salarie(String nom, String prenom, double salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
    }
}
