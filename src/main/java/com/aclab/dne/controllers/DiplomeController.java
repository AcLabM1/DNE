package com.aclab.dne.controllers;

import com.aclab.dne.converter.DiplomeConverter;
import com.aclab.dne.repositories.DiplomeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/diplomes")
public class DiplomeController {

    private static final Logger LOG = LoggerFactory.getLogger(DiplomeController.class);
    private final DiplomeConverter diplomeConverter;
    private final DiplomeRepository diplomeRepository;

    @Autowired
    public DiplomeController(DiplomeConverter diplomeConverter, DiplomeRepository diplomeRepository) {
        this.diplomeConverter = diplomeConverter;
        this.diplomeRepository = diplomeRepository;
    }
}
