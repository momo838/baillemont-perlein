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
public class BaillemontPerleinMedevTest {
    
    public BaillemontPerleinMedevTest() {
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
    
    @Test
    public void testInitialisation() {
        BaillemontPerleinMedev jeu = new BaillemontPerleinMedev();
        // Vérifiez que le plateau est initialisé correctement
        assertNotNull(jeu);
        assertNotNull(jeu.getPlateau());
        assertEquals(Pion.NOIR, jeu.getJoueur1().getCouleur());
        assertEquals(Pion.BLANC, jeu.getJoueur2().getCouleur());
        assertEquals(jeu.getJoueur1(), jeu.getJoueur_actuel());
    }

    
    @Test
    public void testAffichageResultat() {
        BaillemontPerleinMedev jeu = new BaillemontPerleinMedev();

        // Vérifiez que les scores sont corrects
        int scoreJoueur1 = jeu.getPlateau().compterPions(Pion.NOIR);
        int scoreJoueur2 = jeu.getPlateau().compterPions(Pion.BLANC);
        assertEquals(2, scoreJoueur1);
        assertEquals(2, scoreJoueur2);
    }
}
