package tp.interfaces;

public class Cercle implements ObjetGeometrique {
    double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double perimetre() {
        return 2 * 3.14 * rayon;
    }

    @Override
    public double surface() {
        double perimetre = this.perimetre();
        return perimetre / 3.14;
    }

    @Override
    public String toString() {
        return "Le cercle a un rayon de " + rayon + ", son périmetre est donc de : " + this.perimetre() + " et sa surface est de : " + this.surface();
    }
}
