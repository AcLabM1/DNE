package com.aclab.dne.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Data
public class Diplome implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDiplome;

    private String intitule;
    private int totalEcts;
    private boolean estActif;

    @ManyToMany
    @JoinTable(name = "diplome_ue",
            joinColumns = @JoinColumn(name = "id_diplome"),
            inverseJoinColumns = @JoinColumn(name = "id_ue"))
    @JsonIgnoreProperties("diplomes")
    private Set<Ue> ues;
}
