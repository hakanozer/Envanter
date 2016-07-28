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
@Table(name = "ilceler")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ilceler.findAll", query = "SELECT i FROM Ilceler i"),
    @NamedQuery(name = "Ilceler.findByIlceId", query = "SELECT i FROM Ilceler i WHERE i.ilceId = :ilceId"),
    @NamedQuery(name = "Ilceler.findByIlceAdi", query = "SELECT i FROM Ilceler i WHERE i.ilceAdi = :ilceAdi"),
    @NamedQuery(name = "Ilceler.findByIlceTarih", query = "SELECT i FROM Ilceler i WHERE i.ilceTarih = :ilceTarih")})
public class Ilceler implements Serializable {
    @Column(name = "ilce_il_id")
    private String ilceIlId;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ilce_id")
    private Integer ilceId;
    @Column(name = "ilce_adi")
    private String ilceAdi;
    @Column(name = "ilce_tarih")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ilceTarih;

    public Ilceler() {
    }

    public Ilceler(Integer ilceId) {
        this.ilceId = ilceId;
    }

    public Integer getIlceId() {
        return ilceId;
    }

    public void setIlceId(Integer ilceId) {
        this.ilceId = ilceId;
    }

    public String getIlceAdi() {
        return ilceAdi;
    }

    public void setIlceAdi(String ilceAdi) {
        this.ilceAdi = ilceAdi;
    }

    public Date getIlceTarih() {
        return ilceTarih;
    }

    public void setIlceTarih(Date ilceTarih) {
        this.ilceTarih = ilceTarih;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ilceId != null ? ilceId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ilceler)) {
            return false;
        }
        Ilceler other = (Ilceler) object;
        if ((this.ilceId == null && other.ilceId != null) || (this.ilceId != null && !this.ilceId.equals(other.ilceId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "personel.Ilceler[ ilceId=" + ilceId + " ]";
    }

    public String getIlceIlId() {
        return ilceIlId;
    }

    public void setIlceIlId(String ilceIlId) {
        this.ilceIlId = ilceIlId;
    }
    
}
