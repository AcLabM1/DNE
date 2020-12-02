package com.aclab.dne.dto;

public class TuteurDTO {

    private Long idTuteur;
    private String nom;
    private String prenom;
    private String emailPro;
    private String telephonePro;
    private String societe;

    public TuteurDTO() {
    }

    public TuteurDTO(Long idTuteur, String nom, String prenom, String emailPro, String telephonePro, String societe) {
        this.idTuteur = idTuteur;
        this.nom = nom;
        this.prenom = prenom;
        this.emailPro = emailPro;
        this.telephonePro = telephonePro;
        this.societe = societe;
    }

    public Long getIdTuteur() {
        return idTuteur;
    }

    public void setIdTuteur(Long idTuteur) {
        this.idTuteur = idTuteur;
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

    public String getEmailPro() {
        return emailPro;
    }

    public void setEmailPro(String emailPro) {
        this.emailPro = emailPro;
    }

    public String getTelephonePro() {
        return telephonePro;
    }

    public void setTelephonePro(String telephonePro) {
        this.telephonePro = telephonePro;
    }

    public String getSociete() {
        return societe;
    }

    public void setSociete(String societe) {
        this.societe = societe;
    }

    @Override
    public String toString() {
        return "TuteurDTO{" +
                "idPersonne=" + idTuteur +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", emailPro='" + emailPro + '\'' +
                ", telephonePro='" + telephonePro + '\'' +
                ", societe='" + societe + '\'' +
                '}';
    }
}
