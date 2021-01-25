package com.aclab.dne.services;

import com.aclab.dne.converter.*;
import com.aclab.dne.dto.*;
import com.aclab.dne.exception.CustomException;
import com.aclab.dne.model.Personne;
import com.aclab.dne.repositories.*;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.node.ObjectNode;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Transactional
@AllArgsConstructor
@Service
public class PersonneService {
    private static final String PASS_RGEX="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[€@#$%^&+=])(?=\\S+$).{8,20}$";
    private final PersonneRepository personneRepository;
    private final TuteurRepository tuteurRepository;
    private final TuteurConverter tuteurConverter;
    private final AdministratifRepository administratifRepository;
    private final AdministratifConverter administratifConverter;
    private final EnseignantRepository enseignantRepository;
    private final EnseignantConverter enseignantConverter;
    private final EtudiantRepository etudiantRepository;
    private final EtudiantConverter etudiantConverter;
    private final ResponsableFormationRepository responsableFormationRepository;
    private final ResponsableFormationConverter responsableFormationConverter;
    @Autowired
    private PasswordEncoder passwordEncoder;


    public ObjectNode login(String username,String password) throws JsonProcessingException {
        ObjectNode res = null;
        Optional<Personne> p = personneRepository.findPersonneByUsername(username.toLowerCase());
        if (p.isPresent()&& passwordEncoder.matches(password, p.get().getPassword())){
            Long id= p.get().getIdPersonne();
            Object obj = findEntity(id);
            String type;
            if(obj instanceof TuteurDTO){
                type= "Tuteur";
            }else if(obj instanceof EtudiantDTO ){
                type = "Etudiant";
            }else if(obj instanceof ResponsableFormationDTO){
                type = "Responsable";
            }else if(obj instanceof EnseignantDTO){
                type = "Enseignant";
            }else if(obj instanceof AdministratifDTO){
                type = "Administratif";
            }else{
                type ="Non reconnu";
            }
            JsonFactory factory = new JsonFactory();
            ObjectMapper mapper = new ObjectMapper(factory);
            ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
            String json = ow.writeValueAsString(obj);
            ObjectNode node = (ObjectNode) mapper.readTree(json);
            node.putPOJO("status",type);
            node.remove("password");
            res = node;
        }else{
            throw new CustomException( "Erreur d'identification",HttpStatus.FORBIDDEN);
        }
        return res;
    }
    private Object findEntity(Long id){
        if(tuteurRepository.findById(id).isPresent()){
            return tuteurConverter.entityToDto(tuteurRepository.findById(id).get());
        }else if(etudiantRepository.findById(id).isPresent()){
            return etudiantConverter.entityToDto(etudiantRepository.findById(id).get());
        }else if(responsableFormationRepository.findById(id).isPresent()){
            return responsableFormationConverter.entityToDTO(responsableFormationRepository.findById(id).get());
        }else if(enseignantRepository.findById(id).isPresent()){
            return enseignantConverter.entityToDTO(enseignantRepository.findById(id).get());
        }else if(administratifRepository.findById(id).isPresent()){
            return administratifConverter.entityToDTO(administratifRepository.findById(id).get());
        }else{
            return null;
        }
    }

    /**
     * Methode utilitaire pour la creation d'un password
     * Permet de vérifier si le password saisie correspond à la REGEX
     * @param password
     * @return
     */
    private boolean isValidPassword(String password){
        if(password==null){
            return false;
        }else{
            Pattern p = Pattern.compile(PASS_RGEX);
            Matcher m = p.matcher(password);
            return m.matches();
        }
    }
}
