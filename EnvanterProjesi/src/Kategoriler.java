/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package envanterprojesifirma;

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
@Table(name = "kategoriler")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kategoriler.findAll", query = "SELECT k FROM Kategoriler k"),
    @NamedQuery(name = "Kategoriler.findByKatId", query = "SELECT k FROM Kategoriler k WHERE k.katId = :katId"),
    @NamedQuery(name = "Kategoriler.findByKatAdi", query = "SELECT k FROM Kategoriler k WHERE k.katAdi = :katAdi"),
    @NamedQuery(name = "Kategoriler.findByKatTarih", query = "SELECT k FROM Kategoriler k WHERE k.katTarih = :katTarih")})
public class Kategoriler implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "kat_id")
    private Integer katId;
    @Column(name = "kat_adi")
    private String katAdi;
    @Column(name = "kat_tarih")
    @Temporal(TemporalType.TIMESTAMP)
    private Date katTarih;

    public Kategoriler() {
    }

    public Kategoriler(Integer katId) {
        this.katId = katId;
    }

    public Integer getKatId() {
        return katId;
    }

    public void setKatId(Integer katId) {
        this.katId = katId;
    }

    public String getKatAdi() {
        return katAdi;
    }

    public void setKatAdi(String katAdi) {
        this.katAdi = katAdi;
    }

    public Date getKatTarih() {
        return katTarih;
    }

    public void setKatTarih(Date katTarih) {
        this.katTarih = katTarih;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (katId != null ? katId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kategoriler)) {
            return false;
        }
        Kategoriler other = (Kategoriler) object;
        if ((this.katId == null && other.katId != null) || (this.katId != null && !this.katId.equals(other.katId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "envanterprojesifirma.Kategoriler[ katId=" + katId + " ]";
    }
    
}
