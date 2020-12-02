package com.aclab.dne.converter;

import com.aclab.dne.dto.EtudiantDTO;
import com.aclab.dne.model.Etudiant;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class EtudiantConverter {

    public EtudiantDTO entityToDto(Etudiant etudiant) {
        ModelMapper mapper = new ModelMapper();
        return mapper.map(etudiant, EtudiantDTO.class);
    }

    public List<EtudiantDTO> entityToDto(List<Etudiant> etudiants) {
        return etudiants.stream().map(this::entityToDto).collect(Collectors.toList());
    }

    public Etudiant dtoToEntity(EtudiantDTO etudiantDTO) {
        ModelMapper mapper = new ModelMapper();
        return mapper.map(etudiantDTO, Etudiant.class);
    }

    public List<Etudiant> dtoToEntity(List<EtudiantDTO> etudiantsDTO) {
        return etudiantsDTO.stream().map(this::dtoToEntity).collect(Collectors.toList());
    }
}
