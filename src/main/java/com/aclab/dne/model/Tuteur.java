package com.aclab.dne.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
@Entity
@ToString
@PrimaryKeyJoinColumn(name = "idTuteur")
public class Tuteur extends Personne {

    private String emailPro;
    private String telephonePro;
    private String societe;

    public Tuteur() {
        super();
    }
}
