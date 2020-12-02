package com.aclab.dne.controllers;

import com.aclab.dne.converter.UeConverter;
import com.aclab.dne.dto.UeDTO;
import com.aclab.dne.model.Ue;
import com.aclab.dne.repositories.UeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/unitesEnseignement")
public class UeController {

    private final UeConverter ueConverter;
    private final UeRepository ueRepository;

    @Autowired
    public UeController(UeConverter ueConverter, UeRepository ueRepository) {
        this.ueConverter = ueConverter;
        this.ueRepository = ueRepository;
    }

    @GetMapping
    public List<UeDTO> findAll(){
        return ueConverter.entityToDto((List<Ue>) ueRepository.findAll());
    }

    @GetMapping("/{id}")
    public UeDTO findById(@PathVariable int id){
        return ueConverter.entityToDto(ueRepository.findById(id).orElseThrow());
    }

    @PostMapping
    public void createUe(@RequestBody UeDTO ueDTO){
         ueRepository.save(ueConverter.dtoToEntity(ueDTO));
    }
}
