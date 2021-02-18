package model;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Bjakushiki
 */
@Entity
@Table(name = "foglalas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Foglalas.findAll", query = "SELECT f FROM Foglalas f")
    , @NamedQuery(name = "Foglalas.findById", query = "SELECT f FROM Foglalas f WHERE f.id = :id")
    , @NamedQuery(name = "Foglalas.findByApartmanID", query = "SELECT f FROM Foglalas f WHERE f.apartmanID = :apartmanID")
    , @NamedQuery(name = "Foglalas.findByNev", query = "SELECT f FROM Foglalas f WHERE f.nev = :nev")
    , @NamedQuery(name = "Foglalas.findByEmail", query = "SELECT f FROM Foglalas f WHERE f.email = :email")
    , @NamedQuery(name = "Foglalas.findByTelefon", query = "SELECT f FROM Foglalas f WHERE f.telefon = :telefon")
    , @NamedQuery(name = "Foglalas.findByErkezes", query = "SELECT f FROM Foglalas f WHERE f.erkezes = :erkezes")
    , @NamedQuery(name = "Foglalas.findByTavozas", query = "SELECT f FROM Foglalas f WHERE f.tavozas = :tavozas")
    , @NamedQuery(name = "Foglalas.findByFelnottSzam", query = "SELECT f FROM Foglalas f WHERE f.felnottSzam = :felnottSzam")
    , @NamedQuery(name = "Foglalas.findByGyerek1Szam", query = "SELECT f FROM Foglalas f WHERE f.gyerek1Szam = :gyerek1Szam")
    , @NamedQuery(name = "Foglalas.findByGyerek2Szam", query = "SELECT f FROM Foglalas f WHERE f.gyerek2Szam = :gyerek2Szam")
    , @NamedQuery(name = "Foglalas.findByKisallatSzam", query = "SELECT f FROM Foglalas f WHERE f.kisallatSzam = :kisallatSzam")
    , @NamedQuery(name = "Foglalas.findByPotagySzam", query = "SELECT f FROM Foglalas f WHERE f.potagySzam = :potagySzam")
    , @NamedQuery(name = "Foglalas.findByVegosszeg", query = "SELECT f FROM Foglalas f WHERE f.vegosszeg = :vegosszeg")
    , @NamedQuery(name = "Foglalas.findByFizetesimod", query = "SELECT f FROM Foglalas f WHERE f.fizetesimod = :fizetesimod")})
public class Foglalas implements Serializable {

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
    @Column(name = "Telefon")
    private String telefon;
    @Basic(optional = false)
    @Column(name = "Erkezes")
    @Temporal(TemporalType.DATE)
    private Date erkezes;
    @Basic(optional = false)
    @Column(name = "Tavozas")
    @Temporal(TemporalType.DATE)
    private Date tavozas;
    @Basic(optional = false)
    @Column(name = "FelnottSzam")
    private int felnottSzam;
    @Basic(optional = false)
    @Column(name = "Gyerek1Szam")
    private int gyerek1Szam;
    @Basic(optional = false)
    @Column(name = "Gyerek2Szam")
    private int gyerek2Szam;
    @Basic(optional = false)
    @Column(name = "KisallatSzam")
    private int kisallatSzam;
    @Basic(optional = false)
    @Column(name = "PotagySzam")
    private int potagySzam;
    @Basic(optional = false)
    @Column(name = "Vegosszeg")
    private int vegosszeg;
    @Basic(optional = false)
    @Column(name = "Fizetesimod")
    private String fizetesimod;

    public Foglalas() {
    }

    public Foglalas(Integer id) {
        this.id = id;
    }

