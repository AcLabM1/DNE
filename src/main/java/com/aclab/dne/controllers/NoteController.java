package com.aclab.dne.controllers;

import com.aclab.dne.configuration.SwaggerConfig;
import com.aclab.dne.dto.NoteDTO;
import com.aclab.dne.services.NoteService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping(path = "/notes")
@Api(tags = { SwaggerConfig.NOTE })
public class NoteController {

    private static final Logger LOG = LoggerFactory.getLogger(NoteController.class);
    private final NoteService noteService;

    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    @GetMapping
    @ApiOperation(value = "Retourne la liste des notes.")
    public List<NoteDTO> findAll(){
        LOG.debug("IN");
        try {
            return this.noteService.findAllNotes();
        }catch (NoSuchElementException e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/{noteId}")
    @ApiOperation(value = "Retourne la note sélectionné par l'ID passé en paramètre.")
    public NoteDTO findByNoteID(@PathVariable("noteId") Long noteId){
        LOG.debug("IN");
        try{
            return this.noteService.findNoteByNoteID(noteId);
        }catch (NoSuchElementException e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/etudiant/{etudiantId}")
    @ApiOperation(value = "Retourne la liste des notes d'un etudiant.")
    public List<NoteDTO> findNotesByEtudiantId(@PathVariable("etudiantId") Long etudiantId){
        LOG.debug("IN");
        try {
            return this.noteService.findNotesByEtudiantId(etudiantId);
        }catch (NoSuchElementException e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    @ApiOperation(value = "Création d'une note.")
    public NoteDTO createNote(@RequestBody NoteDTO newNoteDTO){
        LOG.debug("IN");
        try{
            return this.noteService.createNote(newNoteDTO);
        }catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

}
