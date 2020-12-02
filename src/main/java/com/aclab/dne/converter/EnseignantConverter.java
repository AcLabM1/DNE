package com.aclab.dne.converter;

import com.aclab.dne.dto.EnseignantDTO;
import com.aclab.dne.model.Enseignant;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class EnseignantConverter {
    private static final Logger log = LoggerFactory.getLogger(EnseignantConverter.class);
    /**
     * Converti un enseignant en enseignantDTO
     *
     * @param enseignant
     * @return
     */
    public EnseignantDTO entityToDTO(Enseignant enseignant) {
        log.debug("IN");
        ModelMapper mapper = new ModelMapper();
        return mapper.map(enseignant, EnseignantDTO.class);
    }

    /**
     * converti une List enseignant en List enseignantDTO
     *
     * @param enseignants
     * @return
     */
    public List<EnseignantDTO> entityToDTO(List<Enseignant> enseignants) {
        log.debug("IN");
        return enseignants.stream().map(this::entityToDTO).collect(Collectors.toList());
    }

    /**
     * Converti EnseignantDO en enseignant
     *
     * @param enseignantDTO
     * @return
     */
    public Enseignant dtoToEntity(EnseignantDTO enseignantDTO) {
        log.debug("IN");
        ModelMapper mapper = new ModelMapper();
        return mapper.map(enseignantDTO, Enseignant.class);
    }

    /**
     * Converti une List EnseignantDTO en List Enseignant
     *
     * @param enseignantDTOS
     * @return
     */
    public List<Enseignant> dtoToEntity(List<EnseignantDTO> enseignantDTOS) {
        log.debug("IN");
        return enseignantDTOS.stream().map(this::dtoToEntity).collect(Collectors.toList());
    }

}
