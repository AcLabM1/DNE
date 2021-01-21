package com.aclab.dne.repositories;

import com.aclab.dne.model.Personne;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PersonneRepository extends CrudRepository<Personne,Long> {
    Optional<Personne> findPersonneByUsername(String username);
}
