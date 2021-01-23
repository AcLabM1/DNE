package com.aclab.dne.dto;

import com.aclab.dne.model.Enseignant;
import com.aclab.dne.model.Session;

import java.util.Objects;
import java.util.Set;

public class MetaMatiereDTO {

    private Long idPromotion;
    private Long idDiplome;
    private Long idUe;
    private Long idMatiere;
    private Set<Enseignant> enseignants;
    private Set<Session> sessions;

    public MetaMatiereDTO() {
    }

    public MetaMatiereDTO(Long idPromotion, Long idDiplome, Long idUe, Long idMatiere, Set<Enseignant> enseignants, Set<Session> sessions) {
        this.idPromotion = idPromotion;
        this.idDiplome = idDiplome;
        this.idUe = idUe;
        this.idMatiere = idMatiere;
        this.enseignants = enseignants;
        this.sessions = sessions;
    }

    public Long getIdPromotion() {
        return idPromotion;
    }

    public void setIdPromotion(Long idPromotion) {
        this.idPromotion = idPromotion;
    }

    public Long getIdDiplome() {
        return idDiplome;
    }

    public void setIdDiplome(Long idDiplome) {
        this.idDiplome = idDiplome;
    }

    public Long getIdUe() {
        return idUe;
    }

    public void setIdUe(Long idUe) {
        this.idUe = idUe;
    }

    public Long getIdMatiere() {
        return idMatiere;
    }

    public void setIdMatiere(Long idMatiere) {
        this.idMatiere = idMatiere;
    }

    public Set<Enseignant> getEnseignants() {
        return enseignants;
    }

    public void setEnseignants(Set<Enseignant> enseignants) {
        this.enseignants = enseignants;
    }

    public Set<Session> getSessions() {
        return sessions;
    }

    public void setSessions(Set<Session> sessions) {
        this.sessions = sessions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MetaMatiereDTO)) return false;
        MetaMatiereDTO that = (MetaMatiereDTO) o;
        return getIdPromotion().equals(that.getIdPromotion()) && getIdDiplome().equals(that.getIdDiplome()) && getIdUe().equals(that.getIdUe()) && getIdMatiere().equals(that.getIdMatiere()) && Objects.equals(getEnseignants(), that.getEnseignants()) && Objects.equals(getSessions(), that.getSessions());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdPromotion(), getIdDiplome(), getIdUe(), getIdMatiere(), getEnseignants(), getSessions());
    }

    @Override
    public String toString() {
        return "MetaMatiereDTO{" +
                "idPromotion=" + idPromotion +
                ", idDiplome=" + idDiplome +
                ", idUe=" + idUe +
                ", idMatiere=" + idMatiere +
                ", enseignants=" + enseignants +
                ", sessions=" + sessions +
                '}';
    }
}
