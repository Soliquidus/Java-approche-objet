package fr.diginamic.essais;

import fr.diginamic.salaire.Intervenant;
import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

/**
 * TP - Autonomie - Exercice CalculSalaire
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 08/10/2021
 */
public class TestIntervenant {
    public static void main(String[] args) {
        //Étape 1
        Salarie salarie = new Salarie("Patoulacci", "Robert", 1750);
        Pigiste pigiste = new Pigiste("Parker", "Peter", 20, 12.50);
        double salaireSalarie = salarie.getSalaire();
        double salairePigiste = pigiste.getSalaire();
        System.out.println("Salarié : " + salaireSalarie + ", Pigiste : " + salairePigiste);

        //Étape 2
        salarie.afficherDonnees(salarie);
        salarie.afficherDonnees(pigiste);
    }
}
