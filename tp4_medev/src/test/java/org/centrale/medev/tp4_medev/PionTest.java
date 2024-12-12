/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.centrale.medev.tp4_medev;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author clesp
 */
public class PionTest {
    
    public PionTest() {
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
     * Test of getPos method, of class Pion.
     */
    @Test
    public void testGetPos() {
        System.out.println("getPos");
        Pion instance = new Pion();
        Point2D expResult = null;
        Point2D result = instance.getPos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCouleur method, of class Pion.
     */
    @Test
    public void testGetCouleur() {
        System.out.println("getCouleur");
        Pion instance = new Pion();
        int expResult = 0;
        int result = instance.getCouleur();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPos method, of class Pion.
     */
    @Test
    public void testSetPos() {
        System.out.println("setPos");
        Point2D pos = null;
        Pion instance = new Pion();
        instance.setPos(pos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCouleur method, of class Pion.
     */
    @Test
    public void testSetCouleur() {
        System.out.println("setCouleur");
        int couleur = 0;
        Pion instance = new Pion();
        instance.setCouleur(couleur);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deplace method, of class Pion.
     */
    @Test
    public void testDeplace() {
        System.out.println("deplace");
        Plateau plateau = new Plateau(new Pion[10][10]);
        int n = 0;
        plateau.getContenu()[5][5]=new Pion(new Point2D(5,5),0);
        plateau.getContenu()[5][5].deplace(plateau, n);
        assertEquals(6,plateau.getContenu()[5][5].getPos().getX());
        assertEquals(6,plateau.getContenu()[5][5].getPos().getY());
    }
    
}
