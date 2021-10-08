package fr.diginamic.essais;

import fr.diginamic.maison.*;

/**
 * TP - Autonomie - Exercice Immobilier
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 08/10/2021
 */
public class TestMaison {
    public static void main(String[] args) {
        //Variables
        Maison maison = new Maison();
        Cuisine cuisine = new Cuisine(35.5, 0);
        Salon salon = new Salon(40.7, 0);
        SalleDeBain salleDeBain = new SalleDeBain(30, 1);
        Chambre chambre = new Chambre(16.5, 1);
        Chambre chambre2 = new Chambre(12.3, 1);
        double superficie = 0;

        //Essais simples
        maison.ajouterPiece(cuisine);
        superficie = maison.getSuperficieTotale();
        System.out.println("Superficie avec la première pièce ajoutée : " + superficie);
        maison.ajouterPiece(salon);
        superficie = maison.getSuperficieTotale();
        System.out.println("Superficie avec la deuxième pièce ajoutée : " + superficie);

        //Essais superficie par étage
        maison.ajouterPiece(salleDeBain);
        maison.ajouterPiece(chambre);
        superficie = maison.getSuperficieEtage(1);
        System.out.println("Superficie à l'étage : " + superficie);

        //Essais erreurs
        Wc wc = new Wc(-17, 0);
        maison.ajouterPiece(null);
        maison.ajouterPiece(wc);

        //Essai méthode par type
        maison.ajouterPiece(chambre2);
        double superficieType = maison.getSuperficieType(chambre);
        String type = chambre.getClass().getSimpleName();
        System.out.println("Superficie par type de pièces (" + type + ") : " + superficieType);
        int nombrePieceType = maison.getNombrePieceType(chambre);
        System.out.println("Nombre de pièces du même type (" + type + ") : " + nombrePieceType);
    }
}
