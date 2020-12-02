package com.aclab.dne.dto;

public class DiplomeDTO {

    private int idDiplome;
    private String intitule;
    private int totalEcts;
    private boolean estActif;

    public DiplomeDTO(String intitule, int totalEcts) {
        this.intitule = intitule;
        this.totalEcts = totalEcts;
        this.estActif = false;
    }

    public int getIdDiplome() {
        return idDiplome;
    }

    public void setIdDiplome(int idDiplome) {
        this.idDiplome = idDiplome;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public int getTotalEcts() {
        return totalEcts;
    }

    public void setTotalEcts(int totalEcts) {
        this.totalEcts = totalEcts;
    }

    public boolean isEstActif() {
        return estActif;
    }

    public void setEstActif(boolean estActif) {
        this.estActif = estActif;
    }

    @Override
    public String toString() {
        return "DiplomeDTO{" +
                "idDiplome=" + idDiplome +
                ", intitule='" + intitule + '\'' +
                ", totalects=" + totalEcts +
                ", estActif=" + estActif +
                '}';
    }


}
