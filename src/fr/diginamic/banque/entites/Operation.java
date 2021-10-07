package fr.diginamic.banque.entites;

/**
 * Classe abstraite qui représente les bases d'une opération bancaire
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 07/10/2021
 */

public abstract class Operation {
    //Variables
    public String dateOperation;
    public int montantOperation;

    //Constructeurs
    public Operation(String dateOperation, int montantOperation) {
        this.dateOperation = dateOperation;
        this.montantOperation = montantOperation;
    }

    public String getType(){
        return ", Type : ";
    }

    @Override
    public String toString() {
        return "DateOperation = " + dateOperation +
                ", montantOperation = " + montantOperation;
    }
}
