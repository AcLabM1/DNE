package com.aclab.dne.services;

import com.aclab.dne.converter.SessionConverter;
import com.aclab.dne.dto.SessionDTO;
import com.aclab.dne.model.Session;
import com.aclab.dne.repositories.SessionRepository;
import lombok.AllArgsConstructor;
import org.apache.commons.collections4.IterableUtils;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Transactional
@AllArgsConstructor
@Service
public class SessionService {

    private final SessionRepository sessionRepository;
    private final SessionConverter sessionConverter;

    public List<SessionDTO> findAllSessions(){
        Iterable<Session> sessions = this.sessionRepository.findAll();
        if(IterableUtils.size(sessions) > 0 ){
            return this.sessionConverter.entityToDTO(IterableUtils.toList(sessions));
        }else{
            throw new NoSuchElementException("pas de session");
        }
    }

    public SessionDTO findSessionBySessionID(Long sessionId){
        Optional<Session> session = this.sessionRepository.findById(sessionId);
        if(session.isPresent()){
            return this.sessionConverter.entityToDTO(session.get());
        }else {
            throw new NoSuchElementException("Pas de session");
        }
    }

    public SessionDTO createSession(SessionDTO newSessionDTO){
        return sessionConverter.entityToDTO((sessionRepository.save(this.sessionConverter.dtoToEntity(newSessionDTO))));
    }
}
