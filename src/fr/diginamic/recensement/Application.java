package fr.diginamic.recensement;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/**
 * TP Autonomie - Exercice Recensement Population
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 14/10/2021
 */
public class Application {
    public static void main(String[] args) {
        Path filePath = Paths.get("D:\\ProjetsCours\\Projets\\Diginamic\\Java\\approche-objet\\src\\fr\\diginamic\\recensement\\fichiers\\recensement.csv");
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        if (Files.isRegularFile(filePath)) {
            if (Files.isReadable(filePath)) {
                try {
                    List<String> lignes = Files.readAllLines(filePath, StandardCharsets.UTF_8);
                    Recensement recensement = new Recensement(lignes);
                    boolean quitterApp = false;
                    while (!quitterApp) {
                        System.out.println("Que voulez-vous faire ?\n" +
                                "1. Afficher la population d'une ville indiquée.\n" +
                                "2. Afficher la population d'un département donné.\n" +
                                "3. Afficher la population d'une région donnée.\n" +
                                "4. Afficher les dix régions les plus peuplées.\n" +
                                "5. Afficher les dix départements les plus peuplés.\n" +
                                "6. Afficher les dix villes les plus peuplées d’un département.\n" +
                                "7. Afficher les dix villes les plus peuplées d’une région.\n" +
                                "8. Afficher les dix villes les plus peuplées de France.\n" +
                                "9. Quitter le programme."
                        );
                        int choix = sc.nextInt();
                        switch (choix) {
                            case 1:
                                PopulationVille ville = new PopulationVille();
                                ville.traiter(recensement, sc2);
                                break;
                            case 2:
                                PopulationDepartement departement = new PopulationDepartement();
                                departement.traiter(recensement, sc2);
                                break;
                            case 3:
                                PopulationRegion region = new PopulationRegion();
                                region.traiter(recensement, sc2);
                                break;
                            case 4:
                                RegionPlusPeuplee regionPlusPeuplee = new RegionPlusPeuplee();
                                regionPlusPeuplee.traiter(recensement, sc2);
                                break;
                            case 5:
                                DepartementPlusPeuple departementPlusPeuple = new DepartementPlusPeuple();
                                departementPlusPeuple.traiter(recensement, sc2);
                                break;
                            case 6:
                                VillePeupleeDepartement villePeupleeDepartement = new VillePeupleeDepartement();
                                villePeupleeDepartement.traiter(recensement, sc2);
                                break;
                            case 7:
                                VillePeupleeRegion villePeupleeRegion = new VillePeupleeRegion();
                                villePeupleeRegion.traiter(recensement, sc2);
                                break;
                            case 8:
                                VillePeupleeFrance villePeupleeFrance = new VillePeupleeFrance();
                                villePeupleeFrance.traiter(recensement, sc2);
                                break;
                            case 9:
                                quitterApp = true;
                                break;
                            default:
                                System.err.println("Veuillez entrer un des chiffres indiqués.");
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                System.err.println("Il y a un soucis de lecture du fichier.");
            }
        } else {
            System.err.println("Il y a un soucis avec le fichier, vérifiez son chemin d'accès.");
        }
    }
}
