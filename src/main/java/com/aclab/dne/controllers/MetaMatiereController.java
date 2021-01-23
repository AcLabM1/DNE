package com.aclab.dne.controllers;

import com.aclab.dne.converter.MetaMatiereConverter;
import com.aclab.dne.repositories.MetaMatiereRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/meta-matieres")
public class MetaMatiereController {

    private static final Logger LOG = LoggerFactory.getLogger(MetaMatiereController.class);
    private final MetaMatiereRepository metaMatiereRepository;
    private final MetaMatiereConverter metaMatiereConverter;

    @Autowired
    public MetaMatiereController(MetaMatiereRepository metaMatiereRepository, MetaMatiereConverter metaMatiereConverter) {
        this.metaMatiereRepository = metaMatiereRepository;
        this.metaMatiereConverter = metaMatiereConverter;
    }
}
