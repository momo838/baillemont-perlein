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
public class PlateauTest {
    public PlateauTest() {
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
     * Test of afficher method, of class Plateau.
     */
    @Test
    public void testAfficher() {
        System.out.println("afficher");
        Plateau instance = new Plateau();
        instance.afficher();
    }

    @Test
    public void testInitialisationPlateau() {
        // Vérifiez que le plateau est initialisé correctement
        Plateau plateau = new Plateau();
        assertEquals(Pion.BLANC, plateau.getPion(3, 3));
        assertEquals(Pion.NOIR, plateau.getPion(3, 4));
        assertEquals(Pion.NOIR, plateau.getPion(4, 3));
        assertEquals(Pion.BLANC, plateau.getPion(4, 4));
        assertEquals(Pion.VIDE, plateau.getPion(0, 0));
    }
    
}
