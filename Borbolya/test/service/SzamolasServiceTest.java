package service;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import model.Apartman;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SzamolasServiceTest {
    private SzamolasService underTest;
       
    
    @Before
    public void setUp() {
        underTest = new SzamolasService(); 
    }
   
 
    @Test
    public void testOsszFoSzamolasReturnsCorrectNumberOfPeople() {
        //GIVEN
        int felnott = 2;
        int gyerek1 = 1;
        int gyerek2 = 2;
        int expected = 5;
       
        //WHEN
        int actual = underTest.osszFoSzamolas(felnott, gyerek1, gyerek2);
           
                
       
        //THEN
        assertEquals(expected, actual);
    }

    @Test
   public void testEjszakaSzamolasReturnsCorrectNumberOfNights(){
        //GIVEN
        Date erkezes = new GregorianCalendar(2020, Calendar.JANUARY, 11).getTime();
        Date tavozas = new GregorianCalendar(2020, Calendar.JANUARY, 13).getTime();
        int expected = 2;
        
        //WHEN
        int actual = underTest.ejszakaSzamolas(erkezes, tavozas);
  
        //THEN
        assertEquals(expected, actual);
        
    }    
   
    @Test
    public void testCalculateVegosszegReturnsCorrectSum(){
        //GIVEN
        
        Apartman apartman = createApartman();
        int felnott = 2;
        int gyerek1 = 1;
        int gyerek2 = 2;
        int kisallat = 1;
        int ejszaka = 3;
       
        int expected = 3006; 
        
        //WHEN
        
        int actual = underTest.calculateVegosszeg(apartman, felnott, gyerek1, gyerek2, kisallat, ejszaka);
        
        //THEN
        
        assertEquals(expected, actual);
        
        
    }

    private Apartman createApartman() {
        Apartman apartman = new Apartman();
        apartman.setId(111);
        apartman.setApartmanNev("a");
        apartman.setFo1(1);
        apartman.setFo2(2);
        apartman.setFo3(3);
        apartman.setFo4(1);
        apartman.setPotagyAr(120);
        apartman.setTobbFo(1);
        return apartman;
    }
    
    @Test
    public void testGetPotAgySzamReturnsCorrectNumbersOfSpareBeds(){
        //GIVEN
        
        Apartman apartman = createApartman();
        int felnott = 2;
        int gyerek1 = 2;
        int gyerek2 = 2;
        
        int expected = 2;

        //WHEN
        
        int actual = underTest.getpotagyszam(apartman, felnott, gyerek1, gyerek2);
        
        
        //THEN
        
        assertEquals(expected, actual);
    }
    
}
