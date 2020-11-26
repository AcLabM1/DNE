package com.aclab.dne.repositories;

import com.aclab.dne.model.Administratif;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdministratifRepository extends CrudRepository<Administratif,Long> {
}
