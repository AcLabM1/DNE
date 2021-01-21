package com.aclab.dne.services;

import com.aclab.dne.repositories.PersonneRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Transactional
@AllArgsConstructor
@Service
public class PersonneService {
    private static final String PASS_RGEX="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[€@#$%^&+=])(?=\\S+$).{8,20}$";

    

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
