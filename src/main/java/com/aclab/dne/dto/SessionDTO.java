package com.aclab.dne.dto;

import java.sql.Timestamp;

public class SessionDTO {

    private Long idSession;
    private Timestamp dateHeure;
    private int duree;
    private String salle;

    public SessionDTO() {
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
