package fr.diginamic.banque.entites;

public class CompteTaux extends Compte{
    //Variables
    int tauxRemuneration;

    //Constructeurs
    public CompteTaux(long numeroCompte, int soldeCompte, int tauxRemuneration) {
        super(numeroCompte, soldeCompte);
        this.tauxRemuneration = tauxRemuneration;
    }

    @Override
    public String toString() {
        String sb = super.toString() +
                ", Taux de rémunération : " + tauxRemuneration;
        return sb;
    }
}
