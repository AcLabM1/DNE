package com.aclab.dne.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
@PrimaryKeyJoinColumn(name = "idEtudiant")
public class Etudiant extends InterneUniv {

    private Date dateNaissance;
    private String emailPersonnel;
    private String telephonePersonnel;
}
