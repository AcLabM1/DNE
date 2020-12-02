package com.aclab.dne.repositories;

import com.aclab.dne.model.Employe;
import org.springframework.data.repository.CrudRepository;

public interface EmployeRepository extends CrudRepository<Employe,Long> {
}
