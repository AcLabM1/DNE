package com.aclab.dne.dto;

public class AdministratifDTO {

    /* heritage de Personne */
    private Long idEmploye;
    private String nom;
    private String prenom;
    /* heritage de InternUniv */
    private String email;
    /* heritage de Employe */
    private String telephoneUniv;
    private String bureau;

    private String fonction;

    public AdministratifDTO(){
        super();
    }

    public AdministratifDTO(Long idEmploye, String nom, String prenom, String email, String telephoneUniv, String bureau, String fonction) {
        super();
        this.idEmploye = idEmploye;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephoneUniv = telephoneUniv;
        this.bureau = bureau;
        this.fonction = fonction;
    }

    public Long getIdEmploye() {
        return idEmploye;
    }

    public void setIdEmploye(Long idEmploye) {
        this.idEmploye = idEmploye;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    @Override
    public String toString() {
        return "AdministratifDTO{" +
                "idEmploye=" + idEmploye +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", telephoneUniv='" + telephoneUniv + '\'' +
                ", bureau='" + bureau + '\'' +
                ", fonction='" + fonction + '\'' +
                '}';
    }
}
