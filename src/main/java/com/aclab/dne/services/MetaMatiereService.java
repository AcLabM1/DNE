package com.aclab.dne.services;

import com.aclab.dne.converter.InscriptionConverter;
import com.aclab.dne.converter.MetaMatiereConverter;
import com.aclab.dne.dto.InscriptionDTO;
import com.aclab.dne.dto.MetaMatiereDTO;
import com.aclab.dne.model.Inscription;
import com.aclab.dne.model.MetaMatiere;
import com.aclab.dne.repositories.InscriptionRepository;
import com.aclab.dne.repositories.MetaMatiereRepository;
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
public class MetaMatiereService {

    private final MetaMatiereRepository metaMatiereRepository;
    private final MetaMatiereConverter metaMatiereConverter;

    public List<MetaMatiereDTO> findAllMetaMatiere(){
        Iterable<MetaMatiere> metaMatieres = this.metaMatiereRepository.findAll();
        if(IterableUtils.size(metaMatieres) > 0 ){
            return this.metaMatiereConverter.entityToDTO(IterableUtils.toList(metaMatieres));
        }else{
            throw new NoSuchElementException("pas de notes");
        }
    }

    //public InscriptionDTO findInscriptionByEtudiantID(Long etudiantId){
    //    Optional<Inscription> inscription = this.inscriptionRepository.findByIdEtudiant(etudiantId);
    //    if(inscription.isPresent()){
    //        return this.inscriptionConverter.entityToDTO(inscription.get());
    //    }else {
    //        throw new NoSuchElementException("Pas de note");
    //    }
    //}

    public MetaMatiereDTO createInscription(MetaMatiereDTO newMetaMatiereDTO){
        return metaMatiereConverter.entityToDTO((metaMatiereRepository.save(this.metaMatiereConverter.dtoToEntity(newMetaMatiereDTO))));
    }
}
