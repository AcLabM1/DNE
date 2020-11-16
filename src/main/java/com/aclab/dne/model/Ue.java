package com.aclab.dne.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table
public class Ue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUE;

    private String intitule;

}
