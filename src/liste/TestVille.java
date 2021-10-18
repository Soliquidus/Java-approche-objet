package liste;

import fr.diginamic.testenumeration.Continent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * TP 10 - Apprendre à utiliser List et ArrayList
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 13/10/2021
 */
public class TestVille {
    public static void main(String[] args) {
//        Exercice 5
        ArrayList<Ville> villes = new ArrayList<>();
        villes.add(new Ville("Nice", 343_000, Continent.EUROPE));
        villes.add(new Ville("Carcassonne", 47_800, Continent.EUROPE));
        villes.add(new Ville("Narbonne", 53_400, Continent.EUROPE));
        villes.add(new Ville("Lyon", 484_000,Continent.EUROPE));
        villes.add(new Ville("Foix", 9_700, Continent.EUROPE));
        villes.add(new Ville("Pau", 77_200, Continent.EUROPE));
        villes.add(new Ville("Marseille", 850_700, Continent.EUROPE));
        villes.add(new Ville("Tarbes", 40_600, Continent.EUROPE));

        System.out.println("La ville la plus peuplée du tableau : ");
        int habitants = 0;
        String nomVille = null;
        for (Ville ville : villes){
            if(habitants == 0 || nomVille == null || ville.habitants > habitants){
                habitants = ville.habitants;
                nomVille = ville.nom;
            }
        }
        System.out.println(nomVille + ", " + habitants + " habitants.");
        System.out.println("------------------------------");

        System.out.println("Suppression de la ville la moins peuplée : ");
        //Je fais une copie du tableau pour garder l'ordre original dans le tableau de base
        ArrayList<Ville> copieTableau;
        copieTableau = (ArrayList)villes.clone();
        Collections.sort(copieTableau);
        Ville petiteVille = copieTableau.get(0);
        System.out.println(petiteVille.nom + ", " + petiteVille.habitants + " habitants.");
        System.out.println("------------------------------");

        System.out.println("Tableau mis à jouer sans l'élément supprimé auparavant : ");
//        Autre méthode :
//        villes.removeIf(ville -> ville.getHabitants() == petiteVille.getHabitants());
        Iterator<Ville> iterator = villes.iterator();
        while (iterator.hasNext()){
            Ville ville = iterator.next();
            if(ville.getHabitants() == petiteVille.getHabitants()){
                iterator.remove();
            }
        }
        for(Ville ville : villes){
            System.out.println(ville.nom + ", " + ville.habitants + " habitants.");
        }
        System.out.println("------------------------------");

        System.out.println("Les villes de plus de 100 000 habitants sont en majuscules : ");
        for(Ville ville : villes){
            if(ville.habitants >= 100_000){
                ville.nom = ville.nom.toUpperCase();
            }
            System.out.println(ville.nom + ", " + ville.habitants + " habitants.");
        }
        System.out.println("------------------------------");
    }
}
