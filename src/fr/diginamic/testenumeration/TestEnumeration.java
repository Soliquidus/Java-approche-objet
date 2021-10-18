package fr.diginamic.testenumeration;

/**
 * TP 3 - Les Enumerations
 *
 * @author: Tibo Pfeifer
 * @version: 1.0
 * @date: 18/10/2021
 */
public class TestEnumeration {
    public static void main(String[] args) {
        //Afficher toutes les saisons
        for(Saison saison : Saison.values()){
            System.out.print(saison + " | ");
        }
        System.out.println("\n------------------------------");

        //Comparaison de valeurs
        String nom = "ETE";
        System.out.println(Saison.valueOf(nom).getSaison());
        System.out.println("------------------------------");

        String libelle = "Hiver";
        Saison.getInstanceSaison(libelle);
    }
}