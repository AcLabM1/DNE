package com.aclab.dne.controllers;

import com.aclab.dne.converter.MatiereConverter;
import com.aclab.dne.repositories.MatiereRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MatiereController {
    @Autowired
    MatiereConverter matiereConverter;
    @Autowired
    MatiereRepository matiereRepository;

}
