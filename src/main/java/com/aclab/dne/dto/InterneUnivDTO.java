package com.aclab.dne.dto;

public class InterneUnivDTO {

    private Long idInterneUniv;
    private Long idUniv;
    private String emailUniv;

    public InterneUnivDTO() {
    }

    public InterneUnivDTO(Long idInterneUniv, Long idUniv, String emailUniv) {
        this.idInterneUniv = idInterneUniv;
        this.idUniv = idUniv;
        this.emailUniv = emailUniv;
    }

    public Long getIdInterneUniv() {
        return idInterneUniv;
    }

    public void setIdInterneUniv(Long idInterneUniv) {
        this.idInterneUniv = idInterneUniv;
    }

    public Long getIdUniv() {
        return idUniv;
    }

    public void setIdUniv(Long idUniv) {
        this.idUniv = idUniv;
    }

    public String getEmailUniv() {
        return emailUniv;
    }

    public void setEmailUniv(String emailUniv) {
        this.emailUniv = emailUniv;
    }


}
