package com.aclab.dne.dto;


public class InscriptionDTO {

    private Long idEtudiant;
    private Long idPromotion;
    private Long idTuteur;

    public InscriptionDTO() {
    }

    public InscriptionDTO(Long idEtudiant, Long idPromotion, Long idTuteur) {
        this.idEtudiant = idEtudiant;
        this.idPromotion = idPromotion;
        this.idTuteur = idTuteur;
    }

    public Long getIdEtudiant() {
        return idEtudiant;
    }

    public void setIdEtudiant(Long idEtudiant) {
        this.idEtudiant = idEtudiant;
    }

    public Long getIdPromotion() {
        return idPromotion;
    }

    public void setIdPromotion(Long idPromotion) {
        this.idPromotion = idPromotion;
    }

    public Long getIdTuteur() {
        return idTuteur;
    }

    public void setIdTuteur(Long idTuteur) {
        this.idTuteur = idTuteur;
    }

    @Override
    public String toString() {
        return "InscriptionDTO{" +
                "idEtudiant=" + idEtudiant +
                ", idPromotion=" + idPromotion +
                ", idTuteur=" + idTuteur +
                '}';
    }
}
