package com.aclab.dne.controllers;

import com.aclab.dne.configuration.SwaggerConfig;
import com.aclab.dne.converter.AdministratifConverter;
import com.aclab.dne.repositories.AdministratifRepository;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/administratifs")
@Api(tags = { SwaggerConfig.ADMINISTRATIF })
public class AdministratifController {

    private static final Logger LOG = LoggerFactory.getLogger(AdministratifController.class);
    private final AdministratifRepository administratifRepository;
    private final AdministratifConverter administratifConverter;

    @Autowired
    public AdministratifController(AdministratifRepository administratifRepository, AdministratifConverter administratifConverter) {
        this.administratifRepository = administratifRepository;
        this.administratifConverter = administratifConverter;
    }
}
