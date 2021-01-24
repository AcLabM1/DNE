package com.aclab.dne.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "idEnseignant")
public class Enseignant extends Employe{

    private boolean estVacataire;
    private String telephone;

    @ManyToMany
    @JoinTable(
            name = "ENSEIGNANT_MATIERE",
            joinColumns = @JoinColumn(name = "id_enseignant"),
            inverseJoinColumns = {
             @JoinColumn(name = "id_promotion"),
             @JoinColumn(name = "id_diplome"),
             @JoinColumn(name = "id_ue"),
             @JoinColumn(name = "id_matiere")})
    private Set<MetaMatiere> matieres;

    @ManyToMany
    @JoinTable(
            name = "ENSEIGNANT_SESSION",
            joinColumns = @JoinColumn(name = "id_enseignant"),
            inverseJoinColumns = @JoinColumn(name = "id_session"))
    private Set<Session> sessions;
}
