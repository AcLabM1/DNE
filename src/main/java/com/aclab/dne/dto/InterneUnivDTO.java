package com.aclab.dne.dto;

public class InterneUnivDTO {

    private Long idInterne;
    private Long idUniv;
    private String email;

    public InterneUnivDTO() {
    }

    public InterneUnivDTO(Long idInterne, Long idUniv, String email) {
        this.idInterne = idInterne;
        this.idUniv = idUniv;
        this.email = email;
    }

    public Long getIdInterne() {
        return idInterne;
    }

    public void setIdInterne(Long idInterne) {
        this.idInterne = idInterne;
    }

    public Long getIdUniv() {
        return idUniv;
    }

    public void setIdUniv(Long idUniv) {
        this.idUniv = idUniv;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
