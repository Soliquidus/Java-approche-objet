package fr.diginamic.maison;

/**
 * TP - Autonomie - Exercice Immobilier
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 08/10/2021
 */
public abstract class Piece {

    /**
     * Attributs
     */
    protected double superficie;
    protected int etage;

    /**
     * Constructeur
     *
     * @param superficie
     * @param etage
     */
    public Piece(double superficie, int etage) {
        this.superficie = superficie;
        this.etage = etage;
    }
}
