package com.aclab.dne.controllers;

import com.aclab.dne.converter.AdministratifConverter;
import com.aclab.dne.repositories.AdministratifRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdministratifController {
    @Autowired
    AdministratifRepository administratifRepository;
    @Autowired
    AdministratifConverter administratifConverter;

}
