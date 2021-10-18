package tri;

import fr.diginamic.testenumeration.Continent;
import liste.Ville;

import java.util.ArrayList;
import java.util.Collections;

/**
 * TP 13 - Apprendre à utiliser le tri
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 14/10/2021
 */
public class TestTri {
    public static void main(String[] args) {
//        Exercice 1 | 3
        Ville nice = new Ville("Nice", 343_000, Continent.EUROPE);
        Ville carcassonne = new Ville("Carcassonne", 47_800, Continent.EUROPE);
        Ville narbonne = new Ville("Narbonne", 53_400, Continent.EUROPE);
        Ville lyon = new Ville("Lyon", 484_000, Continent.EUROPE);
        Ville foix = new Ville("Foix", 9_700, Continent.EUROPE);
        Ville pau = new Ville("Pau", 77_200, Continent.EUROPE);
        Ville marseille = new Ville("Marseille", 850_700, Continent.EUROPE);
        Ville tarbes = new Ville("Tarbes", 40_600, Continent.EUROPE);

        ArrayList<Ville> villesList = new ArrayList<>();
        villesList.add(nice);
        villesList.add(carcassonne);
        villesList.add(narbonne);
        villesList.add(lyon);
        villesList.add(foix);
        villesList.add(pau);
        villesList.add(marseille);
        villesList.add(tarbes);

        System.out.println("Tri de la liste par ordre alphabétique : ");
        Collections.sort(villesList, new ComparatorNom());

        for(Ville ville : villesList){
            System.out.print(ville.getNom() + " | ");
        }
        System.out.println();
        System.out.println("------------------------------");

//        Exercice 2 | 3
        System.out.println("Tri de la liste par nombre d'habitants : ");
        Collections.sort(villesList, new ComparatorHabitant());

        for(Ville ville : villesList){
            System.out.println(ville.getNom() + ", " + ville.getHabitants() + " habitants.");
        }
        System.out.println("------------------------------");
    }
}
