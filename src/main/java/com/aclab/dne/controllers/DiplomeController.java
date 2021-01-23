package com.aclab.dne.controllers;

import com.aclab.dne.configuration.SwaggerConfig;
import com.aclab.dne.dto.DiplomeDTO;
import com.aclab.dne.dto.PromotionDTO;
import com.aclab.dne.dto.TuteurDTO;
import com.aclab.dne.services.DiplomeService;
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
@RequestMapping(path = "/diplomes")
@Api(tags = { SwaggerConfig.DIPLOME })
public class DiplomeController {

    private static final Logger LOG = LoggerFactory.getLogger(DiplomeController.class);
    private final DiplomeService diplomeService;


    public DiplomeController(DiplomeService diplomeService) {
        this.diplomeService = diplomeService;
    }

    @GetMapping
    @ApiOperation(value = "Retourne la liste des diplomes.")
    public List<DiplomeDTO> findAll(){
        LOG.debug("IN");
        try {
                return this.diplomeService.findAllDiplomes();
        }catch (NoSuchElementException e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/{diplomeId}")
    @ApiOperation(value = "Retourne le diplome sélectionné par l'ID passé en paramètre.")
    public DiplomeDTO findByDiplomeID(@PathVariable("diplomeId") int diplomeId){
        LOG.debug("IN");
        try{
            return this.diplomeService.findDiplomeByDiplomeID(diplomeId);
        }catch (NoSuchElementException e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    @ApiOperation(value = "Création d'un diplome.")
    public DiplomeDTO createDiplome(@RequestBody DiplomeDTO newDiplomeDTO){
        LOG.debug("IN");
        try{
            return this.diplomeService.createDiplome(newDiplomeDTO);
        }catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }
}
