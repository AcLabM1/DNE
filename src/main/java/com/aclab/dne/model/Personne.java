package com.aclab.dne.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Personne implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPersonne;
    private String nom;
    private String prenom;
    private String password;
    private String username;

    public void setUsername(String username) {
        this.username = username.toLowerCase();
    }

}
