package com.aclab.dne.controllers;

import com.aclab.dne.converter.TuteurConverter;
import com.aclab.dne.dto.TuteurDTO;
import com.aclab.dne.model.Tuteur;
import com.aclab.dne.repositories.TuteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TuteurController {

    @Autowired
    TuteurConverter tuteurConverter;
    @Autowired
    TuteurRepository tuteurRepository;

    @GetMapping("/tuteur")
    public List<TuteurDTO> findAll(){ return tuteurConverter.entityToDto((List<Tuteur>) tuteurRepository.findAll());}

    @GetMapping("/tuteur/{id}")
    public TuteurDTO findByID(@PathVariable Long id){
        return tuteurConverter.entityToDto(tuteurRepository.findById(id).orElseThrow());
    }

    @PostMapping("/tuteur")
    public void createTuteur(@RequestBody TuteurDTO tuteurDTO){ tuteurRepository.save(tuteurConverter.dtoToEntity(tuteurDTO));}

}
