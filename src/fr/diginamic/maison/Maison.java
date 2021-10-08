package fr.diginamic.maison;

/**
 * TP - Autonomie - Exercice Immobilier
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 08/10/2021
 */
public class Maison {
    /**
     * Attributs
     */
    private Piece[] pieces = {};

    /**
     * Méthode pour ajouter un élément au tableau pièces
     *
     * @param piece
     */
    public void ajouterPiece(Piece piece) {
        int taille;
        if (piece == null || piece.superficie < 0 || piece.etage < 0) {
            System.out.println("Les valeurs ne peuvent pas être négatives ou null");
        } else {
            taille = this.pieces.length;
            pieces = ajouterValeur(taille, pieces, piece);
        }
    }

    /**
     * Obtenir la superficie totale des pièces d'une maison
     *
     * @return superficie totale
     */
    public double getSuperficieTotale() {
        double somme = 0;
        for (Piece piece : pieces) {
            somme += piece.superficie;
        }
        return somme;
    }

    /**
     * Obtenir la superficie d'un étage donné en paramètre
     *
     * @param etage
     * @return superficie d'un étage
     */
    public double getSuperficieEtage(int etage) {
        double somme = 0;
        for (Piece piece : pieces) {
            if (piece.etage == etage) {
                somme += piece.superficie;
            }
        }
        return somme;
    }

    /**
     * Méthode qui permet de calculer la superficie totale par type de pièces
     *
     * @param pieceType
     * @return superficie par type
     */
    public double getSuperficieType(Piece pieceType) {
        double somme = 0;
        String type = pieceType.getClass().getSimpleName();
        for (Piece piece : pieces) {
            if (piece.getClass().getSimpleName().equals(type)) {
                somme += piece.superficie;
            }
        }
        return somme;
    }

    /**
     * Obtenir le nombre de pièces du même type existants
     *
     * @param pieceType
     * @return nombres de pièces du même type
     */
    public int getNombrePieceType(Piece pieceType) {
        int somme = 0;
        String type = pieceType.getClass().getSimpleName();
        for (Piece piece : pieces) {
            if (piece.getClass().getSimpleName().equals(type)) {
                somme += 1;
            }
        }
        return somme;
    }

    /**
     * Méthode pour agrandir un tableau au fur et à mesure que l'on ajoute des éléments.
     *
     * @param taille
     * @param vieuxTableau
     * @param valeurAjout
     * @return tableau agrandi
     */
    private static Piece[] ajouterValeur(int taille, Piece[] vieuxTableau, Piece valeurAjout) {
        int i;

        Piece[] nouveauTableau = new Piece[taille + 1];

        for (i = 0; i < taille; i++)
            nouveauTableau[i] = vieuxTableau[i];
        nouveauTableau[taille] = valeurAjout;

        return nouveauTableau;
    }
}
