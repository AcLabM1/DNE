package com.aclab.dne.converter;

import com.aclab.dne.dto.InterneUnivDTO;
import com.aclab.dne.model.InterneUniv;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class InterneUnivConverter {
    private static final Logger LOG = LoggerFactory.getLogger(InterneUnivConverter.class);

    public InterneUnivDTO entityToDTO(InterneUniv interneUniv) {
        LOG.debug("IN");
        ModelMapper mapper = new ModelMapper();
        return mapper.map(interneUniv, InterneUnivDTO.class);
    }

    public List<InterneUnivDTO> entityToDTO(List<InterneUniv> interneUnivList) {
        LOG.debug("IN");
        return interneUnivList.stream().map(this::entityToDTO).collect(Collectors.toList());
    }

    public InterneUniv dtoToEntity(InterneUnivDTO interneUnivDTO) {
        LOG.debug("IN");
        ModelMapper mapper = new ModelMapper();
        return mapper.map(interneUnivDTO, InterneUniv.class);
    }

    public List<InterneUniv> dtoToEntity(List<InterneUnivDTO> interneUnivList) {
        LOG.debug("IN");
        return interneUnivList.stream().map(this::dtoToEntity).collect(Collectors.toList());
    }
}
