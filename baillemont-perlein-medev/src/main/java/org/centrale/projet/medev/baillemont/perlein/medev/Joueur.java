/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.projet.medev.baillemont.perlein.medev;

/**
 *
 * @author ASUS
 * Classe Joueur pour gérer la représentation des joueurs.
 */
public class Joueur {
    
    private String nom;
    private Pion couleur;

    public Joueur(String nom, Pion couleur) {
        this.nom = nom;
        this.couleur = couleur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Pion getCouleur() {
        return couleur;
    }

    public void setCouleur(Pion couleur) {
        this.couleur = couleur;
    }
    
    
}
