package com.aclab.dne.services;

import com.aclab.dne.converter.PromotionConverter;
import com.aclab.dne.dto.PromotionDTO;
import com.aclab.dne.model.Promotion;
import com.aclab.dne.repositories.PromotionRepository;
import lombok.AllArgsConstructor;
import org.apache.commons.collections4.IterableUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.NoSuchElementException;

@Transactional
@AllArgsConstructor
@Service
public class PromotionService {

    private final PromotionRepository promotionRepository;
    private final PromotionConverter promotionConverter;

    public List<PromotionDTO> findAllPromotions(){
        Iterable<Promotion> promotions = this.promotionRepository.findAll();
        if(IterableUtils.size(promotions) > 0){
            return this.promotionConverter.entityToDTO((IterableUtils.toList(promotions)));
        } else {
            throw new NoSuchElementException("Pas de promotion");
        }
    }

}
