package com.aclab.dne.dto;

public class EmployeDTO {

    private Long idEmploye;
    private String numInterneUniv;
    private String nom;
    private String prenom;
    private String emailUniv;
    private String telephoneUniv;
    private String bureau;
    private String password;
    private String username;

    public EmployeDTO() {
    }

    public EmployeDTO(Long idEmploye, String numInterneUniv, String nom, String prenom, String emailUniv, String telephoneUniv, String bureau) {
        this.idEmploye = idEmploye;
        this.numInterneUniv = numInterneUniv;
        this.nom = nom;
        this.prenom = prenom;
        this.emailUniv = emailUniv;
        this.telephoneUniv = telephoneUniv;
        this.bureau = bureau;
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
        return "EmployeDTO{" +
                "idEmploye=" + idEmploye +
                ", numInterneUniv=" + numInterneUniv +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", emailUniv='" + emailUniv + '\'' +
                ", telephoneUniv='" + telephoneUniv + '\'' +
                ", bureau='" + bureau + '\'' +
                '}';
    }
}
