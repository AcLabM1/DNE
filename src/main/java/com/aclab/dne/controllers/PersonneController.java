package com.aclab.dne.controllers;

import com.aclab.dne.converter.PersonneConverter;
import com.aclab.dne.repositories.PersonneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonneController {

    @Autowired
    PersonneConverter personneConverter;
    @Autowired
    PersonneRepository personneRepository;
}
