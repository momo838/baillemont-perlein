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

    /**
     * Test of jouer method, of class BaillemontPerleinMedev.
     */
    @Test
    public void testJouer() {
        System.out.println("jouer");
        BaillemontPerleinMedev instance = new BaillemontPerleinMedev();
        instance.jouer();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class BaillemontPerleinMedev.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        BaillemontPerleinMedev.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
    public void testChangementDeJoueur() {
        BaillemontPerleinMedev jeu = new BaillemontPerleinMedev();
        // Simulez un mouvement valide et vérifiez le changement de joueur
        jeu.getPlateau().jouerMouvement(3, 4, Pion.NOIR); // Joueur 1 joue
        assertEquals(jeu.getJoueur2(), jeu.getJoueur_actuel()); // Le joueur actuel doit être Joueur 2
    }
    
    @Test
    public void testAffichageResultat() {
        BaillemontPerleinMedev jeu = new BaillemontPerleinMedev();
        // Simulez des scores et vérifiez l'affichage
        jeu.getPlateau().jouerMouvement(3, 4, Pion.NOIR);
        jeu.getPlateau().jouerMouvement(4, 5, Pion.BLANC);
        jeu.getPlateau().jouerMouvement(5, 4, Pion.NOIR);
        jeu.getPlateau().jouerMouvement(4, 3, Pion.BLANC);

        // Vérifiez que les scores sont corrects
        int scoreJoueur1 = jeu.getPlateau().compterPions(Pion.NOIR);
        int scoreJoueur2 = jeu.getPlateau().compterPions(Pion.BLANC);
        assertEquals(2, scoreJoueur1);
        assertEquals(2, scoreJoueur2);
    }
    
    @Test
    public void testPartieTerminee() {
        BaillemontPerleinMedev jeu = new BaillemontPerleinMedev();
        // Simulez une partie terminée
        jeu.getPlateau().jouerMouvement(3, 4, Pion.NOIR);
        jeu.getPlateau().jouerMouvement(4, 5, Pion.BLANC);
        jeu.getPlateau().jouerMouvement(5, 4, Pion.NOIR);
        jeu.getPlateau().jouerMouvement(4, 3, Pion.BLANC);
        
        // Simulez que les deux joueurs ne peuvent plus jouer
        assertFalse(jeu.getPlateau().peutJouer(Pion.NOIR));
        assertFalse(jeu.getPlateau().peutJouer(Pion.BLANC));
    }
}
