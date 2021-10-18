package maps;

import fr.diginamic.testenumeration.Continent;
import liste.Ville;

import java.util.HashMap;
import java.util.Iterator;

/**
 * TP 12 - Apprendre à utiliser Map et HashMap
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 14/10/2021
 */
public class MapVilles {
    public static void main(String[] args) {
//        Exercice 4
        Ville nice = new Ville("Nice", 343_000, Continent.EUROPE);
        Ville carcassonne = new Ville("Carcassonne", 47_800, Continent.EUROPE);
        Ville narbonne = new Ville("Narbonne", 53_400, Continent.EUROPE);
        Ville lyon = new Ville("Lyon", 484_000, Continent.EUROPE);
        Ville foix = new Ville("Foix", 9_700, Continent.EUROPE);
        Ville pau = new Ville("Pau", 77_200, Continent.EUROPE);
        Ville marseille = new Ville("Marseille", 850_700, Continent.EUROPE);
        Ville tarbes = new Ville("Tarbes", 40_600, Continent.EUROPE);

        HashMap<String, Ville> villesMap = new HashMap<>();
        villesMap.put(nice.getNom(), nice);
        villesMap.put(carcassonne.getNom(), carcassonne);
        villesMap.put(narbonne.getNom(), narbonne);
        villesMap.put(lyon.getNom(), lyon);
        villesMap.put(foix.getNom(), foix);
        villesMap.put(pau.getNom(), pau);
        villesMap.put(marseille.getNom(), marseille);
        villesMap.put(tarbes.getNom(), tarbes);

        System.out.println("Ville la moins peuplé dans la map : ");
        Ville habitantsMin = pau;
        for (Ville ville : villesMap.values()) {
            if (ville.getHabitants() < habitantsMin.getHabitants()) {
                habitantsMin = ville;
            }
        }
        System.out.println(habitantsMin.getNom());
        System.out.println("------------------------------");

        System.out.println("Map après suppression de la ville la moins peuplée :");
        villesMap.remove(habitantsMin.getNom());
        for(Ville ville : villesMap.values()){
            System.out.print(ville.getNom() + " | ");
        }
    }
}
