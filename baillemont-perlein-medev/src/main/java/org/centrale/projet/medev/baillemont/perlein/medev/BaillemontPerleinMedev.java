/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.centrale.projet.medev.baillemont.perlein.medev;

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

    
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
