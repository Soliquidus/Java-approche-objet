package entites;

public class TestAdressePostale {
    public static void main(String[] args) {
        AdressePostale adressePostale1 = new AdressePostale();
        adressePostale1.numeroRue = 1;
        adressePostale1.libelleRue = "Rue du Test";
        adressePostale1.codePostal = 68524;
        adressePostale1.ville = "Test-Ville";

        AdressePostale adressePostale2 = new AdressePostale();
        adressePostale2.numeroRue = 25;
        adressePostale2.libelleRue = "Rue du Testeur fou";
        adressePostale2.codePostal = 66666;
        adressePostale2.ville = "Ville-Test";

        System.out.println("Test adresses : ");
        System.out.println(adressePostale1.numeroRue + " " + adressePostale1.libelleRue + " " + adressePostale1.codePostal + " " + adressePostale1.ville);
        System.out.println(adressePostale2.numeroRue + " " + adressePostale2.libelleRue + " " + adressePostale2.codePostal + " " + adressePostale2.ville);
    }
}
