package sets;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/**
 * TP 11 - Apprendre à utiliser Set et HashSet
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 13/10/2021
 */
public class TestSetDouble {
    public static void main(String[] args) {
        //    Exercice 1
        HashSet<Double> chiffres = new HashSet<>();
        chiffres.add(1.5);
        chiffres.add(8.25);
        chiffres.add(-7.32);
        chiffres.add(13.3);
        chiffres.add(-12.45);
        chiffres.add(48.5);
        chiffres.add(0.01);

        System.out.println("Eléments de la collection : ");
        for(Double chiffre : chiffres){
            System.out.print(chiffre + " | ");
        }
        System.out.println();

        System.out.println("Elément le plus grand du tableau : ");
        double plusGrand = Collections.max(chiffres);
        System.out.println(plusGrand);

        System.out.println("Supprimer l'élément le plus petit de la collection : ");
        double plusPetit = Collections.min(chiffres);
        System.out.println(plusPetit);
//        Autre méthode :
//        chiffres.removeIf(chiffre -> chiffre == plusPetit);
        Iterator<Double> iterator = chiffres.iterator();
        while (iterator.hasNext()){
            Double chiffre = iterator.next();
            if(chiffre == plusPetit){
                iterator.remove();
            }
        }

        System.out.println("Résultat final après modifications");
        for (Double chiffre : chiffres){
            System.out.print(chiffre + " | ");
        }
    }
}
