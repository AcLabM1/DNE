package com.aclab.dne.converter;

import com.aclab.dne.dto.UeDTO;
import com.aclab.dne.model.Ue;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;


@Component
public class UeConverter {

    /**
     * Passage de Ue en UeDTO
     * @param ue
     * @return
     */
    public UeDTO entityToDto(Ue ue){
        ModelMapper mapper = new ModelMapper();
        return mapper.map(ue,UeDTO.class);
    }

    /**
     * Passe une List Ue en une List de UeDTO
     * @param ues List UeDTO
     * @return
     */
    public List<UeDTO> entityToDto(List<Ue> ues){
        return ues.stream().map(this::entityToDto).collect(Collectors.toList());
    }

    /**
     * Passage UeDto en Ue
     * @param ueDTO
     * @return
     */
    public Ue dtoToEntity(UeDTO ueDTO){
        ModelMapper mapper = new ModelMapper();
        return mapper.map(ueDTO,Ue.class);
    }

    /**
     * Passage List UeDTO en List Ue
     * @param ueDTOS List Ue
     * @return
     */
    public List<Ue> dtoToEntity(List<UeDTO> ueDTOS){
        return ueDTOS.stream().map(this::dtoToEntity).collect(Collectors.toList());
    }

}
