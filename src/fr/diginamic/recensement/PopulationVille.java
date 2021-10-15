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
public class PopulationVille extends MenuService{

    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.println("Sur quelle ville voulez vous l'information ?");
        try {
            String saisie = scanner.nextLine();
            saisie = saisie.trim().replaceAll(" ", "");
            List<Ville> villes = recensement.getVilles();
            for (Ville ville : villes) {
                if (ville.getNom().equals(saisie)) {
                    System.out.println("La ville compte une population de " + ville.getPopulation() + " habitants (" + ville.getDepartement().getCode() + ")");
                }
            }
        } catch (InputMismatchException e){
            System.err.println("Seule des lettres sont autorisées !");
        }
    }
}