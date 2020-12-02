package com.aclab.dne.controllers;

import com.aclab.dne.converter.EnseignantConverter;
import com.aclab.dne.repositories.EnseignantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnseignantController {
    @Autowired
    EnseignantConverter enseignantConverter;
    @Autowired
    EnseignantRepository enseignantRepository;
}
