package entites2;

import entites.AdressePostale;

/**
 * Classe qui représente une personne
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 07/10/2021
 */
public class Personne {
    /**
     * Attributs
     */
    public String nom;
    public String prenom;
    public AdressePostale adressePostale;

    /**
     * Constructeur
     * @param nom
     * @param prenom
     */
    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    /**
     * Constructeur
     * @param nom
     * @param prenom
     * @param adressePostale
     */
    public Personne(String nom, String prenom, AdressePostale adressePostale) {
        this.nom = nom;
        this.prenom = prenom;
        this.adressePostale = adressePostale;
    }

    /**
     * Getter de nom
     * @return nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter de nom
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Getter de prenom
     * @return prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Setter de prenom
     * @param prenom
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * Getter de adressePostale
     * @return adressePostale
     */
    public AdressePostale getAdressePostale() {
        return adressePostale;
    }

    /**
     * Setter de adressePostale
     * @param adressePostale
     */
    public void setAdressePostale(AdressePostale adressePostale) {
        this.adressePostale = adressePostale;
    }
}
