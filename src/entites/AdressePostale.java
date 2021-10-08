package entites;
/**
 * Classe qui représente une adresse postale
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 07/10/2021
 */
public class AdressePostale {
    /**
     * Variables
     */
    public int numeroRue;
    public String libelleRue;
    public int codePostal;
    public String ville;

    /**
     * Constructeur vide
     */
    public AdressePostale(){

    }

    /**
     * Constructeur
     * @param numeroRue
     * @param libelleRue
     * @param codePostal
     * @param ville
     */
    public AdressePostale(int numeroRue, String libelleRue, int codePostal, String ville) {
        this.numeroRue = numeroRue;
        this.libelleRue = libelleRue;
        this.codePostal = codePostal;
        this.ville = ville;
    }
}
