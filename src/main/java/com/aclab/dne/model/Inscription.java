package com.aclab.dne.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
    @JsonIgnore
    private Set<Note> notes;
}
