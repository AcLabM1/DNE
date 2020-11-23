package com.aclab.dne.dto;

public class DiplomeDTO {

    private int idDiplome;
    private String intitule;
    private int totalects;
    private boolean estActif;

    public DiplomeDTO(){
        super();
    }

    public DiplomeDTO(String intitule,int totalects){
        this.intitule=intitule;
        this.totalects=totalects;
        this.estActif=false;
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

    public int getTotalects() {
        return totalects;
    }

    public void setTotalects(int totalects) {
        this.totalects = totalects;
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
                ", totalects=" + totalects +
                ", estActif=" + estActif +
                '}';
    }


}
