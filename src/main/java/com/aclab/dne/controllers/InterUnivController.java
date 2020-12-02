package com.aclab.dne.controllers;

import com.aclab.dne.converter.InterneUnivConverter;
import com.aclab.dne.repositories.InterneUnivRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/internesUniversite")
public class InterUnivController {

    private static final Logger log = LoggerFactory.getLogger(InterUnivController.class);
    private final InterneUnivConverter interneUnivConverter;
    private final InterneUnivRepository interneUnivRepository;

    @Autowired
    public InterUnivController(InterneUnivConverter interneUnivConverter, InterneUnivRepository interneUnivRepository) {
        this.interneUnivConverter = interneUnivConverter;
        this.interneUnivRepository = interneUnivRepository;
    }
}
