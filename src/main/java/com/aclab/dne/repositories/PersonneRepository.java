package com.aclab.dne.repositories;

import com.aclab.dne.model.Personne;
import org.springframework.data.repository.CrudRepository;

public interface PersonneRepository extends CrudRepository<Personne,Integer> {
}
