package com.aclab.dne.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Session implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSession;
    private Timestamp dateHeure;
    private int duree;
    private String salle;

    @ManyToMany
    @JoinTable(
            name = "ENSEIGNANT_SESSION",
            joinColumns = @JoinColumn(name = "id_session"),
            inverseJoinColumns = @JoinColumn(name = "id_enseignant"))
    private Set<Enseignant> enseignants;

    @ManyToOne
    @JoinColumn(name = "id_promotion")
    @JoinColumn(name = "id_diplome")
    @JoinColumn(name = "id_ue")
    @JoinColumn(name = "id_matiere")
    private MetaMatiere metaMatiere;
}
