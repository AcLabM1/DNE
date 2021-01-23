package com.aclab.dne.controllers;

import com.aclab.dne.converter.PresenceSessionConverter;
import com.aclab.dne.repositories.PresenceSessionRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/presence-session")
public class PresenceSessionController {

    private static final Logger LOG = LoggerFactory.getLogger(PresenceSessionController.class);
    private final PresenceSessionRepository presenceSessionRepository;
    private final PresenceSessionConverter presenceSessionConverter;

    @Autowired
    public PresenceSessionController(PresenceSessionRepository presenceSessionRepository, PresenceSessionConverter presenceSessionConverter) {
        this.presenceSessionRepository = presenceSessionRepository;
        this.presenceSessionConverter = presenceSessionConverter;
    }
}
