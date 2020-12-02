package com.aclab.dne.controllers;

import com.aclab.dne.converter.EnseignantConverter;
import com.aclab.dne.repositories.EnseignantRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/enseignants")
public class EnseignantController {
    private static final Logger log = LoggerFactory.getLogger(EnseignantController.class);
    private final EnseignantConverter enseignantConverter;
    private final EnseignantRepository enseignantRepository;

    @Autowired
    public EnseignantController(EnseignantConverter enseignantConverter, EnseignantRepository enseignantRepository) {
        this.enseignantConverter = enseignantConverter;
        this.enseignantRepository = enseignantRepository;
    }
}
