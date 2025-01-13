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
        //initialiserPlateau(); #TODO
    }
}
