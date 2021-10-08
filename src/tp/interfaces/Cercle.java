package tp.interfaces;

public class Cercle implements ObjetGeometrique {

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
     * Méthode pour calculer le périmètre
     *
     * @return périmètre
     */
    @Override
    public double perimetre() {
        return 2 * 3.14 * rayon;
    }

    /**
     * Méthode pour calculer la surface
     *
     * @return surface
     */
    @Override
    public double surface() {
        double perimetre = this.perimetre();
        return perimetre / 3.14;
    }

    /**
     * Méthode toString
     *
     * @return String
     */
    @Override
    public String toString() {
        return "Le cercle a un rayon de " + rayon + ", son périmetre est donc de : " + this.perimetre() + " et sa surface est de : " + this.surface();
    }
}
