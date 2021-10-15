package liste;

import java.util.ArrayList;
import java.util.List;

/**
 * TP 10 - Apprendre à utiliser List et ArrayList
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 13/10/2021
 */
public class FusionListe {
    public static void main(String[] args) {
        //Exercice 2
        List<String> liste1 = new ArrayList<String>();
        liste1.add("Rouge");
        liste1.add("Vert");
        liste1.add("Orange");
        List<String> liste2 = new ArrayList<String>();
        liste2.add("Blanc");
        liste2.add("Bleu");
        liste2.add("Orange");
        List<String> liste3 = new ArrayList<String>();

        //Ajouter les éléments des deux premiers tableaux en utilisant une boucle (addAll à ignorer donc).
        for (String couleur : liste1){
            liste3.add(couleur);
        }

        for (String couleur : liste2){
            liste3.add(couleur);
        }

        System.out.println("Contenu du tableau liste3 : " );
        for(String couleur : liste3){
            System.out.println(couleur);
        }
    }
}
