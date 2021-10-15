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
public class VillePeupleeRegion extends MenuService{

    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
//        Les dix villes les plus peuplées d'une région donnée
        System.out.println("Indiquez le nom de la région voulue : ");
        String saisie = scanner.nextLine();
        HashMap<String, Integer> villes = new HashMap<>();

//        On doit supprimer les espaces de la saisie utilisateur pour correspondre au traîtement fichier
        saisie = saisie.trim().replaceAll(" ", "");
//        On établit d'abord une map avec les villes de la région indiquée comme clé ainsi qu'une valeur par défaut de 0 afin de préparer l'incrèmentation.
        for(Ville ville : recensement.getVilles()){
            if(ville.getDepartement().getRegion().getNom().equals(saisie)){
                villes.put(ville.getNom(), 0);
            }
        }
//        Si la ville fait partie de la région indiquée on commence à remplir les valeurs par clé donnée (nom de ville)
        for(Ville ville : recensement.getVilles()){
            if(ville.getDepartement().getRegion().getNom().equals(saisie)){
                villes.put(ville.getNom(), villes.get(ville.getNom()) + ville.getPopulation());
            }
        }

//        On procéde ensuite au tri des villes avec une TreeMap ordonnée
        ComparatorRecensement comparator = new ComparatorRecensement(villes);
        TreeMap<String, Integer> villesTri = new TreeMap<>(comparator);
        int i = 0;

        villesTri.putAll(villes);
        for(Map.Entry<String, Integer> ville : villesTri.entrySet()){
//            Une fois les dix premières villes triées on arrête la boucle
            if (i == 10){
                break;
            }
            String cle = ville.getKey();
            int valeur = ville.getValue();

            System.out.println(i + 1 + ". " + cle + " : " + valeur + " habitants.");
//            Attention à bien incrémenter après l'affichage du résultat sinon la liste commencera à 2
            i++;
        }
    }
}