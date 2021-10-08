package fr.diginamic.salaire;

/**
 * TP - Autonomie - Exercice CalculSalaire
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 08/10/2021
 */
public class Pigiste extends Intervenant {

    /**
     * Attributs
     */
    private int joursTravaille;
    private double montantJournalier;

    /**
     * Constructeur
     *
     * @param nom
     * @param prenom
     * @param joursTravaille
     * @param montantJournalier
     */
    public Pigiste(String nom, String prenom, int joursTravaille, double montantJournalier) {
        super(nom, prenom);
        this.joursTravaille = joursTravaille;
        this.montantJournalier = montantJournalier;
    }

    /**
     * Méthode pour avoir le salaire correspondant au nombre de jours travaillés dans le mois.
     *
     * @return salaire
     */
    @Override
    public double getSalaire() {
        return montantJournalier * joursTravaille;
    }

}
