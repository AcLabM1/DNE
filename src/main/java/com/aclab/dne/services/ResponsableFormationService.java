package com.aclab.dne.services;

import com.aclab.dne.converter.ResponsableFormationConverter;
import com.aclab.dne.dto.ResponsableFormationDTO;
import com.aclab.dne.model.ResponsableFormation;
import com.aclab.dne.repositories.ResponsableFormationRepository;
import lombok.AllArgsConstructor;
import org.apache.commons.collections4.IterableUtils;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.NoSuchElementException;

@Transactional
@AllArgsConstructor
@Service
public class ResponsableFormationService {

    private final ResponsableFormationRepository responsableFormationRepository;
    private final ResponsableFormationConverter responsableFormationConverter;

    public List<ResponsableFormationDTO> findAllResponsableFormations(){
        Iterable<ResponsableFormation> responsableFormations = this.responsableFormationRepository.findAll();
        if(IterableUtils.size(responsableFormations) > 0){
            return this.responsableFormationConverter.entityToDTO((IterableUtils.toList(responsableFormations)));
        }else{
            throw new NoSuchElementException("pas de responsable formation");
        }
    }
}
