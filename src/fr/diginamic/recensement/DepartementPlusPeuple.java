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
 * @since 15 /10/2021
 */
public class DepartementPlusPeuple extends MenuService {

    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
//        Les dix départements les plus peuplés
        HashMap<String, Integer> departements = new HashMap<>();
//        On établit d'abord une map avec le code des départements comme clé ainsi qu'une valeur par défaut de 0 afin de préparer l'incrèmentation.
        recensement.getVilles().forEach(ville -> {
            departements.put(ville.getDepartement().getCode(), 0);
        });
//        On y ajoute ensuite une incrémentation des valeurs grâce aux clés mises en place auparavant.
        recensement.getVilles().forEach(ville ->
                departements.put(ville.getDepartement().getCode(), departements.get(ville.getDepartement().getCode()) + ville.getPopulation()));

//        Une TreeMap paraît idéale pour le côté ordonné
        ComparatorRecensement comparator = new ComparatorRecensement(departements);
        Map<String, Integer> departementsTri = new TreeMap<>(comparator);
        int i = 0;

        departementsTri.putAll(departements);
        for (Map.Entry<String, Integer> region : departementsTri.entrySet()) {
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