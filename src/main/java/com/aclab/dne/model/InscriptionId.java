package com.aclab.dne.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class InscriptionId implements Serializable {

    private Long idEtudiant;
    private Long idPromotion;
}
