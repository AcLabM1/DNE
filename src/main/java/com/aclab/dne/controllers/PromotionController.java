package com.aclab.dne.controllers;

import com.aclab.dne.converter.PromotionConverter;
import com.aclab.dne.repositories.PromotionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/promotions")
public class PromotionController {

    private final PromotionConverter promotionConverter;
    private final PromotionRepository promotionRepository;

    @Autowired
    public PromotionController(PromotionConverter promotionConverter, PromotionRepository promotionRepository) {
        this.promotionConverter = promotionConverter;
        this.promotionRepository = promotionRepository;
    }
}
