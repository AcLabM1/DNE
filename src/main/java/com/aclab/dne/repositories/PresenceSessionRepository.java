package com.aclab.dne.repositories;

import com.aclab.dne.model.PresenceSession;
import com.aclab.dne.model.PresenceSessionId;
import org.springframework.data.repository.CrudRepository;

public interface PresenceSessionRepository extends CrudRepository<PresenceSession, PresenceSessionId> {
    Iterable<PresenceSession> findByIdEtudiant(Long idEtudiant);
}
