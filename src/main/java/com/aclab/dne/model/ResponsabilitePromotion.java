package com.aclab.dne.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@IdClass(ResponsabilitePromotionId.class)
public class ResponsabilitePromotion implements Serializable {

    @Id
    private Long idResponsableFormation;

    @Id
    private Long idPromotion;

    @Id
    private Long idDiplome;
}
