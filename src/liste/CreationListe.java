package liste;

import java.util.ArrayList;

/**
 * TP 10 - Apprendre à utiliser List et ArrayList
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 13/10/2021
 */
public class CreationListe {
    public static void main(String[] args) {
        //Exercice 1
        int i;
        ArrayList<Integer> arrayEntiers = new ArrayList<>();
        for(i = 1; i <= 100; i++){
            arrayEntiers.add(i);
        }
        System.out.println("La taille du tableau est de : " + arrayEntiers.size());
    }
}
