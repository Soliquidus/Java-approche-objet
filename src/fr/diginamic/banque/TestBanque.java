package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;

public class TestBanque {
    public static void main(String[] args) {
        Compte compte = new Compte(105_484_987_897L, 350_000);
        System.out.println(compte);
        //Constat : en respectant l'encapsulation, l'accès aux propriétés est impossible car aucun héritage
        //n'est mis en place.
    }
}
