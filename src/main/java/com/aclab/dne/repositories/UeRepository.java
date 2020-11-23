package com.aclab.dne.repositories;

import com.aclab.dne.model.Ue;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UeRepository extends CrudRepository<Ue,Integer> {
}
