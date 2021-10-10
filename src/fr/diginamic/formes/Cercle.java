package fr.diginamic.formes;

/**
 * TP - Autonomie - Exercice Forme
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 08/10/2021
 */
public class Cercle extends Forme {
    private double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    /**
     * Méthode pour calculer le périmètre
     *
     * @return périmètre
     */
    @Override
    public double calculerPerimetre() {
        return 2 * 3.14 * rayon;
    }

    /**
     * Méthode pour calculer la surface
     *
     * @return surface
     */
    @Override
    public double calculerSurface() {
        double perimetre = this.calculerPerimetre();
        return perimetre / 3.14;
    }
}
