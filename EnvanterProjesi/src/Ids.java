/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giris;

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
@Table(name = "ids")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ids.findAll", query = "SELECT i FROM Ids i"),
    @NamedQuery(name = "Ids.findByIdsId", query = "SELECT i FROM Ids i WHERE i.idsId = :idsId"),
    @NamedQuery(name = "Ids.findByIdsSubId", query = "SELECT i FROM Ids i WHERE i.idsSubId = :idsSubId"),
    @NamedQuery(name = "Ids.findByIdsAdi", query = "SELECT i FROM Ids i WHERE i.idsAdi = :idsAdi"),
    @NamedQuery(name = "Ids.findByIdsSoyadi", query = "SELECT i FROM Ids i WHERE i.idsSoyadi = :idsSoyadi"),
    @NamedQuery(name = "Ids.findByIdsKadi", query = "SELECT i FROM Ids i WHERE i.idsKadi = :idsKadi"),
    @NamedQuery(name = "Ids.findByIdsSifre", query = "SELECT i FROM Ids i WHERE i.idsSifre = :idsSifre"),
    @NamedQuery(name = "Ids.findByIdsMail", query = "SELECT i FROM Ids i WHERE i.idsMail = :idsMail"),
    @NamedQuery(name = "Ids.findByIdsTelefon", query = "SELECT i FROM Ids i WHERE i.idsTelefon = :idsTelefon"),
    @NamedQuery(name = "Ids.findByIdsTarih", query = "SELECT i FROM Ids i WHERE i.idsTarih = :idsTarih")})
public class Ids implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ids_id")
    private Integer idsId;
    @Column(name = "ids_sub_id")
    private Integer idsSubId;
    @Column(name = "ids_adi")
    private String idsAdi;
    @Column(name = "ids_soyadi")
    private String idsSoyadi;
    @Column(name = "ids_kadi")
    private String idsKadi;
    @Column(name = "ids_sifre")
    private String idsSifre;
    @Column(name = "ids_mail")
    private String idsMail;
    @Column(name = "ids_telefon")
    private String idsTelefon;
    @Column(name = "ids_tarih")
    @Temporal(TemporalType.TIMESTAMP)
    private Date idsTarih;

    public Ids() {
    }

    public Ids(Integer idsId) {
        this.idsId = idsId;
    }

    public Integer getIdsId() {
        return idsId;
    }

    public void setIdsId(Integer idsId) {
        this.idsId = idsId;
    }

    public Integer getIdsSubId() {
        return idsSubId;
    }

    public void setIdsSubId(Integer idsSubId) {
        this.idsSubId = idsSubId;
    }

    public String getIdsAdi() {
        return idsAdi;
    }

    public void setIdsAdi(String idsAdi) {
        this.idsAdi = idsAdi;
    }

    public String getIdsSoyadi() {
        return idsSoyadi;
    }

    public void setIdsSoyadi(String idsSoyadi) {
        this.idsSoyadi = idsSoyadi;
    }

    public String getIdsKadi() {
        return idsKadi;
    }

    public void setIdsKadi(String idsKadi) {
        this.idsKadi = idsKadi;
    }

    public String getIdsSifre() {
        return idsSifre;
    }

    public void setIdsSifre(String idsSifre) {
        this.idsSifre = idsSifre;
    }

    public String getIdsMail() {
        return idsMail;
    }

    public void setIdsMail(String idsMail) {
        this.idsMail = idsMail;
    }

    public String getIdsTelefon() {
        return idsTelefon;
    }

    public void setIdsTelefon(String idsTelefon) {
        this.idsTelefon = idsTelefon;
    }

    public Date getIdsTarih() {
        return idsTarih;
    }

    public void setIdsTarih(Date idsTarih) {
        this.idsTarih = idsTarih;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsId != null ? idsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ids)) {
            return false;
        }
        Ids other = (Ids) object;
        if ((this.idsId == null && other.idsId != null) || (this.idsId != null && !this.idsId.equals(other.idsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "giris.Ids[ idsId=" + idsId + " ]";
    }
    
}
