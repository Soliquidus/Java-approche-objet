package fr.diginamic.banque;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

public class TestOperation {
    public static void main(String[] args) {
        Credit credit1 = new Credit("01/10/2021", 2500);
        Credit credit2 = new Credit("04/10/2021", 350);
        Debit debit1 = new Debit("10/10/2021", 1150);
        Debit debit2 = new Debit("12/10/2021", 50);

        Operation [] operations = {credit1, credit2, debit1, debit2};
        int sommeCredit = 0, sommeDebit = 0;

        for(Operation operation : operations) {
            System.out.println(operation + operation.getType());
            if(operation.getType().contains("DEBIT")){
                sommeDebit = sommeDebit + operation.montantOperation;
            } else {
                sommeCredit = sommeCredit + operation.montantOperation;
            }
        }
        System.out.println("Crédits totaux : " + sommeCredit + ", Débits totaux : " + sommeDebit);
    }
}
