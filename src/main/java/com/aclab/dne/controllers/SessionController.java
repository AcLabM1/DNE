package com.aclab.dne.controllers;

import com.aclab.dne.configuration.SwaggerConfig;
import com.aclab.dne.dto.SessionDTO;
import com.aclab.dne.services.SessionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping(path = "/sessions")
@Api(tags = { SwaggerConfig.SESSION })
public class SessionController {

    private static final Logger LOG = LoggerFactory.getLogger(SessionController.class);
    private final SessionService sessionService;

    public SessionController(SessionService sessionService) {
        this.sessionService = sessionService;
    }


    @GetMapping
    @ApiOperation(value = "Retourne la liste des session.")
    public List<SessionDTO> findAll(){
        LOG.debug("IN");
        try {
            return this.sessionService.findAllSessions();
        }catch (NoSuchElementException e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/{sessionId}")
    @ApiOperation(value = "Retourne la session sélectionnée par l'ID passé en paramètre.")
    public SessionDTO findBySessionID(@PathVariable("sessionId") Long sessionId){
        LOG.debug("IN");
        try{
            return this.sessionService.findSessionBySessionID(sessionId);
        }catch (NoSuchElementException e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    @ApiOperation(value = "Création d'une session.")
    public SessionDTO createSession(@RequestBody SessionDTO newSessionDTO){
        LOG.debug("IN");
        try{
            return this.sessionService.createSession(newSessionDTO);
        }catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }


}
