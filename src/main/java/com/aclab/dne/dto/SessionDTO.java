package com.aclab.dne.dto;

import com.aclab.dne.model.MetaMatiere;

import java.sql.Timestamp;

public class SessionDTO {

    private Long idSession;
    private Timestamp dateHeure;
    private int duree;
    private String salle;
    private MetaMatiere metaMatiere;

    public MetaMatiere getMetaMatiere() {
        return metaMatiere;
    }

    public void setMetaMatiere(MetaMatiere metaMatiere) {
        this.metaMatiere = metaMatiere;
    }

    public SessionDTO() {
        super();
    }

    public SessionDTO(Timestamp dateHeure, int duree, String salle, MetaMatiere metaMatiere) {
        this.dateHeure = dateHeure;
        this.duree = duree;
        this.salle = salle;
        this.metaMatiere = metaMatiere;
    }

    public Long getIdSession() {
        return idSession;
    }

    public void setIdSession(Long idSession) {
        this.idSession = idSession;
    }

    public Timestamp getDateHeure() {
        return dateHeure;
    }

    public void setDateHeure(Timestamp dateHeure) {
        this.dateHeure = dateHeure;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public String getSalle() {
        return salle;
    }

    public void setSalle(String salle) {
        this.salle = salle;
    }

    @Override
    public String toString() {
        return "SessionDTO{" +
                "idSession=" + idSession +
                ", dateHeure=" + dateHeure +
                ", duree=" + duree +
                ", salle='" + salle + '\'' +
                '}';
    }
}
