package fr.diginamic.formes;
/**
 * TP - Autonomie - Exercice Forme
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 07/10/2021
 */
public class Rectangle extends Forme{

    private double longueur;
    private double largeur;

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public Rectangle() {
    }

    @Override
    public double calculerPerimetre() {
        return 2 * (longueur + largeur);
    }

    @Override
    public double calculerSurface() {
        return longueur*largeur;
    }
}
