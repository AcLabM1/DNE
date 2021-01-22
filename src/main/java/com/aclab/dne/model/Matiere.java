package com.aclab.dne.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Data
@Table
public class Matiere implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMatiere;
    private String codeMatiere;
    private int quotaHeure;
    private int creditECTS;
    private String intitule;
    private String description;
    private int semestre;

    @ManyToMany
    @JoinTable(name = "matiere_ue",
            joinColumns = @JoinColumn(name = "id_matiere"),
            inverseJoinColumns = @JoinColumn(name = "id_ue"))
    @JsonIgnoreProperties("matieres")
    private Set<Ue> ues;
}