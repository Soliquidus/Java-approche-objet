package fr.diginamic.formes;
/**
 * TP - Autonomie - Exercice Forme
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 08/10/2021
 */
public class Carre extends Rectangle {
    private double longueur;

    public Carre(double longueur) {
        this.longueur = longueur;
    }

    @Override
    public double calculerPerimetre() {
        return this.longueur * 4;
    }

    @Override
    public double calculerSurface() {
        return longueur * longueur;
    }
}
