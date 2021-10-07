package fr.diginamic.essais;

import fr.diginamic.utils.CercleFactory;
import fr.diginamic.entites.Cercle;
/**
 * TP - Autonomie - Exercice Cercle
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 07/10/2021
 */
public class TestCercle {
    public static void main(String[] args) {
        //TP - Autonomie - Exercice Cercle
        Cercle cercle = new Cercle(180);
        Cercle cercle1 = new Cercle(380.546);
        System.out.println(cercle);
        System.out.println(cercle1);

        //TP - Autonomie - Exercice CercleFactory
        Cercle cercleFactory = CercleFactory.creerCercle(250);
        System.out.println(cercleFactory);
    }
}
