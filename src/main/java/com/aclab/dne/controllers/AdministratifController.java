package com.aclab.dne.controllers;

import com.aclab.dne.converter.AdministratifConverter;
import com.aclab.dne.repositories.AdministratifRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/administratifs")
public class AdministratifController {

    private final AdministratifRepository administratifRepository;
    private final AdministratifConverter administratifConverter;

    @Autowired
    public AdministratifController(AdministratifRepository administratifRepository, AdministratifConverter administratifConverter) {
        this.administratifRepository = administratifRepository;
        this.administratifConverter = administratifConverter;
    }
}
