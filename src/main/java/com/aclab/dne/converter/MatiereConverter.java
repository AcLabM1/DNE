package com.aclab.dne.converter;

import com.aclab.dne.dto.MatiereDTO;
import com.aclab.dne.model.Matiere;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class MatiereConverter {
    private static final Logger LOG = LoggerFactory.getLogger(MatiereConverter.class);

    /**
     * Passe entity matiere a matiereDTO
     *
     * @param matiere
     * @return matiereDTO
     */
    public MatiereDTO entityToDTO(Matiere matiere) {
        LOG.debug("IN");
        ModelMapper mapper = new ModelMapper();
        return mapper.map(matiere, MatiereDTO.class);
    }

    /**
     * Passage d'une List de matiere a une liste de matiereDTO
     *
     * @param matieres
     * @return List matiereDTO
     */
    public List<MatiereDTO> entityToDTO(List<Matiere> matieres) {
        LOG.debug("IN");
        return matieres.stream().map(this::entityToDTO).collect(Collectors.toList());
    }

    /**
     * Passage MatiereDTO en matiere
     *
     * @param matiereDTO
     * @return matiere
     */
    public Matiere dtoToEntity(MatiereDTO matiereDTO) {
        LOG.debug("IN");
        ModelMapper mapper = new ModelMapper();
        return mapper.map(matiereDTO, Matiere.class);
    }

    /**
     * Passage List MatiereDTO en List Matiere
     *
     * @param matiereDTOS
     * @return List matiere
     */
    public List<Matiere> dtoToEntity(List<MatiereDTO> matiereDTOS) {
        LOG.debug("IN");
        return matiereDTOS.stream().map(this::dtoToEntity).collect(Collectors.toList());
    }

}
