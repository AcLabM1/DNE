package com.aclab.dne.repositories;

import com.aclab.dne.dto.NoteDTO;
import com.aclab.dne.model.Inscription;
import com.aclab.dne.model.InscriptionId;
import com.aclab.dne.model.Note;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface NoteRepository extends CrudRepository<Note,Long> {

    Iterable<Note> findNotesByInscription(Inscription inscription);
}
