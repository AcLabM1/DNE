package com.aclab.dne.converter;

import com.aclab.dne.dto.SessionDTO;
import com.aclab.dne.model.Session;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class SessionConverter {

    public SessionDTO entityToDTO(Session session) {
        ModelMapper mapper = new ModelMapper();
        return mapper.map(session, SessionDTO.class);
    }

    public List<SessionDTO> entityToDTO(List<Session> sessionList) {
        return sessionList.stream().map(this::entityToDTO).collect(Collectors.toList());
    }

    public Session dtoToEntity(SessionDTO sessionDTO) {
        ModelMapper mapper = new ModelMapper();
        return mapper.map(sessionDTO, Session.class);
    }

    public List<Session> dtoToEntity(List<SessionDTO> sessionList) {
        return sessionList.stream().map(this::dtoToEntity).collect(Collectors.toList());
    }
}
