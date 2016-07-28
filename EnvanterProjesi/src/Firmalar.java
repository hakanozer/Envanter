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
@Table(name = "firmalar")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Firmalar.findAll", query = "SELECT f FROM Firmalar f"),
    @NamedQuery(name = "Firmalar.findByFirmaId", query = "SELECT f FROM Firmalar f WHERE f.firmaId = :firmaId"),
    @NamedQuery(name = "Firmalar.findByFirmaKatId", query = "SELECT f FROM Firmalar f WHERE f.firmaKatId = :firmaKatId"),
    @NamedQuery(name = "Firmalar.findByFirmaAdi", query = "SELECT f FROM Firmalar f WHERE f.firmaAdi = :firmaAdi"),
    @NamedQuery(name = "Firmalar.findByFirmaAdres", query = "SELECT f FROM Firmalar f WHERE f.firmaAdres = :firmaAdres"),
    @NamedQuery(name = "Firmalar.findByFirmaTelefon1", query = "SELECT f FROM Firmalar f WHERE f.firmaTelefon1 = :firmaTelefon1"),
    @NamedQuery(name = "Firmalar.findByFirmaTelefon2", query = "SELECT f FROM Firmalar f WHERE f.firmaTelefon2 = :firmaTelefon2"),
    @NamedQuery(name = "Firmalar.findByFirmaMail1", query = "SELECT f FROM Firmalar f WHERE f.firmaMail1 = :firmaMail1"),
    @NamedQuery(name = "Firmalar.findByFirmaMail2", query = "SELECT f FROM Firmalar f WHERE f.firmaMail2 = :firmaMail2"),
    @NamedQuery(name = "Firmalar.findByFirmaTarih", query = "SELECT f FROM Firmalar f WHERE f.firmaTarih = :firmaTarih")})
public class Firmalar implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "firma_id")
    private Integer firmaId;
    @Column(name = "firma_kat_id")
    private Integer firmaKatId;
    @Column(name = "firma_adi")
    private String firmaAdi;
    @Column(name = "firma_adres")
    private String firmaAdres;
    @Column(name = "firma_telefon1")
    private String firmaTelefon1;
    @Column(name = "firma_telefon2")
    private String firmaTelefon2;
    @Column(name = "firma_mail1")
    private String firmaMail1;
    @Column(name = "firma_mail2")
    private String firmaMail2;
    @Column(name = "firma_tarih")
    @Temporal(TemporalType.TIMESTAMP)
    private Date firmaTarih;

    public Firmalar() {
    }

    public Firmalar(Integer firmaId) {
        this.firmaId = firmaId;
    }

    public Integer getFirmaId() {
        return firmaId;
    }

    public void setFirmaId(Integer firmaId) {
        this.firmaId = firmaId;
    }

    public Integer getFirmaKatId() {
        return firmaKatId;
    }

    public void setFirmaKatId(Integer firmaKatId) {
        this.firmaKatId = firmaKatId;
    }

    public String getFirmaAdi() {
        return firmaAdi;
    }

    public void setFirmaAdi(String firmaAdi) {
        this.firmaAdi = firmaAdi;
    }

    public String getFirmaAdres() {
        return firmaAdres;
    }

    public void setFirmaAdres(String firmaAdres) {
        this.firmaAdres = firmaAdres;
    }

    public String getFirmaTelefon1() {
        return firmaTelefon1;
    }

    public void setFirmaTelefon1(String firmaTelefon1) {
        this.firmaTelefon1 = firmaTelefon1;
    }

    public String getFirmaTelefon2() {
        return firmaTelefon2;
    }

    public void setFirmaTelefon2(String firmaTelefon2) {
        this.firmaTelefon2 = firmaTelefon2;
    }

    public String getFirmaMail1() {
        return firmaMail1;
    }

    public void setFirmaMail1(String firmaMail1) {
        this.firmaMail1 = firmaMail1;
    }

    public String getFirmaMail2() {
        return firmaMail2;
    }

    public void setFirmaMail2(String firmaMail2) {
        this.firmaMail2 = firmaMail2;
    }

    public Date getFirmaTarih() {
        return firmaTarih;
    }

    public void setFirmaTarih(Date firmaTarih) {
        this.firmaTarih = firmaTarih;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (firmaId != null ? firmaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Firmalar)) {
            return false;
        }
        Firmalar other = (Firmalar) object;
        if ((this.firmaId == null && other.firmaId != null) || (this.firmaId != null && !this.firmaId.equals(other.firmaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "envanterprojesifirma.Firmalar[ firmaId=" + firmaId + " ]";
    }
    
}
