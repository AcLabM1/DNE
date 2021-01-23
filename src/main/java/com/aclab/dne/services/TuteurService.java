package com.aclab.dne.services;

import com.aclab.dne.converter.TuteurConverter;
import com.aclab.dne.dto.TuteurDTO;
import com.aclab.dne.model.Tuteur;
import com.aclab.dne.repositories.TuteurRepository;
import lombok.AllArgsConstructor;
import org.apache.commons.collections4.IterableUtils;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Transactional
@AllArgsConstructor
@Service
public class TuteurService {

    private final TuteurRepository tuteurRepository;
    private final TuteurConverter tuteurConverter;

    public List<TuteurDTO> findAllTuteurs(){
        Iterable<Tuteur> tuteurs = this.tuteurRepository.findAll();
        if(IterableUtils.size(tuteurs) > 0 ){
            return this.tuteurConverter.entityToDto(IterableUtils.toList(tuteurs));
        }else{
            throw new NoSuchElementException("pas de tuteur");
        }
    }

    public TuteurDTO findTuteurByTuteurID(Long tuteurId){
        Optional<Tuteur> tuteur = this.tuteurRepository.findById(tuteurId);
        if(tuteur.isPresent()){
            return this.tuteurConverter.entityToDto(tuteur.get());
        }else {
            throw new NoSuchElementException("Pas de tuteur");
        }
    }

    public TuteurDTO createTuteur(TuteurDTO newTuteurDTO){
        return tuteurConverter.entityToDto((tuteurRepository.save(this.tuteurConverter.dtoToEntity(newTuteurDTO))));
    }

}
