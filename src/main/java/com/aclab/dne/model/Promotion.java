package com.aclab.dne.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Promotion implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPromotion;
    private int annee;

    @ManyToMany
    @JoinTable(name = "promotion_diplome",
    joinColumns = @JoinColumn(name = "id_promotion"),
    inverseJoinColumns = @JoinColumn(name = "id_diplome"))
    @JsonIgnoreProperties("promotions")
    private Set<Diplome> diplomes;
}
