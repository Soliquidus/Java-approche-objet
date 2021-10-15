package fr.diginamic.recensement;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * TP Autonomie - Exercice Recensement Population
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 14/10/2021
 */
public class PopulationRegion extends MenuService {
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        int population = 0;
        System.out.println("Quelle région voulez-vous choisir ?");
        try {
            String saisie = scanner.nextLine();
            saisie = saisie.trim().replaceAll(" ", "");
            List<Ville> villes = recensement.getVilles();
            for (Ville ville : villes) {
//                On ne retient que les villes ayant la région indiquée dans le parcours
                if (ville.getDepartement().getRegion().getNom().equals(saisie)) {
//                    On incrémente ensuite la population de chaque ville
                    population += ville.getPopulation();
                }
            }
        } catch (InputMismatchException e){
            System.out.println("Veuillez n'entrer que des lettres !");
        }
        System.out.println("La région compte une population de " + population + " habitants.");
    }
}