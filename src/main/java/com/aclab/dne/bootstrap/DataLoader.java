package com.aclab.dne.bootstrap;

import com.aclab.dne.converter.*;
import com.aclab.dne.dto.EtudiantDTO;
import com.aclab.dne.repositories.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

@Component
public class DataLoader implements CommandLineRunner {

    private static final Logger LOG = LoggerFactory.getLogger(DataLoader.class);

    @Override
    public void run(String... args) throws Exception {
        loadData();

    }
    private void loadData(){
        EtudiantDTO julien = new EtudiantDTO();
        julien.setDateNaissance(new GregorianCalendar(1982, Calendar.MARCH, 26).getTime());
        julien.setEmailPersonnel("julien.dudek@gmail.com");
        julien.setEmailUniv("julien.dudek@lacatholille.fr");
        julien.setNom("DUDEK");
        julien.setPrenom("Julien");
        julien.setTelephonePersonnel("0607084231");
        etudiantRepository.save(etudiantConverter.dtoToEntity(julien));

    }

    public DataLoader(AdministratifRepository administratifRepository, DiplomeRepository diplomeRepository, EmployeRepository employeRepository, EnseignantRepository enseignantRepository, EtudiantRepository etudiantRepository, InterneUnivRepository interneUnivRepository, MatiereRepository matiereRepository, NoteRepository noteRepository, PersonneRepository personneRepository, PromotionRepository promotionRepository, ResponsableFormationRepository responsableFormationRepository, SessionRepository sessionRepository, TuteurRepository tuteurRepository, UeRepository ueRepository, AdministratifConverter administratifConverter, DiplomeConverter diplomeConverter, EmployeConverter employeConverter, EnseignantConverter enseignantConverter, EtudiantConverter etudiantConverter, InterneUnivConverter interneUnivConverter, MatiereConverter matiereConverter, NoteConverter noteConverter, PromotionConverter promotionConverter, ResponsableFormationConverter responsableFormationConverter, SessionConverter sessionConverter, TuteurConverter tuteurConverter, UeConverter ueConverter) {
        this.administratifRepository = administratifRepository;
        this.diplomeRepository = diplomeRepository;
        this.employeRepository = employeRepository;
        this.enseignantRepository = enseignantRepository;
        this.etudiantRepository = etudiantRepository;
        this.interneUnivRepository = interneUnivRepository;
        this.matiereRepository = matiereRepository;
        this.noteRepository = noteRepository;
        this.personneRepository = personneRepository;
        this.promotionRepository = promotionRepository;
        this.responsableFormationRepository = responsableFormationRepository;
        this.sessionRepository = sessionRepository;
        this.tuteurRepository = tuteurRepository;
        this.ueRepository = ueRepository;
        this.administratifConverter = administratifConverter;
        this.diplomeConverter = diplomeConverter;
        this.employeConverter = employeConverter;
        this.enseignantConverter = enseignantConverter;
        this.etudiantConverter = etudiantConverter;
        this.interneUnivConverter = interneUnivConverter;
        this.matiereConverter = matiereConverter;
        this.noteConverter = noteConverter;
        this.promotionConverter = promotionConverter;
        this.responsableFormationConverter = responsableFormationConverter;
        this.sessionConverter = sessionConverter;
        this.tuteurConverter = tuteurConverter;
        this.ueConverter = ueConverter;
    }



    private final AdministratifRepository administratifRepository;
    private final DiplomeRepository diplomeRepository;
    private final EmployeRepository employeRepository;
    private final EnseignantRepository enseignantRepository;
    private final EtudiantRepository etudiantRepository;
    private final InterneUnivRepository interneUnivRepository;
    private final MatiereRepository matiereRepository;
    private final NoteRepository noteRepository;
    private final PersonneRepository personneRepository;
    private final PromotionRepository promotionRepository;
    private final ResponsableFormationRepository responsableFormationRepository;
    private final SessionRepository sessionRepository;
    private final TuteurRepository tuteurRepository;
    private final UeRepository ueRepository;

    private final AdministratifConverter administratifConverter;
    private final DiplomeConverter diplomeConverter;
    private final EmployeConverter employeConverter;
    private final EnseignantConverter enseignantConverter;
    private final EtudiantConverter etudiantConverter;
    private final InterneUnivConverter interneUnivConverter;
    private final MatiereConverter matiereConverter;
    private final NoteConverter noteConverter;
    private final PromotionConverter promotionConverter;
    private final ResponsableFormationConverter responsableFormationConverter;
    private final SessionConverter sessionConverter;
    private final TuteurConverter tuteurConverter;
    private final UeConverter ueConverter;
}