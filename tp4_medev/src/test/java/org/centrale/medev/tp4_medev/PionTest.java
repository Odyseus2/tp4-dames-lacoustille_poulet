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
        //nothing to do
    }
    
    @BeforeAll
    public static void setUpClass() {
        //nothing to do
    }
    
    @AfterAll
    public static void tearDownClass() {
        //nothing to do
    }
    
    @BeforeEach
    public void setUp() {
        //nothing to do
    }
    
    @AfterEach
    public void tearDown() {
        //nothing to do
    }

    /**
     * Test of deplaceNonPrenable method, of class Pion.
     */
    @Test
    void testDeplaceNonPrenable() {
        Logger logger = Logger.getLogger(getClass().getName());
        logger.info("deplaceNonPrenable");
        Plateau plateau = new Plateau(new Pion[10][10]);
        int n = 0;
        plateau.getContenu()[5][5]=new Pion(new Point2D(5,5),0);
        plateau.getContenu()[5][5].deplaceNonPrenable(plateau, n);
        assertEquals(6,plateau.getContenu()[6][6].getPos().getX());
        assertEquals(6,plateau.getContenu()[6][6].getPos().getY());
    }
    
    @Test
    void testDeplacePrenable(){
        Logger logger = Logger.getLogger(getClass().getName());
        logger.info("deplacePrenable");
        Plateau plateau = new Plateau(new Pion[10][10]);
        int n = 1;
        plateau.getContenu()[5][5]=new Pion(new Point2D(5,5),0);
        Pion pion=new Pion(new Point2D(6,6),1);
        plateau.getContenu()[6][6]=pion;
        plateau.getContenu()[5][5].deplacePrenable(plateau, n,pion);
        assertEquals(7,plateau.getContenu()[7][7].getPos().getX());
        assertEquals(7,plateau.getContenu()[7][7].getPos().getY());
        assertEquals(null, plateau.getContenu()[6][6]);
    }
    
    
    
}
