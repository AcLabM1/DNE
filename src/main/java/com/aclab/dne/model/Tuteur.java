package com.aclab.dne.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@Data
@PrimaryKeyJoinColumn(name = "idPersonne")
public class Tuteur extends Personne {

    private String emailPro;
    private String telephonePro;
    private String societe;
}
