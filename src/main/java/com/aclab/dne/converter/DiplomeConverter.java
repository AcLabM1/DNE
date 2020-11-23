package com.aclab.dne.converter;

import com.aclab.dne.dto.DiplomeDTO;
import com.aclab.dne.model.Diplome;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class DiplomeConverter {

    /**
     * Passage de Diplome en DiplomeDto
     * @param diplome
     * @return
     */
    public DiplomeDTO entityToDTO(Diplome diplome){
        ModelMapper mapper = new ModelMapper();
        return mapper.map(diplome,DiplomeDTO.class);
    }

    /**
     * Passe une List Diplome en List DiplomeDTO
     * @param diplomes List de Diplome
     * @return
     */
    public List<DiplomeDTO> entityToDTO(List<Diplome> diplomes){
        return diplomes.stream().map(this::entityToDTO).collect(Collectors.toList());
    }

    /**
     * Passage DiplomeDTO en Diplome
     * @param diplomeDTO
     * @return
     */
    public Diplome dtoToEntity(DiplomeDTO diplomeDTO){
        ModelMapper mapper = new ModelMapper();
        return mapper.map(diplomeDTO,Diplome.class);
    }

    /**
     * Passage List DiplomeDTO en List Diplome
     * @param diplomeDTOs
     * @return
     */
    public List<Diplome> dtoToEntity(List<DiplomeDTO> diplomeDTOs){
        return diplomeDTOs.stream().map(this::dtoToEntity).collect(Collectors.toList());
    }

}
