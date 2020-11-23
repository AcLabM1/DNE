package com.aclab.dne.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table
public class Matiere implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMatiere;
    private String codeMatiere;
    private int quotaHeure;
    private int creditECTS;
    private String intitule;
    private String description;
    private int semestre;


}