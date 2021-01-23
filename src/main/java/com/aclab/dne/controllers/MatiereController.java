package com.aclab.dne.controllers;

import com.aclab.dne.configuration.SwaggerConfig;
import com.aclab.dne.dto.MatiereDTO;
import com.aclab.dne.services.MatiereService;
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
@RequestMapping(path = "/matieres")
@Api(tags = { SwaggerConfig.MATIERE })
public class MatiereController {

    private static final Logger LOG = LoggerFactory.getLogger(MatiereController.class);
    private final MatiereService matiereService;

    public MatiereController(MatiereService matiereService) {
        this.matiereService = matiereService;
    }


    @GetMapping
    @ApiOperation(value = "Retourne la liste de matieres.")
    public List<MatiereDTO> findAll(){
        LOG.debug("IN");
        try {
            return this.matiereService.findAllMatiere();
        }catch (NoSuchElementException e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/{matiereId}")
    @ApiOperation(value = "Retourne la matière sélectionnée par l'ID passé en paramètre.")
    public MatiereDTO findByTuteurID(@PathVariable("matiereId") int matiereId){
        LOG.debug("IN");
        try{
            return this.matiereService.findMatiereByMAtiereID(matiereId);
        }catch (NoSuchElementException e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    @ApiOperation(value = "Création d'une matière.")
    public MatiereDTO createMatiere(@RequestBody MatiereDTO newMatiereDTO){
        LOG.debug("IN");
        try{
            return this.matiereService.createMatiere(newMatiereDTO);
        }catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

}
