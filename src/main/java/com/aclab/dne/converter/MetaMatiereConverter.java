package com.aclab.dne.converter;

import com.aclab.dne.dto.MetaMatiereDTO;
import com.aclab.dne.model.MetaMatiere;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class MetaMatiereConverter {

    public MetaMatiereDTO entityToDTO(MetaMatiere metaMatiere) {
        ModelMapper mapper = new ModelMapper();
        return mapper.map(metaMatiere, MetaMatiereDTO.class);
    }

    public List<MetaMatiereDTO> entityToDTO(List<MetaMatiere> metaMatieres) {
        return metaMatieres.stream().map(this::entityToDTO).collect(Collectors.toList());
    }

    public MetaMatiere dtoToEntity(MetaMatiereDTO metaMatiereDTO) {
        ModelMapper mapper = new ModelMapper();
        return mapper.map(metaMatiereDTO, MetaMatiere.class);
    }

    public List<MetaMatiere> dtoToEntity(List<MetaMatiereDTO> metaMatiereDTOs) {
        return metaMatiereDTOs.stream().map(this::dtoToEntity).collect(Collectors.toList());
    }
}
