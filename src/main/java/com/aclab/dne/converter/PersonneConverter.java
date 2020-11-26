package com.aclab.dne.converter;

import com.aclab.dne.dto.PersonneDTO;
import com.aclab.dne.model.Personne;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PersonneConverter {

    /**
     * Passage de Personne en PersonneDTO
     * @param personne
     * @return
     */
    public PersonneDTO entityToDto(Personne personne){
        ModelMapper mapper = new ModelMapper();
        return mapper.map(personne,PersonneDTO.class);
    }

    /**
     * Passe une List Personne en une List de Personne DTO
     * @param personnes List PersonneDTO
     * @returne
     **/
    public List<PersonneDTO> entityToDto(List<Personne> personnes){
        return personnes.stream().map(this::entityToDto).collect(Collectors.toList());
    }

    /**
     * Passage PersonneDTO en Personne
     * @param personneDTO
     * @return
     **/
    public Personne dtoToEntity(PersonneDTO personneDTO){
        ModelMapper mapper = new ModelMapper();
        return mapper.map(personneDTO,Personne.class);
    }

    /**
     * Passage List PersonneDTO en List Personne
     * @param personneDTOS List Personne
     * @return
     */
    public List<Personne> dtoToEntity(List<PersonneDTO> personneDTOS){
        return personneDTOS.stream().map(this::dtoToEntity).collect(Collectors.toList());
    }
}
