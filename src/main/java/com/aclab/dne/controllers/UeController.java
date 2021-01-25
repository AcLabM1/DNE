package com.aclab.dne.controllers;

import com.aclab.dne.configuration.SwaggerConfig;
import com.aclab.dne.dto.UeDTO;
import com.aclab.dne.services.UeService;
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
@RequestMapping(path = "/unitesEnseignement")
@Api(tags = { SwaggerConfig.UE })
public class UeController {

    private static final Logger LOG = LoggerFactory.getLogger(UeController.class);
    private final UeService ueService;

    public UeController(UeService ueService) {
        this.ueService = ueService;
    }


    @GetMapping
    @ApiOperation(value = "Retourne la liste des Ues.")
    public List<UeDTO> findAll(){
        LOG.debug("IN");
        try {
            return this.ueService.findAllUes();
        }catch (NoSuchElementException e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/{ueId}")
    @ApiOperation(value = "Retourne l'ue sélectionnée par l'ID passé en paramètre.")
    public UeDTO findByUeID(@PathVariable("ueId") int ueId){
        LOG.debug("IN");
        try{
            return this.ueService.findUeByUeID(ueId);
        }catch (NoSuchElementException e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    @ApiOperation(value = "Création d'une Ue.")
    public UeDTO createUe(@RequestBody UeDTO newUeDTO){
        LOG.debug("IN");
        try{
            return this.ueService.createUe(newUeDTO);
        }catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

}
