package com.aclab.dne.repositories;

import com.aclab.dne.model.Inscription;
import com.aclab.dne.model.InscriptionId;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface InscriptionRepository extends CrudRepository<Inscription, InscriptionId> {


    Optional<Inscription> findByIdEtudiant(Long etudiantId);

}
