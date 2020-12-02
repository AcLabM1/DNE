package com.aclab.dne.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import java.util.Date;
import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@Entity
@PrimaryKeyJoinColumn(name = "idPersonne")
public class Etudiant extends InterneUniv {

    private Date dateNaissance;
    private String emailPersonnel;
    private String telephonePeronnel;

    public Etudiant() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Etudiant)) return false;
        if (!super.equals(o)) return false;
        Etudiant etudiant = (Etudiant) o;
        return Objects.equals(getDateNaissance(), etudiant.getDateNaissance()) &&
                Objects.equals(getEmailPersonnel(), etudiant.getEmailPersonnel()) &&
                Objects.equals(getTelephonePeronnel(), etudiant.getTelephonePeronnel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getDateNaissance(), getEmailPersonnel(), getTelephonePeronnel());
    }
}
