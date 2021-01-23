package com.aclab.dne.controllers;

import com.aclab.dne.repositories.InscriptionRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/inscriptions")
public class InscriptionController {

    private static final Logger LOG = LoggerFactory.getLogger(InscriptionController.class);
    private final InscriptionRepository inscriptionRepository;

    public InscriptionController(InscriptionRepository inscriptionRepository) {
        this.inscriptionRepository = inscriptionRepository;
    }
}
