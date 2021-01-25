package com.aclab.dne.controllers;

import com.aclab.dne.configuration.SwaggerConfig;
import com.aclab.dne.dto.EtudiantDTO;
import com.aclab.dne.services.EtudiantService;
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
@RequestMapping(path = "/etudiants")
@Api(tags = { SwaggerConfig.ETUDIANT })
public class EtudiantController {
    private static final Logger LOG = LoggerFactory.getLogger(EtudiantController.class);

    private final EtudiantService etudiantService;

    public EtudiantController(EtudiantService etudiantService) {
        this.etudiantService = etudiantService;
    }

    @GetMapping
    @ApiOperation(value = "Retourne la liste de tout les étudiants.")
    public List<EtudiantDTO> findAll() {
        LOG.debug("IN");
        try {
            return this.etudiantService.findAllEtudiants();
        }catch (NoSuchElementException e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/{etudiantId}")
    @ApiOperation(value = "Retourne l\'etudiant sélectionné par l'ID passé en paramètre.")
    public EtudiantDTO findByEtudiantID(@PathVariable("etudiantId") Long etudiantId){
        LOG.debug("IN");
        try{
            return this.etudiantService.findEtudiantByEtudiantID(etudiantId);
        }catch (NoSuchElementException e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    @ApiOperation(value = "Création d'un etudiant.")
    public EtudiantDTO createEtudiant(@RequestBody EtudiantDTO newEtudiantDTO){
        LOG.debug("IN");
        try{
            return this.etudiantService.createEtudiant(newEtudiantDTO);
        }catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }
}
