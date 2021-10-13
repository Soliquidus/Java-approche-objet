package liste;

import java.util.ArrayList;
import java.util.Collections;

/**
 * TP 10 - Apprendre à utiliser List et ArrayList
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 13/10/2021
 */
public class TestListeInt {
    public static void main(String[] args) {
        //Exercice 3
        ArrayList<Integer> arrayEntiers = new ArrayList<>();
        arrayEntiers.add(-1);
        arrayEntiers.add(5);
        arrayEntiers.add(7);
        arrayEntiers.add(3);
        arrayEntiers.add(-2);
        arrayEntiers.add(4);
        arrayEntiers.add(8);
        arrayEntiers.add(5);
        System.out.println("Eléments de la liste : ");
        for(Integer entier : arrayEntiers){
            System.out.println(entier);
        }
        System.out.println("La taille du tableau est de : " + arrayEntiers.size());

        System.out.println("Elément le plus grand du tableau : ");
        Integer max = Collections.max(arrayEntiers);
        System.out.println(max);

        System.out.println("Elément le plus petit du tableau : ");
        Integer min = Collections.min(arrayEntiers);
        System.out.println(min);

        //Transformer les éléments négatifs en positifs
        System.out.println("Transformations des entiers négatifs en positifs : ");
        for (Integer entier : arrayEntiers){
            if (entier < 0){
                Integer newEntier = Math.abs(entier);
                System.out.println(newEntier);
            } else {
                System.out.println(entier);
            }
        }
    }
}
