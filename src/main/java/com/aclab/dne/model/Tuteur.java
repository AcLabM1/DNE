package com.aclab.dne.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

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
