package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {
    public static void main(String[] args) {
        Compte compteNormal = new Compte(105_484_987_897L, 350_000);
        CompteTaux compteTaux = new CompteTaux(105_484_987_900L, 100_000_000, 10000);
        Compte [] comptes = {compteNormal, compteTaux};
        for (Compte compte : comptes) {
            System.out.println(compte);
        }
    }
}
