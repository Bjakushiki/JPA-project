/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

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
public class ApartmanTest {
    
    public ApartmanTest() {
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
     * Test of getId method, of class Apartman.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Apartman instance = new Apartman();
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getApartmanNev method, of class Apartman.
     */
    @Test
    public void testGetApartmanNev() {
        System.out.println("getApartmanNev");
        Apartman instance = new Apartman();
        String expResult = "";
        String result = instance.getApartmanNev();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setApartmanNev method, of class Apartman.
     */
    @Test
    public void testSetApartmanNev() {
        System.out.println("setApartmanNev");
        String apartmanNev = "";
        Apartman instance = new Apartman();
        instance.setApartmanNev(apartmanNev);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFo1 method, of class Apartman.
     */
    @Test
    public void testGetFo1() {
        System.out.println("getFo1");
        Apartman instance = new Apartman();
        int expResult = 0;
        int result = instance.getFo1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFo2 method, of class Apartman.
     */
    @Test
    public void testGetFo2() {
        System.out.println("getFo2");
        Apartman instance = new Apartman();
        int expResult = 0;
        int result = instance.getFo2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFo3 method, of class Apartman.
     */
    @Test
    public void testGetFo3() {
        System.out.println("getFo3");
        Apartman instance = new Apartman();
        int expResult = 0;
        int result = instance.getFo3();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFo4 method, of class Apartman.
     */
    @Test
    public void testGetFo4() {
        System.out.println("getFo4");
        Apartman instance = new Apartman();
        int expResult = 0;
        int result = instance.getFo4();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTobbFo method, of class Apartman.
     */
    @Test
    public void testGetTobbFo() {
        System.out.println("getTobbFo");
        Apartman instance = new Apartman();
        int expResult = 0;
        int result = instance.getTobbFo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPotagyAr method, of class Apartman.
     */
    @Test
    public void testGetPotagyAr() {
        System.out.println("getPotagyAr");
        Apartman instance = new Apartman();
        int expResult = 0;
        int result = instance.getPotagyAr();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readApartmanByID method, of class Apartman.
     */
    @Test
    public void testReadApartmanByID() {
        System.out.println("readApartmanByID");
        Integer id_in = null;
        Apartman expResult = null;
        Apartman result = Apartman.readApartmanByID(id_in);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Apartman.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Apartman instance = new Apartman();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Apartman.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Apartman instance = new Apartman();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Apartman.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Apartman instance = new Apartman();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
