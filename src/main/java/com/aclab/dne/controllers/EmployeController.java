package com.aclab.dne.controllers;

import com.aclab.dne.converter.EmployeConverter;
import com.aclab.dne.dto.EmployeDTO;
import com.aclab.dne.model.Employe;
import com.aclab.dne.repositories.EmployeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeController {

    @Autowired
    EmployeRepository employeRepository;
    @Autowired
    EmployeConverter employeConverter;





    @GetMapping("/employe")
    public List<EmployeDTO> findAll(){
        EmployeDTO employeDTO = new EmployeDTO("nom", "prenom", "mail", "tel", "bureau");
        employeRepository.save(employeConverter.dtoToEntity(employeDTO));
        return employeConverter.entityToDTO((List<Employe>) employeRepository.findAll());
    }
}
