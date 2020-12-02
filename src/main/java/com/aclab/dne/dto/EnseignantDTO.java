package com.aclab.dne.dto;

public class EnseignantDTO {

    private Long idEnseignant;
    private Long idUniv;
    private String nom;
    private String prenom;
    private String emailUniv;
    private String telephoneUniv;
    private String bureau;
    private boolean estVacataire;
    private String telephone;

    public EnseignantDTO() {
    }

    public EnseignantDTO(Long idEnseignant, Long idUniv, String nom, String prenom, String emailUniv, String telephoneUniv, String bureau, boolean estVacataire, String telephone) {
        this.idEnseignant = idEnseignant;
        this.idUniv = idUniv;
        this.nom = nom;
        this.prenom = prenom;
        this.emailUniv = emailUniv;
        this.telephoneUniv = telephoneUniv;
        this.bureau = bureau;
        this.estVacataire = estVacataire;
        this.telephone = telephone;
    }

    public Long getIdEnseignant() {
        return idEnseignant;
    }

    public void setIdEnseignant(Long idEnseignant) {
        this.idEnseignant = idEnseignant;
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

    public boolean isEstVacataire() {
        return estVacataire;
    }

    public void setEstVacataire(boolean estVacataire) {
        this.estVacataire = estVacataire;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Long getIdUniv() {
        return idUniv;
    }

    public void setIdUniv(Long idUniv) {
        this.idUniv = idUniv;
    }

    @Override
    public String toString() {
        return "EnseignantDTO{" +
                "idEnseignant=" + idEnseignant +
                ", idUniv=" + idUniv +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", emailUniv='" + emailUniv + '\'' +
                ", telephoneUniv='" + telephoneUniv + '\'' +
                ", bureau='" + bureau + '\'' +
                ", estVacataire=" + estVacataire +
                ", telephone='" + telephone + '\'' +
                '}';
    }
}

