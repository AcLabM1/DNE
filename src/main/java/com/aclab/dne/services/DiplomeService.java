package com.aclab.dne.services;

import com.aclab.dne.converter.DiplomeConverter;
import com.aclab.dne.converter.EtudiantConverter;
import com.aclab.dne.dto.DiplomeDTO;
import com.aclab.dne.dto.EtudiantDTO;
import com.aclab.dne.dto.TuteurDTO;
import com.aclab.dne.model.Diplome;
import com.aclab.dne.model.Etudiant;
import com.aclab.dne.model.Tuteur;
import com.aclab.dne.repositories.DiplomeRepository;
import com.aclab.dne.repositories.EtudiantRepository;
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
public class DiplomeService {

    private final DiplomeRepository diplomeRepository;
    private final DiplomeConverter diplomeConverter;

    public List<DiplomeDTO> findAllDiplomes() {
        Iterable<Diplome> diplomes = this.diplomeRepository.findAll();
        if (IterableUtils.size(diplomes) > 0) {
            return this.diplomeConverter.entityToDTO(IterableUtils.toList(diplomes));
        } else {
            throw new NoSuchElementException("pas de diplome");
        }
    }

    public DiplomeDTO findDiplomeByDiplomeID(int diplomeId){
        Optional<Diplome> diplome = this.diplomeRepository.findById(diplomeId);
        if(diplome.isPresent()){
            return this.diplomeConverter.entityToDTO(diplome.get());
        }else {
            throw new NoSuchElementException("Pas de diplome");
        }
    }

    public DiplomeDTO createDiplome(DiplomeDTO newDiplomeDTO){
        return diplomeConverter.entityToDTO((diplomeRepository.save(this.diplomeConverter.dtoToEntity(newDiplomeDTO))));
    }
}
