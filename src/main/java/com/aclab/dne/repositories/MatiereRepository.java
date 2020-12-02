package com.aclab.dne.repositories;

import com.aclab.dne.model.Matiere;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface MatiereRepository extends CrudRepository<Matiere,Integer> {
}
