package fr.diginamic.essais;
/**
 * TP - Autonomie - Exercice Forme
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 08/10/2021
 */

import fr.diginamic.formes.Forme;

public class AffichageForme {
    public void afficher(Forme forme) {
        double perimetre = forme.calculerPerimetre();
        double surface = forme.calculerSurface();

        System.out.println("Forme passée en paramètre : " + forme.getClass().getSimpleName());
        System.out.println("Périmètre de la forme : " + perimetre);
        System.out.println("Surface ou aire de la forme : " + surface);
    }
}
