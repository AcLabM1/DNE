package com.aclab.dne.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@Getter
@Setter
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "IdEmploye")
public class Enseignant extends Employe{

    private boolean estVacataire;
    private String telephone;
}
