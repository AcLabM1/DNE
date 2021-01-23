package com.aclab.dne.dto;

import java.util.Date;

public class EtudiantDTO {

    private Long idEtudiant;
    private String numInterneUniv;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private String emailUniv;
    private String emailPersonnel;
    private String telephonePersonnel;
    private String password;
    private String username;

    public EtudiantDTO() {
    }

    public EtudiantDTO(Long idEtudiant, String numInterneUniv, String nom, String prenom, Date dateNaissance, String emailUniv, String emailPersonnel, String telephonePersonnel) {
        this.idEtudiant = idEtudiant;
        this.numInterneUniv = numInterneUniv;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.emailUniv = emailUniv;
        this.emailPersonnel = emailPersonnel;
        this.telephonePersonnel = telephonePersonnel;
    }

    public Long getIdEtudiant() {
        return idEtudiant;
    }

    public void setIdEtudiant(Long idEtudiant) {
        this.idEtudiant = idEtudiant;
    }

    public String getNumInterneUniv() {
        return numInterneUniv;
    }

    public void setNumInterneUniv(String numInterneUniv) {
        this.numInterneUniv = numInterneUniv;
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

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getEmailUniv() {
        return emailUniv;
    }

    public void setEmailUniv(String emailUniv) {
        this.emailUniv = emailUniv;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "EtudiantDTO{" +
                "idEtudiant=" + idEtudiant +
                ", numInterneUniv='" + numInterneUniv + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dateNaissance=" + dateNaissance +
                ", emailUniv='" + emailUniv + '\'' +
                ", emailPersonnel='" + emailPersonnel + '\'' +
                ", telephonePersonnel='" + telephonePersonnel + '\'' +
                '}';
    }
}
