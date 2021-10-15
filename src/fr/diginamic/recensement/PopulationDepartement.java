package fr.diginamic.recensement;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * TP Autonomie - Exercice Recensement Population
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 14/10/2021
 */
public class PopulationDepartement  extends MenuService{

    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        int population = 0;
        System.out.println("Quel numéro de département voulez-vous choisir ?");
        try {
            String saisie = scanner.nextLine();
            for(Ville ville : recensement.getVilles()) {
//                On ne retient que le département indiqué dans le parcours
                if(ville.getDepartement().getCode().equals(saisie)){
//                    Il suffit ensuite d'incrémenter la population de chaque ville
                    population += ville.getPopulation();
                }
            }
        }catch (InputMismatchException e){
            System.out.println("Veuillez n'entrer que des lettres !");
        }
        System.out.println("Le département compte une population de " + population + " habitants.");
    }
}