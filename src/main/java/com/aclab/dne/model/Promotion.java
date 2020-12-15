package com.aclab.dne.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Promotion implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPromotion;
    private int annee;

    @ManyToMany
    @JoinTable(name = "promotion_diplome",
    joinColumns = @JoinColumn(name = "id_promotion"),
    inverseJoinColumns = @JoinColumn(name = "ud_diplome"))
    @JsonIgnoreProperties("promotions")
    private Set<Diplome> diplomes;
}
