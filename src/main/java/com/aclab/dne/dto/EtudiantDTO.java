package com.aclab.dne.dto;

import java.util.Date;
import java.util.Objects;

public class EtudiantDTO {

    private Long idEtudiant;
    private String nom;
    private String prenom;
    private Long iduniv;
    private String emailUniv;
    private Date dateNaissance;
    private String emailPersonnel;
    private String telephonePersonnel;

    public EtudiantDTO() {
    }

    public EtudiantDTO(Long idEtudiant, String nom, String prenom, Long iduniv, String emailUniv, Date dateNaissance, String emailPersonnel, String telephonePersonnel) {
        this.idEtudiant = idEtudiant;
        this.nom = nom;
        this.prenom = prenom;
        this.iduniv = iduniv;
        this.emailUniv = emailUniv;
        this.dateNaissance = dateNaissance;
        this.emailPersonnel = emailPersonnel;
        this.telephonePersonnel = telephonePersonnel;
    }

    public Long getIdEtudiant() {
        return idEtudiant;
    }

    public void setIdEtudiant(Long idEtudiant) {
        this.idEtudiant = idEtudiant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Long getIduniv() {
        return iduniv;
    }

    public void setIduniv(Long iduniv) {
        this.iduniv = iduniv;
    }

    public String getEmailUniv() {
        return emailUniv;
    }

    public void setEmailUniv(String emailUniv) {
        this.emailUniv = emailUniv;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getEmailPersonnel() {
        return emailPersonnel;
    }

    public void setEmailPersonnel(String emailPersonnel) {
        this.emailPersonnel = emailPersonnel;
    }

    public String getTelephonePersonnel() {
        return telephonePersonnel;
    }

    public void setTelephonePersonnel(String telephonePersonnel) {
        this.telephonePersonnel = telephonePersonnel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EtudiantDTO)) return false;
        EtudiantDTO that = (EtudiantDTO) o;
        return Objects.equals(getIdEtudiant(), that.getIdEtudiant()) &&
                Objects.equals(getNom(), that.getNom()) &&
                Objects.equals(getPrenom(), that.getPrenom()) &&
                Objects.equals(getIduniv(), that.getIduniv()) &&
                Objects.equals(getEmailUniv(), that.getEmailUniv()) &&
                Objects.equals(getDateNaissance(), that.getDateNaissance()) &&
                Objects.equals(getEmailPersonnel(), that.getEmailPersonnel()) &&
                Objects.equals(getTelephonePersonnel(), that.getTelephonePersonnel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdEtudiant(), getNom(), getPrenom(), getIduniv(), getEmailUniv(), getDateNaissance(), getEmailPersonnel(), getTelephonePersonnel());
    }

    @Override
    public String toString() {
        return "EtudiantDTO{" +
                "idEtudiant=" + idEtudiant +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", iduniv=" + iduniv +
                ", emailUniv='" + emailUniv + '\'' +
                ", dateNaissance=" + dateNaissance +
                ", emailPersonnel='" + emailPersonnel + '\'' +
                ", telephonePersonnel='" + telephonePersonnel + '\'' +
                '}';
    }
}
