/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.Date;
import java.util.List;
import model.Foglalas;
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
public class FoglalasServiceTest {
    
    public FoglalasServiceTest() {
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
     * Test of createFoglalas method, of class FoglalasService.
     */
    @Test
    public void testCreateFoglalas() {
        System.out.println("createFoglalas");
        Integer apartmanid_in = null;
        String nev_in = "";
        String email_in = "";
        String telefon_in = "";
        Date erkezes_in = null;
        Date tavozas_in = null;
        Integer felnott_in = null;
        Integer gyerek1_in = null;
        Integer gyerek2_in = null;
        Integer kisallat_in = null;
        String fizetesimod_in = "";
        FoglalasService instance = new FoglalasService();
        instance.createFoglalas(apartmanid_in, nev_in, email_in, telefon_in, erkezes_in, tavozas_in, felnott_in, gyerek1_in, gyerek2_in, kisallat_in, fizetesimod_in);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllFoglalasDatum method, of class FoglalasService.
     */
    @Test
    public void testGetAllFoglalasDatum() {
        System.out.println("getAllFoglalasDatum");
        Integer id = null;
        FoglalasService instance = new FoglalasService();
        List<Foglalas> expResult = null;
        List<Foglalas> result = instance.getAllFoglalasDatum(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
