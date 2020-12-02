package com.aclab.dne.converter;

import com.aclab.dne.dto.PromotionDTO;
import com.aclab.dne.model.Promotion;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PromotionConverter {

    public PromotionDTO entityToDTO(Promotion promotion) {
        ModelMapper mapper = new ModelMapper();
        return mapper.map(promotion, PromotionDTO.class);
    }

    public List<PromotionDTO> entityToDTO(List<Promotion> promotionList) {
        return promotionList.stream().map(this::entityToDTO).collect(Collectors.toList());
    }

    public Promotion dtoToEntity(PromotionDTO promotionDTO) {
        ModelMapper mapper = new ModelMapper();
        return mapper.map(promotionDTO, Promotion.class);
    }

    public List<Promotion> dtoToEntity(List<PromotionDTO> promotionList) {
        return promotionList.stream().map(this::dtoToEntity).collect(Collectors.toList());
    }
}
