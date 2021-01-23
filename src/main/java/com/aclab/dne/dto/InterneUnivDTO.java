package com.aclab.dne.dto;

public class InterneUnivDTO {

    private Long idInterneUniv;
    private String idUniv;
    private String emailUniv;

    public InterneUnivDTO() {
    }

    public InterneUnivDTO(Long idInterneUniv, String numInterneUniv, String emailUniv) {
        this.idInterneUniv = idInterneUniv;
        this.idUniv = numInterneUniv;
        this.emailUniv = emailUniv;
    }

    public Long getIdInterneUniv() {
        return idInterneUniv;
    }

    public void setIdInterneUniv(Long idInterneUniv) {
        this.idInterneUniv = idInterneUniv;
    }

    public String getnumInterneUniv() {
        return idUniv;
    }

    public void setnumInterneUniv(String numInterneUniv) {
        this.idUniv = numInterneUniv;
    }

    public String getEmailUniv() {
        return emailUniv;
    }

    public void setEmailUniv(String emailUniv) {
        this.emailUniv = emailUniv;
    }
}
