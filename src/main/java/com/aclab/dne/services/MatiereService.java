package com.aclab.dne.services;

import com.aclab.dne.converter.MatiereConverter;
import com.aclab.dne.dto.MatiereDTO;
import com.aclab.dne.model.Matiere;
import com.aclab.dne.repositories.MatiereRepository;
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
public class MatiereService {

    private final MatiereRepository matiereRepository;
    private final MatiereConverter matiereConverter;

    public List<MatiereDTO> findAllMatiere(){
        Iterable<Matiere> matieres = this.matiereRepository.findAll();
        if(IterableUtils.size(matieres) > 0 ){
            return this.matiereConverter.entityToDTO(IterableUtils.toList(matieres));
        }else{
            throw new NoSuchElementException("pas de matiere");
        }
    }

    public MatiereDTO findMatiereByMAtiereID(int matiereId){
        Optional<Matiere> matiere = this.matiereRepository.findById(matiereId);
        if(matiere.isPresent()){
            return this.matiereConverter.entityToDTO(matiere.get());
        }else {
            throw new NoSuchElementException("Pas de matiere");
        }
    }

    public MatiereDTO createMatiere(MatiereDTO newMatiereDTO){
        return matiereConverter.entityToDTO((matiereRepository.save(this.matiereConverter.dtoToEntity(newMatiereDTO))));
    }

}
