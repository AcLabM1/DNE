package com.aclab.dne.repositories;

import com.aclab.dne.model.InterneUniv;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterneUnivRepository extends CrudRepository<InterneUniv,Long> {
}
