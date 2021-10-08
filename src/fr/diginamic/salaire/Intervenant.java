package fr.diginamic.salaire;
/**
 * TP - Autonomie - Exercice CalculSalaire
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 08/10/2021
 */
public abstract class Intervenant {
    protected String nom;
    protected String prenom;

    public Intervenant(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public Intervenant() {
    }

    public abstract double getSalaire();

    public void afficherDonnees(Intervenant intervenant){
        double salaire = intervenant.getSalaire();
        String statut = intervenant.getClass().getSimpleName();

        System.out.println("Fiche de l'intervenant : ");
        System.out.println("Nom/Prénom : " + intervenant.nom + " " + intervenant.prenom);
        System.out.println("Salaire : " + salaire);
        System.out.println("Statut : " + statut);
    }
}
