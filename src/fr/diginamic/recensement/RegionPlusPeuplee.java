package fr.diginamic.recensement;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * TP Autonomie - Exercice Recensement Population
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 15/10/2021
 */
public class RegionPlusPeuplee extends MenuService {

    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
//        Les dix régions les plus peuplées
        HashMap<String, Integer> regions = new HashMap<>();
//        On établit d'abord une map avec le nom des régions comme clé ainsi qu'une valeur par défaut de 0 afin de préparer l'incrèmentation.
        recensement.getVilles().forEach(ville -> {
            regions.put(ville.getDepartement().getRegion().getNom(), 0);
        });
//        On y ajoute ensuite une incrémentation des valeurs grâce aux clés mises en place auparavant.
        recensement.getVilles().forEach(ville ->
                regions.put(ville.getDepartement().getRegion().getNom(), regions.get(ville.getDepartement().getRegion().getNom()) + ville.getPopulation()));

//        Une TreeMap paraît idéale pour le côté ordonné
        ComparatorRecensement comparator = new ComparatorRecensement(regions);
        TreeMap<String, Integer> regionsTri = new TreeMap<>(comparator);
        regionsTri.putAll(regions);
        int i = 0;
        for (Map.Entry<String, Integer> region : regionsTri.entrySet()) {
//            Une fois les dix premières régions triées on arrête la boucle
            if (i == 10) {
                break;
            }
            String cle = region.getKey();
            int valeur = region.getValue();

            System.out.println(i + 1 + ". " + cle + " : " + valeur + " habitants.");
            i++;
        }
    }
}