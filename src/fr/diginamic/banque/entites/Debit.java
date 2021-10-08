package fr.diginamic.banque.entites;

public class Debit extends Operation {
    /**
     * Constructeur
     *
     * @param dateOperation
     * @param montantOperation
     */
    public Debit(String dateOperation, int montantOperation) {
        super(dateOperation, montantOperation);
    }

    /**
     * Méthode pour afficher le type DEBIT
     *
     * @return String
     */
    @Override
    public String getType() {
        return super.getType() + "DEBIT";
    }
}
