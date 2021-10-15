package fr.diginamic.jdr;

import java.util.Random;
import java.util.Scanner;

public class Menu {
    public void lancerJeu() {
        //Variables
        int chiffreSaisi;
        boolean gameOn = true;
        Joueur joueur = new Joueur();
        Scanner sc = new Scanner(System.in);

        //Menu du jeu, les touches étant simples et peu nombreuses, on décide de ne l'afficher qu'une fois durant une partie.
        System.out.println("-- Menu du jeu --\n" +
                        "1 -> Créer le personnage\n" +
                        "2 -> Combattre une créature\n" +
                        "3 -> Afficher score\n" +
                        "4 -> Quitter le jeu\n" +
                        "-- -- -- -- -- --"
                );

        //Boucle de jeu
        do {
            try {
                chiffreSaisi = sc.nextInt();
                switch (chiffreSaisi) {
                    case 1:
                        joueur.creerPersonnage(joueur);
                        System.out.println("-- Vous créez un nouveau personnage (force " + joueur.force + ", points de vie " + joueur.pointsDeVie + ") --");
                        break;
                    case 2:
                        //Variables pour instancier les classes avec des statistiques aléatoires.
                        Loup loup = new Loup();
                        loup.creerPersonnage(loup);
                        Gobelin gobelin = new Gobelin();
                        gobelin.creerPersonnage(gobelin);
                        Troll troll = new Troll();
                        troll.creerPersonnage(troll);
                        Random random = new Random();
                        //On place les creatures instanciées dans un tableau pour pouvoir les piocher de manière aléatoire lors d'un combat.
                        Personnage[] creatures = {loup, gobelin, troll};
                        int selectionner = random.nextInt(creatures.length);
                        Personnage creature = creatures[selectionner];
                        creature.creerPersonnage(creature);
                        //On entre dans la boucle de combat.
                        System.out.println("-- Nouveau combat avec un " + creature.getClass().getSimpleName() + " ! --");
                        do {
                            //Variables pour calculer les dégâts infligés ensuite.
                            int attaqueJoueur, attaqueCreature;
                            attaqueJoueur = joueur.attaquer();
                            attaqueCreature = creature.attaquer();
                            //Si l'attaque du joueur est la plus puissante, alors on calcule la différence de dégâts infligés sur la créature.
                            if (attaqueJoueur > attaqueCreature) {
                                int degatsJoueur = attaqueJoueur - attaqueCreature;
                                creature.pointsDeVie -= degatsJoueur;
                                System.out.println("Le joueur inflige " + degatsJoueur + " de dégâts. Il reste " + creature.pointsDeVie +
                                        " de vie au " + creature.getClass().getSimpleName());
                            }
                            //Si l'attaque de la créature est la plus puissante, alors on calcule la différence de dégâts infligés sur le joueur.
                            else {
                                int degatsCreature = attaqueCreature - attaqueJoueur;
                                joueur.pointsDeVie -= degatsCreature;
                                System.out.println("La créature inflige " + degatsCreature + " de dégâts. Il reste " + joueur.pointsDeVie +
                                        " de vie au joueur.");
                            }
                            //Si la santé de la créature est à 0 ou moins le joueur gagne et on ajoute les points au score.
                            if(creature.pointsDeVie <= 0 && joueur.pointsDeVie > 0){
                                joueur.score += creature.score;
                                //Petite condition pour chipoter sur l'orthographe afin de correctement afficher points au singulier quand on en gagne qu'un.
                                System.out.printf("-- Le joueur gagne la partie et gagne %d point%s ! --", creature.score, creature.score > 1 ? "s" : "");
                            }
                            //Si le joueur n'a plus de vie, alors la partie s'arrête et affiche le score total.
                            if(joueur.pointsDeVie <= 0){
                                System.out.println("-- Le joueur perd la partie ! Score final : " + joueur.score + " points. --");
                                gameOn = false;
                            }
                            //La boucle de combat dure tant que le joueur et la créature disposent encore de points de vie.
                        } while (joueur.pointsDeVie > 0 && creature.pointsDeVie > 0);
                        break;
                    case 3:
                        System.out.println("-- Votre score : " + joueur.score + " --");
                        break;
                    case 4:
                        gameOn = false;
                }

            } catch (java.util.InputMismatchException e) {
                System.out.print("Vous devez obligatoirement taper un nombre !");
                break;
            }
        }
        while (gameOn);
    }
}
