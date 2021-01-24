package com.aclab.dne.dto;

import java.sql.Date;

public class NoteDTO {

    private Long idNote;
    private Float note;
    private Date date;
    private int coef;
    private String type;


    public NoteDTO(Long idNote, Float note, Date date, int coef, String type) {
        this.idNote = idNote;
        this.note = note;
        this.date = date;
        this.coef = coef;
        this.type = type;
    }

    public NoteDTO() {

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
