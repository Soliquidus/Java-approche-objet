package liste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * TP 10 - Apprendre à utiliser List et ArrayList
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 13/10/2021
 */
public class TestListeString {
    public static void main(String[] args) {
//        Exercice 4
        ArrayList<String> villes = new ArrayList<>();
        villes.add("Nice");
        villes.add("Carcassonne");
        villes.add("Narbonne");
        villes.add("Lyon");
        villes.add("Foix");
        villes.add("Pau");
        villes.add("Marseille");
        villes.add("Tarbes");

        System.out.println("L'élément le plus long du tableau : ");
        String motPlusLong = null;
        for(String ville : villes){
            if(motPlusLong == null || ville.length() > motPlusLong.length()){
                motPlusLong = ville;
            }
        }
        System.out.println(motPlusLong);

        System.out.println("Mettre tous les éléments en majuscules : ");
        villes.replaceAll(String::toUpperCase);
        for (String ville : villes){
            System.out.println(ville);
        }

        System.out.println("Supprimer les éléments commençant par la lettre N : ");
        Iterator<String> iterator = villes.listIterator();
//        Méthode avec removeIf
//      villes.removeIf(ville -> ville.charAt(0) == 'N');
//        Méthode avec l'itérateur
        while (iterator.hasNext()) {
            String ville = iterator.next();
            if(ville.charAt(0) == 'N'){
                iterator.remove();
            }
        }
        for (String ville : villes){
            System.out.println(ville);
        }
    }
}
