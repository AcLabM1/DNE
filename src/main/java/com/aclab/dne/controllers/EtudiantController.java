package com.aclab.dne.controllers;

import com.aclab.dne.configuration.SwaggerConfig;
import com.aclab.dne.converter.EtudiantConverter;
import com.aclab.dne.repositories.EtudiantRepository;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/etudiants")
@Api(tags = { SwaggerConfig.ETUDIANT })
public class EtudiantController {
    private static final Logger LOG = LoggerFactory.getLogger(EtudiantController.class);
    private final EtudiantConverter etudiantConverter;
    private final EtudiantRepository etudiantRepository;

    @Autowired
    public EtudiantController(EtudiantConverter etudiantConverter, EtudiantRepository etudiantRepository) {
        this.etudiantConverter = etudiantConverter;
        this.etudiantRepository = etudiantRepository;
    }
}
