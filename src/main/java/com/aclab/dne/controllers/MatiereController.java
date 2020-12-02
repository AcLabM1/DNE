package com.aclab.dne.controllers;

import com.aclab.dne.converter.MatiereConverter;
import com.aclab.dne.repositories.MatiereRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/matieres")
public class MatiereController {

    private final MatiereConverter matiereConverter;
    private final MatiereRepository matiereRepository;

    @Autowired
    public MatiereController(MatiereConverter matiereConverter, MatiereRepository matiereRepository) {
        this.matiereConverter = matiereConverter;
        this.matiereRepository = matiereRepository;
    }
}
