package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.List;

/**
 * TP Autonomie - Exercice Recensement Population
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 14 /10/2021
 */
public class Recensement {
    private List<Ville> villes;

    /**
     * Instantiates a new Recensement.
     *
     * @param lignes the lignes
     */
    public Recensement(List<String> lignes){
        List<Ville> newListe = new ArrayList<>();

        for (String string : lignes) {
//            On ignore le header afin de ne pas entrer en conflit avec du parsing éventuel
            if (string.equals("Code région;Nom de la région;Code département;Code arrondissement;Code canton;Code commune;Nom de la commune;Population municipale;Population comptée à part;Population totale;"))
                continue;
            string = string.trim().replaceAll(" ", "");
            String[] token = string.split(";");
            Region reg = new Region(Integer.parseInt(token[0]), token[1]);
            Departement dep = new Departement(token[2], reg);
            Ville ville = new Ville(Integer.parseInt(token[5]), token[6], Integer.parseInt(token[9]), dep);
            newListe.add(ville);
        }
        this.villes = newListe;
    }

    /**
     * Afficher villes.
     */
    public void afficherVilles(){
        for(Ville ville : villes){
            System.out.println(ville.toString());
        }
    }

    /**
     * Gets villes.
     *
     * @return the villes
     */
    public List<Ville> getVilles() {
        return villes;
    }

    /**
     * Sets villes.
     *
     * @param villes the villes
     */
    public void setVilles(List<Ville> villes) {
        this.villes = villes;
    }
}
