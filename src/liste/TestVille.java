package liste;

import java.util.ArrayList;
import java.util.Collections;

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
        villes.add(new Ville("Nice", 343_000));
        villes.add(new Ville("Carcassonne", 47_800));
        villes.add(new Ville("Narbonne", 53_400));
        villes.add(new Ville("Lyon", 484_000));
        villes.add(new Ville("Foix", 9_700));
        villes.add(new Ville("Pau", 77_200));
        villes.add(new Ville("Marseille", 850_700));
        villes.add(new Ville("Tarbes", 40_600));

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
        System.out.println("--------------------");

        System.out.println("Suppression de la ville la moins peuplée : ");
        //Je fais une copie du tableau histoire de garder l'ordre d'origine dans l'original
        ArrayList<Ville> copieTableau;
        copieTableau = (ArrayList)villes.clone();
        Collections.sort(copieTableau);
        Ville petiteVille = copieTableau.get(0);
        copieTableau.clear();
        //Ja rajoute seulement la ville la plus petite
        copieTableau.add(petiteVille);
        System.out.println(petiteVille.nom + ", " + petiteVille.habitants + " habitants.");
        System.out.println("--------------------");

        System.out.println("Tableau mis à jouer sans l'élément supprimé auparavant : ");
        //Je supprime la ville grâce à la copie du tableau qui contient la valeur non désirée
        villes.removeAll(copieTableau);
        for(Ville ville : villes){
            System.out.println(ville.nom + ", " + ville.habitants + " habitants.");
        }
        System.out.println("--------------------");

        System.out.println("Les villes de plus de 100 000 habitants sont en majuscules : ");
        for(Ville ville : villes){
            if(ville.habitants >= 100_000){
                ville.nom = ville.nom.toUpperCase();
            }
            System.out.println(ville.nom + ", " + ville.habitants + " habitants.");
        }
        System.out.println("--------------------");
    }
}
