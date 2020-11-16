package com.aclab.dne.converter;

import com.aclab.dne.dto.UeDTO;
import com.aclab.dne.model.Ue;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.tuple;

import static org.junit.jupiter.api.Assertions.*;

class UeConverterTest {


    @Test
    void entityToDto() {
        Ue ue = new Ue();
        ue.setIntitule("une Ue");
        ue.setIdUE(10);
        UeConverter ueConverter = new UeConverter();
        UeDTO ueDTO = ueConverter.entityToDto(ue);
        assertThat(ueDTO.getIdUe()).isEqualTo(10);
        assertThat(ueDTO.getIntitule()).isEqualTo("une Ue");
    }


    @Test
    void dtoToEntity() {
        UeDTO ueDTO = new UeDTO(10,"une Ue");
        UeConverter ueConverter = new UeConverter();
        Ue ue = ueConverter.dtoToEntity(ueDTO);
        assertThat(ue.getIdUE()).isEqualTo(10);
        assertThat(ue.getIntitule()).isEqualTo("une Ue");
    }

}