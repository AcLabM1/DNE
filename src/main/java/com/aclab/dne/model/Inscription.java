package com.aclab.dne.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@IdClass(InscriptionId.class)
public class Inscription  implements Serializable {

    @Id
    @Column(name = "id_etudiant")
    private Long idEtudiant;

    @Id
    @Column(name = "id_promotion")
    private Long idPromotion;

    @Id
    @Column(name = "id_diplome")
    private int idDiplome;

    private Long idTuteur;

    @OneToMany(mappedBy = "inscription")
    private Set<Note> notes;
}
