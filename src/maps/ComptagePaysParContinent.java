package maps;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 * TP 12 - Apprendre à utiliser Map et HashMap
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 14/10/2021
 */
public class ComptagePaysParContinent {
    public static void main(String[] args) {
//        Exercice 5
        ArrayList<Pays> paysList = new ArrayList<>();
        paysList.add(new Pays("France", 65_000_000, "Europe"));
        paysList.add(new Pays("Allemagne", 80_000_000, "Europe"));
        paysList.add(new Pays("Belgique", 10_000_000, "Europe"));
        paysList.add(new Pays("Russie", 150_000_000, "Asie"));
        paysList.add(new Pays("Chine", 140_000_000_000L, "Asie"));
        paysList.add(new Pays("Indonésie", 220_000_000, "Océanie"));
        paysList.add(new Pays("Australie", 20_000_000, "Océanie"));

        HashMap<String, Integer> paysMap = new HashMap<>();
        Integer i = 0;
        for(Pays pays : paysList){
            i++;
            paysMap.put(pays.getNom(), i);
        }
        System.out.println("Map après comptage et ajout de la liste de pays : ");
        Iterator<String> keyIterator = paysMap.keySet().iterator();
        Iterator<Integer> valueIterator = paysMap.values().iterator();
        //Affichage des clés et valeurs du map
        while (keyIterator.hasNext() && valueIterator.hasNext()){
            String nomPays = keyIterator.next();
            Integer nombrePays = valueIterator.next();
            System.out.print(nombrePays + ". " + nomPays + " | ");
        }
    }
}
