package fr.diginamic.banque.entites;

/**
 * Classe qui représente l'entité Compte
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 07/10/2021
 */

public class Compte {
    /**
     * Attributs
     */
    private long numeroCompte;
    private int soldeCompte;

    /**
     * Constructeur
     *
     * @param numeroCompte
     * @param soldeCompte
     */
    public Compte(long numeroCompte, int soldeCompte) {
        this.numeroCompte = numeroCompte;
        this.soldeCompte = soldeCompte;
    }

    /**
     * Méthode toString
     *
     * @return String
     */
    @Override
    public String toString() {
        return "Compte : " +
                "numeroCompte = " + numeroCompte +
                ", soldeCompte = " + soldeCompte;
    }
}
