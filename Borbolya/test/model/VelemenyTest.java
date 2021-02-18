/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
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
public class VelemenyTest {
    
    public VelemenyTest() {
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
     * Test of getId method, of class Velemeny.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Velemeny instance = new Velemeny();
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getApartmanID method, of class Velemeny.
     */
    @Test
    public void testGetApartmanID() {
        System.out.println("getApartmanID");
        Velemeny instance = new Velemeny();
        int expResult = 0;
        int result = instance.getApartmanID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNev method, of class Velemeny.
     */
    @Test
    public void testGetNev() {
        System.out.println("getNev");
        Velemeny instance = new Velemeny();
        String expResult = "";
        String result = instance.getNev();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Velemeny.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Velemeny instance = new Velemeny();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getErtekeles method, of class Velemeny.
     */
    @Test
    public void testGetErtekeles() {
        System.out.println("getErtekeles");
        Velemeny instance = new Velemeny();
        double expResult = 0.0;
        double result = instance.getErtekeles();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTetszett method, of class Velemeny.
     */
    @Test
    public void testGetTetszett() {
        System.out.println("getTetszett");
        Velemeny instance = new Velemeny();
        String expResult = "";
        String result = instance.getTetszett();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNemTetszett method, of class Velemeny.
     */
    @Test
    public void testGetNemTetszett() {
        System.out.println("getNemTetszett");
        Velemeny instance = new Velemeny();
        String expResult = "";
        String result = instance.getNemTetszett();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMegjegyzes method, of class Velemeny.
     */
    @Test
    public void testGetMegjegyzes() {
        System.out.println("getMegjegyzes");
        Velemeny instance = new Velemeny();
        String expResult = "";
        String result = instance.getMegjegyzes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllVelemeny method, of class Velemeny.
     */
    @Test
    public void testGetAllVelemeny() {
        System.out.println("getAllVelemeny");
        List<Velemeny> expResult = null;
        List<Velemeny> result = Velemeny.getAllVelemeny();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createVelemeny method, of class Velemeny.
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
        Velemeny.createVelemeny(nev, apartmanid, email, eretkeles, tetszett, nemTetszett, megjegyzes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Velemeny.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Velemeny instance = new Velemeny();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Velemeny.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Velemeny instance = new Velemeny();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Velemeny.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Velemeny instance = new Velemeny();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
