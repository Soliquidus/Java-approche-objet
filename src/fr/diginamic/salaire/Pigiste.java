package fr.diginamic.salaire;

/**
 * TP - Autonomie - Exercice CalculSalaire
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 08/10/2021
 */
public class Pigiste extends Intervenant {
    private int joursTravaille;
    private double montantJournalier;

    public Pigiste(String nom, String prenom, int joursTravaille, double montantJournalier) {
        super(nom, prenom);
        this.joursTravaille = joursTravaille;
        this.montantJournalier = montantJournalier;
    }

    @Override
    public double getSalaire() {
        return montantJournalier * joursTravaille;
    }

}
