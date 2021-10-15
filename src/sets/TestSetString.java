package sets;

import java.util.HashSet;
import java.util.Iterator;

/**
 * TP 11 - Apprendre à utiliser Set et HashSet
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 13/10/2021
 */
public class TestSetString {
    public static void main(String[] args) {
        //    Exercice 2
        HashSet<String> pays = new HashSet<>();
        pays.add("USA");
        pays.add("France");
        pays.add("Allemagne");
        pays.add("UK");
        pays.add("Italie");
        pays.add("Japon");
        pays.add("Chine");
        pays.add("Russie");
        pays.add("Inde");

        System.out.println("Tous les éléments de la collection : ");
        for(String unPays : pays){
            System.out.print(unPays + " | ");
        }
        System.out.println();

        String nomPlusLong = null;
        for(String unPays : pays){
            if(nomPlusLong == null || unPays.length() > nomPlusLong.length()){
                nomPlusLong = unPays;
            }
        }

        System.out.println("Pays au nom le plus long : ");
        System.out.println(nomPlusLong);

        System.out.println("Collection après suppression du pays le plus long à écrire : ");
        Iterator<String> iterator = pays.iterator();
        while (iterator.hasNext()){
            String unPays = iterator.next();
            if(unPays.equals(nomPlusLong)){
                iterator.remove();
            }
        }
        for(String unPays : pays){
            System.out.print(unPays + " | ");
        }
        System.out.println();
    }
}
