package com.aclab.dne.dto;

public class UeDTO {

    private int idUe;
    private String intitule;

    public UeDTO(int idUe, String intitule) {
        this.idUe = idUe;
        this.intitule = intitule;
    }

    public int getIdUe() {
        return idUe;
    }

    public void setIdUe(int idUe) {
        this.idUe = idUe;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    @Override
    public String toString() {
        return "UeDTO{" +
                "idUe=" + idUe +
                ", intitule='" + intitule + '\'' +
                '}';
    }
}
