package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        AdressePostale adressePostale1 = new AdressePostale(3, "Rue de la paix avant tout", 78954, "Paix-Ville");
        AdressePostale adressePostale2 = new AdressePostale(66, "Rue Skynet", 66666, "Armageddon");

        Personne personne1 = new Personne("Patoulacci", "Robert", adressePostale1);
        Personne personne2 = new Personne("Connor", "Sarah", adressePostale2);

        System.out.println("Test de l'entité personne :");
        System.out.println(personne1.nom + " " + personne1.prenom + " habite à :");
        System.out.println(personne1.adressePostale.numeroRue + " " + personne1.adressePostale.libelleRue + " " + personne1.adressePostale.codePostal + " " + personne1.adressePostale.ville);
        System.out.println(personne2.nom + " " + personne2.prenom + " habite à :");
        System.out.println(personne2.adressePostale.numeroRue + " " + personne2.adressePostale.libelleRue + " " + personne2.adressePostale.codePostal + " " + personne2.adressePostale.ville);
    }
}
