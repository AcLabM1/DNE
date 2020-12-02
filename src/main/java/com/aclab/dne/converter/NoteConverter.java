package com.aclab.dne.converter;

import com.aclab.dne.dto.NoteDTO;
import com.aclab.dne.model.Note;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class NoteConverter {

    private static final Logger LOG = LoggerFactory.getLogger(NoteConverter.class);

    /**
     * Passage de Note en NoteDto
     *
     * @param note
     * @return
     */
    public NoteDTO entityToDTO(Note note) {
        LOG.debug("IN");
        ModelMapper mapper = new ModelMapper();
        return mapper.map(note, NoteDTO.class);
    }

    /**
     * Passe une List Note en List NoteDTO
     *
     * @param notes List de Note
     * @return
     */
    public List<NoteDTO> entityToDTO(List<Note> notes) {
        LOG.debug("IN");
        return notes.stream().map(this::entityToDTO).collect(Collectors.toList());
    }

    /**
     * Passage NoteDTO en Note
     *
     * @param noteDTO
     * @return
     */
    public Note dtoToEntity(NoteDTO noteDTO) {
        LOG.debug("IN");
        ModelMapper mapper = new ModelMapper();
        return mapper.map(noteDTO, Note.class);
    }

    /**
     * Passage List NoteDTO en List Note
     *
     * @param noteDTOs
     * @return
     */
    public List<Note> dtoToEntity(List<NoteDTO> noteDTOs) {
        LOG.debug("IN");
        return noteDTOs.stream().map(this::dtoToEntity).collect(Collectors.toList());
    }
}
