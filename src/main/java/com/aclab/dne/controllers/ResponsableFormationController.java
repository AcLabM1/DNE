package com.aclab.dne.controllers;

import com.aclab.dne.configuration.SwaggerConfig;
import com.aclab.dne.dto.ResponsableFormationDTO;
import com.aclab.dne.services.ResponsableFormationService;
import io.swagger.annotations.Api;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping(path = "/responsables")
@Api(tags = { SwaggerConfig.RESPONSABLE })
public class ResponsableFormationController {

    private final ResponsableFormationService responsableFormationService;

    public ResponsableFormationController(ResponsableFormationService responsableFormationService) {
        this.responsableFormationService = responsableFormationService;
    }

    @GetMapping
    public List<ResponsableFormationDTO> findAll(){
        try {
            return this.responsableFormationService.findAllResponsableFormations();
        }catch (NoSuchElementException e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }
}
