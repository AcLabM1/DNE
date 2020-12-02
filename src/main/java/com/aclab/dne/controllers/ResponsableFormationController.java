package com.aclab.dne.controllers;

import com.aclab.dne.converter.ResponsableFormationConverter;
import com.aclab.dne.repositories.ResponsableFormationRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/responsables")
public class ResponsableFormationController {

    private static final Logger log = LoggerFactory.getLogger(ResponsableFormationController.class);
    private final ResponsableFormationConverter responsableFormationConverter;
    private final ResponsableFormationRepository responsableFormationRepository;

    @Autowired
    public ResponsableFormationController(ResponsableFormationConverter responsableFormationConverter, ResponsableFormationRepository responsableFormationRepository) {
        this.responsableFormationConverter = responsableFormationConverter;
        this.responsableFormationRepository = responsableFormationRepository;
    }
}
