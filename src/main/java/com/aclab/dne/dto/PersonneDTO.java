package com.aclab.dne.dto;

public class PersonneDTO {

    private Long idPersonne;
    private String nom;
    private String prenom;

    public PersonneDTO() {
        super();
    }

    public PersonneDTO(Long idPersonne, String nom, String prenom) {
        this.idPersonne = idPersonne;
        this.nom = nom;
        this.prenom = prenom;
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

    @Override
    public String toString() {
        return "PersonneDTO{" +
                "idPersonne=" + idPersonne +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }
}
