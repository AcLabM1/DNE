package com.aclab.dne.bootstrap;

import com.aclab.dne.converter.*;
import com.aclab.dne.dto.*;
import com.aclab.dne.model.*;
import com.aclab.dne.repositories.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.GregorianCalendar;

@Component
public class DataLoader implements CommandLineRunner {

    private static final Logger LOG = LoggerFactory.getLogger(DataLoader.class);

    @Autowired
    private PasswordEncoder passwordEncoder;

    //Repositories
    private final AdministratifRepository administratifRepository;
    private final DiplomeRepository diplomeRepository;
    private final EtudiantRepository etudiantRepository;
    private final MatiereRepository matiereRepository;
    private final PromotionRepository promotionRepository;
    private final ResponsableFormationRepository responsableFormationRepository;
    private final TuteurRepository tuteurRepository;
    private final UeRepository ueRepository;
    private final SessionRepository sessionRepository;
    private final NoteRepository noteRepository;
    private final InscriptionRepository inscriptionRepository;
    //Converter
    private final AdministratifConverter administratifConverter;
    private final DiplomeConverter diplomeConverter;
    private final EtudiantConverter etudiantConverter;
    private final MatiereConverter matiereConverter;
    private final PromotionConverter promotionConverter;
    private final ResponsableFormationConverter responsableFormationConverter;
    private final TuteurConverter tuteurConverter;
    private final UeConverter ueConverter;
    private final SessionConverter sessionConverter;
    private final NoteConverter noteConverter;
    private final InscriptionConverter inscriptionConverter;

    public DataLoader(AdministratifRepository administratifRepository, DiplomeRepository diplomeRepository,
                      EtudiantRepository etudiantRepository, MatiereRepository matiereRepository,
                      PromotionRepository promotionRepository,
                      ResponsableFormationRepository responsableFormationRepository, TuteurRepository tuteurRepository,
                      UeRepository ueRepository, SessionRepository sessionRepository, NoteRepository noteRepository, InscriptionRepository inscriptionRepository, AdministratifConverter administratifConverter, DiplomeConverter diplomeConverter,
                      EtudiantConverter etudiantConverter, MatiereConverter matiereConverter, PromotionConverter promotionConverter,
                      ResponsableFormationConverter responsableFormationConverter, TuteurConverter tuteurConverter,
                      UeConverter ueConverter, SessionConverter sessionConverter, NoteConverter noteConverter, InscriptionConverter inscriptionConverter) {

        this.administratifRepository = administratifRepository;
        this.diplomeRepository = diplomeRepository;
        this.etudiantRepository = etudiantRepository;
        this.matiereRepository = matiereRepository;
        this.promotionRepository = promotionRepository;
        this.responsableFormationRepository = responsableFormationRepository;
        this.tuteurRepository = tuteurRepository;
        this.ueRepository = ueRepository;
        this.sessionRepository = sessionRepository;
        this.noteRepository = noteRepository;
        this.inscriptionRepository = inscriptionRepository;
        this.administratifConverter = administratifConverter;
        this.diplomeConverter = diplomeConverter;
        this.etudiantConverter = etudiantConverter;
        this.matiereConverter = matiereConverter;
        this.promotionConverter = promotionConverter;
        this.responsableFormationConverter = responsableFormationConverter;
        this.tuteurConverter = tuteurConverter;
        this.ueConverter = ueConverter;
        this.sessionConverter = sessionConverter;
        this.noteConverter = noteConverter;
        this.inscriptionConverter = inscriptionConverter;
    }

    @Override
    public void run(String... args){
        LOG.debug("IN");
        loadData();
    }

