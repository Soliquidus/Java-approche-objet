package fr.diginamic.operations;

/**
 * TP - Autonomie - Exercice Operations
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 07/10/2021
 */
public class Operations {

    /**
     * Méthode pour éffectuer l'opération demandé en paramètre
     *
     * @param a
     * @param b
     * @param operateur
     */
    public void calcul(double a, double b, char operateur) {
        double somme = 0;
        switch (operateur) {
            case '+':
                somme = a + b;
                break;
            case '-':
                somme = a - b;
                break;
            case '*':
                somme = a * b;
                break;
            case '/':
                somme = a / b;
                break;
            default:
                System.out.println("Opérateur non reconnu");
        }
        System.out.println("Le résultat avec l'opérateur " + operateur + " est : " + somme);
    }
}
