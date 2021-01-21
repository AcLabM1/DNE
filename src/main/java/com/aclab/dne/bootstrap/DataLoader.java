package com.aclab.dne.bootstrap;

import com.aclab.dne.converter.*;
import com.aclab.dne.dto.*;
import com.aclab.dne.repositories.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.Calendar;
import java.util.GregorianCalendar;

@Component
public class DataLoader implements CommandLineRunner {

    private static final Logger LOG = LoggerFactory.getLogger(DataLoader.class);

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args){
        LOG.debug("IN");
        loadData();
    }
    private void loadData(){
        LOG.debug("IN");
        ResponsableFormationDTO resp = new ResponsableFormationDTO();
        resp.setNom("Gouvy");
        resp.setPrenom("Nicolas");
        resp.setEmailUniv("nicolas.gouvy@univ-catholille.fr");
        resp.setTelephoneUniv("0320134195");
        resp.setBureau("RZ2XX");
        resp.setEstVacataire(false);
        resp.setPoste("Head of the Computer Science Master Degree ");
        resp.setIdUniv(2014617345L);
        resp.setUsername(resp.getEmailUniv());//TODO voir pour la structure de l'username.
        resp.setPassword(passwordEncoder.encode("L@Cath0l1ll€"));
        responsableFormationRepository.save(responsableFormationConverter.dtoToEntity(resp));

        EtudiantDTO user = new EtudiantDTO();
        user.setDateNaissance(new GregorianCalendar(1982, Calendar.MARCH, 26).getTime());
        user.setEmailPersonnel("julien.dudek@gmail.com");
        user.setEmailUniv("julien.dudek@lacatholille.fr");
        user.setNom("Dudek");
        user.setPrenom("Julien");
        user.setTelephonePersonnel("0607084231");
        user.setIduniv(2020615893L);
        user.setUsername(user.getEmailUniv());//TODO voir pour la structure de l'username.
        user.setPassword(passwordEncoder.encode("L@Cath0l1ll€"));
        etudiantRepository.save(etudiantConverter.dtoToEntity(user));

        TuteurDTO tuteurDTO = new TuteurDTO();
        tuteurDTO.setNom("Lefebvre");
        tuteurDTO.setPrenom("Pierre");
        tuteurDTO.setEmailPro("pierre.2.lefebvre@worldline.com");
        tuteurDTO.setSociete("Worldline");
        tuteurDTO.setTelephonePro("0320608183");
        tuteurDTO.setUsername(tuteurDTO.getEmailPro());//TODO voir pour la structure de l'username.
        tuteurDTO.setPassword(passwordEncoder.encode("L@Cath0l1ll€"));
        tuteurRepository.save(tuteurConverter.dtoToEntity(tuteurDTO));

        AdministratifDTO administratifDTO = new AdministratifDTO();
        administratifDTO.setNom("Bediez");
        administratifDTO.setPrenom("Stéphanie");
        administratifDTO.setEmailUniv("Stephanie.BEDIEZ@univ-catholille.fr");
        administratifDTO.setFonction("Responsable Relations Entreprises FGES | ISEA");
        administratifDTO.setTelephoneUniv("03.59.31.50.01");
        administratifDTO.setBureau("non communiqué");
        administratifDTO.setUsername(administratifDTO.getEmailUniv());//TODO voir pour la structure de l'username.
        administratifDTO.setPassword(passwordEncoder.encode("L@Cath0l1ll€"));
        administratifRepository.save(administratifConverter.dtoToEntity(administratifDTO));

        MatiereDTO matiereDTO = new MatiereDTO();
        matiereDTO.setIntitule("ACLAB M1 S1");
        matiereDTO.setCodeMatiere("GRPE001");
        matiereDTO.setCreditECTS(2);
        matiereDTO.setDescription("Travail de groupe visant à produire une plus-value technique.");
        matiereDTO.setSemestre(1);
        matiereDTO.setQuotaHeure(32);
        matiereRepository.save(matiereConverter.dtoToEntity(matiereDTO));

        UeDTO ueDTO = new UeDTO();
        ueDTO.setIntitule("Transversal 1");
        ueRepository.save(ueConverter.dtoToEntity(ueDTO));

        DiplomeDTO diplomeDTO = new DiplomeDTO("Master III",120);
        diplomeDTO.setEstActif(true);
        diplomeRepository.save(diplomeConverter.dtoToEntity(diplomeDTO));

        PromotionDTO promotionDTO = new PromotionDTO();
        promotionDTO.setAnnee(2020);
        promotionRepository.save(promotionConverter.dtoToEntity(promotionDTO));

        LOG.info("Données chargées");

    }

    public DataLoader(AdministratifRepository administratifRepository, DiplomeRepository diplomeRepository,
                      EtudiantRepository etudiantRepository, MatiereRepository matiereRepository,
                      PromotionRepository promotionRepository,
                      ResponsableFormationRepository responsableFormationRepository,TuteurRepository tuteurRepository,
                      UeRepository ueRepository, AdministratifConverter administratifConverter, DiplomeConverter diplomeConverter,
                      EtudiantConverter etudiantConverter, MatiereConverter matiereConverter, PromotionConverter promotionConverter,
                      ResponsableFormationConverter responsableFormationConverter, TuteurConverter tuteurConverter,
                      UeConverter ueConverter) {

        this.administratifRepository = administratifRepository;
        this.diplomeRepository = diplomeRepository;
        this.etudiantRepository = etudiantRepository;
        this.matiereRepository = matiereRepository;
        this.promotionRepository = promotionRepository;
        this.responsableFormationRepository = responsableFormationRepository;
        this.tuteurRepository = tuteurRepository;
        this.ueRepository = ueRepository;
        this.administratifConverter = administratifConverter;
        this.diplomeConverter = diplomeConverter;
        this.etudiantConverter = etudiantConverter;
        this.matiereConverter = matiereConverter;
        this.promotionConverter = promotionConverter;
        this.responsableFormationConverter = responsableFormationConverter;
        this.tuteurConverter = tuteurConverter;
        this.ueConverter = ueConverter;
    }


    //Repositories
    private final AdministratifRepository administratifRepository;
    private final DiplomeRepository diplomeRepository;
    private final EtudiantRepository etudiantRepository;
    private final MatiereRepository matiereRepository;
    private final PromotionRepository promotionRepository;
    private final ResponsableFormationRepository responsableFormationRepository;
    private final TuteurRepository tuteurRepository;
    private final UeRepository ueRepository;
    //Converter
    private final AdministratifConverter administratifConverter;
    private final DiplomeConverter diplomeConverter;
    private final EtudiantConverter etudiantConverter;
    private final MatiereConverter matiereConverter;
    private final PromotionConverter promotionConverter;
    private final ResponsableFormationConverter responsableFormationConverter;
    private final TuteurConverter tuteurConverter;
    private final UeConverter ueConverter;
}