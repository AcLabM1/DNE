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
@IdClass(MetaMatiereId.class)
public class MetaMatiere  implements Serializable {

    @Id
    @Column(name = "id_promotion")
    private Long idPromotion;

    @Id
    @Column(name = "id_diplome")
    private Long idDiplome;

    @Id
    @Column(name = "id_ue")
    private Long idUe;

    @Id
    @Column(name = "id_matiere")
    private Long idMatiere;

    @ManyToMany(mappedBy = "matieres")
    Set<Enseignant> enseignants;
}
