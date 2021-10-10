package fr.diginamic.operations;

/**
 * TP - Autonomie - Exercice CalculMoyenne
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 07/10/2021
 */
public class CalculMoyenne {

    /**
     * Attributs
     */
    public double[] tableau;

    /**
     * Constructeur
     *
     * @param tableau
     */
    public CalculMoyenne(double[] tableau) {
        this.tableau = tableau;
    }

    /**
     * Méthode pour ajouter une valeur au tableau qui s'agrandit au fur et à mesure.
     *
     * @param chiffre
     * @return tableau
     */
    public double[] ajout(double chiffre) {
        int taille;

        taille = this.tableau.length;
        tableau = ajouterValeur(taille, tableau, chiffre);
        return tableau;
    }

    /**
     * Méthode pour calculer la moyenne des éléments d'un tableau
     *
     * @return somme
     */
    public double calcul() {
        double somme = 0;
        for (double valeur : this.tableau) {
            somme += valeur;
        }
        return somme / this.tableau.length;
    }

    /**
     * Méthode pour agrandir un tableau dès l'entrée de nouvelles données.
     *
     * @param taille
     * @param vieuxTableau
     * @param valeurAjout
     * @return tableauAgrandi
     */
    private static double[] ajouterValeur(int taille, double[] vieuxTableau, double valeurAjout) {
        int i;

        double[] nouveauTableau = new double[taille + 1];

        for (i = 0; i < taille; i++)
            nouveauTableau[i] = vieuxTableau[i];
        nouveauTableau[taille] = valeurAjout;

        return nouveauTableau;
    }
}