    private void loadData(){
        LOG.debug("IN");
        ResponsableFormationDTO responsableDTO = new ResponsableFormationDTO();
        responsableDTO.setNom("Gouvy");
        responsableDTO.setPrenom("Nicolas");
        responsableDTO.setEmailUniv("nicolas.gouvy@univ-catholille.fr");
        responsableDTO.setTelephoneUniv("0320134195");
        responsableDTO.setBureau("RZ2XX");
        responsableDTO.setEstVacataire(false);
        responsableDTO.setPoste("Head of the Computer Science Master Degree ");
        responsableDTO.setnumInterneUniv("2014617345L");
        responsableDTO.setUsername(responsableDTO.getEmailUniv());//TODO voir pour la structure de l'username.
        responsableDTO.setPassword(passwordEncoder.encode("L@Cath0l1ll€"));
        ResponsableFormation responsableSaved = responsableFormationRepository.save(responsableFormationConverter.dtoToEntity(responsableDTO));

        EtudiantDTO etudiant1DTO = new EtudiantDTO();
        etudiant1DTO.setDateNaissance(new GregorianCalendar(1990, Calendar.FEBRUARY, 12).getTime());
        etudiant1DTO.setEmailPersonnel("morgan.lombard@unmail.com");
        etudiant1DTO.setEmailUniv("morgan.lombard@lacatholille.fr");
        etudiant1DTO.setNom("Lombard");
        etudiant1DTO.setPrenom("Morgan");
        etudiant1DTO.setTelephonePersonnel("0607056561");
        etudiant1DTO.setNumInterneUniv("2020615893L");
        etudiant1DTO.setUsername(etudiant1DTO.getEmailUniv());//TODO voir pour la structure de l'username.
        etudiant1DTO.setPassword(passwordEncoder.encode("L@Cath0l1ll€"));
        Etudiant etudiant1saved = etudiantRepository.save(etudiantConverter.dtoToEntity(etudiant1DTO));

        EtudiantDTO etudiant2DTO = new EtudiantDTO();
        etudiant2DTO.setDateNaissance(new GregorianCalendar(1982, Calendar.MARCH, 26).getTime());
        etudiant2DTO.setEmailPersonnel("julien.dudek@unmail.com");
        etudiant2DTO.setEmailUniv("julien.dudek@lacatholille.fr");
        etudiant2DTO.setNom("Dudek");
        etudiant2DTO.setPrenom("Julien");
        etudiant2DTO.setTelephonePersonnel("0609090231");
        etudiant2DTO.setNumInterneUniv("2020777893L");
        etudiant2DTO.setUsername(etudiant2DTO.getEmailUniv());//TODO voir pour la structure de l'username.
        etudiant2DTO.setPassword(passwordEncoder.encode("L@Cath0l1ll€"));
        Etudiant etudiant2saved = etudiantRepository.save(etudiantConverter.dtoToEntity(etudiant2DTO));

        EtudiantDTO etudiant3DTO = new EtudiantDTO();
        etudiant3DTO.setDateNaissance(new GregorianCalendar(1990, Calendar.DECEMBER, 31).getTime());
        etudiant3DTO.setEmailPersonnel("pierre.darcas@unmail.com");
        etudiant3DTO.setEmailUniv("pierre.darcas@lacatholille.fr");
        etudiant3DTO.setNom("Darcas");
        etudiant3DTO.setPrenom("Pierre");
        etudiant3DTO.setTelephonePersonnel("0601111161");
        etudiant3DTO.setNumInterneUniv("2020610003L");
        etudiant3DTO.setUsername(etudiant3DTO.getEmailUniv());//TODO voir pour la structure de l'username.
        etudiant3DTO.setPassword(passwordEncoder.encode("L@Cath0l1ll€"));
        Etudiant etudiant3saved = etudiantRepository.save(etudiantConverter.dtoToEntity(etudiant3DTO));

        TuteurDTO tuteurDTO = new TuteurDTO();
        tuteurDTO.setNom("Lefebvreeeee");
        tuteurDTO.setPrenom("Pierrrre");
        tuteurDTO.setEmailPro("pierre.2.lefebvre@saboite.com");
        tuteurDTO.setSociete("Worldline");
        tuteurDTO.setTelephonePro("0320000083");
        tuteurDTO.setUsername(tuteurDTO.getEmailPro());//TODO voir pour la structure de l'username.
        tuteurDTO.setPassword(passwordEncoder.encode("L@Cath0l1ll€"));
        Tuteur tuteurSaved = tuteurRepository.save(tuteurConverter.dtoToEntity(tuteurDTO));

        AdministratifDTO administratifDTO = new AdministratifDTO();
        administratifDTO.setNom("Bediez");
        administratifDTO.setPrenom("Stéphanie");
        administratifDTO.setEmailUniv("Stephanie.BEDIEZ@univ-catholille.fr");
        administratifDTO.setFonction("Responsable Relations Entreprises FGES | ISEA");
        administratifDTO.setTelephoneUniv("0359315001");
        administratifDTO.setBureau("non communiqué");
        administratifDTO.setUsername(administratifDTO.getEmailUniv());//TODO voir pour la structure de l'username.
        administratifDTO.setPassword(passwordEncoder.encode("L@Cath0l1ll€"));
        Administratif administratifSaved = administratifRepository.save(administratifConverter.dtoToEntity(administratifDTO));

        MatiereDTO matiereDTO = new MatiereDTO();
        matiereDTO.setIntitule("ACLAB M1 S1");
        matiereDTO.setCodeMatiere("GRPE001");
        matiereDTO.setCreditECTS(2);
        matiereDTO.setDescription("Travail de groupe visant à produire une plus-value technique.");
        matiereDTO.setSemestre(1);
        matiereDTO.setQuotaHeure(32);
        Matiere matiereSaved = matiereRepository.save(matiereConverter.dtoToEntity(matiereDTO));

        UeDTO ueDTO = new UeDTO();
        ueDTO.setIntitule("Transversal 1");
        Ue ueSaved = ueRepository.save(ueConverter.dtoToEntity(ueDTO));


        DiplomeDTO diplomeDTO = new DiplomeDTO("Master III",120);
        diplomeDTO.setEstActif(true);
        Diplome diplomeSaved = diplomeRepository.save(diplomeConverter.dtoToEntity(diplomeDTO));

        PromotionDTO promotionDTO = new PromotionDTO();
        promotionDTO.setAnnee(2020);
        Promotion promotionSaved = promotionRepository.save(promotionConverter.dtoToEntity(promotionDTO));

        SessionDTO sessionDTO = new SessionDTO();
        sessionDTO.setDateHeure( Timestamp.valueOf("2020-10-25 10:00:00.000"));
        sessionDTO.setDuree(2);
        sessionDTO.setSalle("RZ242");
        Session sessionSaved = sessionRepository.save(sessionConverter.dtoToEntity(sessionDTO));

        NoteDTO noteDTO = new NoteDTO();
        noteDTO.setNote(15.0F);
        noteDTO.setDate(Date.valueOf("2021-10-25"));
        noteDTO.setCoef(2);
        noteDTO.setType("QCM");
        Note noteSaved = noteRepository.save(noteConverter.dtoToEntity(noteDTO));


        InscriptionDTO inscriptionDTO = new InscriptionDTO();
        inscriptionDTO.setIdEtudiant(etudiant2saved.getIdPersonne());
        inscriptionDTO.setIdPromotion(promotionSaved.getIdPromotion());
        inscriptionDTO.setIdTuteur(tuteurSaved.getIdPersonne());
        inscriptionDTO.setIdDiplome(diplomeSaved.getIdDiplome());
        Inscription inscriptionSaved = inscriptionRepository.save(inscriptionConverter.dtoToEntity(inscriptionDTO));

        LOG.info("Données chargées");
    }
}