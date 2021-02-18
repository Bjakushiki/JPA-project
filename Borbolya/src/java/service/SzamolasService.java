package service;
import java.text.SimpleDateFormat;
import java.util.Date;
import model.Apartman;
/**
 *
 * @author Bjakushiki
 */
public class SzamolasService {

    
    public Integer vegosszegSzamolas(Integer apartmanId,Integer felnott,Integer gyerek1,Integer gyerek2,Integer kisallat,Integer ejszaka){
        Apartman a = Apartman.readApartmanByID(apartmanId);   
        return calculateVegosszeg(a,felnott,gyerek1,gyerek2,kisallat,ejszaka);

    }
    
    public Integer calculateVegosszeg(Apartman a,Integer felnott,Integer gyerek1,Integer gyerek2,Integer kisallat,Integer ejszaka){
        Integer vegosszeg = 0;
        Integer foperej=0;
        Integer osszfo = osszFoSzamolas(felnott,gyerek1,gyerek2);
        Integer potagyszam = potagyszamolas(a.getId(),felnott,gyerek1,gyerek2);
        switch(osszfo){
            case 1:
                foperej = a.getFo1();
                break;
            case 2:
                foperej = a.getFo2();
                break;
            case 3:
                foperej = a.getFo3();
                break;
            case 4:
                foperej = a.getFo4();
                break;
            default:
                foperej = a.getTobbFo();
        }
        Integer gyerek1ar = foperej/2;
        Integer gyerek2ar = (foperej/100)*75;
        Integer kisallatar = 1000;
        Integer potagyar = a.getPotagyAr(); 
        
        vegosszeg = ((felnott * foperej)+(gyerek1 * gyerek1ar)+(gyerek2 * gyerek2ar)+(kisallat * kisallatar)+(potagyszam * potagyar))*ejszaka;
        if(ejszaka>7){vegosszeg = (vegosszeg/100)*90;}
        return vegosszeg;
        
    }
     
    public Integer potagyszamolas(Integer apartmanId,Integer felnott,Integer gyerek1,Integer gyerek2){
        Apartman a = Apartman.readApartmanByID(apartmanId);
        return getpotagyszam(a, felnott, gyerek1, gyerek2);
    }
    
    public Integer getpotagyszam(Apartman apartman, Integer felnott, Integer gyerek1, Integer gyerek2){
         Integer potagyszam = 0;
        
        Integer osszfo = osszFoSzamolas(felnott,gyerek1,gyerek2);
        if(osszfo > 4 && (apartman.getFo1()!=0 && apartman.getFo2()!=0 && apartman.getFo3()!=0 && apartman.getFo4()!=0)){
            potagyszam = osszfo - 4;
        }
        return potagyszam;
    }
    
    public Integer osszFoSzamolas(Integer felnott,Integer gyerek1,Integer gyerek2){
        Integer osszfo = felnott + gyerek1 + gyerek2;
        return osszfo;
    }

    
    public int ejszakaSzamolas(Date erkezes, Date tavozas) {
    int daysdiff = 0;
    long diff = tavozas.getTime() - erkezes.getTime();
    long diffDays = diff / (24 * 60 * 60 * 1000);
    daysdiff = (int) diffDays;
    return daysdiff;
}

}
