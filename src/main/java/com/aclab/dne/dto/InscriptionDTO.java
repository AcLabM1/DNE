package com.aclab.dne.dto;


public class InscriptionDTO {

    private Long idEtudiant;
    private Long idPromotion;
    private Long idTuteur;
    private int idDiplome;

    public InscriptionDTO() {
    }

    public InscriptionDTO(Long idEtudiant, Long idPromotion, Long idTuteur, int idDiplome) {
        this.idEtudiant = idEtudiant;
        this.idPromotion = idPromotion;
        this.idTuteur = idTuteur;
        this.idDiplome = idDiplome;
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

    public int getIdDiplome() {
        return idDiplome;
    }

    public void setIdDiplome(int idDiplome) {
        this.idDiplome = idDiplome;
    }

    @Override
    public String toString() {
        return "InscriptionDTO{" +
                "idEtudiant=" + idEtudiant +
                ", idPromotion=" + idPromotion +
                ", idTuteur=" + idTuteur +
                ", idDiplome=" + idDiplome +
                '}';
    }
}
