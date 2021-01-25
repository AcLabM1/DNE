package com.aclab.dne.dto;

import com.aclab.dne.model.Inscription;
import com.aclab.dne.model.MetaMatiere;

import java.sql.Date;

public class NoteDTO {

    private Long idNote;
    private Float note;
    private Date date;
    private int coef;
    private String type;
    private Inscription inscription;
    private MetaMatiere metaMatiere;

    public NoteDTO(){

    }

    public NoteDTO(Long idNote, Float note, Date date, int coef, String type, Inscription inscription, MetaMatiere metaMatiere) {
        this.idNote = idNote;
        this.note = note;
        this.date = date;
        this.coef = coef;
        this.type = type;
        this.inscription = inscription;
        this.metaMatiere = metaMatiere;
    }

    public Long getIdNote() {
        return idNote;
    }

    public void setIdNote(Long idNote) {
        this.idNote = idNote;
    }

    public Float getNote() {
        return note;
    }

    public void setNote(Float note) {
        this.note = note;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getCoef() {
        return coef;
    }

    public void setCoef(int coef) {
        this.coef = coef;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Inscription getInscription() {
        return inscription;
    }

    public void setInscription(Inscription inscription) {
        this.inscription = inscription;
    }

    public MetaMatiere getMetaMatiere() {
        return metaMatiere;
    }

    public void setMetaMatiere(MetaMatiere metaMatiere) {
        this.metaMatiere = metaMatiere;
    }

    @Override
    public String toString() {
        return "NoteDTO{" +
                "idNote=" + idNote +
                ", note=" + note +
                ", date=" + date +
                ", coef=" + coef +
                ", type='" + type + '\'' +
                '}';
    }
}
