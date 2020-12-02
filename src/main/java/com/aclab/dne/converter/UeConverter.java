package com.aclab.dne.converter;

import com.aclab.dne.dto.UeDTO;
import com.aclab.dne.model.Ue;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;


@Component
public class UeConverter {

    private static final Logger log = LoggerFactory.getLogger(UeConverter.class);
    /**
     * Passage de Ue en UeDTO
     *
     * @param ue
     * @return
     */
    public UeDTO entityToDto(Ue ue) {
        log.debug("IN");
        ModelMapper mapper = new ModelMapper();
        return mapper.map(ue, UeDTO.class);
    }

    /**
     * Passe une List Ue en une List de UeDTO
     *
     * @param ues List UeDTO
     * @return
     */
    public List<UeDTO> entityToDto(List<Ue> ues) {
        log.debug("IN");
        return ues.stream().map(this::entityToDto).collect(Collectors.toList());
    }

    /**
     * Passage UeDto en Ue
     *
     * @param ueDTO
     * @return
     */
    public Ue dtoToEntity(UeDTO ueDTO) {
        log.debug("IN");
        ModelMapper mapper = new ModelMapper();
        return mapper.map(ueDTO, Ue.class);
    }

    /**
     * Passage List UeDTO en List Ue
     *
     * @param ueDTOS List Ue
     * @return
     */
    public List<Ue> dtoToEntity(List<UeDTO> ueDTOS) {
        log.debug("IN");
        return ueDTOS.stream().map(this::dtoToEntity).collect(Collectors.toList());
    }

}
