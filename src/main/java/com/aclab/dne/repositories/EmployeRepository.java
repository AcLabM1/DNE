package com.aclab.dne.repositories;

import com.aclab.dne.model.Employe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeRepository extends CrudRepository<Employe,Long> {
}
