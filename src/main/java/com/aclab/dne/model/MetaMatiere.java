package com.aclab.dne.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @JsonIgnore
    private Set<Enseignant> enseignants;

    @OneToMany(mappedBy = "metaMatiere")
    @JsonIgnore
    private Set<Session> sessions;
}
