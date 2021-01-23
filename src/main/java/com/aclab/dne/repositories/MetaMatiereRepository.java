package com.aclab.dne.repositories;

import com.aclab.dne.model.MetaMatiere;
import com.aclab.dne.model.MetaMatiereId;
import org.springframework.data.repository.CrudRepository;

public interface MetaMatiereRepository extends CrudRepository<MetaMatiere, MetaMatiereId> {
}
