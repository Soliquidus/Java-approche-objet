package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

/**
 * TP - Autonomie - Exercice Theatre
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 07/10/2021
 */
public class TestTheatre {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Bouffonnerie", 60, 30, 300);
        System.out.println(theatre);
        theatre.inscrire(20, 200);
        System.out.println(theatre);
        theatre.inscrire(10, 200);
        System.out.println(theatre);
        theatre.inscrire(30, 300);
    }
}
