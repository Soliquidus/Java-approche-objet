package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        Personne personne1 = new Personne();
        personne1.nom = "Patoulacci";
        personne1.prenom = "Robert";
        personne1.adressePostale = new AdressePostale();
        personne1.adressePostale.numeroRue = 3;
        personne1.adressePostale.libelleRue = "Rue de la paix avant tout";
        personne1.adressePostale.codePostal = 78954;
        personne1.adressePostale.ville = "Paix-Ville";

        Personne personne2 = new Personne();
        personne2.nom = "Connor";
        personne2.prenom = "Sarah";
        personne2.adressePostale = new AdressePostale();
        personne2.adressePostale.numeroRue = 66;
        personne2.adressePostale.libelleRue = "Rue Skynet";
        personne2.adressePostale.codePostal = 66666;
        personne2.adressePostale.ville = "Armageddon";

        System.out.println("Test de l'entité personne :");
        System.out.println(personne1.nom + " " + personne1.prenom + " habite à :");
        System.out.println(personne1.adressePostale.numeroRue + " " + personne1.adressePostale.libelleRue + " " + personne1.adressePostale.codePostal + " " + personne1.adressePostale.ville);
        System.out.println(personne2.nom + " " + personne2.prenom + " habite à :");
        System.out.println(personne2.adressePostale.numeroRue + " " + personne2.adressePostale.libelleRue + " " + personne2.adressePostale.codePostal + " " + personne2.adressePostale.ville);
    }
}
