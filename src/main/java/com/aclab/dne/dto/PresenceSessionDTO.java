package com.aclab.dne.dto;


import java.util.Objects;

public class PresenceSessionDTO {

    private Long idEtudiant;
    private Long idPromotion;
    private Long idSession;
    private boolean isPresent;

    public PresenceSessionDTO() {
    }

    public PresenceSessionDTO(Long idEtudiant, Long idPromotion, Long idSession, boolean isPresent) {
        this.idEtudiant = idEtudiant;
        this.idPromotion = idPromotion;
        this.idSession = idSession;
        this.isPresent = isPresent;
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

    public Long getIdSession() {
        return idSession;
    }

    public void setIdSession(Long idSession) {
        this.idSession = idSession;
    }

    public boolean isPresent() {
        return isPresent;
    }

    public void setPresent(boolean present) {
        isPresent = present;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PresenceSessionDTO)) return false;
        PresenceSessionDTO that = (PresenceSessionDTO) o;
        return isPresent() == that.isPresent() && getIdEtudiant().equals(that.getIdEtudiant()) && getIdPromotion().equals(that.getIdPromotion()) && getIdSession().equals(that.getIdSession());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdEtudiant(), getIdPromotion(), getIdSession(), isPresent());
    }

    @Override
    public String toString() {
        return "PresenceSessionDTO{" +
                "idEtudiant=" + idEtudiant +
                ", idPromotion=" + idPromotion +
                ", idSession=" + idSession +
                ", isPresent=" + isPresent +
                '}';
    }
}
