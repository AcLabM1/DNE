package com.aclab.dne.converter;

import com.aclab.dne.dto.CommunicationDTO;
import com.aclab.dne.model.Communication;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

public class CommunicationConverter {

    public CommunicationDTO entityToDTO(Communication communication){
        ModelMapper mapper = new ModelMapper();
        return mapper.map(communication, CommunicationDTO.class);
    }

    public List<CommunicationDTO> entityToDTO(List<Communication> communications){
        return communications.stream().map(this::entityToDTO).collect(Collectors.toList());
    }

    public Communication dtoToEntity(CommunicationDTO communicationDTO){
        ModelMapper mapper = new ModelMapper();
        return mapper.map(communicationDTO, Communication.class);
    }

    public List<Communication> dtoToEntity(List<CommunicationDTO> communicationDTOs){
        return communicationDTOs.stream().map(this::dtoToEntity).collect(Collectors.toList());
    }
}
