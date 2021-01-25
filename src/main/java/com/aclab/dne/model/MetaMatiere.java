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
    private long idPromotion;

    @Id
    @Column(name = "id_diplome")
    private int idDiplome;

    @Id
    @Column(name = "id_ue")
    private int idUe;

    @Id
    @Column(name = "id_matiere")
    private int idMatiere;

    @ManyToMany(mappedBy = "matieres")
    private Set<Enseignant> enseignants;

    @OneToMany(mappedBy = "metaMatiere")
    private Set<Session> sessions;
}
