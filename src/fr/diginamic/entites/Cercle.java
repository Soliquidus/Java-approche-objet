package fr.diginamic.entites;

/**
 * TP - Autonomie - Exercice cercle
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 07/10/2021
 */
public class Cercle {
    /**
     * Attributs
     */
    double rayon;

    /**
     * Constructeur
     *
     * @param rayon
     */
    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    /**
     * Méthode pour retourner le périmètre
     *
     * @return perimetre
     */
    public double perimetre() {
        return 2 * 3.14 * rayon;
    }

    public double surface() {
        double perimetre = this.perimetre();
        return perimetre / 3.14;
    }

    /**
     * Méthode toString
     *
     * @return String
     */
    public String toString() {
        return "Le cercle a un rayon de " + rayon + ", son périmetre est donc de : " + this.perimetre() + " et sa surface est de : " + this.surface();
    }
}