    public Foglalas(Integer id, int apartmanID, String nev, String email, String telefon, Date erkezes, Date tavozas, int felnottSzam, int gyerek1Szam, int gyerek2Szam, int kisallatSzam, int potagySzam, int vegosszeg, String fizetesimod) {
        this.id = id;
        this.apartmanID = apartmanID;
        this.nev = nev;
        this.email = email;
        this.telefon = telefon;
        this.erkezes = erkezes;
        this.tavozas = tavozas;
        this.felnottSzam = felnottSzam;
        this.gyerek1Szam = gyerek1Szam;
        this.gyerek2Szam = gyerek2Szam;
        this.kisallatSzam = kisallatSzam;
        this.potagySzam = potagySzam;
        this.vegosszeg = vegosszeg;
        this.fizetesimod = fizetesimod;
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

    public String getTelefon() {
        return telefon;
    }

    public Date getErkezes() {
        return erkezes;
    }

    public Date getTavozas() {
        return tavozas;
    }

    public int getFelnottSzam() {
        return felnottSzam;
    }

    public int getGyerek1Szam() {
        return gyerek1Szam;
    }

    public int getGyerek2Szam() {
        return gyerek2Szam;
    }

    public int getKisallatSzam() {
        return kisallatSzam;
    }

    public int getPotagySzam() {
        return potagySzam;
    }

    public int getVegosszeg() {
        return vegosszeg;
    }

    public String getFizetesimod() {
        return fizetesimod;
    }

    public void setApartmanID(int apartmanID) {
        this.apartmanID = apartmanID;
    }

    public void setErkezes(Date erkezes) {
        this.erkezes = erkezes;
    }

    public void setTavozas(Date tavozas) {
        this.tavozas = tavozas;
    }
    
    
    
    public static void createFoglala(Integer apartmanid_in, String nev_in, String email_in, String telefon_in, Date erkezes_in, Date tavozas_in, Integer felnott_in, Integer gyerek1_in, Integer gyerek2_in, Integer kisallat_in, Integer potagyszam_in, Integer vegosszeg_in, String fizetesimod_in){
        
        try{
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("BorbolyaPU");
        EntityManager manager = factory.createEntityManager();
        StoredProcedureQuery spq = manager.createStoredProcedureQuery("create_foglalas");
        spq.registerStoredProcedureParameter("apartmanid_in", Integer.class, ParameterMode.IN);
        spq.registerStoredProcedureParameter("nev_in", String.class, ParameterMode.IN);
        spq.registerStoredProcedureParameter("email_in", String.class, ParameterMode.IN);
        spq.registerStoredProcedureParameter("telefon_in", String.class, ParameterMode.IN);
        spq.registerStoredProcedureParameter("erkezes_in", Date.class, ParameterMode.IN);
        spq.registerStoredProcedureParameter("tavozas_in", Date.class, ParameterMode.IN);
        spq.registerStoredProcedureParameter("felnott_in", Integer.class, ParameterMode.IN);
        spq.registerStoredProcedureParameter("gyerek1_in", Integer.class, ParameterMode.IN);
        spq.registerStoredProcedureParameter("gyerek2_in", Integer.class, ParameterMode.IN);
        spq.registerStoredProcedureParameter("kisallat_in", Integer.class, ParameterMode.IN);
        spq.registerStoredProcedureParameter("potagyszam_in", Integer.class, ParameterMode.IN);
        spq.registerStoredProcedureParameter("vegosszeg_in", Integer.class, ParameterMode.IN);
        spq.registerStoredProcedureParameter("fizetesimod_in", String.class, ParameterMode.IN);        
        spq.setParameter("apartmanid_in", apartmanid_in);
        spq.setParameter("nev_in", nev_in);
        spq.setParameter("email_in", email_in);
        spq.setParameter("telefon_in", telefon_in);
        spq.setParameter("erkezes_in", erkezes_in);
        spq.setParameter("tavozas_in", tavozas_in);
        spq.setParameter("felnott_in", felnott_in);
        spq.setParameter("gyerek1_in", gyerek1_in);
        spq.setParameter("gyerek2_in", gyerek2_in);
        spq.setParameter("kisallat_in", kisallat_in);
        spq.setParameter("potagyszam_in", potagyszam_in);
        spq.setParameter("vegosszeg_in", vegosszeg_in);
        spq.setParameter("vegosszeg_in", vegosszeg_in);
        spq.setParameter("fizetesimod_in", fizetesimod_in);
        spq.execute();
        }
        catch(Exception ex){
            String e = ex.toString();
            System.out.println(ex.toString());
        }
        System.out.println("");
    }
    
    public static List<Foglalas> getAllFoglalasDatum() throws ParseException{
        
        List<Foglalas> allFoglalas = new ArrayList<>();
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("BorbolyaPU");
        EntityManager manager = factory.createEntityManager();
        StoredProcedureQuery spq = manager.createStoredProcedureQuery("get_all_foglalas");
        List<Object[]> objectList = spq.getResultList();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());  
        for (Object[] object : objectList) {
            Foglalas f = new Foglalas();
            f.setApartmanID(Integer.valueOf(String.valueOf(object[1])));
            f.setErkezes(sdf.parse(String.valueOf(object[5])));
            f.setTavozas(sdf.parse(String.valueOf(object[6])));
            allFoglalas.add(f);
        }
         
         
         return allFoglalas;
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
        if (!(object instanceof Foglalas)) {
            return false;
        }
        Foglalas other = (Foglalas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Foglalas[ id=" + id + " ]";
    }
    
}
