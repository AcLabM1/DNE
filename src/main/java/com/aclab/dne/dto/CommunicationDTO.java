package com.aclab.dne.dto;

import java.sql.Timestamp;

public class CommunicationDTO {

    private Long idEtudiant;
    private Long idPromotion;
    private Long idEmploye;
    private Long idCommunication;
    private Timestamp dateHeure;
    private String description;
    private String nature;

    public CommunicationDTO() {
    }

    public CommunicationDTO(Long idEtudiant, Long idPromotion, Long idEmploye, Long idCommunication, Timestamp dateHeure, String description, String nature) {
        this.idEtudiant = idEtudiant;
        this.idPromotion = idPromotion;
        this.idEmploye = idEmploye;
        this.idCommunication = idCommunication;
        this.dateHeure = dateHeure;
        this.description = description;
        this.nature = nature;
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

    public Long getIdEmploye() {
        return idEmploye;
    }

    public void setIdEmploye(Long idEmploye) {
        this.idEmploye = idEmploye;
    }

    public Long getIdCommunication() {
        return idCommunication;
    }

    public void setIdCommunication(Long idCommunication) {
        this.idCommunication = idCommunication;
    }

    public Timestamp getDateHeure() {
        return dateHeure;
    }

    public void setDateHeure(Timestamp dateHeure) {
        this.dateHeure = dateHeure;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    @Override
    public String toString() {
        return "CommunicationDTO{" +
                "idEtudiant=" + idEtudiant +
                ", idPromotion=" + idPromotion +
                ", idEmploye=" + idEmploye +
                ", idCommunication=" + idCommunication +
                ", dateHeure=" + dateHeure +
                ", description='" + description + '\'' +
                ", nature='" + nature + '\'' +
                '}';
    }
}
