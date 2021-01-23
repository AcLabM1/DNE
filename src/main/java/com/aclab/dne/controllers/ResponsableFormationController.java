package com.aclab.dne.controllers;

import com.aclab.dne.configuration.SwaggerConfig;
import com.aclab.dne.converter.ResponsableFormationConverter;
import com.aclab.dne.dto.ResponsableFormationDTO;
import com.aclab.dne.model.ResponsableFormation;
import com.aclab.dne.repositories.ResponsableFormationRepository;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/responsables")
@Api(tags = { SwaggerConfig.RESPONSABLE })
public class ResponsableFormationController {

    private static final Logger LOG = LoggerFactory.getLogger(ResponsableFormationController.class);
    private final ResponsableFormationConverter responsableFormationConverter;
    private final ResponsableFormationRepository responsableFormationRepository;

    @Autowired
    public ResponsableFormationController(ResponsableFormationConverter responsableFormationConverter, ResponsableFormationRepository responsableFormationRepository) {
        this.responsableFormationConverter = responsableFormationConverter;
        this.responsableFormationRepository = responsableFormationRepository;
    }

    @GetMapping
    public List<ResponsableFormationDTO> findAll(){
        return this.responsableFormationConverter.entityToDTO((List<ResponsableFormation>) this.responsableFormationRepository.findAll());
    }
}
