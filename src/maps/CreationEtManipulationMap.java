package maps;

import java.util.HashMap;
import java.util.Iterator;

/**
 * TP 12 - Apprendre à utiliser Map et HashMap
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 13/10/2021
 */
public class CreationEtManipulationMap {
    public static void main(String[] args) {
//        Exercice 2
        HashMap<Integer, String> mapVilles = new HashMap<>();
        mapVilles.put(13, "Marseille");
        mapVilles.put(34, "Montpellier");
        mapVilles.put(44, "Nantes");
        mapVilles.put(75, "Paris");
        mapVilles.put(31, "Toulouse");
        mapVilles.put(59, "Lille");
        mapVilles.put(69, "Lyon");
        mapVilles.put(33, "Bordeaux");

        Iterator<Integer> keyIterator = mapVilles.keySet().iterator();
        System.out.println("Ensemble des clés contenues dans la map : ");
        while (keyIterator.hasNext()){
            Integer key = keyIterator.next();
            System.out.print(key + " | ");
        }
        System.out.println();
        System.out.println("------------------------------");

        Iterator<String> valueIterator = mapVilles.values().iterator();
        System.out.println("Ensemble des valeurs contenues dans la map : ");
        while (valueIterator.hasNext()){
            String value = valueIterator.next();
            System.out.print(value + " | ");
        }
        System.out.println();
        System.out.println("------------------------------");

        System.out.println("Taille de la map : " + mapVilles.size());
        System.out.println("------------------------------");
    }
}
