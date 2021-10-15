package fr.diginamic.chaines;

/**
 * TP - Comprendre l'intérêt de la classe StringBuilder
 *
 * @author: Tibo Pfeifer
 * @version: 1.0
 * @date: 15/10/2021
 */
public class TestStringBuilder {
    public static void main(String[] args) {
//        Chrono avec StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        long chronoDebut = System.currentTimeMillis();

        for (int i = 0 ; i <= 100_000 ; i++) {
            stringBuilder.append(i).append("|");
        }
        long chronoFin = System.currentTimeMillis();
        stringBuilder.append("\nTemps écoulé en millisecondes : ").append(chronoFin - chronoDebut);
        System.out.println(stringBuilder);

//        Chrono sans StringBuilder
        long debut = System.currentTimeMillis();
        int i = 0;
        for (i = 0 ; i <= 100_000; i++) {
            String string = "|" + i;
            System.out.print(string);
        }
        long fin = System.currentTimeMillis();
        System.out.println("\nTemps écoulé en millisecondes : " + (fin - debut));

//        La différence d'exécution est énorme : ~ 9 ms pour le StringBuilder contre ~ 300 ms pour la classe String
    }
}