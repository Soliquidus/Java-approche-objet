package fr.diginamic.banque.entites;

/**
 * Classe qui représente l'entité Compte
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 07/10/2021
 */

public class Compte {
    //Variables
    private long numeroCompte;
    private int soldeCompte;

    //Constructeurs
    public Compte(long numeroCompte, int soldeCompte) {
        this.numeroCompte = numeroCompte;
        this.soldeCompte = soldeCompte;
    }
}
