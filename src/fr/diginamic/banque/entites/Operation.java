package fr.diginamic.banque.entites;

/**
 * Classe abstraite qui représente les bases d'une opération bancaire
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 07/10/2021
 */

public abstract class Operation {
    /**
     * Attributs
     */
    public String dateOperation;
    public int montantOperation;

    /**
     * Constructeur
     *
     * @param dateOperation
     * @param montantOperation
     */
    public Operation(String dateOperation, int montantOperation) {
        this.dateOperation = dateOperation;
        this.montantOperation = montantOperation;
    }

    /**
     * Méthode par défaut de retour de type
     *
     * @return String
     */
    public String getType() {
        return ", Type : ";
    }

    /**
     * Méthode toString
     *
     * @return String
     */
    @Override
    public String toString() {
        return "DateOperation = " + dateOperation +
                ", montantOperation = " + montantOperation;
    }
}
