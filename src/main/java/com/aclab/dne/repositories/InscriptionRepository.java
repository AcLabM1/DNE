package com.aclab.dne.repositories;

import com.aclab.dne.model.Inscription;
import com.aclab.dne.model.InscriptionId;
import org.springframework.data.repository.CrudRepository;

public interface InscriptionRepository extends CrudRepository<Inscription, InscriptionId> {
}
