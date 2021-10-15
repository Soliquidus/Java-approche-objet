package tri;

import liste.Ville;

import java.util.Comparator;

/**
 * TP 13 - Apprendre à utiliser le tri
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 14/10/2021
 */
public class ComparatorHabitant implements Comparator<Ville> {

    @Override
    public int compare(Ville ville, Ville autreVille) {
        return Integer.compare(ville.getHabitants(), autreVille.getHabitants());
    }
}
