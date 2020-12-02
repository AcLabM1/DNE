package com.aclab.dne.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Data
public class Ue implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUE;

    private String intitule;

    @ManyToMany(mappedBy = "ues")
    @JsonIgnoreProperties("ues")
    private Set<Matiere> matieres;
}
