package fr.diginamic.banque.entites;

public class Debit extends Operation{
    public Debit(String dateOperation, int montantOperation) {
        super(dateOperation, montantOperation);
    }

    @Override
    public String getType() {
        return super.getType() + "DEBIT";
    }
}
