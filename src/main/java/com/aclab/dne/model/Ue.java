package com.aclab.dne.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ue {
    @Id
    int idUE;
    String intitule;
}
