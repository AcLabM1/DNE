package com.aclab.dne.controllers;

import com.aclab.dne.converter.NoteConverter;
import com.aclab.dne.repositories.NoteRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoteController {


    private final NoteConverter noteConverter;
    private final NoteRepository noteRepository;

    public NoteController(NoteConverter noteConverter, NoteRepository noteRepository) {
        this.noteConverter = noteConverter;
        this.noteRepository = noteRepository;
    }
}
