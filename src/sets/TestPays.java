package sets;

import java.util.HashSet;

/**
 * TP 11 - Apprendre à utiliser Set et HashSet
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 13/10/2021
 */
public class TestPays {
    public static void main(String[] args) {
//        Exercice 3
        HashSet<Pays> pays = new HashSet<>();
        pays.add(new Pays("USA", 331_002_651, 1.7974));
        pays.add(new Pays("France", 65_273_511, 6.6720));
        pays.add(new Pays("Allemagne", 83_783_942, 5.9923));
        pays.add(new Pays("UK", 67_886_011, 6.2765));
        pays.add(new Pays("Italie", 60_461_826, 6.3461));
        pays.add(new Pays("Japon", 126_476_461, 3.3728));
        pays.add(new Pays("Chine", 1_439_323_776, 1.1549));
        pays.add(new Pays("Russie", 145_934_462, 1.6986));
        pays.add(new Pays("Inde", 145_934_462, 4.9337));

        System.out.println("Pays au PIB le plus élevé : ");
        double pibHaut = 0;
        String nomPays = null;
        for(Pays unPays : pays){
            if(unPays.pibHabitant > pibHaut){
                pibHaut = unPays.pibHabitant;
                nomPays = unPays.nom;
            }
        }
        System.out.println(nomPays + " avec un PIB/Habitant de " + pibHaut);
        System.out.println("------------------------------");

        System.out.println("Pays au PIB total le plus élevé : ");
        int pibTotal = 0;
        for(Pays unPays : pays){
            int calculPib = unPays.calculerPibTotal();
            if(calculPib > pibTotal){
                nomPays = unPays.nom;
                pibTotal = calculPib;
            }
        }
        System.out.println(nomPays + " avec un PIB de " + pibTotal);
        System.out.println("------------------------------");

        System.out.println("Eléments de la collection avec le pays au PIB le plus bas en majuscules : ");
        //Initialisation d'un objet pour pouvoir commencer la comparaison
        Pays pibMinimum = new Pays("Inde", 145_934_462, 4.9337);
        for(Pays unPays : pays){
            if(unPays.calculerPibTotal() < pibMinimum.calculerPibTotal())
                pibMinimum = unPays;
        }
        pibMinimum.setNom(pibMinimum.getNom().toUpperCase());
        for(Pays unPays : pays){
            System.out.println(unPays.nom + ", " + unPays.calculerPibTotal());
        }
        System.out.println("------------------------------");

        System.out.println("Eléments après suppression du pays au PIB le plus bas : ");
        pays.remove(pibMinimum);
        for(Pays unPays : pays){
            System.out.println(unPays.getNom() + ", " + unPays.getHabitants() + " habitants, PIB total de " + unPays.calculerPibTotal());
        }
        System.out.println("------------------------------");

    }
}
