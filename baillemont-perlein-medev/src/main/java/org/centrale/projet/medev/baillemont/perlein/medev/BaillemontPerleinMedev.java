/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.centrale.projet.medev.baillemont.perlein.medev;
import java.util.Scanner;

/**
 *
 * @author morga
 */
public class BaillemontPerleinMedev {

    private Plateau plateau;
    private Joueur joueur1;
    private Joueur joueur2;
    private Joueur joueur_actuel;

    public BaillemontPerleinMedev() {
        plateau = new Plateau();
        joueur1 = new Joueur("Joueur 1", Pion.NOIR);
        joueur2 = new Joueur("Joueur 2", Pion.BLANC);
        joueur_actuel = joueur1;
    }

        public void jouer() {
            
        //to do : dans plateau, implémenter mouvementValide, jouerMouvement et peutJouer
            
        Scanner scanner = new Scanner(System.in);
        while (true) {
            plateau.afficher();
            System.out.println(joueur_actuel.getNom() + "Entrer le mouvement (ex: e5) : ");
            String mouvement = scanner.nextLine();

            // vérif validité du mouvement
            if (mouvement.length() < 2) {
                System.out.println("Non valide");
                continue;
            }

            // convertir en coordonnées
            int colonne = mouvement.charAt(0) - 'a';
            int ligne = Character.getNumericValue(mouvement.charAt(1)) - 1;

            // vérif validité des coordonnées
            if (ligne < 0 || ligne >= 8 || colonne < 0 || colonne >= 8) {
                System.out.println("Non valide");
                continue;
            }

            //test si le mouvement est ok
            
            if (plateau.mouvementValide(ligne, colonne, joueur_actuel.getCouleur())) {
                
                //jouer le tour
                plateau.jouerMouvement(ligne, colonne, joueur_actuel.getCouleur());
                
                // changement de joueur
                joueur_actuel = (joueur_actuel == joueur1) ? joueur2 : joueur1;
            } 
            
            else {
                System.out.println("Non valide");
            }

            // vérif si partie finie ou non
            if (!plateau.peutJouer(joueur1.getCouleur()) && !plateau.peutJouer(joueur2.getCouleur())) {
                System.out.println("Partie terminée. QUi a gagné ?!?!");
                break;
            }
        }
        scanner.close();
        afficherResultat() ;
        
        }
    
    private void afficherResultat() {
        // Comptez les pions pour chaque joueur
        int scoreJoueur1 = plateau.compterPions(joueur1.getCouleur());
        int scoreJoueur2 = plateau.compterPions(joueur2.getCouleur());

        System.out.println("Score de " + joueur1.getNom() + " (NOIR) : " + scoreJoueur1);
        System.out.println("Score de " + joueur2.getNom() + " (BLANC) : " + scoreJoueur2);

        if (scoreJoueur1 > scoreJoueur2) {
            System.out.println("Victoire de " + joueur1.getNom());
        } else if (scoreJoueur2 > scoreJoueur1) {
            System.out.println("Victoire de " + joueur2.getNom());
        } else {
            System.out.println("Match nul");
        }
    }

        
    public static void main(String[] args) {
        BaillemontPerleinMedev jeu = new BaillemontPerleinMedev();
        jeu.jouer();
    }
}
