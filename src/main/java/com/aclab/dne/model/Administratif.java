package com.aclab.dne.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@PrimaryKeyJoinColumn(name = "idAdministratif")
public class Administratif extends Employe {

    private String fonction;
}
