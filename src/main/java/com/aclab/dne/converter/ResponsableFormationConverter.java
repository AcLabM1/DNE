package com.aclab.dne.converter;

import com.aclab.dne.dto.ResponsableFormationDTO;
import com.aclab.dne.model.ResponsableFormation;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ResponsableFormationConverter {

    public ResponsableFormationDTO entityToDTO(ResponsableFormation responsableFormation) {
        ModelMapper mapper = new ModelMapper();
        return mapper.map(responsableFormation, ResponsableFormationDTO.class);
    }

    public List<ResponsableFormationDTO> entityToDTO(List<ResponsableFormation> responsableFormations) {
        return responsableFormations.stream().map(this::entityToDTO).collect(Collectors.toList());
    }

    public ResponsableFormation dtoToEntity(ResponsableFormationDTO responsableFormationDTO) {
        ModelMapper mapper = new ModelMapper();
        return mapper.map(responsableFormationDTO, ResponsableFormation.class);
    }

    public List<ResponsableFormation> dtoToEntity(List<ResponsableFormationDTO> responsableFormationDTOS) {
        return responsableFormationDTOS.stream().map(this::dtoToEntity).collect(Collectors.toList());
    }
}
