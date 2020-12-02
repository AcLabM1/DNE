package com.aclab.dne.converter;

import com.aclab.dne.dto.NoteDTO;
import com.aclab.dne.model.Note;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class NoteConverter {

    /**
     * Passage de Note en NoteDto
     *
     * @param Note
     * @return
     */
    public NoteDTO entityToDTO(Note Note) {
        ModelMapper mapper = new ModelMapper();
        return mapper.map(Note, NoteDTO.class);
    }

    /**
     * Passe une List Note en List NoteDTO
     *
     * @param Notes List de Note
     * @return
     */
    public List<NoteDTO> entityToDTO(List<Note> Notes) {
        return Notes.stream().map(this::entityToDTO).collect(Collectors.toList());
    }

    /**
     * Passage NoteDTO en Note
     *
     * @param NoteDTO
     * @return
     */
    public Note dtoToEntity(NoteDTO NoteDTO) {
        ModelMapper mapper = new ModelMapper();
        return mapper.map(NoteDTO, Note.class);
    }

    /**
     * Passage List NoteDTO en List Note
     *
     * @param NoteDTOs
     * @return
     */
    public List<Note> dtoToEntity(List<NoteDTO> NoteDTOs) {
        return NoteDTOs.stream().map(this::dtoToEntity).collect(Collectors.toList());
    }
}
