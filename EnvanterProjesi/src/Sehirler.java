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
@Table(name = "sehirler")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sehirler.findAll", query = "SELECT s FROM Sehirler s"),
    @NamedQuery(name = "Sehirler.findBySehirId", query = "SELECT s FROM Sehirler s WHERE s.sehirId = :sehirId"),
    @NamedQuery(name = "Sehirler.findBySehirAdi", query = "SELECT s FROM Sehirler s WHERE s.sehirAdi = :sehirAdi"),
    @NamedQuery(name = "Sehirler.findBySehirTarih", query = "SELECT s FROM Sehirler s WHERE s.sehirTarih = :sehirTarih")})
public class Sehirler implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "sehir_id")
    private Integer sehirId;
    @Column(name = "sehir_adi")
    private String sehirAdi;
    @Column(name = "sehir_tarih")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sehirTarih;

    public Sehirler() {
    }

    public Sehirler(Integer sehirId) {
        this.sehirId = sehirId;
    }

    public Integer getSehirId() {
        return sehirId;
    }

    public void setSehirId(Integer sehirId) {
        this.sehirId = sehirId;
    }

    public String getSehirAdi() {
        return sehirAdi;
    }

    public void setSehirAdi(String sehirAdi) {
        this.sehirAdi = sehirAdi;
    }

    public Date getSehirTarih() {
        return sehirTarih;
    }

    public void setSehirTarih(Date sehirTarih) {
        this.sehirTarih = sehirTarih;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sehirId != null ? sehirId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sehirler)) {
            return false;
        }
        Sehirler other = (Sehirler) object;
        if ((this.sehirId == null && other.sehirId != null) || (this.sehirId != null && !this.sehirId.equals(other.sehirId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "personel.Sehirler[ sehirId=" + sehirId + " ]";
    }
    
}
