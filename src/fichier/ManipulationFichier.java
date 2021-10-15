package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * TP 15 - Apprendre à manipuler des fichiers
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 14/10/2021
 */
public class ManipulationFichier {
    public static void main(String[] args) throws IOException {
        Path pathFile = Paths.get("D:\\ProjetsCours\\Projets\\Diginamic\\Java\\approche-objet\\src\\fichier\\recensement.csv");
        ArrayList<String> newLines = new ArrayList<>();
        if (Files.isRegularFile(pathFile)) {
            if (Files.isReadable(pathFile)) {
                try {
//            Lecture du fichier
                    List<String> lines = Files.readAllLines(pathFile, StandardCharsets.UTF_8);
//            On va chercher les index qui nous intéressent
                    for (String line : lines) {
                        String[] index = line.split(";");
//                        Pour pouvoir comparer les chiffres il faut parser afin de transformer les String en Int
                        index[9] = index[9].trim().replaceAll(" ", "");
                        index[9] = index[9].trim().replaceAll("Populationtotale", "Population totale");
                        if (!index[9].equals("Population totale")) {
                            if (Integer.parseInt(index[9]) > 25000) {
                                newLines.add(index[6] + ";" + index[2] + ";" + index[9] + ";");
                            }
                        } else {
                            newLines.add(index[6] + ";" + index[2] + ";" + index[9] + ";");
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("Fichier illisible");
            }
        } else {
            System.out.println("Pas le bon format de fichier");
        }
        Path pathNew = Paths.get("D:\\\\ProjetsCours\\\\Projets\\\\Diginamic\\\\Java\\\\approche-objet\\\\src\\\\fichier\\\\recensementModif.csv");
        Files.write(pathNew, newLines);
    }
}
