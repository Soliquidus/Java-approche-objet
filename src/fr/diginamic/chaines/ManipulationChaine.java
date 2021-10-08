package fr.diginamic.chaines;

import fr.diginamic.entites.Salarie;

import java.util.Arrays;

/**
 * TP - Autonomie - Exercice ManipulationChaine
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 08/10/2021
 */
public class ManipulationChaine {
    public static void main(String[] args) {

        String chaine = "Durand;Marcel;2 523.5";

        char premierCaractere = chaine.charAt(0);
        System.out.println("Premier caractère : " + premierCaractere);

        int longueurChaine = chaine.length();
        System.out.println("Longueur de la chaine : " + longueurChaine);

        int index = chaine.indexOf(';');
        System.out.println("Index du premier \";\" : " + index);

        String portionChaine = chaine.substring(5, 15);
        System.out.println("Extrait d'une portion de chaine : " + portionChaine);

        String nomFamille = chaine.substring(0, chaine.indexOf(';'));
        System.out.println("Combinaison de méthodes pour extraire le nom : " + nomFamille);

        System.out.println("Nom de famille en majuscules : " + nomFamille.toUpperCase());

        System.out.println("Nom de famille en minuscules : " + nomFamille.toLowerCase());

        String [] chaineDecoupe = chaine.split(";");
        System.out.println("Découpage de la chaine : " + Arrays.toString(chaineDecoupe));

        //Manipulation pour créer une instance de classe
        String nom = chaine.substring(0, chaine.indexOf(';'));

        String prenomAModifier = chaine.substring(7, chaine.indexOf('2'));
        String prenom = prenomAModifier.replace(";", "");

        String salaireExtrait = chaine.substring(14);
        String salaireAParser = salaireExtrait.replace(" ", "");
        double salaire = Double.parseDouble(salaireAParser);

        Salarie salarie = new Salarie(nom, prenom, salaire);

        System.out.println("Donnés de l'instanciation de salarié après manipulations : " + salarie.nom + ", " + salarie.prenom + ", " + salarie.salaire);
    }
}
