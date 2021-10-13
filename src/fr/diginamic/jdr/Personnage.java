package fr.diginamic.jdr;

import java.util.Random;

/**
 * TP - Autonomie - Exercice JeuDeRole
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 08/10/2021
 */
public abstract class Personnage {

    /**
     * Attributs
     */
    protected int force;
    protected int pointsDeVie;
    protected int score;

    /**
     * Constructeur
     *
     * @param force
     * @param pointsDeVie
     * @param score
     */
    public Personnage(int force, int pointsDeVie, int score) {
        this.force = force;
        this.pointsDeVie = pointsDeVie;
        this.score = score;
    }

    /**
     * Constructeur vide
     */
    public Personnage() {
    }

    /**
     * Méthode pour créer un personnage d'une classe
     * spécifique avec des statistiques aléatoires
     *
     * @param personnage
     * @return personnage
     */
    public Personnage creerPersonnage(Personnage personnage) {
        String typePersonnage = personnage.getClass().getSimpleName();
        switch (typePersonnage) {
            case "Joueur":
                force = getRandomNumber(12, 18);
                pointsDeVie = getRandomNumber(20, 50);
                score = 0;
                return new Joueur(force, pointsDeVie, score);
            case "Loup":
                force = getRandomNumber(3, 8);
                pointsDeVie = getRandomNumber(5, 10);
                score = 1;
                return new Loup(force, pointsDeVie, score);
            case "Gobelin":
                force = getRandomNumber(5, 10);
                pointsDeVie = getRandomNumber(10, 15);
                score = 2;
                return new Gobelin(force, pointsDeVie, score);
            case "Troll":
                force = getRandomNumber(10, 15);
                pointsDeVie = getRandomNumber(20, 30);
                score = 5;
                return new Gobelin(force, pointsDeVie, score);
        }
        return personnage;
    }

    /**
     * Méthode pour attaquer avec le personnage indiqué
     *
     * @return attaque
     */
    public int attaquer() {
        int attaque;
        attaque = force + getRandomNumber(1, 10);
        return attaque;
    }

    /**
     * Méthode pour utiliser utiliser un chiffre aléatoire entre une rangée donnée
     *
     * @param min
     * @param max
     * @return random
     */
    private static int getRandomNumber(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("Le maximum doit être plus haut que le minimum.");
        }
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
