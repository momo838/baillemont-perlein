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
}
