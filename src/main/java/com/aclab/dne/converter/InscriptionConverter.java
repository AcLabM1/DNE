package com.aclab.dne.converter;

import com.aclab.dne.dto.InscriptionDTO;
import com.aclab.dne.model.Inscription;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class InscriptionConverter {

    public InscriptionDTO entityToDTO(Inscription inscription){
        ModelMapper mapper = new ModelMapper();
        return mapper.map(inscription, InscriptionDTO.class);
    }

    public List<InscriptionDTO> entityToDTO(List<Inscription> inscriptions){
        return inscriptions.stream().map(this::entityToDTO).collect(Collectors.toList());
    }

    public Inscription dtoToEntity(InscriptionDTO inscriptionDTO){
        ModelMapper mapper = new ModelMapper();
        return mapper.map(inscriptionDTO,Inscription.class);
    }

    public List<Inscription> dtoToEntity(List<InscriptionDTO> inscriptionDTOs){
        return inscriptionDTOs.stream().map(this::dtoToEntity).collect(Collectors.toList());
    }
}
