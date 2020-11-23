package com.aclab.dne.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Data
@Table
public class Personne implements Serializable {

    @Id
    @GeneratedValue
    private Long idPersonne;
    private String nom;
    private String prenom;


}
