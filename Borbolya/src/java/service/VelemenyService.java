package service;

import java.util.ArrayList;
import java.util.List;
import model.Velemeny;

/**
 *
 * @author Bjakushiki
 */
public class VelemenyService {
    
        public List<Velemeny> getAllVelemenyByID(Integer id){
            List<Velemeny> allVelemeny = new ArrayList<>();
            List<Velemeny> sortedVelemeny = new ArrayList<>();
            try{
                allVelemeny = Velemeny.getAllVelemeny();
                for(Velemeny v: allVelemeny){
                    if(v.getApartmanID()==id){
                        sortedVelemeny.add(v);
                    }
                }
            }
            catch(Exception ex){
                System.out.println(ex.toString());
            }
            return sortedVelemeny;
        } 

        public void createVelemeny(String nev, Integer apartmanid, String email, Double eretkeles, String tetszett, String nemTetszett, String megjegyzes){
            
            Velemeny.createVelemeny(nev, apartmanid, email, eretkeles, tetszett, nemTetszett, megjegyzes);
            
            
        }
         public List<Velemeny> getAllVelemeny(){
            List<Velemeny> allVelemeny = new ArrayList<>();
            try{
                allVelemeny = Velemeny.getAllVelemeny();

            }
            catch(Exception ex){
                System.out.println(ex.toString());
            }
            return allVelemeny;
        } 
        
    
    
}
