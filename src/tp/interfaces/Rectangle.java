package tp.interfaces;

public class Rectangle implements ObjetGeometrique {
    int longueur, largeur;

    public Rectangle(int longueur, int largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    public double perimetre() {
        return 2 * (longueur + largeur);
    }

    @Override
    public double surface() {
        return longueur*largeur;
    }

    @Override
    public String toString() {
        return "Le rectangle a une longueur/largeur de " + longueur + "/" + largeur + ", son périmetre est donc de : " + this.perimetre() + " et sa surface est de : " + this.surface();
    }
}
