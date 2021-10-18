package liste;

import fr.diginamic.testenumeration.Continent;

/**
 * TP - Apprendre à redéfinir Equals
 *
 * @author: Tibo Pfeifer
 * @version: 1.0
 * @date: 15/10/2021
 */
public class TestEquals {
    public static void main(String[] args) {
        Ville nantes = new Ville("Nantes", 350_000, Continent.EUROPE);
        Ville nantes2 = new Ville("Nantes", 350_000, Continent.EUROPE);

        boolean equals;

        equals = nantes.equals(nantes2);
        System.out.println("Test avec deux instances ayant les mêmes attributs : " + equals);

        nantes2.setHabitants(345_000);
        equals = nantes.equals(nantes2);
        System.out.println("Test avec deux instances ayant un attribut différent : " + equals);

        nantes2.setHabitants(350_000);
        equals = (nantes == nantes2);
        System.out.println("Test avec deux instances ayant les mêmes attributs avec un == : " + equals);

        //Solution pour rendre true avec == (on joue le jeu du == jusqu'au bout même dans la condition alors qu'il vaudrait mieux mettre getNom().equals())
        equals = (nantes.getNom() == nantes.getNom() && nantes.getHabitants() == nantes2.getHabitants());
        System.out.println("Test en modifiant les conditions du == : " + equals);
    }
}