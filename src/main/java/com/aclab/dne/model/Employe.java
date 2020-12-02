package com.aclab.dne.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@PrimaryKeyJoinColumn(name = "idInterneUniv")
public class Employe extends InterneUniv {

    private String telephoneUniv;
    private String bureau;


}
