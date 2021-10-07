package fr.diginamic.entites;

/**
 * TP - Autonomie - Exercice Theatre
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 07/10/2021
 */
public class Theatre {
    String nom;
    int capaciteMax;
    int totalClients;
    int recette;

    public Theatre(String nom, int capaciteMax, int totalClients, int recette) {
        this.nom = nom;
        this.capaciteMax = capaciteMax;
        this.totalClients = totalClients;
        this.recette = recette;
    }

    public void inscrire(int nombreClients, int prix){
        if (capaciteMax < (nombreClients+this.totalClients)){
            System.out.println("Il n'y a plus assez de places pour autant de personnes, désolé !");
        } else {
            this.totalClients += nombreClients;
            this.recette+= prix;
        }
    }

    @Override
    public String toString() {
        return "Théatre : " + nom + ", capaciteMax = " + capaciteMax +
                ", totalClients = " + totalClients +
                ", recette = " + recette;
    }
}
