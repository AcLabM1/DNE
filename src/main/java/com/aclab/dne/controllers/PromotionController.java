package com.aclab.dne.controllers;

import com.aclab.dne.configuration.SwaggerConfig;
import com.aclab.dne.dto.PromotionDTO;
import com.aclab.dne.dto.TuteurDTO;
import com.aclab.dne.services.PromotionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping(path = "/promotions")
@Api(tags = { SwaggerConfig.PROMOTION })
public class PromotionController {

    private static final Logger LOG = LoggerFactory.getLogger(PromotionController.class);
    private final PromotionService promotionService;

    public PromotionController(PromotionService promotionService) {
        this.promotionService = promotionService;
    }

    @GetMapping
    @ApiOperation(value = "Retourne la liste des promotions.")
    public List<PromotionDTO> findAll(){
        LOG.debug("IN");
        try {
            return this.promotionService.findAllPromotions();
        }catch (NoSuchElementException e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/{promotionId}")
    @ApiOperation(value = "Retourne la promotion sélectionnée par l'ID passé en paramètre.")
    public PromotionDTO findByPromotionID(@PathVariable("promotionId") Long promotionId){
        LOG.debug("IN");
        try{
            return this.promotionService.findPromotionByPromotionID(promotionId);
        }catch (NoSuchElementException e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    @ApiOperation(value = "Création d'un tuteur.")
    public PromotionDTO createPromotion(@RequestBody PromotionDTO newPromotionDTO){
        LOG.debug("IN");
        try{
            return this.promotionService.createPromotion(newPromotionDTO);
        }catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }
}
