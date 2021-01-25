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
    private int idDiplome;
    private int idUe;
    private int idMatiere;

}
