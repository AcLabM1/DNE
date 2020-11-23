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
<<<<<<< HEAD
public abstract class Personne implements Serializable {
=======
public class Personne implements Serializable {
>>>>>>> ab06b7f87f4ae386b6464fdf2e5d7158ef35b0f8

    @Id
    @GeneratedValue
    private Long idPersonne;
    private String nom;
    private String prenom;


}
