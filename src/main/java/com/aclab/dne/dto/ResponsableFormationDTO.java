package com.aclab.dne.dto;


public class ResponsableFormationDTO {

    /* heritage de Personne */
    private Long idEmploye;
    private String nom;
    private String prenom;
    /* heritage de InternUniv */
    private String email;
    /* heritage de Employe */
    private String telephoneUniv;
    private String bureau;
    /* heritage Enseignant */
    private boolean estVacataire;
    private String telephone;

    private String poste;

    public ResponsableFormationDTO(){
        super();
    }
    public ResponsableFormationDTO(Long idEmploye, String nom, String prenom, String email, String telephoneUniv, String bureau, boolean estVacataire, String telephone, String poste) {
        this.idEmploye = idEmploye;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephoneUniv = telephoneUniv;
        this.bureau = bureau;
        this.estVacataire = estVacataire;
        this.telephone = telephone;
        this.poste = poste;
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

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }
}
