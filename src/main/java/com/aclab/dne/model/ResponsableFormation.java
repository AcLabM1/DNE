package com.aclab.dne.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import java.util.Objects;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@PrimaryKeyJoinColumn(name = "idPersonne")
public class ResponsableFormation extends Enseignant {

    private String poste;

    @OneToMany
    private Set<Promotion> promotions;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ResponsableFormation)) return false;
        if (!super.equals(o)) return false;
        ResponsableFormation that = (ResponsableFormation) o;
        return Objects.equals(getPoste(), that.getPoste()) && Objects.equals(getPromotions(), that.getPromotions());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getPoste(), getPromotions());
    }
}
