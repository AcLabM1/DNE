package com.aclab.dne.controllers;

import com.aclab.dne.converter.UeConverter;
import com.aclab.dne.dto.UeDTO;
import com.aclab.dne.model.Ue;
import com.aclab.dne.repositories.UeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UeController {

    @Autowired
    UeConverter ueConverter;
    @Autowired
    UeRepository ueRepository;

    @GetMapping("/ue")
    public List<UeDTO> findAll(){
        return ueConverter.entityToDto((List<Ue>) ueRepository.findAll());
    }

    @GetMapping("/ue/{id}")
    public UeDTO findById(@PathVariable int id){
        return ueConverter.entityToDto(ueRepository.findById(id).orElseThrow());
    }

    @PostMapping("/ue")
    public void createUe(@RequestBody UeDTO ueDTO){
         ueRepository.save(ueConverter.dtoToEntity(ueDTO));
    }
}
