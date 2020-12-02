package com.aclab.dne.converter;

import com.aclab.dne.dto.TuteurDTO;
import com.aclab.dne.dto.UeDTO;
import com.aclab.dne.model.Personne;
import com.aclab.dne.model.Tuteur;
import com.aclab.dne.model.Ue;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class TuteurConverter {

    /**
     * Passage de Tuteur en TuteurDTO
     *
     * @param tuteur
     * @return
     */
    public TuteurDTO entityToDto(Tuteur tuteur) {
        ModelMapper mapper = new ModelMapper();
        return mapper.map(tuteur, TuteurDTO.class);
    }

    /**
     * Passe une List Tuteur en une List de TuteurDTO
     *
     * @param tuteurs List TuteurDTO
     * @return
     */
    public List<TuteurDTO> entityToDto(List<Tuteur> tuteurs) {
        return tuteurs.stream().map(this::entityToDto).collect(Collectors.toList());
    }

    /**
     * Passage TuteurDTO en Tuteur
     *
     * @param tuteurDTO
     * @return
     */
    public Tuteur dtoToEntity(TuteurDTO tuteurDTO) {
        ModelMapper mapper = new ModelMapper();
        return mapper.map(tuteurDTO, Tuteur.class);
    }

    /**
     * Passage List TuteurDTO en List Tuteur
     *
     * @param tuteurDTOS List Ue
     * @return
     */
    public List<Tuteur> dtoToEntity(List<TuteurDTO> tuteurDTOS) {
        return tuteurDTOS.stream().map(this::dtoToEntity).collect(Collectors.toList());
    }

}
