package com.aclab.dne.repositories;

import com.aclab.dne.model.Enseignant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface EnseignantRepository extends CrudRepository<Enseignant,Long> {
}
