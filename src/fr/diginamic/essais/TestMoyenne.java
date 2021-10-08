package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

/**
 * TP - Autonomie - Exercice CalculMoyenne
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 07/10/2021
 */
public class TestMoyenne {
    public static void main(String[] args) {

        double[] notes = {10.5, 15, 17, 13.5};
        CalculMoyenne moyenne = new CalculMoyenne(notes);
        System.out.println("Longueur du tableau : " + moyenne.tableau.length);
        System.out.println("Moyenne avec les valeurs par défaut : " + moyenne.calcul());
        moyenne.ajout(18);
        moyenne.ajout(9.75);
        System.out.println("Longueur du tableau après ajout de valeurs : " + moyenne.tableau.length);
        System.out.println("Nouvelle moyenne : " + moyenne.calcul());

        double[] resultats = {780.541, 35.589};
        CalculMoyenne moyenne2 = new CalculMoyenne(resultats);
        System.out.println("Longueur du tableau : " + moyenne2.tableau.length);
        System.out.println("Moyenne avec les valeurs par défaut : " + moyenne2.calcul());
        moyenne2.ajout(46.58);
        moyenne2.ajout(5.04);
        moyenne2.ajout(25.75);
        System.out.println("Longueur du tableau après ajout de valeurs : " + moyenne2.tableau.length);
        System.out.println("Nouvelle moyenne : " + moyenne2.calcul());
    }
}
