package com.aclab.dne.dto;


import lombok.Data;

@Data
public class TuteurDTO {

    private Long idPersonne;
    private String nom;
    private String prenom;

    private String emailPro;
    private String telephonePro;
    private String societe;

    public TuteurDTO(Long idPersonne, String nom, String prenom, String emailPro, String telephonePro, String societe) {
        this.idPersonne = idPersonne;
        this.nom = nom;
        this.prenom = prenom;
        this.emailPro = emailPro;
        this.telephonePro = telephonePro;
        this.societe = societe;
    }

    public Long getIdPersonne() {
        return idPersonne;
    }

    public void setIdPersonne(Long idPersonne) {
        this.idPersonne = idPersonne;
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
                "idPersonne=" + idPersonne +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", emailPro='" + emailPro + '\'' +
                ", telephonePro='" + telephonePro + '\'' +
                ", societe='" + societe + '\'' +
                '}';
    }
}
