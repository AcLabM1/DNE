package com.aclab.dne.services;

import com.aclab.dne.converter.NoteConverter;
import com.aclab.dne.converter.TuteurConverter;
import com.aclab.dne.dto.NoteDTO;
import com.aclab.dne.exception.CustomException;
import com.aclab.dne.model.Inscription;
import com.aclab.dne.model.Note;
import com.aclab.dne.repositories.InscriptionRepository;
import com.aclab.dne.repositories.NoteRepository;
import lombok.AllArgsConstructor;
import org.apache.commons.collections4.IterableUtils;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Transactional
@AllArgsConstructor
@Service
public class NoteService {

    private final NoteRepository noteRepository;
    private final NoteConverter noteConverter;
    private final InscriptionRepository inscriptionRepository;

    public List<NoteDTO> findAllNotes(){
        Iterable<Note> notes = this.noteRepository.findAll();
        if(IterableUtils.size(notes) > 0 ){
            return this.noteConverter.entityToDTO(IterableUtils.toList(notes));
        }else{
            throw new NoSuchElementException("pas de notes");
        }
    }

    public NoteDTO findNoteByNoteID(Long noteId){
        Optional<Note> note = this.noteRepository.findById(noteId);
        if(note.isPresent()){
            return this.noteConverter.entityToDTO(note.get());
        }else {
            throw new NoSuchElementException("Pas de note");
        }
    }

    public List<NoteDTO> findNotesByEtudiantId(Long etudiantId){
        Optional<Inscription> ins = inscriptionRepository.findByIdEtudiant(etudiantId);
        if(ins.isPresent()){
            Iterable<Note> notes = this.noteRepository.findNotesByInscription(ins.get());
            if(IterableUtils.size(notes) > 0 ){
                return this.noteConverter.entityToDTO(IterableUtils.toList(notes));
            }else{
                throw new NoSuchElementException("pas de notes");
            }
        }else{
            throw new CustomException("Etudiant non reconnu", HttpStatus.BAD_REQUEST);
        }


    }

    public NoteDTO createNote(NoteDTO newNoteDTO){
        return noteConverter.entityToDTO((noteRepository.save(this.noteConverter.dtoToEntity(newNoteDTO))));
    }

}
