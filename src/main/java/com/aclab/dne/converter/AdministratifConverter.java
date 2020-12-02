package com.aclab.dne.converter;

import com.aclab.dne.dto.AdministratifDTO;
import com.aclab.dne.model.Administratif;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class AdministratifConverter {

    /**
     * Passage Administratif à AdministratifDTO
     * @param administratif
     * @return administratifDTO
     */
    public AdministratifDTO entityToDTO(Administratif administratif){
        ModelMapper mapper = new ModelMapper();
        return mapper.map(administratif,AdministratifDTO.class);
    }

    /**
     * Converti une liste d'administratifs en administratifDTO
     * @param administratifs
     * @return une liste d'administratifDTO
     */
    public List<AdministratifDTO> entityToDTO(List<Administratif> administratifs){
        return  administratifs.stream().map(this::entityToDTO).collect(Collectors.toList());
    }

    /**
     * Converti un AdministratifDTO en Administratif
     * @param administratifDTO
     * @return entite Administratif
     */
    public Administratif dtoToEntity(AdministratifDTO administratifDTO){
        ModelMapper mapper = new ModelMapper();
        return mapper.map(administratifDTO,Administratif.class);
    }

    /**
     * Converti une liste de
     * @param administratifDTOS
     * @return
     */
    public List<Administratif> dtoToEntity(List<AdministratifDTO> administratifDTOS){
        return administratifDTOS.stream().map(this::dtoToEntity).collect(Collectors.toList());
    }

}
