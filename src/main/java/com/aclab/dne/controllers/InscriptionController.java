package com.aclab.dne.controllers;

import com.aclab.dne.converter.InscriptionConverter;
import com.aclab.dne.dto.InscriptionDTO;
import com.aclab.dne.model.Inscription;
import com.aclab.dne.repositories.InscriptionRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/inscriptions")
public class InscriptionController {

    private static final Logger LOG = LoggerFactory.getLogger(InscriptionController.class);
    private final InscriptionRepository inscriptionRepository;
    private final InscriptionConverter inscriptionConverter;

    public InscriptionController(InscriptionRepository inscriptionRepository, InscriptionConverter inscriptionConverter) {
        this.inscriptionRepository = inscriptionRepository;
        this.inscriptionConverter = inscriptionConverter;
    }

    @GetMapping
    public List<InscriptionDTO> findAll(){
        return this.inscriptionConverter.entityToDTO((List<Inscription>) this.inscriptionRepository.findAll());
    }


}
