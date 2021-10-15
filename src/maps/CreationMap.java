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
public class CreationMap {
    public static void main(String[] args) {
//        Exercice 1
        System.out.println("Exercice 1");
        HashMap<String, Integer> mapSalaires = new HashMap<>();
        mapSalaires.put("Paul", 1750);
        mapSalaires.put("Hicham", 1825);
        mapSalaires.put("Yu", 2250);
        mapSalaires.put("Ingrid", 2015);
        mapSalaires.put("Chantal", 2418);

        System.out.println("Taille de la map : " + mapSalaires.size());
        System.out.println("------------------------------");
    }
}
