package com.aclab.dne.controllers;

import com.aclab.dne.dto.PresenceSessionDTO;
import com.aclab.dne.services.PresenceSessionService;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping(path = "/presence-session")
public class PresenceSessionController {

    private static final Logger LOG = LoggerFactory.getLogger(PresenceSessionController.class);
    private final PresenceSessionService presenceSessionService;


    public PresenceSessionController(PresenceSessionService presenceSessionService) {
        this.presenceSessionService = presenceSessionService;
    }

    @GetMapping
    @ApiOperation(value = "Retourne la liste de toutes les presenceSession.")
    public List<PresenceSessionDTO> findAll() {
        LOG.debug("IN");
        try {
            return this.presenceSessionService.findAllPresenceSessions();
        }catch (NoSuchElementException e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

    }


    @GetMapping("/etudiant/{etudiantId}")
    @ApiOperation(value = "Retourne la liste des presence d'un etudiant.")
    public List<PresenceSessionDTO> findPresenceSessionsByEtudiantId(@PathVariable("etudiantId") Long etudiantId){
        LOG.debug("IN");
        try {
            return this.presenceSessionService.findPresenceSessionByEtudiantID(etudiantId);
        }catch (NoSuchElementException e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/etudiant/absences/{etudiantId}")
    @ApiOperation(value = "Retourne la liste des absences d'un etudiant.")
    public List<PresenceSessionDTO> findAbsenceSessionsByEtudiantId(@PathVariable("etudiantId") Long etudiantId){
        LOG.debug("IN");
        try {
            return this.presenceSessionService.findAbsenceSessionByEtudiantID(etudiantId);
        }catch (NoSuchElementException e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

}
