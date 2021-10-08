package fr.diginamic.banque.entites;

public class Credit extends Operation{
    /**
     * Constructeur
     * @param dateOperation
     * @param montantOperation
     */
    public Credit(String dateOperation, int montantOperation) {
        super(dateOperation, montantOperation);
    }

    /**
     * Méthode pour afficher le type CREDIT
     *
     * @return String
     */
    @Override
   public String getType() {
        return super.getType() + "CREDIT";
    }
}
