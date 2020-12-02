package com.aclab.dne.converter;

import com.aclab.dne.dto.PromotionDTO;
import com.aclab.dne.model.Promotion;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PromotionConverter {

    private static final Logger LOG = LoggerFactory.getLogger(PromotionConverter.class);

    public PromotionDTO entityToDTO(Promotion promotion) {
        LOG.debug("IN");
        ModelMapper mapper = new ModelMapper();
        return mapper.map(promotion, PromotionDTO.class);
    }

    public List<PromotionDTO> entityToDTO(List<Promotion> promotionList) {
        LOG.debug("IN");
        return promotionList.stream().map(this::entityToDTO).collect(Collectors.toList());
    }

    public Promotion dtoToEntity(PromotionDTO promotionDTO) {
        LOG.debug("IN");
        ModelMapper mapper = new ModelMapper();
        return mapper.map(promotionDTO, Promotion.class);
    }

    public List<Promotion> dtoToEntity(List<PromotionDTO> promotionList) {
        LOG.debug("IN");
        return promotionList.stream().map(this::dtoToEntity).collect(Collectors.toList());
    }
}
