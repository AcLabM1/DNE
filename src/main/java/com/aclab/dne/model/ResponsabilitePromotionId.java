package com.aclab.dne.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class ResponsabilitePromotionId implements Serializable {

    private Long idResponsableFormation;
    private Long idPromotion;
    private Long idDiplome;
}
