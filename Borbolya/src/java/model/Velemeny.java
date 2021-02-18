package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.ParameterMode;
import javax.persistence.Persistence;
import javax.persistence.StoredProcedureQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Bjakushiki
 */
@Entity
@Table(name = "velemeny")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Velemeny.findAll", query = "SELECT v FROM Velemeny v")
    , @NamedQuery(name = "Velemeny.findById", query = "SELECT v FROM Velemeny v WHERE v.id = :id")
    , @NamedQuery(name = "Velemeny.findByApartmanID", query = "SELECT v FROM Velemeny v WHERE v.apartmanID = :apartmanID")
    , @NamedQuery(name = "Velemeny.findByNev", query = "SELECT v FROM Velemeny v WHERE v.nev = :nev")
    , @NamedQuery(name = "Velemeny.findByEmail", query = "SELECT v FROM Velemeny v WHERE v.email = :email")
    , @NamedQuery(name = "Velemeny.findByErtekeles", query = "SELECT v FROM Velemeny v WHERE v.ertekeles = :ertekeles")
    , @NamedQuery(name = "Velemeny.findByTetszett", query = "SELECT v FROM Velemeny v WHERE v.tetszett = :tetszett")
    , @NamedQuery(name = "Velemeny.findByNemTetszett", query = "SELECT v FROM Velemeny v WHERE v.nemTetszett = :nemTetszett")
    , @NamedQuery(name = "Velemeny.findByMegjegyzes", query = "SELECT v FROM Velemeny v WHERE v.megjegyzes = :megjegyzes")})
public class Velemeny implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "ApartmanID")
    private int apartmanID;
    @Basic(optional = false)
    @Column(name = "Nev")
    private String nev;
    @Basic(optional = false)
    @Column(name = "E-mail")
    private String email;
    @Basic(optional = false)
    @Column(name = "Ertekeles")
    private double ertekeles;
    @Basic(optional = false)
    @Column(name = "Tetszett")
    private String tetszett;
    @Basic(optional = false)
    @Column(name = "NemTetszett")
    private String nemTetszett;
    @Basic(optional = false)
    @Column(name = "Megjegyzes")
    private String megjegyzes;

    public Velemeny() {
    }

    public Velemeny(Integer id) {
        this.id = id;
    }

    public Velemeny(Integer id, int apartmanID, String nev, String email, double ertekeles, String tetszett, String nemTetszett, String megjegyzes) {
        this.id = id;
        this.apartmanID = apartmanID;
        this.nev = nev;
        this.email = email;
        this.ertekeles = ertekeles;
        this.tetszett = tetszett;
        this.nemTetszett = nemTetszett;
        this.megjegyzes = megjegyzes;
    }

    public Integer getId() {
        return id;
    }

    public int getApartmanID() {
        return apartmanID;
    }

    public String getNev() {
        return nev;
    }

    public String getEmail() {
        return email;
    }

    public double getErtekeles() {
        return ertekeles;
    }

    public String getTetszett() {
        return tetszett;
    }

    public String getNemTetszett() {
        return nemTetszett;
    }

    public String getMegjegyzes() {
        return megjegyzes;
    }

    private void setId(Integer id) {
        this.id = id;
    }

    private void setApartmanID(int apartmanID) {
        this.apartmanID = apartmanID;
    }

    private void setNev(String nev) {
        this.nev = nev;
    }

    private void setEmail(String email) {
        this.email = email;
    }

    private void setErtekeles(double ertekeles) {
        this.ertekeles = ertekeles;
    }

    private void setTetszett(String tetszett) {
        this.tetszett = tetszett;
    }

    private void setNemTetszett(String nemTetszett) {
        this.nemTetszett = nemTetszett;
    }

    private void setMegjegyzes(String megjegyzes) {
        this.megjegyzes = megjegyzes;
    }

    
    
    public static List<Velemeny> getAllVelemeny(){
        
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("BorbolyaPU");
        EntityManager manager = factory.createEntityManager();
        List<Velemeny> allVelemeny = new ArrayList<>();
        StoredProcedureQuery spq = manager.createStoredProcedureQuery("get_all_velemeny");
        List<Object[]> objectList = spq.getResultList();
        for (Object[] object : objectList) {
             Velemeny v = new Velemeny();
            v.setId(Integer.valueOf(String.valueOf(object[0])));
            v.setApartmanID(Integer.valueOf(String.valueOf(object[1])));
            v.setNev(String.valueOf(object[2]));
            v.setEmail(String.valueOf(object[3]));
            v.setErtekeles(Double.valueOf(String.valueOf(object[4])));
            v.setTetszett(String.valueOf(object[5]));
            v.setNemTetszett(String.valueOf(object[6]));
            v.setMegjegyzes(String.valueOf(object[7]));
        
            allVelemeny.add(v);
        }
        
        return allVelemeny; 
    }
    
    public static void createVelemeny(String nev, Integer apartmanid, String email, Double eretkeles, String tetszett, String nemTetszett, String megjegyzes){
        

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("BorbolyaPU");
        EntityManager manager = factory.createEntityManager();
        StoredProcedureQuery spq = manager.createStoredProcedureQuery("create_velemeny");
        spq.registerStoredProcedureParameter("nev_in", String.class, ParameterMode.IN);
        spq.registerStoredProcedureParameter("apartmanid_in", Integer.class, ParameterMode.IN);
        spq.registerStoredProcedureParameter("email_in", String.class, ParameterMode.IN);
        spq.registerStoredProcedureParameter("ertekeles_in", Double.class, ParameterMode.IN);
        spq.registerStoredProcedureParameter("tetszett_in", String.class, ParameterMode.IN);
        spq.registerStoredProcedureParameter("nemtetszett_in", String.class, ParameterMode.IN);
        spq.registerStoredProcedureParameter("megjegyzes_in", String.class, ParameterMode.IN);
        spq.setParameter("nev_in", nev);
        spq.setParameter("apartmanid_in", apartmanid);
        spq.setParameter("email_in", email);
        spq.setParameter("ertekeles_in", eretkeles);
        spq.setParameter("tetszett_in", tetszett);
        spq.setParameter("nemtetszett_in", nemTetszett);
        spq.setParameter("megjegyzes_in", megjegyzes);
        spq.execute();
       
        
    }

    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Velemeny)) {
            return false;
        }
        Velemeny other = (Velemeny) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Velemeny[ id=" + id + " ]";
    }
    
}
