package com.aclab.dne.converter;

import com.aclab.dne.dto.ResponsabilitePromotionDTO;
import com.aclab.dne.model.ResponsabilitePromotion;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ResponsabilitePromotionConverter {
    
    public ResponsabilitePromotionDTO entityToDTO(ResponsabilitePromotion responsabilitePromotion) {
        ModelMapper mapper = new ModelMapper();
        return mapper.map(responsabilitePromotion, ResponsabilitePromotionDTO.class);
    }

    public List<ResponsabilitePromotionDTO> entityToDTO(List<ResponsabilitePromotion> responsabilitePromotions) {
        return responsabilitePromotions.stream().map(this::entityToDTO).collect(Collectors.toList());
    }

    public ResponsabilitePromotion dtoToEntity(ResponsabilitePromotionDTO responsabilitePromotionDTO) {
        ModelMapper mapper = new ModelMapper();
        return mapper.map(responsabilitePromotionDTO, ResponsabilitePromotion.class);
    }

    public List<ResponsabilitePromotion> dtoToEntity(List<ResponsabilitePromotionDTO> responsabilitePromotionDTOs) {
        return responsabilitePromotionDTOs.stream().map(this::dtoToEntity).collect(Collectors.toList());
    }
}
