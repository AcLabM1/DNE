package com.aclab.dne.controllers;

import com.aclab.dne.configuration.SwaggerConfig;
import com.aclab.dne.converter.SessionConverter;
import com.aclab.dne.repositories.SessionRepository;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/sessions")
@Api(tags = { SwaggerConfig.SESSION })
public class SessionController {

    private static final Logger LOG = LoggerFactory.getLogger(SessionController.class);
    private final SessionRepository sessionRepository;
    private final SessionConverter sessionConverter;

    @Autowired
    public SessionController(SessionRepository sessionRepository, SessionConverter sessionConverter) {
        this.sessionRepository = sessionRepository;
        this.sessionConverter = sessionConverter;
    }
}
