package com.aclab.dne.controllers;

import com.aclab.dne.configuration.SwaggerConfig;
import com.aclab.dne.dto.TuteurDTO;
import com.aclab.dne.services.TuteurService;
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
@RequestMapping(path = "/tuteurs")
@Api(tags = { SwaggerConfig.TUTEUR })
public class TuteurController {

    private static final Logger LOG = LoggerFactory.getLogger(TuteurController.class);
    private final TuteurService tuteurService;

    public TuteurController(TuteurService tuteurService) {
        this.tuteurService = tuteurService;
    }

    @GetMapping
    @ApiOperation(value = "Retourne la liste des tuteurs.")
    public List<TuteurDTO> findAll(){
        LOG.debug("IN");
        try {
            return this.tuteurService.findAllTuteurs();
        }catch (NoSuchElementException e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/{tuteurId}")
    @ApiOperation(value = "Retourne le tuteur sélectionné par l'ID passé en paramètre.")
    public TuteurDTO findByTuteurID(@PathVariable("tuteurId") Long tuteurId){
        LOG.debug("IN");
        try{
            return this.tuteurService.findTuteurByTuteurID(tuteurId);
        }catch (NoSuchElementException e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    @ApiOperation(value = "Création d'un tuteur.")
    public TuteurDTO createTuteur(@RequestBody TuteurDTO newTuteurDTO){
        LOG.debug("IN");
        try{
            return this.tuteurService.createTuteur(newTuteurDTO);
        }catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

}
