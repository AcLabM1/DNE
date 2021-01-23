package com.aclab.dne.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Session implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSession;
    private Timestamp dateHeure;
    private int duree;
    private String salle;

    @ManyToMany(mappedBy = "sessions")
    private Set<Enseignant> enseignants;

    @ManyToOne
    @JoinColumn(name = "id_promotion")
    @JoinColumn(name = "id_diplome")
    @JoinColumn(name = "id_ue")
    @JoinColumn(name = "id_matiere")
    private MetaMatiere metaMatiere;
}
