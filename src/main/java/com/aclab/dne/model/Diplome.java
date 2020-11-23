package com.aclab.dne.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table
public class Diplome {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDiplome;

    private String intitule;
    private int totalects;
    private boolean estActif;

}
