/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import model.Velemeny;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Benedek
 */
public class VelemenyServiceTest {
    
    public VelemenyServiceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getAllVelemeny method, of class VelemenyService.
     */
    @Test
    public void testGetAllVelemeny() {
        System.out.println("getAllVelemeny");
        Integer id = null;
        VelemenyService instance = new VelemenyService();
        List<Velemeny> expResult = null;
        List<Velemeny> result = instance.getAllVelemeny();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createVelemeny method, of class VelemenyService.
     */
    @Test
    public void testCreateVelemeny() {
        System.out.println("createVelemeny");
        String nev = "";
        Integer apartmanid = null;
        String email = "";
        Double eretkeles = null;
        String tetszett = "";
        String nemTetszett = "";
        String megjegyzes = "";
        VelemenyService instance = new VelemenyService();
        instance.createVelemeny(nev, apartmanid, email, eretkeles, tetszett, nemTetszett, megjegyzes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
