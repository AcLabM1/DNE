package com.aclab.dne.dto;

public class AdministratifDTO {

    private Long idAdministratif;
    private Long idUniv;
    private String nom;
    private String prenom;
    private String emailUniv;
    private String telephoneUniv;
    private String bureau;
    private String fonction;

    public AdministratifDTO() {
    }

    public AdministratifDTO(Long idAdministratif, Long idUniv, String nom, String prenom, String emailUniv, String telephoneUniv, String bureau, String fonction) {
        this.idAdministratif = idAdministratif;
        this.idUniv = idUniv;
        this.nom = nom;
        this.prenom = prenom;
        this.emailUniv = emailUniv;
        this.telephoneUniv = telephoneUniv;
        this.bureau = bureau;
        this.fonction = fonction;
    }

    public Long getIdAdministratif() {
        return idAdministratif;
    }

    public void setIdAdministratif(Long idAdministratif) {
        this.idAdministratif = idAdministratif;
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

    public String getEmailUniv() {
        return emailUniv;
    }

    public void setEmailUniv(String emailUniv) {
        this.emailUniv = emailUniv;
    }

    public String getTelephoneUniv() {
        return telephoneUniv;
    }

    public void setTelephoneUniv(String telephoneUniv) {
        this.telephoneUniv = telephoneUniv;
    }

    public String getBureau() {
        return bureau;
    }

    public void setBureau(String bureau) {
        this.bureau = bureau;
    }

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public Long getIdUniv() {
        return idUniv;
    }

    public void setIdUniv(Long idUniv) {
        this.idUniv = idUniv;
    }

    @Override
    public String toString() {
        return "AdministratifDTO{" +
                "idAdministratif=" + idAdministratif +
                ", idUniv=" + idUniv +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", emailUniv='" + emailUniv + '\'' +
                ", telephoneUniv='" + telephoneUniv + '\'' +
                ", bureau='" + bureau + '\'' +
                ", fonction='" + fonction + '\'' +
                '}';
    }
}
