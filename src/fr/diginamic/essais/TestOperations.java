package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

/**
 * TP - Autonomie - Exercice Operations
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 07/10/2021
 */
public class TestOperations {
    public static void main(String[] args) {
        double a = 12.45;
        double b = 20.50;

        Operations operations = new Operations();

        //Essais méthode
        operations.calcul(a, b, '+');
        operations.calcul(a, b, '-');
        operations.calcul(a, b, '*');
        operations.calcul(a, b, '/');
        operations.calcul(a, b, 'd');
    }
}
