/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.centrale.medev.tp4_medev;

import java.util.logging.Logger;
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
     * Test of deplace method, of class Pion.
     */
    @Test
    void testDeplace() {
        Logger logger = Logger.getLogger(getClass().getName());
        logger.info("déplace");
        Plateau plateau = new Plateau(new Pion[10][10]);
        int n = 0;
        plateau.getContenu()[5][5]=new Pion(new Point2D(5,5),0);
        plateau.getContenu()[5][5].deplace(plateau, n);
        assertEquals(6,plateau.getContenu()[5][5].getPos().getX());
        assertEquals(6,plateau.getContenu()[5][5].getPos().getY());
    }
    
}
