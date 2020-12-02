package com.aclab.dne.converter;

import com.aclab.dne.dto.EmployeDTO;
import com.aclab.dne.model.Employe;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class EmployeConverter {

    public EmployeDTO entityToDTO(Employe employe){
        ModelMapper mapper = new ModelMapper();
        return mapper.map(employe,EmployeDTO.class);
    }

    public List<EmployeDTO> entityToDTO(List<Employe> employes){
        return employes.stream().map(this::entityToDTO).collect(Collectors.toList());
    }

    public Employe dtoToEntity(EmployeDTO employeDTO){
        ModelMapper mapper = new ModelMapper();
        return mapper.map(employeDTO,Employe.class);
    }

    public List<Employe> dtoToEntity(List<EmployeDTO> employeDTOS){
        return employeDTOS.stream().map(this::dtoToEntity).collect(Collectors.toList());
    }

}
