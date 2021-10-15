package fr.diginamic.recensement;

import java.util.Comparator;
import java.util.Map;

/**
 * The type Comparator recensement.
 */
public class ComparatorRecensement implements Comparator<String> {

    /**
     * The Map.
     */
    Map<String, Integer> map;

    /**
     * Instantiates a new Comparator recensement.
     *
     * @param map the map
     */
    public ComparatorRecensement(Map<String, Integer> map) {
        this.map = map;
    }

    @Override
    public int compare(String valeur1, String valeur2) {
        return map.get(valeur2).compareTo(map.get(valeur1));
    }
}
