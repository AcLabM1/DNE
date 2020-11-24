package com.aclab.dne.converter;

import com.aclab.dne.dto.InterneUnivDTO;
import com.aclab.dne.dto.MatiereDTO;
import com.aclab.dne.dto.PersonneDTO;
import com.aclab.dne.model.InterneUniv;
import com.aclab.dne.model.Matiere;
import com.aclab.dne.model.Personne;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class InterneUnivConverter {

    public InterneUnivDTO entityToDTO(InterneUniv interneUniv){
        ModelMapper mapper = new ModelMapper();
        return mapper.map(interneUniv,InterneUnivDTO.class);
    }

    public List<InterneUnivDTO> entityToDTO(List<InterneUniv> interneUnivList){
        return interneUnivList.stream().map(this::entityToDTO).collect(Collectors.toList());
    }

    public InterneUniv dtoToEntity(InterneUnivDTO interneUnivDTO){
        ModelMapper mapper = new ModelMapper();
        return mapper.map(interneUnivDTO,InterneUniv.class);
    }

    public List<InterneUniv> dtoToEntity(List<InterneUnivDTO> interneUnivList){
        return interneUnivList.stream().map(this::dtoToEntity).collect(Collectors.toList());
    }
}
