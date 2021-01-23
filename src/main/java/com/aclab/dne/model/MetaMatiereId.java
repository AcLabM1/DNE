package com.aclab.dne.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class MetaMatiereId implements Serializable {

    private Long idPromotion;
    private Long idDiplome;
    private Long idUe;
    private Long idMatiere;
}
