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
@Table(name = "subeler")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Subeler.findAll", query = "SELECT s FROM Subeler s"),
    @NamedQuery(name = "Subeler.findBySubeId", query = "SELECT s FROM Subeler s WHERE s.subeId = :subeId"),
    @NamedQuery(name = "Subeler.findBySubeSehirId", query = "SELECT s FROM Subeler s WHERE s.subeSehirId = :subeSehirId"),
    @NamedQuery(name = "Subeler.findBySubeIlceId", query = "SELECT s FROM Subeler s WHERE s.subeIlceId = :subeIlceId"),
    @NamedQuery(name = "Subeler.findBySubeAdres", query = "SELECT s FROM Subeler s WHERE s.subeAdres = :subeAdres"),
    @NamedQuery(name = "Subeler.findBySubeTelefon", query = "SELECT s FROM Subeler s WHERE s.subeTelefon = :subeTelefon"),
    @NamedQuery(name = "Subeler.findBySubeIds", query = "SELECT s FROM Subeler s WHERE s.subeIds = :subeIds"),
    @NamedQuery(name = "Subeler.findBySubeTarih", query = "SELECT s FROM Subeler s WHERE s.subeTarih = :subeTarih")})
public class Subeler implements Serializable {
    @Column(name = "subu_adi")
    private String subuAdi;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "sube_id")
    private Integer subeId;
    @Column(name = "sube_sehir_id")
    private Integer subeSehirId;
    @Column(name = "sube_ilce_id")
    private Integer subeIlceId;
    @Column(name = "sube_adres")
    private String subeAdres;
    @Column(name = "sube_telefon")
    private String subeTelefon;
    @Column(name = "sube_ids")
    private Integer subeIds;
    @Column(name = "sube_tarih")
    @Temporal(TemporalType.TIMESTAMP)
    private Date subeTarih;

    public Subeler() {
    }

    public Subeler(Integer subeId) {
        this.subeId = subeId;
    }

    public Integer getSubeId() {
        return subeId;
    }

    public void setSubeId(Integer subeId) {
        this.subeId = subeId;
    }

    public Integer getSubeSehirId() {
        return subeSehirId;
    }

    public void setSubeSehirId(Integer subeSehirId) {
        this.subeSehirId = subeSehirId;
    }

    public Integer getSubeIlceId() {
        return subeIlceId;
    }

    public void setSubeIlceId(Integer subeIlceId) {
        this.subeIlceId = subeIlceId;
    }

    public String getSubeAdres() {
        return subeAdres;
    }

    public void setSubeAdres(String subeAdres) {
        this.subeAdres = subeAdres;
    }

    public String getSubeTelefon() {
        return subeTelefon;
    }

    public void setSubeTelefon(String subeTelefon) {
        this.subeTelefon = subeTelefon;
    }

    public Integer getSubeIds() {
        return subeIds;
    }

    public void setSubeIds(Integer subeIds) {
        this.subeIds = subeIds;
    }

    public Date getSubeTarih() {
        return subeTarih;
    }

    public void setSubeTarih(Date subeTarih) {
        this.subeTarih = subeTarih;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (subeId != null ? subeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Subeler)) {
            return false;
        }
        Subeler other = (Subeler) object;
        if ((this.subeId == null && other.subeId != null) || (this.subeId != null && !this.subeId.equals(other.subeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "personel.Subeler[ subeId=" + subeId + " ]";
    }

    public String getSubuAdi() {
        return subuAdi;
    }

    public void setSubuAdi(String subuAdi) {
        this.subuAdi = subuAdi;
    }
    
}
