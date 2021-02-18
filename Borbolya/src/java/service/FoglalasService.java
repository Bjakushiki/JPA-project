package service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.Apartman;
import model.Foglalas;
import model.Velemeny;


/**
 *
 * @author Bjakushiki
 */
public class FoglalasService {
    
    public void createFoglalas(Integer apartmanid_in, String nev_in, String email_in, String telefon_in, Date erkezes_in, Date tavozas_in, Integer felnott_in, Integer gyerek1_in, Integer gyerek2_in, Integer kisallat_in, String fizetesimod_in){
        
        SzamolasService szamolas = new SzamolasService();
        Integer ejszaka = szamolas.ejszakaSzamolas(erkezes_in, tavozas_in);
        Integer vegosszeg = szamolas.vegosszegSzamolas(apartmanid_in, felnott_in, gyerek1_in, gyerek2_in, kisallat_in, ejszaka);
        Integer potagy = szamolas.potagyszamolas(apartmanid_in, felnott_in, gyerek1_in, gyerek2_in);
        Foglalas.createFoglala(apartmanid_in, nev_in, email_in, telefon_in, erkezes_in, tavozas_in, felnott_in, gyerek1_in, gyerek2_in, kisallat_in, potagy, vegosszeg, fizetesimod_in);
        
        
        EmailService email = new EmailService();
        Apartman a = Apartman.readApartmanByID(apartmanid_in);
        String subject = "Új foglalás érkezett a "+ a.getApartmanNev()+"ra";
        String body = "Foglaló neve: "+nev_in +"\n"+
                      "Foglaló email címe: "+email_in+"\n"+
                      "Foglaló telefonszáma: "+telefon_in+"\n"+
                      "Tervezett érkezési dátum: "+erkezes_in.toString()+"\n"+
                      "Tervezett távozási dátum: "+tavozas_in.toString()+"\n"+
                      "Felnőttek száma: "+felnott_in.toString()+"\n"+
                      "0-3 éves gyerekek száma: "+gyerek1_in.toString()+"\n"+
                      "3-12 éves gyerekek száma: "+gyerek2_in.toString()+"\n"+
                      "Kisállatok száma: "+kisallat_in.toString()+"\n"+
                      "Szükséges: "+potagy.toString()+"\n"+
                      "Fizetendő összeg: "+vegosszeg.toString()+"\n"+
                      "Fizetési mód: "+fizetesimod_in;
        
        //email.kuldes(subject, body);
        

    }
    
    public List<Foglalas> getAllFoglalasDatum(Integer id){
        List<Foglalas> allFoglalas = new ArrayList<>();
        List<Foglalas> sortedFoglalas = new ArrayList<>();
        try{
            allFoglalas = Foglalas.getAllFoglalasDatum();
            for(Foglalas f: allFoglalas){
                if(f.getApartmanID()==id){
                    sortedFoglalas.add(f);
                }
            }
        }
        catch(Exception ex){
            System.out.println(ex.toString());
        }
        return sortedFoglalas;
        
    }

}
