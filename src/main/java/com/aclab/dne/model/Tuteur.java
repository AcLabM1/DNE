package com.aclab.dne.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import java.util.Set;

@Entity
@Data
@PrimaryKeyJoinColumn(name = "idPersonne")
public class Tuteur extends Personne {

    private String emailPro;
    private String telephonePro;
    private String societe;

    @OneToMany(mappedBy = "tuteur")
    @JsonIgnore
    private Set<Inscription> etudiantsSousTutorat;
}
