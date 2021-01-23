package com.aclab.dne.model;

import lombok.Data;
import org.hibernate.annotations.JoinColumnOrFormula;
import org.hibernate.annotations.JoinColumnsOrFormulas;
import org.hibernate.annotations.JoinFormula;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Data
@Table
public class Note implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idNote;
    private Float noteAttribuee;
    private Date date;
    private int coef;
    private String type;

    @ManyToOne
    @JoinColumns(value = {
            @JoinColumn(name = "id_etudiant", referencedColumnName = "id_etudiant"),
            @JoinColumn(name = "id_promotion", referencedColumnName = "id_promotion")
    })
    private Inscription inscription;

    @ManyToOne
    @JoinColumnsOrFormulas(value = {
            @JoinColumnOrFormula(formula = @JoinFormula(value = "id_promotion", referencedColumnName = "id_promotion")),
            @JoinColumnOrFormula(column = @JoinColumn(name = "id_diplome", referencedColumnName = "id_diplome")),
            @JoinColumnOrFormula(column = @JoinColumn(name = "id_ue", referencedColumnName = "id_ue")),
            @JoinColumnOrFormula(column = @JoinColumn(name = "id_matiere", referencedColumnName = "id_matiere"))
    })
    private MetaMatiere metaMatiere;
}
