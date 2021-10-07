package fr.diginamic.operations;

/**
 * TP - Autonomie - Exercice CalculMoyenne
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 07/10/2021
 */
public class CalculMoyenne {
    public double[] tableau;

    public CalculMoyenne(double[] tableau) {
        this.tableau = tableau;
    }

    //Ajoute une valeur au tableau qui s'agrandit au fur et à mesure.
    public double[] ajout(double chiffre) {
        int taille;

        taille = this.tableau.length;
        tableau = ajouterValeur(taille, tableau, chiffre);
        return tableau;
    }

    //Calcule la moyenne du tableau.
    public double calcul() {
        double somme = 0;
        for (double valeur : this.tableau) {
            somme += valeur;
        }
        return somme / this.tableau.length;
    }

    //Méthode pour agrandir un tableau dès l'entrée de nouvelles données.
    private static double[] ajouterValeur(int taille, double[] vieuxTableau, double valeurAjout) {
        int i;

        double[] nouveauTableau = new double[taille + 1];

        for (i = 0; i < taille; i++)
            nouveauTableau[i] = vieuxTableau[i];
        nouveauTableau[taille] = valeurAjout;

        return nouveauTableau;
    }
}
