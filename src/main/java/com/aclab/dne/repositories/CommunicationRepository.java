package com.aclab.dne.repositories;

import com.aclab.dne.model.Communication;
import com.aclab.dne.model.CommunicationId;
import org.springframework.data.repository.CrudRepository;

public interface CommunicationRepository extends CrudRepository<Communication, CommunicationId> {
}
