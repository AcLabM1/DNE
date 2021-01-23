package com.aclab.dne.controllers;

import com.aclab.dne.configuration.SwaggerConfig;
import com.aclab.dne.dto.DiplomeDTO;
import com.aclab.dne.dto.PromotionDTO;
import com.aclab.dne.services.DiplomeService;
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
}
