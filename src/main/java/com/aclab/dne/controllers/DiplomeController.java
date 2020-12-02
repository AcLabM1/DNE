package com.aclab.dne.controllers;

import com.aclab.dne.converter.DiplomeConverter;
import com.aclab.dne.repositories.DiplomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiplomeController {

    @Autowired
    DiplomeConverter diplomeConverter;
    @Autowired
    DiplomeRepository diplomeRepository;


}
