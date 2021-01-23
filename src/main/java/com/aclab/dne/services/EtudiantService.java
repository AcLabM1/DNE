package com.aclab.dne.services;

import com.aclab.dne.converter.EtudiantConverter;
import com.aclab.dne.dto.EtudiantDTO;
import com.aclab.dne.model.Etudiant;
import com.aclab.dne.repositories.EtudiantRepository;
import lombok.AllArgsConstructor;
import org.apache.commons.collections4.IterableUtils;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.NoSuchElementException;

@Transactional
@AllArgsConstructor
@Service
public class EtudiantService {

    private final EtudiantRepository etudiantRepository;
    private final EtudiantConverter etudiantConverter;

    public List<EtudiantDTO> findAllEtudiants(){
        Iterable<Etudiant> etudiants = this.etudiantRepository.findAll();
        if(IterableUtils.size(etudiants) > 0 ){
            return this.etudiantConverter.entityToDto(IterableUtils.toList(etudiants));
        }else{
            throw new NoSuchElementException("pas d\'étudiants");
        }
    }

}
