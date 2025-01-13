/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.projet.medev.baillemont.perlein.medev;

/**
 *
 * @author morga
 */
public class Plateau {
    private Pion[][] plateau;
    private static final int TAILLE = 8;

    public Plateau() {
        plateau = new Pion[TAILLE][TAILLE];
        initialiserPlateau(); 
    }
    
    /**
     *  Fonction d'initialisation du plateau. 
     *  Crée un plateau avec des pions vide puis ajoute des pions pour chaque joueur.
     */
    private void initialiserPlateau() {
        for (int i = 0; i < TAILLE; i++) {
            for (int j = 0; j < TAILLE; j++) {
                plateau[i][j] = Pion.VIDE;
            }
        }
        plateau[3][3] = Pion.BLANC;
        plateau[3][4] = Pion.NOIR;
        plateau[4][3] = Pion.NOIR;
        plateau[4][4] = Pion.BLANC;
    }
    
    /**
     * Fonction d'affichage texte du plateau
     */
    public void afficher() {
        System.out.print("  a b c d e f g h\n");
        for (int i = 0; i < TAILLE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < TAILLE; j++) {
                switch (plateau[i][j]) {
                    case NOIR:
                        System.out.print("N ");
                        break;
                    case BLANC:
                        System.out.print("B ");
                        break;
                    case VIDE:
                        System.out.print(". ");
                        break;
                }
            }
            System.out.println();
        }
    }

    public Pion[][] getPlateau() {
        return plateau;
    }

    public void setPlateau(Pion[][] plateau) {
        this.plateau = plateau;
    }
    
    /**
     * Recupère le pion de la ligne et la colonne spécifiées.
     * @param ligne
     * @param colonne
     * @return 
     */
    public Pion getPion(int ligne, int colonne) {
        return plateau[ligne][colonne];
}
}
