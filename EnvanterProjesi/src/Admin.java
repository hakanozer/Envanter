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
@Table(name = "admin")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Admin.findAll", query = "SELECT a FROM Admin a"),
    @NamedQuery(name = "Admin.findByAdminId", query = "SELECT a FROM Admin a WHERE a.adminId = :adminId"),
    @NamedQuery(name = "Admin.findByAdminAdi", query = "SELECT a FROM Admin a WHERE a.adminAdi = :adminAdi"),
    @NamedQuery(name = "Admin.findByAdminSoyadi", query = "SELECT a FROM Admin a WHERE a.adminSoyadi = :adminSoyadi"),
    @NamedQuery(name = "Admin.findByAdminKadi", query = "SELECT a FROM Admin a WHERE a.adminKadi = :adminKadi"),
    @NamedQuery(name = "Admin.findByAdminSifre", query = "SELECT a FROM Admin a WHERE a.adminSifre = :adminSifre"),
    @NamedQuery(name = "Admin.findByAdminMail", query = "SELECT a FROM Admin a WHERE a.adminMail = :adminMail"),
    @NamedQuery(name = "Admin.findByAdminTelefon", query = "SELECT a FROM Admin a WHERE a.adminTelefon = :adminTelefon"),
    @NamedQuery(name = "Admin.findByAdminTarih", query = "SELECT a FROM Admin a WHERE a.adminTarih = :adminTarih")})
public class Admin implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "admin_id")
    private Integer adminId;
    @Column(name = "admin_adi")
    private String adminAdi;
    @Column(name = "admin_soyadi")
    private String adminSoyadi;
    @Column(name = "admin_kadi")
    private String adminKadi;
    @Column(name = "admin_sifre")
    private String adminSifre;
    @Column(name = "admin_mail")
    private String adminMail;
    @Column(name = "admin_telefon")
    private String adminTelefon;
    @Column(name = "admin_tarih")
    @Temporal(TemporalType.TIMESTAMP)
    private Date adminTarih;

    public Admin() {
    }

    public Admin(Integer adminId) {
        this.adminId = adminId;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminAdi() {
        return adminAdi;
    }

    public void setAdminAdi(String adminAdi) {
        this.adminAdi = adminAdi;
    }

    public String getAdminSoyadi() {
        return adminSoyadi;
    }

    public void setAdminSoyadi(String adminSoyadi) {
        this.adminSoyadi = adminSoyadi;
    }

    public String getAdminKadi() {
        return adminKadi;
    }

    public void setAdminKadi(String adminKadi) {
        this.adminKadi = adminKadi;
    }

    public String getAdminSifre() {
        return adminSifre;
    }

    public void setAdminSifre(String adminSifre) {
        this.adminSifre = adminSifre;
    }

    public String getAdminMail() {
        return adminMail;
    }

    public void setAdminMail(String adminMail) {
        this.adminMail = adminMail;
    }

    public String getAdminTelefon() {
        return adminTelefon;
    }

    public void setAdminTelefon(String adminTelefon) {
        this.adminTelefon = adminTelefon;
    }

    public Date getAdminTarih() {
        return adminTarih;
    }

    public void setAdminTarih(Date adminTarih) {
        this.adminTarih = adminTarih;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (adminId != null ? adminId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Admin)) {
            return false;
        }
        Admin other = (Admin) object;
        if ((this.adminId == null && other.adminId != null) || (this.adminId != null && !this.adminId.equals(other.adminId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "giris.Admin[ adminId=" + adminId + " ]";
    }
    
}
