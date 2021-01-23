package com.aclab.dne.dto;

public class AdministratifDTO {

    private Long idAdministratif;
    private String numInterneUniv;
    private String nom;
    private String prenom;
    private String emailUniv;
    private String telephoneUniv;
    private String bureau;
    private String fonction;
    private String password;
    private String username;

    public AdministratifDTO() {
    }

    public AdministratifDTO(Long idAdministratif, String numInterneUniv, String nom, String prenom, String emailUniv, String telephoneUniv, String bureau, String fonction) {
        this.idAdministratif = idAdministratif;
        this.numInterneUniv = numInterneUniv;
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

    public String getnumInterneUniv() {
        return numInterneUniv;
    }

    public void setnumInterneUniv(String numInterneUniv) {
        this.numInterneUniv = numInterneUniv;
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
        return "AdministratifDTO{" +
                "idAdministratif=" + idAdministratif +
                ", numInterneUniv=" + numInterneUniv +
                ", username='"+ username +'\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", emailUniv='" + emailUniv + '\'' +
                ", telephoneUniv='" + telephoneUniv + '\'' +
                ", bureau='" + bureau + '\'' +
                ", fonction='" + fonction + '\'' +
                '}';
    }
}
