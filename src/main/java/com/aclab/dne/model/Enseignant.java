package com.aclab.dne.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "IdEmploye")
public class Enseignant extends Employe{

    private boolean estVacataire;
    private String telephone;
}
