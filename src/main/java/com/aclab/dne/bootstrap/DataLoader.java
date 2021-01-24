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
import java.util.HashSet;

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
        ResponsableFormation responsable = new ResponsableFormation();
        responsable.setNom("Gouvy");
        responsable.setPrenom("Nicolas");
        responsable.setEmailUniv("nicolas.gouvy@univ-catholille.fr");
        responsable.setTelephoneUniv("0320134195");
        responsable.setBureau("RZ2XX");
        responsable.setEstVacataire(false);
        responsable.setPoste("Head of the Computer Science Master Degree ");
        responsable.setNumInterneUniv("2014617345L");
        responsable.setUsername(responsable.getEmailUniv());//TODO voir pour la structure de l'username.
        responsable.setPassword(passwordEncoder.encode("L@Cath0l1ll€"));
        ResponsableFormation responsableSaved = responsableFormationRepository.save(responsable);
        LOG.debug("=================================================================================================================");
        LOG.debug(responsableSaved.toString());
        LOG.debug("=================================================================================================================");

        Etudiant etudiant1 = new Etudiant();
        etudiant1.setDateNaissance(new GregorianCalendar(1990, Calendar.FEBRUARY, 12).getTime());
        etudiant1.setEmailPersonnel("morgan.lombard@unmail.com");
        etudiant1.setEmailUniv("morgan.lombard@lacatholille.fr");
        etudiant1.setNom("Lombard");
        etudiant1.setPrenom("Morgan");
        etudiant1.setTelephonePersonnel("0607056561");
        etudiant1.setNumInterneUniv("2020615893L");
        etudiant1.setUsername(etudiant1.getEmailUniv());//TODO voir pour la structure de l'username.
        etudiant1.setPassword(passwordEncoder.encode("L@Cath0l1ll€"));
        Etudiant etudiant1saved = etudiantRepository.save(etudiant1);
        LOG.debug("=================================================================================================================");
        LOG.debug(etudiant1saved.toString());
        LOG.debug("=================================================================================================================");

        Etudiant etudiant2 = new Etudiant();
        etudiant2.setDateNaissance(new GregorianCalendar(1982, Calendar.MARCH, 26).getTime());
        etudiant2.setEmailPersonnel("julien.dudek@unmail.com");
        etudiant2.setEmailUniv("julien.dudek@lacatholille.fr");
        etudiant2.setNom("Dudek");
        etudiant2.setPrenom("Julien");
        etudiant2.setTelephonePersonnel("0609090231");
        etudiant2.setNumInterneUniv("2020777893L");
        etudiant2.setUsername(etudiant2.getEmailUniv());//TODO voir pour la structure de l'username.
        etudiant2.setPassword(passwordEncoder.encode("L@Cath0l1ll€"));
        Etudiant etudiant2saved = etudiantRepository.save(etudiant2);
        LOG.debug("=================================================================================================================");
        LOG.debug(etudiant2saved.toString());
        LOG.debug("=================================================================================================================");

        Etudiant etudiant3 = new Etudiant();
        etudiant3.setDateNaissance(new GregorianCalendar(1990, Calendar.DECEMBER, 31).getTime());
        etudiant3.setEmailPersonnel("pierre.darcas@unmail.com");
        etudiant3.setEmailUniv("pierre.darcas@lacatholille.fr");
        etudiant3.setNom("Darcas");
        etudiant3.setPrenom("Pierre");
        etudiant3.setTelephonePersonnel("0601111161");
        etudiant3.setNumInterneUniv("2020610003L");
        etudiant3.setUsername(etudiant3.getEmailUniv());//TODO voir pour la structure de l'username.
        etudiant3.setPassword(passwordEncoder.encode("L@Cath0l1ll€"));
        Etudiant etudiant3saved = etudiantRepository.save(etudiant3);
        LOG.debug("=================================================================================================================");
        LOG.debug(etudiant3saved.toString());
        LOG.debug("=================================================================================================================");

        Tuteur tuteur = new Tuteur();
        tuteur.setNom("Lefebvreeeee");
        tuteur.setPrenom("Pierrrre");
        tuteur.setEmailPro("pierre.2.lefebvre@saboite.com");
        tuteur.setSociete("Worldline");
        tuteur.setTelephonePro("0320000083");
        tuteur.setUsername(tuteur.getEmailPro());//TODO voir pour la structure de l'username.
        tuteur.setPassword(passwordEncoder.encode("L@Cath0l1ll€"));
        Tuteur tuteurSaved = tuteurRepository.save(tuteur);
        LOG.debug("=================================================================================================================");
        LOG.debug(tuteurSaved.toString());
        LOG.debug("=================================================================================================================");

        Administratif administratif = new Administratif();
        administratif.setNom("Bediez");
        administratif.setPrenom("Stéphanie");
        administratif.setEmailUniv("Stephanie.BEDIEZ@univ-catholille.fr");
        administratif.setFonction("Responsable Relations Entreprises FGES | ISEA");
        administratif.setTelephoneUniv("0359315001");
        administratif.setBureau("non communiqué");
        administratif.setUsername(administratif.getEmailUniv());//TODO voir pour la structure de l'username.
        administratif.setPassword(passwordEncoder.encode("L@Cath0l1ll€"));
        Administratif administratifSaved = administratifRepository.save(administratif);
        LOG.debug("=================================================================================================================");
        LOG.debug(administratifSaved.toString());
        LOG.debug("=================================================================================================================");

        Promotion promotion = new Promotion();
        promotion.setAnnee(2020);
        Promotion promotionSaved = promotionRepository.save(promotion);
        LOG.debug("=================================================================================================================");
        LOG.debug(promotionSaved.toString());
        LOG.debug("=================================================================================================================");

        Diplome diplome = new Diplome();
        diplome.setIntitule("Master 1 III");
        diplome.setTotalEcts(120);
        diplome.setEstActif(true);
        Diplome diplomeSaved = diplomeRepository.save(diplome);

        promotionSaved.setDiplomes(new HashSet<>());
        promotionSaved.getDiplomes().add(diplomeSaved);
        promotionSaved = promotionRepository.save(promotionSaved);

        LOG.debug("=================================================================================================================");
        LOG.debug(diplomeSaved.toString());
        LOG.debug("=================================================================================================================");

        Ue ueTransversal = new Ue();
        ueTransversal.setIntitule("Transversal 1");
        Ue ueTransversalSaved = ueRepository.save(ueTransversal);

        diplomeSaved.setUes(new HashSet<>());
        diplomeSaved.getUes().add(ueTransversalSaved);
        diplomeSaved = diplomeRepository.save(diplomeSaved);

        LOG.debug("=================================================================================================================");
        LOG.debug(ueTransversalSaved.toString());
        LOG.debug("=================================================================================================================");

        Matiere matiere = new Matiere();
        matiere.setIntitule("ACLAB M1 S1");
        matiere.setCodeMatiere("GRPE001");
        matiere.setCreditECTS(2);
        matiere.setDescription("Travail de groupe visant à produire une plus-value technique.");
        matiere.setSemestre(1);
        matiere.setQuotaHeure(32);
        Matiere matiereSaved = matiereRepository.save(matiere);

        matiereSaved.setUes(new HashSet<>());
        matiereSaved.getUes().add(ueTransversalSaved);
        matiereSaved = matiereRepository.save(matiereSaved);
        LOG.debug("=================================================================================================================");
        LOG.debug(matiereSaved.toString());
        LOG.debug("=================================================================================================================");

        Session session = new Session();
        session.setDateHeure( Timestamp.valueOf("2020-10-25 10:00:00.000"));
        session.setDuree(2);
        session.setSalle("RZ242");
        Session sessionSaved = sessionRepository.save(session);
        LOG.debug("=================================================================================================================");
        LOG.debug(sessionSaved.toString());
        LOG.debug("=================================================================================================================");

        Note note = new Note();
        note.setNoteAttribuee(15.0F);
        note.setDate(Date.valueOf("2021-10-25"));
        note.setCoef(2);
        note.setType("QCM");
        Note noteSaved = noteRepository.save(note);
        LOG.debug("=================================================================================================================");
        LOG.debug(noteSaved.toString());
        LOG.debug("=================================================================================================================");

        Inscription inscription = new Inscription();
        inscription.setIdEtudiant(etudiant2saved.getIdPersonne());
        inscription.setIdPromotion(promotionSaved.getIdPromotion());
        inscription.setIdTuteur(tuteurSaved.getIdPersonne());
        inscription.setIdDiplome(diplomeSaved.getIdDiplome());
        Inscription inscriptionSaved = inscriptionRepository.save(inscription);
        LOG.debug("=================================================================================================================");
        LOG.debug(inscriptionSaved.toString());
        LOG.debug("=================================================================================================================");



        LOG.info("Données chargées");
    }
}