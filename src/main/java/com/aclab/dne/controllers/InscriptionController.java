package com.aclab.dne.controllers;

import com.aclab.dne.configuration.SwaggerConfig;
import com.aclab.dne.dto.InscriptionDTO;
import com.aclab.dne.services.InscriptionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping(path = "/inscriptions")
@Api(tags = { SwaggerConfig.INSCRIPTION })
public class InscriptionController {

    private static final Logger LOG = LoggerFactory.getLogger(InscriptionController.class);
    private final InscriptionService inscriptionService;

    public InscriptionController(InscriptionService inscriptionService) {
        this.inscriptionService = inscriptionService;
    }


    @GetMapping
    @ApiOperation(value = "Retourne la liste de toutes les inscriptions.")
    public List<InscriptionDTO> findAll() {
        LOG.debug("IN");
        try {
            return this.inscriptionService.findAllInstription();
        }catch (NoSuchElementException e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

    }

    @GetMapping("/etudiant/{etudiantId}")
    @ApiOperation(value = "Retourne l\'inscription sélectionnée par l'ID etudiant passé en paramètre.")
    public InscriptionDTO findByEtudiantID(@PathVariable("etudiantId") Long etudiantId){
        LOG.debug("IN");
        try{
            return this.inscriptionService.findInscriptionByEtudiantID(etudiantId);
        }catch (NoSuchElementException e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }


}
