package com.aclab.dne.dto;

public class PromotionDTO {

    private Long idPromotion;
    private int annee;

    public PromotionDTO() {
    }

    public PromotionDTO(Long idPromotion, int annee) {
        this.idPromotion = idPromotion;
        this.annee = annee;
    }

    public Long getIdPromotion() {
        return idPromotion;
    }

    public void setIdPromotion(Long idPromotion) {
        this.idPromotion = idPromotion;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    @Override
    public String toString() {
        return "PromotionDTO{" +
                "idPromotion=" + idPromotion +
                ", annee=" + annee +
                '}';
    }
}
