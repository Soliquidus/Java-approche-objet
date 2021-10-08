package fr.diginamic.formes;

/**
 * TP - Autonomie - Exercice Forme
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 07/10/2021
 */
public class Rectangle extends Forme {

    /**
     * Attributs
     */
    private double longueur;
    private double largeur;

    /**
     * Constructeur
     *
     * @param longueur
     * @param largeur
     */
    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    /**
     * Constructeur vide
     */
    public Rectangle() {
    }

    /**
     * Méthode pour calculer le périmètre
     *
     * @return périmètre
     */
    @Override
    public double calculerPerimetre() {
        return 2 * (longueur + largeur);
    }

    /**
     * Méthode pour calculer la surface
     *
     * @return surface
     */
    @Override
    public double calculerSurface() {
        return longueur * largeur;
    }
}
