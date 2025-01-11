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
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 *
 * @author ASUS
 */
public class BaillemontPerleinMedevTest {

    @Test
    void testMain() {
        // Capture la sortie standard
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Appeler la méthode main
        BaillemontPerleinMedev.main(null);

        // Récupère la sortie et vérifie qu'elle est correcte
        String output = outputStream.toString().trim(); // Supprime les espaces inutiles
        assertEquals("Hello World!", output);

        // Optionnel : restaurer la sortie standard après le test
        System.setOut(System.out);
    }
}
