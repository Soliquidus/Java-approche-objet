package entites2;

import entites.AdressePostale;

/**
 * Classe qui représente une personne
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 07/10/2021
 */
public class Personne {
    //Variables
    public String nom;
    public String prenom;
    public AdressePostale adressePostale;

    //Constructeurs
    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public Personne(String nom, String prenom, AdressePostale adressePostale) {
        this.nom = nom;
        this.prenom = prenom;
        this.adressePostale = adressePostale;
    }
}
