package com.aclab.dne.converter;

import com.aclab.dne.dto.EtudiantDTO;
import com.aclab.dne.model.Etudiant;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class EtudiantConverter {
    private static final Logger log = LoggerFactory.getLogger(EtudiantConverter.class);
    public EtudiantDTO entityToDto(Etudiant etudiant) {
        log.debug("IN");
        ModelMapper mapper = new ModelMapper();
        return mapper.map(etudiant, EtudiantDTO.class);
    }

    public List<EtudiantDTO> entityToDto(List<Etudiant> etudiants) {
        log.debug("IN");
        return etudiants.stream().map(this::entityToDto).collect(Collectors.toList());
    }

    public Etudiant dtoToEntity(EtudiantDTO etudiantDTO) {
        log.debug("IN");
        ModelMapper mapper = new ModelMapper();
        return mapper.map(etudiantDTO, Etudiant.class);
    }

    public List<Etudiant> dtoToEntity(List<EtudiantDTO> etudiantsDTO) {
        log.debug("IN");
        return etudiantsDTO.stream().map(this::dtoToEntity).collect(Collectors.toList());
    }
}
