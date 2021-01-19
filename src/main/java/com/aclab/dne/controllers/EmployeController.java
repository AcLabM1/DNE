package com.aclab.dne.controllers;

import com.aclab.dne.converter.EmployeConverter;
import com.aclab.dne.dto.EmployeDTO;
import com.aclab.dne.model.Employe;
import com.aclab.dne.repositories.EmployeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/employes")
public class EmployeController {

    private static final Logger LOG = LoggerFactory.getLogger(EmployeController.class);
    private final EmployeRepository employeRepository;
    private final EmployeConverter employeConverter;

    @Autowired
    public EmployeController(EmployeRepository employeRepository, EmployeConverter employeConverter) {
        this.employeRepository = employeRepository;
        this.employeConverter = employeConverter;
    }

    @GetMapping
    public List<EmployeDTO> findAll(){
        LOG.debug("IN");
        return employeConverter.entityToDTO((List<Employe>) employeRepository.findAll());
    }
}
