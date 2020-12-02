package com.aclab.dne.repositories;


import com.aclab.dne.model.Tuteur;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface TuteurRepository extends CrudRepository<Tuteur,Long> {
}
