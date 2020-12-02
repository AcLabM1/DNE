package com.aclab.dne.repositories;

import com.aclab.dne.model.Etudiant;
import org.springframework.data.repository.CrudRepository;

public interface EtudiantRepository extends CrudRepository<Etudiant, Long> {
}
