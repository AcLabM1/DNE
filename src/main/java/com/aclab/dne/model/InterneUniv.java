package com.aclab.dne.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Getter
@Setter
@AllArgsConstructor
@Entity
@ToString
@PrimaryKeyJoinColumn(name = "idInterneUniv")
public class InterneUniv extends Personne {


    private String numInterneUniv;

    private String emailUniv;

    public InterneUniv() {
        super();
    }

    public InterneUniv(String emailUniv) {
        this.emailUniv = emailUniv;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
