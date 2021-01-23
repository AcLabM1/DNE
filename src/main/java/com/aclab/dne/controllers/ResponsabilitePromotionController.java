package com.aclab.dne.controllers;

import com.aclab.dne.converter.ResponsabilitePromotionConverter;
import com.aclab.dne.repositories.ResponsabilitePromotionRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/responsabilite-promotion")
public class ResponsabilitePromotionController {

    private static final Logger LOG = LoggerFactory.getLogger(ResponsabilitePromotionController.class);
    private final ResponsabilitePromotionRepository responsabilitePromotionRepository;
    private final ResponsabilitePromotionConverter responsabilitePromotionConverter;

    @Autowired
    public ResponsabilitePromotionController(ResponsabilitePromotionRepository responsabilitePromotionRepository, ResponsabilitePromotionConverter responsabilitePromotionConverter) {
        this.responsabilitePromotionRepository = responsabilitePromotionRepository;
        this.responsabilitePromotionConverter = responsabilitePromotionConverter;
    }
}
