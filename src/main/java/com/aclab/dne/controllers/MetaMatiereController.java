package com.aclab.dne.controllers;

import com.aclab.dne.configuration.SwaggerConfig;
import com.aclab.dne.dto.InscriptionDTO;
import com.aclab.dne.dto.MetaMatiereDTO;
import com.aclab.dne.services.MetaMatiereService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping(path = "/meta-matieres")
@Api(tags = { SwaggerConfig.METAMATIERE })
public class MetaMatiereController {

    private static final Logger LOG = LoggerFactory.getLogger(MetaMatiereController.class);
    private final MetaMatiereService metaMatiereService;


    public MetaMatiereController(MetaMatiereService metaMatiereService) {
        this.metaMatiereService = metaMatiereService;
    }

    @GetMapping
    @ApiOperation(value = "Retourne toutes les méta-matières.")
    public List<MetaMatiereDTO> findAll() {
        LOG.debug("IN");
        try {
            return this.metaMatiereService.findAllMetaMatieres();
        }catch (NoSuchElementException e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }
}
