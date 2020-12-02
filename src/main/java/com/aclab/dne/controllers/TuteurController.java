package com.aclab.dne.controllers;

import com.aclab.dne.converter.TuteurConverter;
import com.aclab.dne.dto.TuteurDTO;
import com.aclab.dne.model.Tuteur;
import com.aclab.dne.repositories.TuteurRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/tuteurs")
public class TuteurController {

    private static final Logger LOG = LoggerFactory.getLogger(TuteurController.class);
    private final TuteurConverter tuteurConverter;
    private final TuteurRepository tuteurRepository;

    @Autowired
    public TuteurController(TuteurConverter tuteurConverter, TuteurRepository tuteurRepository) {
        this.tuteurConverter = tuteurConverter;
        this.tuteurRepository = tuteurRepository;
    }

    @GetMapping
    public List<TuteurDTO> findAll(){
        LOG.debug("IN");
        return tuteurConverter.entityToDto((List<Tuteur>) tuteurRepository.findAll());
    }

    @GetMapping("/{id}")
    public TuteurDTO findByID(@PathVariable Long id){
        LOG.debug("IN");
        return tuteurConverter.entityToDto(tuteurRepository.findById(id).orElseThrow());
    }

    @PostMapping
    public void createTuteur(@RequestBody TuteurDTO tuteurDTO){
        LOG.debug("IN");
        tuteurRepository.save(tuteurConverter.dtoToEntity(tuteurDTO));
    }

}
