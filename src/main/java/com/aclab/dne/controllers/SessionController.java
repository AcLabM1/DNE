package com.aclab.dne.controllers;

import com.aclab.dne.converter.SessionConverter;
import com.aclab.dne.repositories.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/sessions")
public class SessionController {

    private final SessionRepository sessionRepository;
    private final SessionConverter sessionConverter;

    @Autowired
    public SessionController(SessionRepository sessionRepository, SessionConverter sessionConverter) {
        this.sessionRepository = sessionRepository;
        this.sessionConverter = sessionConverter;
    }
}
