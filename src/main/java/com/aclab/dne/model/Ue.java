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
    private int idUe;

    private String intitule;

    @ManyToMany
    @JoinTable(name = "matiere_ue",
            joinColumns = @JoinColumn(name = "id_ue"),
            inverseJoinColumns = @JoinColumn(name = "id_matiere"))
    @JsonIgnoreProperties("ues")
    private Set<Matiere> matieres;

    @ManyToMany(mappedBy = "ues")
    @JsonIgnoreProperties("ues")
    private Set<Diplome> diplomes;
}
