package com.aclab.dne.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@IdClass(InscriptionId.class)
public class Inscription {

    @Id
    private Long idEtudiant;

    @Id
    private Long idPromotion;

    private Long idTuteur;
}
