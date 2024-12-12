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
     * Test of deplaceNonPrenable method, of class Pion.
     */
    @Test
    public void testDeplaceNonPrenable() {
        System.out.println("deplaceNonPrenable");
        Plateau plateau = new Plateau(new Pion[10][10]);
        int n = 0;
        plateau.getContenu()[5][5]=new Pion(new Point2D(5,5),0);
        plateau.getContenu()[5][5].deplaceNonPrenable(plateau, n);
        assertEquals(6,plateau.getContenu()[6][6].getPos().getX());
        assertEquals(6,plateau.getContenu()[6][6].getPos().getY());
    }
    
    @Test
    public void testDeplacePrenable(){
        System.out.println("deplacePrenable");
        Plateau plateau = new Plateau(new Pion[10][10]);
        int n = 0;
        plateau.getContenu()[5][5]=new Pion(new Point2D(5,5),0);
        Pion pion=new Pion(new Point2D(6,6),1);
        plateau.getContenu()[6][6]=pion;
        plateau.getContenu()[5][5].deplacePrenable(plateau, n,pion);
        assertEquals(7,plateau.getContenu()[7][7].getPos().getX());
        assertEquals(7,plateau.getContenu()[7][7].getPos().getY());
        assertEquals(null, plateau.getContenu()[6][6]);
    }
    
    
    
}
