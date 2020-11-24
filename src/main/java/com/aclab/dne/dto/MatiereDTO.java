package com.aclab.dne.dto;

public class MatiereDTO {
    private int idMatiere;
    private String codeMatiere;
    private int quotaHeure;
    private int creditECTS;
    private String intitule;
    private String description;
    private int semestre;

    public MatiereDTO(String codeMatiere, String intitule) {
        this.codeMatiere = codeMatiere;
        this.intitule = intitule;
    }
    public MatiereDTO(){
        super();
    }

    public int getIdMatiere() {
        return idMatiere;
    }

    public void setIdMatiere(int idMatiere) {
        this.idMatiere = idMatiere;
    }

    public String getCodeMatiere() {
        return codeMatiere;
    }

    public void setCodeMatiere(String codeMatiere) {
        this.codeMatiere = codeMatiere;
    }

    public int getQuotaHeure() {
        return quotaHeure;
    }

    public void setQuotaHeure(int quotaHeure) {
        this.quotaHeure = quotaHeure;
    }

    public int getCreditECTS() {
        return creditECTS;
    }

    public void setCreditECTS(int creditECTS) {
        this.creditECTS = creditECTS;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return "MatiereDTO{" +
                "idMatiere=" + idMatiere +
                ", codeMatiere='" + codeMatiere + '\'' +
                ", quotaHeure=" + quotaHeure +
                ", creditECTS=" + creditECTS +
                ", intitule='" + intitule + '\'' +
                ", description='" + description + '\'' +
                ", semestre=" + semestre +
                '}';
    }
}
