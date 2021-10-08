package tp.interfaces;

public class Rectangle implements ObjetGeometrique {

    /**
     * Attributs
     */
    int longueur, largeur;

    /**
     * Constructeur
     * @param longueur
     * @param largeur
     */
    public Rectangle(int longueur, int largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    /**
     * Méthode pour calculer le périmètre
     * @return périmètre
     */
    @Override
    public double perimetre() {
        return 2 * (longueur + largeur);
    }

    /**
     * Méthode pour calculer la surface
     *
     * @return surface
     */
    @Override
    public double surface() {
        return longueur*largeur;
    }

    /**
     * Méthode toString
     * @return String
     */
    @Override
    public String toString() {
        return "Le rectangle a une longueur/largeur de " + longueur + "/" + largeur + ", son périmetre est donc de : " + this.perimetre() + " et sa surface est de : " + this.surface();
    }
}
