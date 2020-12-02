package com.aclab.dne.controllers;

import com.aclab.dne.converter.ResponsableFormationConverter;
import com.aclab.dne.repositories.ResponsableFormationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResponsableFormationController {
    @Autowired
    ResponsableFormationConverter responsableFormationConverter;
    @Autowired
    ResponsableFormationRepository responsableFormationRepository;
}
