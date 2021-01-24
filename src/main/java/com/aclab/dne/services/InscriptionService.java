package com.aclab.dne.services;

import com.aclab.dne.converter.InscriptionConverter;
import com.aclab.dne.converter.NoteConverter;
import com.aclab.dne.dto.InscriptionDTO;
import com.aclab.dne.dto.NoteDTO;
import com.aclab.dne.model.Inscription;
import com.aclab.dne.model.InscriptionId;
import com.aclab.dne.repositories.InscriptionRepository;
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
public class InscriptionService {

    private final InscriptionRepository inscriptionRepository;
    private final InscriptionConverter inscriptionConverter;

    public List<InscriptionDTO> findAllInstription(){
        Iterable<Inscription> notes = this.inscriptionRepository.findAll();
        if(IterableUtils.size(notes) > 0 ){
            return this.inscriptionConverter.entityToDTO(IterableUtils.toList(notes));
        }else{
            throw new NoSuchElementException("pas de notes");
        }
    }

    public InscriptionDTO findInscriptionByEtudiantID(Long etudiantId){
        Optional<Inscription> inscription = this.inscriptionRepository.findByIdEtudiant(etudiantId);
        if(inscription.isPresent()){
            return this.inscriptionConverter.entityToDTO(inscription.get());
        }else {
            throw new NoSuchElementException("Pas de note");
        }
    }

    public InscriptionDTO createInscription(InscriptionDTO newInscriptionDTO){
        return inscriptionConverter.entityToDTO((inscriptionRepository.save(this.inscriptionConverter.dtoToEntity(newInscriptionDTO))));
    }

}
