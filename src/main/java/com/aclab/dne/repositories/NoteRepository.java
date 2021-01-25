package com.aclab.dne.repositories;

import com.aclab.dne.model.Inscription;
import com.aclab.dne.model.Note;
import org.springframework.data.repository.CrudRepository;

public interface NoteRepository extends CrudRepository<Note,Long> {

    Iterable<Note> findNotesByInscription(Inscription inscription);
}
