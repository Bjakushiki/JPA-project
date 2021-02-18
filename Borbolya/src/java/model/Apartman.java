/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
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
@Table(name = "apartman")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Apartman.findAll", query = "SELECT a FROM Apartman a")
    , @NamedQuery(name = "Apartman.findById", query = "SELECT a FROM Apartman a WHERE a.id = :id")
    , @NamedQuery(name = "Apartman.findByApartmanNev", query = "SELECT a FROM Apartman a WHERE a.apartmanNev = :apartmanNev")
    , @NamedQuery(name = "Apartman.findByFo1", query = "SELECT a FROM Apartman a WHERE a.fo1 = :fo1")
    , @NamedQuery(name = "Apartman.findByFo2", query = "SELECT a FROM Apartman a WHERE a.fo2 = :fo2")
    , @NamedQuery(name = "Apartman.findByFo3", query = "SELECT a FROM Apartman a WHERE a.fo3 = :fo3")
    , @NamedQuery(name = "Apartman.findByFo4", query = "SELECT a FROM Apartman a WHERE a.fo4 = :fo4")
    , @NamedQuery(name = "Apartman.findByTobbFo", query = "SELECT a FROM Apartman a WHERE a.tobbFo = :tobbFo")
    , @NamedQuery(name = "Apartman.findByPotagyAr", query = "SELECT a FROM Apartman a WHERE a.potagyAr = :potagyAr")})
public class Apartman implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "ApartmanNev")
    private String apartmanNev;
    @Basic(optional = false)
    @Column(name = "fo1")
    private int fo1;
    @Basic(optional = false)
    @Column(name = "fo2")
    private int fo2;
    @Basic(optional = false)
    @Column(name = "fo3")
    private int fo3;
    @Basic(optional = false)
    @Column(name = "fo4")
    private int fo4;
    @Basic(optional = false)
    @Column(name = "TobbFo")
    private int tobbFo;
    @Basic(optional = false)
    @Column(name = "PotagyAr")
    private int potagyAr;

    public Apartman() {
    }

    public Apartman(Integer id) {
        this.id = id;
    }

    public Apartman(Integer id, String apartmanNev, int fo1, int fo2, int fo3, int fo4, int tobbFo, int potagyAr) {
        this.id = id;
        this.apartmanNev = apartmanNev;
        this.fo1 = fo1;
        this.fo2 = fo2;
        this.fo3 = fo3;
        this.fo4 = fo4;
        this.tobbFo = tobbFo;
        this.potagyAr = potagyAr;
    }

    public Integer getId() {
        return id;
    }

    public String getApartmanNev() {
        return apartmanNev;
    }

    public void setApartmanNev(String apartmanNev) {
        this.apartmanNev = apartmanNev;
    }

    public int getFo1() {
        return fo1;
    }

    public int getFo2() {
        return fo2;
    }

    public int getFo3() {
        return fo3;
    }

    public int getFo4() {
        return fo4;
    }

    public int getTobbFo() {
        return tobbFo;
    }

    public int getPotagyAr() {
        return potagyAr;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFo1(int fo1) {
        this.fo1 = fo1;
    }

    public void setFo2(int fo2) {
        this.fo2 = fo2;
    }

    public void setFo3(int fo3) {
        this.fo3 = fo3;
    }

    public void setFo4(int fo4) {
        this.fo4 = fo4;
    }

    public void setTobbFo(int tobbFo) {
        this.tobbFo = tobbFo;
    }

    public void setPotagyAr(int potagyAr) {
        this.potagyAr = potagyAr;
    }

    public static Apartman readApartmanByID(Integer id_in){
        Apartman a = new Apartman();
        try{
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("BorbolyaPU");
        EntityManager manager = factory.createEntityManager();
        StoredProcedureQuery spq = manager.createStoredProcedureQuery("read_apartman");
        spq.registerStoredProcedureParameter("id_in", Integer.class, ParameterMode.IN);
        spq.setParameter("id_in", id_in);
        spq.execute();
        List<Object[]> objectList = spq.getResultList();
        for (Object[] object : objectList) {
             a.setId(Integer.valueOf(String.valueOf(object[0])));
             a.setApartmanNev(String.valueOf(object[1]));
             a.setFo1(Integer.valueOf(String.valueOf(object[2])));
             a.setFo2(Integer.valueOf(String.valueOf(object[3])));
             a.setFo3(Integer.valueOf(String.valueOf(object[4])));
             a.setFo4(Integer.valueOf(String.valueOf(object[5])));
             a.setTobbFo(Integer.valueOf(String.valueOf(object[6])));
             a.setPotagyAr(Integer.valueOf(String.valueOf(object[7])));
        }
        System.out.println(objectList.toString());
        }
        catch(Exception ex){
            System.out.println(ex.toString());
        }
        return a;        
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
        if (!(object instanceof Apartman)) {
            return false;
        }
        Apartman other = (Apartman) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Apartman[ id=" + id + " ]";
    }
    
}
