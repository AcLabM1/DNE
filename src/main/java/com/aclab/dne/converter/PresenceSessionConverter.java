package com.aclab.dne.converter;

import com.aclab.dne.dto.PresenceSessionDTO;
import com.aclab.dne.model.PresenceSession;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PresenceSessionConverter {

    public PresenceSessionDTO entityToDTO(PresenceSession presenceSession) {
        ModelMapper mapper = new ModelMapper();
        return mapper.map(presenceSession, PresenceSessionDTO.class);
    }

    public List<PresenceSessionDTO> entityToDTO(List<PresenceSession> presenceSessions) {
        return presenceSessions.stream().map(this::entityToDTO).collect(Collectors.toList());
    }

    public PresenceSession dtoToEntity(PresenceSessionDTO presenceSessionDTO) {
        ModelMapper mapper = new ModelMapper();
        return mapper.map(presenceSessionDTO, PresenceSession.class);
    }

    public List<PresenceSession> dtoToEntity(List<PresenceSessionDTO> presenceSessionDTOS) {
        return presenceSessionDTOS.stream().map(this::dtoToEntity).collect(Collectors.toList());
    }
}
