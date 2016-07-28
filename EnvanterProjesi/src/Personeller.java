/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personel;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author java3
 */
@Entity
@Table(name = "personeller")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Personeller.findAll", query = "SELECT p FROM Personeller p"),
    @NamedQuery(name = "Personeller.findByPersonelId", query = "SELECT p FROM Personeller p WHERE p.personelId = :personelId"),
    @NamedQuery(name = "Personeller.findByPersonelAdi", query = "SELECT p FROM Personeller p WHERE p.personelAdi = :personelAdi"),
    @NamedQuery(name = "Personeller.findByPersonelSoyadi", query = "SELECT p FROM Personeller p WHERE p.personelSoyadi = :personelSoyadi"),
    @NamedQuery(name = "Personeller.findByPersonelTelefon", query = "SELECT p FROM Personeller p WHERE p.personelTelefon = :personelTelefon"),
    @NamedQuery(name = "Personeller.findByPersonelMail", query = "SELECT p FROM Personeller p WHERE p.personelMail = :personelMail"),
    @NamedQuery(name = "Personeller.findByPersonelSubeId", query = "SELECT p FROM Personeller p WHERE p.personelSubeId = :personelSubeId"),
    @NamedQuery(name = "Personeller.findByPersonelTarih", query = "SELECT p FROM Personeller p WHERE p.personelTarih = :personelTarih")})
public class Personeller implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "personel_id")
    private Integer personelId;
    @Column(name = "personel_adi")
    private String personelAdi;
    @Column(name = "personel_soyadi")
    private String personelSoyadi;
    @Column(name = "personel_telefon")
    private String personelTelefon;
    @Column(name = "personel_mail")
    private String personelMail;
    @Column(name = "personel_sube_id")
    private Integer personelSubeId;
    @Column(name = "personel_tarih")
    @Temporal(TemporalType.TIMESTAMP)
    private Date personelTarih;

    public Personeller() {
    }

    public Personeller(Integer personelId) {
        this.personelId = personelId;
    }

    public Integer getPersonelId() {
        return personelId;
    }

    public void setPersonelId(Integer personelId) {
        this.personelId = personelId;
    }

    public String getPersonelAdi() {
        return personelAdi;
    }

    public void setPersonelAdi(String personelAdi) {
        this.personelAdi = personelAdi;
    }

    public String getPersonelSoyadi() {
        return personelSoyadi;
    }

    public void setPersonelSoyadi(String personelSoyadi) {
        this.personelSoyadi = personelSoyadi;
    }

    public String getPersonelTelefon() {
        return personelTelefon;
    }

    public void setPersonelTelefon(String personelTelefon) {
        this.personelTelefon = personelTelefon;
    }

    public String getPersonelMail() {
        return personelMail;
    }

    public void setPersonelMail(String personelMail) {
        this.personelMail = personelMail;
    }

    public Integer getPersonelSubeId() {
        return personelSubeId;
    }

    public void setPersonelSubeId(Integer personelSubeId) {
        this.personelSubeId = personelSubeId;
    }

    public Date getPersonelTarih() {
        return personelTarih;
    }

    public void setPersonelTarih(Date personelTarih) {
        this.personelTarih = personelTarih;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (personelId != null ? personelId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Personeller)) {
            return false;
        }
        Personeller other = (Personeller) object;
        if ((this.personelId == null && other.personelId != null) || (this.personelId != null && !this.personelId.equals(other.personelId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "personel.Personeller[ personelId=" + personelId + " ]";
    }
    
}
