package maps;

import java.util.HashMap;

/**
 * TP 12 - Apprendre à utiliser Map et HashMap
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 13/10/2021
 */
public class FusionMap {
    public static void main(String[] args) {
//        Exercice 3
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Rouge");
        map1.put(2, "Vert");
        map1.put(3, "Orange");
        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(4, "Blanc");
        map2.put(5, "Bleu");
        map2.put(6, "Orange");
        HashMap<Integer, String> map3 = new HashMap<>(map1);
        map2.forEach((key, value) -> map3
                .merge(key, value, (v1, v2)
                        -> v1.equalsIgnoreCase(v2) ? v1 : v2 + ", " + v2));
        System.out.println("Nouveau map qui contient les deux précédents map : ");
        System.out.println(map3);

    }
}
