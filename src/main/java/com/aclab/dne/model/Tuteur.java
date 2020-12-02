package com.aclab.dne.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table
@PrimaryKeyJoinColumn(name = "idPersonne")
@Data
public class Tuteur extends Personne{

    private String emailPro;
    private String telephonePro;
    private String societe;

}
