package com.aclab.dne.dto;


import java.util.Objects;

public class ResponsabilitePromotionDTO {

    private Long idResponsableFormation;
    private Long idPromotion;
    private Long idDiplome;

    public ResponsabilitePromotionDTO() {
    }

    public ResponsabilitePromotionDTO(Long idResponsableFormation, Long idPromotion, Long idDiplome) {
        this.idResponsableFormation = idResponsableFormation;
        this.idPromotion = idPromotion;
        this.idDiplome = idDiplome;
    }

    public Long getIdResponsableFormation() {
        return idResponsableFormation;
    }

    public void setIdResponsableFormation(Long idResponsableFormation) {
        this.idResponsableFormation = idResponsableFormation;
    }

    public Long getIdPromotion() {
        return idPromotion;
    }

    public void setIdPromotion(Long idPromotion) {
        this.idPromotion = idPromotion;
    }

    public Long getIdDiplome() {
        return idDiplome;
    }

    public void setIdDiplome(Long idDiplome) {
        this.idDiplome = idDiplome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ResponsabilitePromotionDTO)) return false;
        ResponsabilitePromotionDTO that = (ResponsabilitePromotionDTO) o;
        return getIdResponsableFormation().equals(that.getIdResponsableFormation()) && getIdPromotion().equals(that.getIdPromotion()) && getIdDiplome().equals(that.getIdDiplome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdResponsableFormation(), getIdPromotion(), getIdDiplome());
    }

    @Override
    public String toString() {
        return "ResponsabilitePromotionDTO{" +
                "idResponsableFormation=" + idResponsableFormation +
                ", idPromotion=" + idPromotion +
                ", idDiplome=" + idDiplome +
                '}';
    }
}
