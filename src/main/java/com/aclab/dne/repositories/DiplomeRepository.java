package com.aclab.dne.repositories;

import com.aclab.dne.model.Diplome;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiplomeRepository extends CrudRepository<Diplome,Integer> {
}
