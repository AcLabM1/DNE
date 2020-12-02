package com.aclab.dne.repositories;

import com.aclab.dne.model.Personne;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface PersonneRepository extends CrudRepository<Personne,Long> {
}
