package fr.diginamic.testenumeration;

import liste.Ville;

import java.util.ArrayList;

/**
 * TP - Les Enumerations
 *
 * @author: Tibo Pfeifer
 * @version: 1.0
 * @date: 18/10/2021
 */
public class TestContinentAvecEnum {
    public static void main(String[] args) {
        ArrayList<Ville> villes = new ArrayList<>();
        villes.add(new Ville("Paris", 343000, Continent.EUROPE));
        villes.add(new Ville("Pretoria", 9700, Continent.AFRIQUE));
        villes.add(new Ville("New York", 47800, Continent.AMERIQUE));
        villes.add(new Ville("Tokyo", 484000, Continent.ASIE));
        villes.add(new Ville("Sydney", 53000, Continent.OCEANIE));

        for(Ville ville : villes){
            System.out.println(ville.toString());
        }
    }
}