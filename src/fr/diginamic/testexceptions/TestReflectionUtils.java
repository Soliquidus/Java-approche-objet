package fr.diginamic.testexceptions;

import fr.diginamic.testenumeration.Continent;
import liste.Ville;

import javax.management.ReflectionException;


/**
 * TP 2 - Gestion des Exceptions
 *
 * @author: Tibo Pfeifer
 * @version: 1.0
 * @date: 18/10/2021
 */
public class TestReflectionUtils {
    public static void main(String[] args) throws IllegalAccessException {
        Ville paris = new Ville("Paris", 2_000_000_000, Continent.EUROPE);
        try {
            ReflectionUtils.afficherAttributs(paris);
        } catch (ReflectionException e) {
            System.out.println("L'objet ne peut pas être null");
        }
    }
}