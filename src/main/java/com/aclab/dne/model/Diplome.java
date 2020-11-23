package com.aclab.dne.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table
public class Diplome implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDiplome;

    private String intitule;
    private int totalects;
    private boolean estActif;

}
