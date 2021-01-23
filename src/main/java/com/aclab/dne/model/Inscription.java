package com.aclab.dne.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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
    private Long idDiplome;


    @ManyToOne
    @JoinColumn(name = "id_tuteur")
    private Tuteur tuteur;

    @OneToMany(mappedBy = "inscription")
    private Set<Note> notes;
}
