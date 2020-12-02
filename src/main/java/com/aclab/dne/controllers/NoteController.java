package com.aclab.dne.controllers;

import com.aclab.dne.converter.NoteConverter;
import com.aclab.dne.dto.NoteDTO;
import com.aclab.dne.model.Note;
import com.aclab.dne.repositories.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/notes")
public class NoteController {

    private final NoteConverter noteConverter;
    private final NoteRepository noteRepository;

    @Autowired
    public NoteController(NoteConverter noteConverter, NoteRepository noteRepository) {
        this.noteConverter = noteConverter;
        this.noteRepository = noteRepository;
    }

    @GetMapping
    public List<NoteDTO> findAll(){ return noteConverter.entityToDTO((List<Note>) noteRepository.findAll());}
}
