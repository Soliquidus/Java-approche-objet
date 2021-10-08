package fr.diginamic.essais;

import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Rectangle;

/**
 * TP - Autonomie - Exercice Forme
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 08/10/2021
 */
public class TestForme {
    public static void main(String[] args) {
        Cercle cercle = new Cercle(180.50);
        Rectangle rectangle = new Rectangle(90.5, 60.70);
        Carre carre = new Carre(40);
        AffichageForme affichage = new AffichageForme();

        affichage.afficher(cercle);
        affichage.afficher(rectangle);
        affichage.afficher(carre);
    }
}
