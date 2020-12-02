package com.aclab.dne.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
public class Ue implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUE;

    private String intitule;

}
