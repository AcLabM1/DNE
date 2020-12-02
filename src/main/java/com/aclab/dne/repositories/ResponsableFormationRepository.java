package com.aclab.dne.repositories;

import com.aclab.dne.model.ResponsableFormation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResponsableFormationRepository extends CrudRepository<ResponsableFormation,Long> {
}
