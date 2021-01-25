package com.aclab.dne.services;

import com.aclab.dne.converter.PresenceSessionConverter;
import com.aclab.dne.dto.InscriptionDTO;
import com.aclab.dne.dto.MetaMatiereDTO;
import com.aclab.dne.dto.PresenceSessionDTO;
import com.aclab.dne.model.Inscription;
import com.aclab.dne.model.MetaMatiere;
import com.aclab.dne.model.PresenceSession;
import com.aclab.dne.repositories.EtudiantRepository;
import com.aclab.dne.repositories.PresenceSessionRepository;
import lombok.AllArgsConstructor;
import org.apache.commons.collections4.IterableUtils;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.*;

@Transactional
@AllArgsConstructor
@Service
public class PresenceSessionService {

    private final PresenceSessionRepository presenceSessionRepository;
    private final PresenceSessionConverter presenceSessionConverter;
    private final EtudiantRepository etudiantRepository;

    public List<PresenceSessionDTO> findAllPresenceSessions(){
        Iterable<PresenceSession> presenceSessions = this.presenceSessionRepository.findAll();
        if(IterableUtils.size(presenceSessions) > 0 ){
            return this.presenceSessionConverter.entityToDTO(IterableUtils.toList(presenceSessions));
        }else{
            throw new NoSuchElementException("pas de notes");
        }
    }

    public List<PresenceSessionDTO> findPresenceSessionByEtudiantID(Long etudiantId){
        Iterable<PresenceSession> presenceSessions = this.presenceSessionRepository.findByIdEtudiant(etudiantId);
        if(IterableUtils.size(presenceSessions) > 0){
            return this.presenceSessionConverter.entityToDTO(IterableUtils.toList(presenceSessions));
        }else {
            throw new NoSuchElementException("Pas de presence");
        }
    }

    public List<PresenceSessionDTO> findAbsenceSessionByEtudiantID(Long etudiantId){
        Iterable<PresenceSession> presenceSessions = this.presenceSessionRepository.findByIdEtudiant(etudiantId);
        if(IterableUtils.size(presenceSessions) > 0){
            List<PresenceSession> absenceSessions = new ArrayList<PresenceSession>();
            for (PresenceSession session : presenceSessions) {
                if (session.isPresent() == false){
                    absenceSessions.add(session);
                }
            }
            return this.presenceSessionConverter.entityToDTO(absenceSessions);
        }else {
            throw new NoSuchElementException("Pas de presence");
        }
    }

    public PresenceSessionDTO createresenceSession(PresenceSessionDTO newPresenceSessionDTO){
        return presenceSessionConverter.entityToDTO((presenceSessionRepository.save(this.presenceSessionConverter.dtoToEntity(newPresenceSessionDTO))));
    }
}
