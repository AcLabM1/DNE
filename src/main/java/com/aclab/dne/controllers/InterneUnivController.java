package com.aclab.dne.controllers;

import com.aclab.dne.configuration.SwaggerConfig;
import com.aclab.dne.converter.InterneUnivConverter;
import com.aclab.dne.repositories.InterneUnivRepository;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/internesUniversite")
public class InterneUnivController {

    private static final Logger LOG = LoggerFactory.getLogger(InterneUnivController.class);
    private final InterneUnivConverter interneUnivConverter;
    private final InterneUnivRepository interneUnivRepository;

    @Autowired
    public InterneUnivController(InterneUnivConverter interneUnivConverter, InterneUnivRepository interneUnivRepository) {
        this.interneUnivConverter = interneUnivConverter;
        this.interneUnivRepository = interneUnivRepository;
    }
}
