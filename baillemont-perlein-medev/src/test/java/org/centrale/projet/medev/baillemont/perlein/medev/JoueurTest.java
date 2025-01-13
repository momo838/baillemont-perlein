/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.centrale.projet.medev.baillemont.perlein.medev;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author morga
 */
public class JoueurTest {
    
    public JoueurTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getNom method, of class Joueur.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        Joueur instance = new Joueur("Hector", Pion.BLANC);
        String expResult = "Hector";
        String result = instance.getNom();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNom method, of class Joueur.
     */
    @Test
    public void testSetNom() {
        System.out.println("setNom");
        String nom = "Morgane";
        Joueur instance = new Joueur("Hector", Pion.BLANC);
        instance.setNom(nom);
        String expResult = "Morgane";
        String result = instance.getNom();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCouleur method, of class Joueur.
     */
    @Test
    public void testGetCouleur() {
        System.out.println("getCouleur");
        Joueur instance = new Joueur("Hector", Pion.BLANC);
        Pion expResult = Pion.BLANC;
        Pion result = instance.getCouleur();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCouleur method, of class Joueur.
     */
    @Test
    public void testSetCouleur() {
        System.out.println("setCouleur");
        Pion couleur = Pion.NOIR;
        Joueur instance = new Joueur("Hector", Pion.BLANC);
        instance.setCouleur(couleur);
        Pion expResult = Pion.NOIR;
        Pion result = instance.getCouleur();
        assertEquals(expResult, result);
    }
    
}
