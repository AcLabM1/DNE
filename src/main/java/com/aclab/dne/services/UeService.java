package com.aclab.dne.services;

import com.aclab.dne.converter.UeConverter;
import com.aclab.dne.dto.UeDTO;
import com.aclab.dne.model.Ue;
import com.aclab.dne.repositories.UeRepository;
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
public class UeService {

    private final UeRepository ueRepository;
    private final UeConverter ueConverter;

    public List<UeDTO> findAllUes(){
        Iterable<Ue> ues = this.ueRepository.findAll();
        if(IterableUtils.size(ues) > 0 ){
            return this.ueConverter.entityToDto(IterableUtils.toList(ues));
        }else{
            throw new NoSuchElementException("pas d\' UE");
        }
    }

    public UeDTO findUeByUeID(int ueId){
        Optional<Ue> ue = this.ueRepository.findById(ueId);
        if(ue.isPresent()){
            return this.ueConverter.entityToDto(ue.get());
        }else {
            throw new NoSuchElementException("Pas d'ue");
        }
    }

    public UeDTO createUe(UeDTO newUeDTO){
        return ueConverter.entityToDto((ueRepository.save(this.ueConverter.dtoToEntity(newUeDTO))));
    }

}
