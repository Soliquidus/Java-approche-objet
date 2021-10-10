package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {
    /**
     * Attributs
     */
    int tauxRemuneration;

    /**
     * Constructeur
     *
     * @param numeroCompte
     * @param soldeCompte
     * @param tauxRemuneration
     */
    public CompteTaux(long numeroCompte, int soldeCompte, int tauxRemuneration) {
        super(numeroCompte, soldeCompte);
        this.tauxRemuneration = tauxRemuneration;
    }

    /**
     * Méthode toString
     *
     * @return String
     */
    @Override
    public String toString() {
        String sb = super.toString() +
                ", Taux de rémunération : " + tauxRemuneration;
        return sb;
    }
}
