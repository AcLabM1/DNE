package com.aclab.dne.controllers;

import com.aclab.dne.repositories.CommunicationRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/communications")
public class CommunicationController {

    private static final Logger LOG = LoggerFactory.getLogger(CommunicationController.class);
    private final CommunicationRepository communicationRepository;

    @Autowired
    public CommunicationController(CommunicationRepository communicationRepository) {
        this.communicationRepository = communicationRepository;
    }
}
