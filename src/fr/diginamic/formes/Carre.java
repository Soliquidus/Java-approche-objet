package fr.diginamic.formes;

/**
 * TP - Autonomie - Exercice Forme
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 08/10/2021
 */
public class Carre extends Rectangle {
    /**
     * Attributs
     */
    private double longueur;

    /**
     * Constructeur
     *
     * @param longueur
     */
    public Carre(double longueur) {
        this.longueur = longueur;
    }

    /**
     * Méthode pour calculer le périmètre
     *
     * @return périmètre
     */
    @Override
    public double calculerPerimetre() {
        return this.longueur * 4;
    }

    /**
     * Méthode pour calculer la surface
     *
     * @return surface
     */
    @Override
    public double calculerSurface() {
        return longueur * longueur;
    }
}
