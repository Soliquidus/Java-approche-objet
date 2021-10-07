package fr.diginamic.utils;

import fr.diginamic.entites.Cercle;

/**
 * TP - Autonomie - Exercice CercleFactory
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 07/10/2021
 */
public class CercleFactory {
    public static Cercle creerCercle(double tailleCercle){
        return new Cercle(tailleCercle);
    }
}
