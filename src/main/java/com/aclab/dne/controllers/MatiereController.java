package com.aclab.dne.controllers;

import com.aclab.dne.configuration.SwaggerConfig;
import com.aclab.dne.converter.MatiereConverter;
import com.aclab.dne.repositories.MatiereRepository;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/matieres")
@Api(tags = { SwaggerConfig.MATIERE })
public class MatiereController {

    private static final Logger LOG = LoggerFactory.getLogger(MatiereController.class);
    private final MatiereConverter matiereConverter;
    private final MatiereRepository matiereRepository;

    @Autowired
    public MatiereController(MatiereConverter matiereConverter, MatiereRepository matiereRepository) {
        this.matiereConverter = matiereConverter;
        this.matiereRepository = matiereRepository;
    }
}
