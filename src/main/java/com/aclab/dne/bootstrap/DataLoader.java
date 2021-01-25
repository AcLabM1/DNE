package com.aclab.dne.bootstrap;

import com.aclab.dne.model.*;
import com.aclab.dne.repositories.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashSet;

@Transactional
@Component
public class DataLoader implements CommandLineRunner {

    private static final Logger LOG = LoggerFactory.getLogger(DataLoader.class);

    private PasswordEncoder passwordEncoder;
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

    private final MetaMatiereRepository metaMatiereRepository;
    private final EnseignantRepository enseignantRepository;
    private final PresenceSessionRepository presenceSessionRepository;

    public DataLoader(PasswordEncoder passwordEncoder, AdministratifRepository administratifRepository, DiplomeRepository diplomeRepository, EtudiantRepository etudiantRepository, MatiereRepository matiereRepository, PromotionRepository promotionRepository, ResponsableFormationRepository responsableFormationRepository, TuteurRepository tuteurRepository, UeRepository ueRepository, SessionRepository sessionRepository, NoteRepository noteRepository, InscriptionRepository inscriptionRepository, MetaMatiereRepository metaMatiereRepository, EnseignantRepository enseignantRepository, PresenceSessionRepository presenceSessionRepository) {
        this.passwordEncoder = passwordEncoder;
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
        this.metaMatiereRepository = metaMatiereRepository;
        this.enseignantRepository = enseignantRepository;
        this.presenceSessionRepository = presenceSessionRepository;
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

        Etudiant etudiant2 = new Etudiant();
        etudiant2.setDateNaissance(new GregorianCalendar(1982, Calendar.MARCH, 26).getTime());
        etudiant2.setEmailPersonnel("julien.dudek@unmail.com");
        etudiant2.setEmailUniv("Julien.dudek@lacatholille.fr");
        etudiant2.setNom("Dudek");
        etudiant2.setPrenom("Julien");
        etudiant2.setTelephonePersonnel("0609090231");
        etudiant2.setNumInterneUniv("2020777893L");
        etudiant2.setUsername(etudiant2.getEmailUniv());//TODO voir pour la structure de l'username.
        etudiant2.setPassword(passwordEncoder.encode("L@Cath0l1ll€"));
        Etudiant etudiant2saved = etudiantRepository.save(etudiant2);

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

        Tuteur tuteur1 = new Tuteur();
        tuteur1.setNom("Lefebvreeeee");
        tuteur1.setPrenom("Pierrrre");
        tuteur1.setEmailPro("pierre.2.lefebvre@saboite.com");
        tuteur1.setSociete("Worldline");
        tuteur1.setTelephonePro("0320000083");
        tuteur1.setUsername(tuteur1.getEmailPro());//TODO voir pour la structure de l'username.
        tuteur1.setPassword(passwordEncoder.encode("L@Cath0l1ll€"));
        Tuteur tuteur1Saved = tuteurRepository.save(tuteur1);

        Tuteur tuteur2 = new Tuteur();
        tuteur2.setNom("Doe");
        tuteur2.setPrenom("John");
        tuteur2.setEmailPro("john.doe@mail.com");
        tuteur2.setSociete("Worldline");
        tuteur2.setTelephonePro("0325698745");
        tuteur2.setUsername(tuteur2.getEmailPro());//TODO voir pour la structure de l'username.
        tuteur2.setPassword(passwordEncoder.encode("L@Cath0l1ll€"));
        Tuteur tuteur2Saved = tuteurRepository.save(tuteur2);

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

        Promotion promotion = new Promotion();
        promotion.setAnnee(2020);
        Promotion promotionSaved = promotionRepository.save(promotion);

        Diplome diplome = new Diplome();
        diplome.setIntitule("Master 1 III");
        diplome.setTotalEcts(120);
        diplome.setEstActif(true);
        Diplome diplomeSaved = diplomeRepository.save(diplome);

        promotionSaved.setDiplomes(new HashSet<>());
        promotionSaved.getDiplomes().add(diplomeSaved);
        promotionSaved = promotionRepository.save(promotionSaved);

        Inscription inscriptionEtudiant1 = new Inscription();
        inscriptionEtudiant1.setIdEtudiant(etudiant1saved.getIdPersonne());
        inscriptionEtudiant1.setIdPromotion(promotionSaved.getIdPromotion());
        inscriptionEtudiant1.setIdTuteur(tuteur1Saved.getIdPersonne());
        inscriptionEtudiant1.setIdDiplome(diplomeSaved.getIdDiplome());
        Inscription inscriptionEtudiant1Saved = inscriptionRepository.save(inscriptionEtudiant1);

        Inscription inscriptionEtudiant2 = new Inscription();
        inscriptionEtudiant2.setIdEtudiant(etudiant2saved.getIdPersonne());
        inscriptionEtudiant2.setIdPromotion(promotionSaved.getIdPromotion());
        inscriptionEtudiant2.setIdTuteur(tuteur1Saved.getIdPersonne());
        inscriptionEtudiant2.setIdDiplome(diplomeSaved.getIdDiplome());
        Inscription inscriptionEtudiant2Saved = inscriptionRepository.save(inscriptionEtudiant2);

        Inscription inscriptionEtudiant3 = new Inscription();
        inscriptionEtudiant3.setIdEtudiant(etudiant3saved.getIdPersonne());
        inscriptionEtudiant3.setIdPromotion(promotionSaved.getIdPromotion());
        inscriptionEtudiant3.setIdTuteur(tuteur2Saved.getIdPersonne());
        inscriptionEtudiant3.setIdDiplome(diplomeSaved.getIdDiplome());
        Inscription inscriptionEtudiant3Saved = inscriptionRepository.save(inscriptionEtudiant3);

        Ue ueExpertise = new Ue();
        ueExpertise.setIntitule("Expertise");
        Ue ueExpertiseSaved = ueRepository.save(ueExpertise);

        Ue ueAgileOps = new Ue();
        ueAgileOps.setIntitule("Agile OPS");
        Ue ueAgileOpsSaved = ueRepository.save(ueAgileOps);

        Ue ueTransversal = new Ue();
        ueTransversal.setIntitule("Transversal 1");
        Ue ueTransversalSaved = ueRepository.save(ueTransversal);

        Ue ueFullStack = new Ue();
        ueFullStack.setIntitule("Full Stack");
        Ue ueFullStackSaved = ueRepository.save(ueFullStack);

        diplomeSaved.setUes(new HashSet<>());
        diplomeSaved.getUes().add(ueTransversalSaved);
        diplomeSaved.getUes().add(ueExpertiseSaved);
        diplomeSaved.getUes().add(ueAgileOpsSaved);
        diplomeSaved.getUes().add(ueFullStackSaved);
        diplomeSaved = diplomeRepository.save(diplomeSaved);

        Matiere matiereCyberSecurite = new Matiere();
        matiereCyberSecurite.setIntitule("Cybersécurité M1 S1");
        matiereCyberSecurite.setCodeMatiere("GRPE001");
        matiereCyberSecurite.setCreditECTS(4);
        matiereCyberSecurite.setDescription("Découverte de la sécurité des applications");
        matiereCyberSecurite.setSemestre(1);
        matiereCyberSecurite.setQuotaHeure(32);
        Matiere matiereCyberSecuriteSaved = matiereRepository.save(matiereCyberSecurite);

        Matiere matiereIa = new Matiere();
        matiereIa.setIntitule("Intelligence Artificielle");
        matiereIa.setCodeMatiere("GRPE002");
        matiereIa.setCreditECTS(4);
        matiereIa.setDescription("Découverte de l'Intelligence Artificielle");
        matiereIa.setSemestre(1);
        matiereIa.setQuotaHeure(32);
        Matiere matiereIaSaved = matiereRepository.save(matiereIa);

        ueExpertiseSaved.setMatieres(new HashSet<>());
        ueExpertiseSaved.getMatieres().add(matiereCyberSecuriteSaved);
        ueExpertiseSaved.getMatieres().add(matiereIaSaved);
        ueExpertiseSaved = ueRepository.save(ueExpertiseSaved);

        Matiere matiereDevOps = new Matiere();
        matiereDevOps.setIntitule("DevOps");
        matiereDevOps.setCodeMatiere("GRPE003");
        matiereDevOps.setCreditECTS(3);
        matiereDevOps.setDescription("Mise en place d'un pipeline CI/CD");
        matiereDevOps.setSemestre(1);
        matiereDevOps.setQuotaHeure(20);
        Matiere matiereDevOpsSaved = matiereRepository.save(matiereDevOps);

        Matiere matiereGestionProjetAgile = new Matiere();
        matiereGestionProjetAgile.setIntitule("Gestion de projet Agile");
        matiereGestionProjetAgile.setCodeMatiere("GRPE04");
        matiereGestionProjetAgile.setCreditECTS(2);
        matiereGestionProjetAgile.setDescription("Gestion de projet Agile et framework scrum");
        matiereGestionProjetAgile.setSemestre(1);
        matiereGestionProjetAgile.setQuotaHeure(16);
        Matiere matiereGestionProjetAgileSaved = matiereRepository.save(matiereGestionProjetAgile);

        ueAgileOpsSaved.setMatieres(new HashSet<>());
        ueAgileOpsSaved.getMatieres().add(matiereDevOpsSaved);
        ueAgileOpsSaved.getMatieres().add(matiereGestionProjetAgileSaved);
        ueAgileOpsSaved = ueRepository.save(ueAgileOpsSaved);

        Matiere matiereProgFonctionnelle = new Matiere();
        matiereProgFonctionnelle.setIntitule("Programmation Fonctionnelle 1");
        matiereProgFonctionnelle.setCodeMatiere("GRPE005");
        matiereProgFonctionnelle.setCreditECTS(3);
        matiereProgFonctionnelle.setDescription("Programmation fonctionnelle avec javascript et initiation React");
        matiereProgFonctionnelle.setSemestre(1);
        matiereProgFonctionnelle.setQuotaHeure(24);
        Matiere matiereProgFonctionnelleSaved = matiereRepository.save(matiereProgFonctionnelle);

        Matiere matiereProgParComposant = new Matiere();
        matiereProgParComposant.setIntitule("Programmation par Composant 1");
        matiereProgParComposant.setCodeMatiere("GRPE006");
        matiereProgParComposant.setCreditECTS(2);
        matiereProgParComposant.setDescription("Decouverte du framework Spring Boot");
        matiereProgParComposant.setSemestre(1);
        matiereProgParComposant.setQuotaHeure(32);
        Matiere matiereProgParComposantSaved = matiereRepository.save(matiereProgParComposant);

        Matiere matiereUxDesign = new Matiere();
        matiereUxDesign.setIntitule("UX Design");
        matiereUxDesign.setCodeMatiere("GRPE007");
        matiereUxDesign.setCreditECTS(2);
        matiereUxDesign.setDescription("Decouverte de l'UX Design");
        matiereUxDesign.setSemestre(1);
        matiereUxDesign.setQuotaHeure(32);
        Matiere matiereUxDesignSaved = matiereRepository.save(matiereUxDesign);

        ueFullStackSaved.setMatieres(new HashSet<>());
        ueFullStackSaved.getMatieres().add(matiereProgFonctionnelleSaved);
        ueFullStackSaved.getMatieres().add(matiereProgParComposantSaved);
        ueFullStackSaved.getMatieres().add(matiereUxDesignSaved);
        ueFullStackSaved = ueRepository.save(ueFullStackSaved);

        Matiere matiereAcLab = new Matiere();
        matiereAcLab.setIntitule("ACLAB M1 S1");
        matiereAcLab.setCodeMatiere("GRPE008");
        matiereAcLab.setCreditECTS(2);
        matiereAcLab.setDescription("Travail de groupe visant à produire une plus-value technique.");
        matiereAcLab.setSemestre(1);
        matiereAcLab.setQuotaHeure(32);
        Matiere matiereAcLabSaved = matiereRepository.save(matiereAcLab);

        Matiere matiereDroitDonnees = new Matiere();
        matiereDroitDonnees.setIntitule("Droit et données");
        matiereDroitDonnees.setCodeMatiere("GRPE009");
        matiereDroitDonnees.setCreditECTS(2);
        matiereDroitDonnees.setDescription("Droit du travail et notions de RGPD");
        matiereDroitDonnees.setSemestre(1);
        matiereDroitDonnees.setQuotaHeure(24);
        Matiere matiereDroitDonneesSaved = matiereRepository.save(matiereDroitDonnees);

        Matiere matiereAnglais = new Matiere();
        matiereAnglais.setIntitule("Anglais");
        matiereAnglais.setCodeMatiere("GRPE010");
        matiereAnglais.setCreditECTS(2);
        matiereAnglais.setDescription("Anglais professionnel");
        matiereAnglais.setSemestre(1);
        matiereAnglais.setQuotaHeure(32);
        Matiere matiereAnglaisSaved = matiereRepository.save(matiereAnglais);

        Matiere matiereTechnoEntreprise = new Matiere();
        matiereTechnoEntreprise.setIntitule("Technologie d'entreprise");
        matiereTechnoEntreprise.setCodeMatiere("GRPE011");
        matiereTechnoEntreprise.setCreditECTS(2);
        matiereTechnoEntreprise.setDescription("PluralSight");
        matiereTechnoEntreprise.setSemestre(1);
        matiereTechnoEntreprise.setQuotaHeure(32);
        Matiere matiereTechnoEntrepriseSaved = matiereRepository.save(matiereTechnoEntreprise);

        ueTransversalSaved.setMatieres(new HashSet<>());
        ueTransversalSaved.getMatieres().add(matiereAcLabSaved);
        ueTransversalSaved.getMatieres().add(matiereDroitDonneesSaved);
        ueTransversalSaved.getMatieres().add(matiereAnglaisSaved);
        ueTransversalSaved.getMatieres().add(matiereTechnoEntrepriseSaved);
        ueTransversalSaved = ueRepository.save(ueTransversalSaved);

        MetaMatiere metaMatiereCyberSecurite = new MetaMatiere();
        metaMatiereCyberSecurite.setIdMatiere(matiereCyberSecuriteSaved.getIdMatiere());
        metaMatiereCyberSecurite.setIdDiplome(diplomeSaved.getIdDiplome());
        metaMatiereCyberSecurite.setIdUe(ueExpertise.getIdUe());
        metaMatiereCyberSecurite.setIdPromotion(promotionSaved.getIdPromotion());
        MetaMatiere metaMatiereCyberSecuriteSaved = metaMatiereRepository.save(metaMatiereCyberSecurite);

        MetaMatiere metaMatiereIa = new MetaMatiere();
        metaMatiereIa.setIdMatiere(matiereIaSaved.getIdMatiere());
        metaMatiereIa.setIdDiplome(diplomeSaved.getIdDiplome());
        metaMatiereIa.setIdUe(ueExpertise.getIdUe());
        metaMatiereIa.setIdPromotion(promotionSaved.getIdPromotion());
        MetaMatiere metaMatiereIaSaved = metaMatiereRepository.save(metaMatiereIa);

        MetaMatiere metaMatiereDevOps = new MetaMatiere();
        metaMatiereDevOps.setIdMatiere(matiereDevOpsSaved.getIdMatiere());
        metaMatiereDevOps.setIdDiplome(diplomeSaved.getIdDiplome());
        metaMatiereDevOps.setIdUe(ueAgileOpsSaved.getIdUe());
        metaMatiereDevOps.setIdPromotion(promotionSaved.getIdPromotion());
        MetaMatiere metaMatiereDevOpsSaved = metaMatiereRepository.save(metaMatiereDevOps);

        MetaMatiere metaMatiereGestionProjetAgile = new MetaMatiere();
        metaMatiereGestionProjetAgile.setIdMatiere(matiereGestionProjetAgileSaved.getIdMatiere());
        metaMatiereGestionProjetAgile.setIdDiplome(diplomeSaved.getIdDiplome());
        metaMatiereGestionProjetAgile.setIdUe(ueAgileOpsSaved.getIdUe());
        metaMatiereGestionProjetAgile.setIdPromotion(promotionSaved.getIdPromotion());
        MetaMatiere metaMatiereGestionProjetAgileSaved = metaMatiereRepository.save(metaMatiereGestionProjetAgile);

        MetaMatiere metaMatiereProgFonctionnelle = new MetaMatiere();
        metaMatiereProgFonctionnelle.setIdMatiere(matiereProgFonctionnelleSaved.getIdMatiere());
        metaMatiereProgFonctionnelle.setIdDiplome(diplomeSaved.getIdDiplome());
        metaMatiereProgFonctionnelle.setIdUe(ueFullStackSaved.getIdUe());
        metaMatiereProgFonctionnelle.setIdPromotion(promotionSaved.getIdPromotion());
        MetaMatiere metaMatiereProgFonctionnelleSaved = metaMatiereRepository.save(metaMatiereProgFonctionnelle);

        MetaMatiere metaMatiereProgParComposant = new MetaMatiere();
        metaMatiereProgParComposant.setIdMatiere(matiereProgParComposantSaved.getIdMatiere());
        metaMatiereProgParComposant.setIdDiplome(diplomeSaved.getIdDiplome());
        metaMatiereProgParComposant.setIdUe(ueFullStackSaved.getIdUe());
        metaMatiereProgParComposant.setIdPromotion(promotionSaved.getIdPromotion());
        MetaMatiere metaMatiereProgParComposantSaved = metaMatiereRepository.save(metaMatiereProgParComposant);

        MetaMatiere metaMatiereUxDesign = new MetaMatiere();
        metaMatiereUxDesign.setIdMatiere(matiereUxDesignSaved.getIdMatiere());
        metaMatiereUxDesign.setIdDiplome(diplomeSaved.getIdDiplome());
        metaMatiereUxDesign.setIdUe(ueFullStackSaved.getIdUe());
        metaMatiereUxDesign.setIdPromotion(promotionSaved.getIdPromotion());
        MetaMatiere metaMatiereUxDesignSaved = metaMatiereRepository.save(metaMatiereUxDesign);

        MetaMatiere metaMatiereAcLab = new MetaMatiere();
        metaMatiereAcLab.setIdMatiere(matiereAcLabSaved.getIdMatiere());
        metaMatiereAcLab.setIdDiplome(diplomeSaved.getIdDiplome());
        metaMatiereAcLab.setIdUe(ueTransversalSaved.getIdUe());
        metaMatiereAcLab.setIdPromotion(promotionSaved.getIdPromotion());
        MetaMatiere metaMatiereAcLabSaved = metaMatiereRepository.save(metaMatiereAcLab);

        MetaMatiere metaMatiereDroitDonnees = new MetaMatiere();
        metaMatiereDroitDonnees.setIdMatiere(matiereDroitDonneesSaved.getIdMatiere());
        metaMatiereDroitDonnees.setIdDiplome(diplomeSaved.getIdDiplome());
        metaMatiereDroitDonnees.setIdUe(ueTransversalSaved.getIdUe());
        metaMatiereDroitDonnees.setIdPromotion(promotionSaved.getIdPromotion());
        MetaMatiere metaMatiereDroitDonneesSaved = metaMatiereRepository.save(metaMatiereDroitDonnees);

        MetaMatiere metaMatiereAnglais = new MetaMatiere();
        metaMatiereAnglais.setIdMatiere(matiereAnglaisSaved.getIdMatiere());
        metaMatiereAnglais.setIdDiplome(diplomeSaved.getIdDiplome());
        metaMatiereAnglais.setIdUe(ueTransversalSaved.getIdUe());
        metaMatiereAnglais.setIdPromotion(promotionSaved.getIdPromotion());
        MetaMatiere metaMatiereAnglaisSaved = metaMatiereRepository.save(metaMatiereAnglais);

        MetaMatiere metaMatiereTechnoEntreprise = new MetaMatiere();
        metaMatiereTechnoEntreprise.setIdMatiere(matiereTechnoEntrepriseSaved.getIdMatiere());
        metaMatiereTechnoEntreprise.setIdDiplome(diplomeSaved.getIdDiplome());
        metaMatiereTechnoEntreprise.setIdUe(ueTransversalSaved.getIdUe());
        metaMatiereTechnoEntreprise.setIdPromotion(promotionSaved.getIdPromotion());
        MetaMatiere metaMatiereTechnoEntrepriseSaved = metaMatiereRepository.save(metaMatiereTechnoEntreprise);

        Note noteCyberSecurite1 = new Note();
        noteCyberSecurite1.setNoteAttribuee(15.0F);
        noteCyberSecurite1.setDate(Date.valueOf("2020-11-17"));
        noteCyberSecurite1.setCoef(2);
        noteCyberSecurite1.setType("QCM");
        noteCyberSecurite1.setInscription(inscriptionEtudiant1Saved);
        noteCyberSecurite1.setMetaMatiere(metaMatiereCyberSecuriteSaved);
        Note noteCyberSecurite1Saved = noteRepository.save(noteCyberSecurite1);

        Note noteCyberSecurite2 = new Note();
        noteCyberSecurite2.setNoteAttribuee(16.0F);
        noteCyberSecurite2.setDate(Date.valueOf("2020-12-17"));
        noteCyberSecurite2.setCoef(2);
        noteCyberSecurite2.setType("QCM");
        noteCyberSecurite2.setInscription(inscriptionEtudiant2Saved);
        noteCyberSecurite2.setMetaMatiere(metaMatiereCyberSecuriteSaved);
        Note noteCyberSecurite2Saved = noteRepository.save(noteCyberSecurite2);

        Note noteCyberSecurite3 = new Note();
        noteCyberSecurite3.setNoteAttribuee(13.5F);
        noteCyberSecurite3.setDate(Date.valueOf("2021-01-17"));
        noteCyberSecurite3.setCoef(2);
        noteCyberSecurite3.setType("PROJET");
        noteCyberSecurite3.setInscription(inscriptionEtudiant3Saved);
        noteCyberSecurite3.setMetaMatiere(metaMatiereCyberSecuriteSaved);
        Note noteCyberSecurite3Saved = noteRepository.save(noteCyberSecurite3);

        Note noteIa1 = new Note();
        noteIa1.setNoteAttribuee(13.5F);
        noteIa1.setDate(Date.valueOf("2021-01-11"));
        noteIa1.setCoef(2);
        noteIa1.setType("PROJET");
        noteIa1.setInscription(inscriptionEtudiant1Saved);
        noteIa1.setMetaMatiere(metaMatiereIaSaved);
        Note noteIa1Saved = noteRepository.save(noteIa1);

        Note noteIa2 = new Note();
        noteIa2.setNoteAttribuee(14.5F);
        noteIa2.setDate(Date.valueOf("2021-01-11"));
        noteIa2.setCoef(2);
        noteIa2.setType("PROJET");
        noteIa2.setInscription(inscriptionEtudiant2Saved);
        noteIa2.setMetaMatiere(metaMatiereIaSaved);
        Note noteIa2Saved = noteRepository.save(noteIa2);

        Note noteIa3 = new Note();
        noteIa3.setNoteAttribuee(13.5F);
        noteIa3.setDate(Date.valueOf("2021-01-11"));
        noteIa3.setCoef(2);
        noteIa3.setType("PROJET");
        noteIa3.setInscription(inscriptionEtudiant3Saved);
        noteIa3.setMetaMatiere(metaMatiereIaSaved);
        Note noteIa3Saved = noteRepository.save(noteIa3);

        Note noteDevOps1 = new Note();
        noteDevOps1.setNoteAttribuee(13.5F);
        noteDevOps1.setDate(Date.valueOf("2021-01-11"));
        noteDevOps1.setCoef(2);
        noteDevOps1.setType("PROJET");
        noteDevOps1.setInscription(inscriptionEtudiant1Saved);
        noteDevOps1.setMetaMatiere(metaMatiereDevOpsSaved);
        Note noteDevOps1Saved = noteRepository.save(noteDevOps1);

        Note noteDevOps2 = new Note();
        noteDevOps2.setNoteAttribuee(14.5F);
        noteDevOps2.setDate(Date.valueOf("2021-01-11"));
        noteDevOps2.setCoef(2);
        noteDevOps2.setType("PROJET");
        noteDevOps2.setInscription(inscriptionEtudiant2Saved);
        noteDevOps2.setMetaMatiere(metaMatiereDevOpsSaved);
        Note noteDevOps2Saved = noteRepository.save(noteDevOps2);

        Note noteDevOps3 = new Note();
        noteDevOps3.setNoteAttribuee(13.5F);
        noteDevOps3.setDate(Date.valueOf("2021-01-11"));
        noteDevOps3.setCoef(2);
        noteDevOps3.setType("PROJET");
        noteDevOps3.setInscription(inscriptionEtudiant3Saved);
        noteDevOps3.setMetaMatiere(metaMatiereDevOpsSaved);
        Note noteDevOps3Saved = noteRepository.save(noteDevOps3);

        Note noteGestionProjetAgile1 = new Note();
        noteGestionProjetAgile1.setNoteAttribuee(15.5F);
        noteGestionProjetAgile1.setDate(Date.valueOf("2020-10-04"));
        noteGestionProjetAgile1.setCoef(1);
        noteGestionProjetAgile1.setType("EXPOSE");
        noteGestionProjetAgile1.setInscription(inscriptionEtudiant1Saved);
        noteGestionProjetAgile1.setMetaMatiere(metaMatiereGestionProjetAgileSaved);
        Note noteGestionProjetAgile1Saved = noteRepository.save(noteGestionProjetAgile1);

        Note noteGestionProjetAgile2 = new Note();
        noteGestionProjetAgile2.setNoteAttribuee(12.5F);
        noteGestionProjetAgile2.setDate(Date.valueOf("2020-10-04"));
        noteGestionProjetAgile2.setCoef(1);
        noteGestionProjetAgile2.setType("EXPOSE");
        noteGestionProjetAgile2.setInscription(inscriptionEtudiant2Saved);
        noteGestionProjetAgile2.setMetaMatiere(metaMatiereGestionProjetAgileSaved);
        Note noteGestionProjetAgile2Saved = noteRepository.save(noteGestionProjetAgile2);

        Note noteGestionProjetAgile3 = new Note();
        noteGestionProjetAgile3.setNoteAttribuee(17.0F);
        noteGestionProjetAgile3.setDate(Date.valueOf("2020-10-04"));
        noteGestionProjetAgile3.setCoef(1);
        noteGestionProjetAgile3.setType("EXPOSE");
        noteGestionProjetAgile3.setInscription(inscriptionEtudiant3Saved);
        noteGestionProjetAgile3.setMetaMatiere(metaMatiereGestionProjetAgileSaved);
        Note noteGestionProjetAgile3Saved = noteRepository.save(noteGestionProjetAgile3);

        Note noteProgrammationFonctionnelle1 = new Note();
        noteProgrammationFonctionnelle1.setNoteAttribuee(15.5F);
        noteProgrammationFonctionnelle1.setDate(Date.valueOf("2020-10-04"));
        noteProgrammationFonctionnelle1.setCoef(1);
        noteProgrammationFonctionnelle1.setType("PROJET");
        noteProgrammationFonctionnelle1.setInscription(inscriptionEtudiant1Saved);
        noteProgrammationFonctionnelle1.setMetaMatiere(metaMatiereProgFonctionnelleSaved);
        Note noteProgrammationFonctionnelle1Saved = noteRepository.save(noteProgrammationFonctionnelle1);

        Note noteProgrammationFonctionnelle2 = new Note();
        noteProgrammationFonctionnelle2.setNoteAttribuee(12.5F);
        noteProgrammationFonctionnelle2.setDate(Date.valueOf("2020-10-04"));
        noteProgrammationFonctionnelle2.setCoef(1);
        noteProgrammationFonctionnelle2.setType("PROJET");
        noteProgrammationFonctionnelle2.setInscription(inscriptionEtudiant2Saved);
        noteProgrammationFonctionnelle2.setMetaMatiere(metaMatiereProgFonctionnelleSaved);
        Note noteProgrammationFonctionnelle2Saved = noteRepository.save(noteProgrammationFonctionnelle2);

        Note noteProgrammationFonctionnelle3 = new Note();
        noteProgrammationFonctionnelle3.setNoteAttribuee(17.0F);
        noteProgrammationFonctionnelle3.setDate(Date.valueOf("2020-10-04"));
        noteProgrammationFonctionnelle3.setCoef(1);
        noteProgrammationFonctionnelle3.setType("PROJET");
        noteProgrammationFonctionnelle3.setInscription(inscriptionEtudiant3Saved);
        noteProgrammationFonctionnelle3.setMetaMatiere(metaMatiereProgFonctionnelleSaved);
        Note noteProgrammationFonctionnelle3Saved = noteRepository.save(noteProgrammationFonctionnelle3);

        Note noteProgParComposant1 = new Note();
        noteProgParComposant1.setNoteAttribuee(15.5F);
        noteProgParComposant1.setDate(Date.valueOf("2020-12-19"));
        noteProgParComposant1.setCoef(1);
        noteProgParComposant1.setType("PROJET");
        noteProgParComposant1.setInscription(inscriptionEtudiant1Saved);
        noteProgParComposant1.setMetaMatiere(metaMatiereProgParComposantSaved);
        Note noteProgParComposant1Saved = noteRepository.save(noteProgParComposant1);

        Note noteProgParComposant2 = new Note();
        noteProgParComposant2.setNoteAttribuee(12.5F);
        noteProgParComposant2.setDate(Date.valueOf("2020-12-19"));
        noteProgParComposant2.setCoef(1);
        noteProgParComposant2.setType("PROJET");
        noteProgParComposant2.setInscription(inscriptionEtudiant2Saved);
        noteProgParComposant2.setMetaMatiere(metaMatiereProgParComposantSaved);
        Note noteProgParComposant2Saved = noteRepository.save(noteProgParComposant2);

        Note noteProgParComposant3 = new Note();
        noteProgParComposant3.setNoteAttribuee(17.0F);
        noteProgParComposant3.setDate(Date.valueOf("2020-12-19"));
        noteProgParComposant3.setCoef(1);
        noteProgParComposant3.setType("PROJET");
        noteProgParComposant3.setInscription(inscriptionEtudiant3Saved);
        noteProgParComposant3.setMetaMatiere(metaMatiereProgParComposantSaved);
        Note noteProgParComposant3Saved = noteRepository.save(noteProgParComposant3);

        Note noteUxDesign1 = new Note();
        noteUxDesign1.setNoteAttribuee(15.5F);
        noteUxDesign1.setDate(Date.valueOf("2020-12-19"));
        noteUxDesign1.setCoef(1);
        noteUxDesign1.setType("PROJET");
        noteUxDesign1.setInscription(inscriptionEtudiant1Saved);
        noteUxDesign1.setMetaMatiere(metaMatiereUxDesignSaved);
        Note noteUxDesign1Saved = noteRepository.save(noteUxDesign1);

        Note noteUxDesign2 = new Note();
        noteUxDesign2.setNoteAttribuee(12.5F);
        noteUxDesign2.setDate(Date.valueOf("2020-12-19"));
        noteUxDesign2.setCoef(1);
        noteUxDesign2.setType("PROJET");
        noteUxDesign2.setInscription(inscriptionEtudiant2Saved);
        noteUxDesign2.setMetaMatiere(metaMatiereUxDesignSaved);
        Note noteUxDesign2Saved = noteRepository.save(noteUxDesign2);

        Note noteUxDesign3 = new Note();
        noteUxDesign3.setNoteAttribuee(17.0F);
        noteUxDesign3.setDate(Date.valueOf("2020-12-19"));
        noteUxDesign3.setCoef(1);
        noteUxDesign3.setType("PROJET");
        noteUxDesign3.setInscription(inscriptionEtudiant3Saved);
        noteUxDesign3.setMetaMatiere(metaMatiereUxDesignSaved);
        Note noteUxDesign3Saved = noteRepository.save(noteUxDesign3);

        Note noteAcLab1 = new Note();
        noteAcLab1.setNoteAttribuee(20.0F);
        noteAcLab1.setDate(Date.valueOf("2021-01-26"));
        noteAcLab1.setCoef(1);
        noteAcLab1.setType("PROJET");
        noteAcLab1.setInscription(inscriptionEtudiant1Saved);
        noteAcLab1.setMetaMatiere(metaMatiereAcLabSaved);
        Note noteAcLab1Saved = noteRepository.save(noteAcLab1);

        Note noteAcLab2 = new Note();
        noteAcLab2.setNoteAttribuee(20.0F);
        noteAcLab2.setDate(Date.valueOf("2021-01-26"));
        noteAcLab2.setCoef(1);
        noteAcLab2.setType("PROJET");
        noteAcLab2.setInscription(inscriptionEtudiant2Saved);
        noteAcLab2.setMetaMatiere(metaMatiereAcLabSaved);
        Note noteAcLab2Saved = noteRepository.save(noteAcLab2);

        Note noteAcLab3 = new Note();
        noteAcLab3.setNoteAttribuee(20.0F);
        noteAcLab3.setDate(Date.valueOf("2021-01-26"));
        noteAcLab3.setCoef(1);
        noteAcLab3.setType("PROJET");
        noteAcLab3.setInscription(inscriptionEtudiant3Saved);
        noteAcLab3.setMetaMatiere(metaMatiereAcLabSaved);
        Note noteAcLab3Saved = noteRepository.save(noteAcLab3);

        Note noteDroitDonnees1 = new Note();
        noteDroitDonnees1.setNoteAttribuee(14.0F);
        noteDroitDonnees1.setDate(Date.valueOf("2021-01-26"));
        noteDroitDonnees1.setCoef(1);
        noteDroitDonnees1.setType("PROJET");
        noteDroitDonnees1.setInscription(inscriptionEtudiant1Saved);
        noteDroitDonnees1.setMetaMatiere(metaMatiereDroitDonneesSaved);
        Note noteDroitDonnees1Saved = noteRepository.save(noteDroitDonnees1);

        Note noteDroitDonnees2 = new Note();
        noteDroitDonnees2.setNoteAttribuee(13.0F);
        noteDroitDonnees2.setDate(Date.valueOf("2021-01-26"));
        noteDroitDonnees2.setCoef(1);
        noteDroitDonnees2.setType("PROJET");
        noteDroitDonnees2.setInscription(inscriptionEtudiant2Saved);
        noteDroitDonnees2.setMetaMatiere(metaMatiereDroitDonneesSaved);
        Note noteDroitDonnees2Saved = noteRepository.save(noteDroitDonnees2);

        Note noteDroitDonnees3 = new Note();
        noteDroitDonnees3.setNoteAttribuee(12.0F);
        noteDroitDonnees3.setDate(Date.valueOf("2021-01-26"));
        noteDroitDonnees3.setCoef(1);
        noteDroitDonnees3.setType("PROJET");
        noteDroitDonnees3.setInscription(inscriptionEtudiant3Saved);
        noteDroitDonnees3.setMetaMatiere(metaMatiereDroitDonneesSaved);
        Note noteDroitDonnees3Saved = noteRepository.save(noteDroitDonnees3);

        Note noteAnglais1 = new Note();
        noteAnglais1.setNoteAttribuee(14.0F);
        noteAnglais1.setDate(Date.valueOf("2021-01-26"));
        noteAnglais1.setCoef(1);
        noteAnglais1.setType("EXAM");
        noteAnglais1.setInscription(inscriptionEtudiant1Saved);
        noteAnglais1.setMetaMatiere(metaMatiereAnglaisSaved);
        Note noteAnglais1Saved = noteRepository.save(noteAnglais1);

        Note noteAnglais2 = new Note();
        noteAnglais2.setNoteAttribuee(13.0F);
        noteAnglais2.setDate(Date.valueOf("2021-01-26"));
        noteAnglais2.setCoef(1);
        noteAnglais2.setType("EXAM");
        noteAnglais2.setInscription(inscriptionEtudiant2Saved);
        noteAnglais2.setMetaMatiere(metaMatiereAnglaisSaved);
        Note noteAnglais2Saved = noteRepository.save(noteAnglais2);

        Note noteAnglais3 = new Note();
        noteAnglais3.setNoteAttribuee(12.0F);
        noteAnglais3.setDate(Date.valueOf("2021-01-26"));
        noteAnglais3.setCoef(1);
        noteAnglais3.setType("EXAM");
        noteAnglais3.setInscription(inscriptionEtudiant3Saved);
        noteAnglais3.setMetaMatiere(metaMatiereAnglaisSaved);
        Note noteAnglais3Saved = noteRepository.save(noteAnglais3);

        Note noteTechnoEntreprise1 = new Note();
        noteTechnoEntreprise1.setNoteAttribuee(14.0F);
        noteTechnoEntreprise1.setDate(Date.valueOf("2021-01-26"));
        noteTechnoEntreprise1.setCoef(1);
        noteTechnoEntreprise1.setType("EXAM");
        noteTechnoEntreprise1.setInscription(inscriptionEtudiant1Saved);
        noteTechnoEntreprise1.setMetaMatiere(metaMatiereTechnoEntrepriseSaved);
        Note noteTechnoEntreprise1Saved = noteRepository.save(noteTechnoEntreprise1);

        Note noteTechnoEntreprise2 = new Note();
        noteTechnoEntreprise2.setNoteAttribuee(13.0F);
        noteTechnoEntreprise2.setDate(Date.valueOf("2021-01-26"));
        noteTechnoEntreprise2.setCoef(1);
        noteTechnoEntreprise2.setType("EXAM");
        noteTechnoEntreprise2.setInscription(inscriptionEtudiant2Saved);
        noteTechnoEntreprise2.setMetaMatiere(metaMatiereTechnoEntrepriseSaved);
        Note noteTechnoEntreprise2Saved = noteRepository.save(noteTechnoEntreprise2);

        Note noteTechnoEntreprise3 = new Note();
        noteTechnoEntreprise3.setNoteAttribuee(12.0F);
        noteTechnoEntreprise3.setDate(Date.valueOf("2021-01-26"));
        noteTechnoEntreprise3.setCoef(1);
        noteTechnoEntreprise3.setType("EXAM");
        noteTechnoEntreprise3.setInscription(inscriptionEtudiant3Saved);
        noteTechnoEntreprise3.setMetaMatiere(metaMatiereTechnoEntrepriseSaved);
        Note noteTechnoEntreprise3Saved = noteRepository.save(noteTechnoEntreprise3);

        Enseignant enseignantCyberSecurite = new Enseignant();
        enseignantCyberSecurite.setNom("Sierra");
        enseignantCyberSecurite.setPrenom("Loris");
        enseignantCyberSecurite.setEstVacataire(true);
        enseignantCyberSecurite.setTelephone("0123654789");
        enseignantCyberSecurite.setEmailUniv("loris.sierra@lacatholille.fr");
        enseignantCyberSecurite.setNumInterneUniv("123456789");
        enseignantCyberSecurite.setMatieres(new HashSet<>());
        enseignantCyberSecurite.setUsername(enseignantCyberSecurite.getEmailUniv());
        enseignantCyberSecurite.setPassword(passwordEncoder.encode("L@Cath0l1ll€"));
        enseignantCyberSecurite.getMatieres().add(metaMatiereCyberSecuriteSaved);
        Enseignant enseignantCyberSecuriteSaved = enseignantRepository.save(enseignantCyberSecurite);

        Enseignant enseignantIa = new Enseignant();
        enseignantIa.setNom("Jacques");
        enseignantIa.setPrenom("Julie");
        enseignantIa.setEstVacataire(true);
        enseignantIa.setTelephone("0123654789");
        enseignantIa.setEmailUniv("julie.jacques@lacatholille.fr");
        enseignantIa.setNumInterneUniv("123456789");
        enseignantIa.setMatieres(new HashSet<>());
        enseignantIa.getMatieres().add(metaMatiereIaSaved);
        enseignantIa.setUsername(enseignantIa.getEmailUniv());
        enseignantIa.setPassword(passwordEncoder.encode("L@Cath0l1ll€"));
        Enseignant enseignantIaSaved = enseignantRepository.save(enseignantIa);

        Enseignant enseignantDevOps = new Enseignant();
        enseignantDevOps.setNom("Beaussart");
        enseignantDevOps.setPrenom("Nicolas");
        enseignantDevOps.setEstVacataire(true);
        enseignantDevOps.setTelephone("0123654789");
        enseignantDevOps.setEmailUniv("nicolas.beaussart@lacatholille.fr");
        enseignantDevOps.setNumInterneUniv("123456789");
        enseignantDevOps.setMatieres(new HashSet<>());
        enseignantDevOps.getMatieres().add(metaMatiereDevOpsSaved);
        enseignantDevOps.setUsername(enseignantDevOps.getEmailUniv());
        enseignantDevOps.setPassword(passwordEncoder.encode("L@Cath0l1ll€"));
        Enseignant enseignantDevOpsSaved = enseignantRepository.save(enseignantDevOps);

        Enseignant enseignantGestionProjetAgile = new Enseignant();
        enseignantGestionProjetAgile.setNom("Tondeur");
        enseignantGestionProjetAgile.setPrenom("Nicolas");
        enseignantGestionProjetAgile.setEstVacataire(true);
        enseignantGestionProjetAgile.setTelephone("0123654789");
        enseignantGestionProjetAgile.setEmailUniv("nicolas.tondeur@lacatholille.fr");
        enseignantGestionProjetAgile.setNumInterneUniv("123456789");
        enseignantGestionProjetAgile.setMatieres(new HashSet<>());
        enseignantGestionProjetAgile.getMatieres().add(metaMatiereDroitDonneesSaved);
        enseignantGestionProjetAgile.setPassword(passwordEncoder.encode("L@Cath0l1ll€"));
        enseignantGestionProjetAgile.setUsername(enseignantGestionProjetAgile.getEmailUniv());
        Enseignant enseignantGestionProjetAgileSaved = enseignantRepository.save(enseignantGestionProjetAgile);

        Enseignant enseignantProgFonctionnelle = new Enseignant();
        enseignantProgFonctionnelle.setNom("Samuel");
        enseignantProgFonctionnelle.setPrenom("Gomez");
        enseignantProgFonctionnelle.setEstVacataire(true);
        enseignantProgFonctionnelle.setTelephone("0123654789");
        enseignantProgFonctionnelle.setEmailUniv("samuel.gomez@lacatholille.fr");
        enseignantProgFonctionnelle.setNumInterneUniv("123456789");
        enseignantProgFonctionnelle.setMatieres(new HashSet<>());
        enseignantProgFonctionnelle.getMatieres().add(metaMatiereProgFonctionnelleSaved);
        enseignantProgFonctionnelle.setPassword(passwordEncoder.encode("L@Cath0l1ll€"));
        enseignantProgFonctionnelle.setUsername(enseignantProgFonctionnelle.getEmailUniv());
        Enseignant enseignantProgFonctionnelleSaved = enseignantRepository.save(enseignantProgFonctionnelle);

        Enseignant enseignantProgParComposant = new Enseignant();
        enseignantProgParComposant.setNom("Six");
        enseignantProgParComposant.setPrenom("Douglas");
        enseignantProgParComposant.setEstVacataire(true);
        enseignantProgParComposant.setTelephone("0123654789");
        enseignantProgParComposant.setEmailUniv("douglas.six@lacatholille.fr");
        enseignantProgParComposant.setNumInterneUniv("123456789");
        enseignantProgParComposant.setMatieres(new HashSet<>());
        enseignantProgParComposant.getMatieres().add(metaMatiereProgParComposantSaved);
        enseignantProgParComposant.setPassword(passwordEncoder.encode("L@Cath0l1ll€"));
        enseignantProgParComposant.setUsername(enseignantProgParComposant.getEmailUniv());
        Enseignant enseignantProgParComposantSaved = enseignantRepository.save(enseignantProgParComposant);

        Enseignant enseignantUxDesign = new Enseignant();
        enseignantUxDesign.setNom("Polito");
        enseignantUxDesign.setPrenom("Gianni");
        enseignantUxDesign.setEstVacataire(true);
        enseignantUxDesign.setTelephone("0123654789");
        enseignantUxDesign.setEmailUniv("gianni.polito@lacatholille.fr");
        enseignantUxDesign.setNumInterneUniv("123456789");
        enseignantUxDesign.setMatieres(new HashSet<>());
        enseignantUxDesign.getMatieres().add(metaMatiereUxDesignSaved);
        enseignantUxDesign.setPassword(passwordEncoder.encode("L@Cath0l1ll€"));
        enseignantUxDesign.setUsername(enseignantUxDesign.getEmailUniv());
        Enseignant enseignantUxDesignSaved = enseignantRepository.save(enseignantUxDesign);

        Enseignant enseignantDroitDonnees = new Enseignant();
        enseignantDroitDonnees.setNom("Nicholls");
        enseignantDroitDonnees.setPrenom("Christian");
        enseignantDroitDonnees.setEstVacataire(true);
        enseignantDroitDonnees.setTelephone("0123654789");
        enseignantDroitDonnees.setEmailUniv("christian.nicholls@lacatholille.fr");
        enseignantDroitDonnees.setNumInterneUniv("123456789");
        enseignantDroitDonnees.setMatieres(new HashSet<>());
        enseignantDroitDonnees.getMatieres().add(metaMatiereDroitDonneesSaved);
        enseignantDroitDonnees.setPassword(passwordEncoder.encode("L@Cath0l1ll€"));
        enseignantDroitDonnees.setUsername(enseignantDroitDonnees.getEmailUniv());
        Enseignant enseignantDroitDonneesSaved = enseignantRepository.save(enseignantDroitDonnees);

        Enseignant enseignantAnglais1 = new Enseignant();
        enseignantAnglais1.setNom("Ciubaciuc");
        enseignantAnglais1.setPrenom("Diana");
        enseignantAnglais1.setEstVacataire(true);
        enseignantAnglais1.setTelephone("0123654789");
        enseignantAnglais1.setEmailUniv("diana.ciubaciuc@lacatholille.fr");
        enseignantAnglais1.setNumInterneUniv("123456789");
        enseignantAnglais1.setMatieres(new HashSet<>());
        enseignantAnglais1.getMatieres().add(metaMatiereAnglaisSaved);
        enseignantAnglais1.setPassword(passwordEncoder.encode("L@Cath0l1ll€"));
        enseignantAnglais1.setUsername(enseignantAnglais1.getEmailUniv());
        Enseignant enseignantAnglais1Saved = enseignantRepository.save(enseignantAnglais1);

        Enseignant enseignantAnglais2 = new Enseignant();
        enseignantAnglais2.setNom("Tapscott");
        enseignantAnglais2.setPrenom("benjamin");
        enseignantAnglais2.setEstVacataire(true);
        enseignantAnglais2.setTelephone("0123654789");
        enseignantAnglais2.setEmailUniv("benjamin.tapscott@lacatholille.fr");
        enseignantAnglais2.setNumInterneUniv("123456789");
        enseignantAnglais2.setMatieres(new HashSet<>());
        enseignantAnglais2.getMatieres().add(metaMatiereAnglaisSaved);
        enseignantAnglais2.setPassword(passwordEncoder.encode("L@Cath0l1ll€"));
        enseignantAnglais2.setUsername(enseignantAnglais2.getEmailUniv());
        Enseignant enseignantAnglais2Saved = enseignantRepository.save(enseignantAnglais2);

        responsableSaved.setMatieres(new HashSet<>());
        responsableSaved.getMatieres().add(metaMatiereAcLabSaved);
        responsableSaved.getMatieres().add(metaMatiereTechnoEntrepriseSaved);
        responsableSaved = responsableFormationRepository.save(responsableSaved);

        Session sessionCyberSecurite1 = new Session();
        sessionCyberSecurite1.setDateHeure( Timestamp.valueOf("2020-10-25 10:00:00.000"));
        sessionCyberSecurite1.setDuree(2);
        sessionCyberSecurite1.setSalle("RZ242");
        sessionCyberSecurite1.setEnseignants(new HashSet<>());
        sessionCyberSecurite1.getEnseignants().add(enseignantCyberSecuriteSaved);
        sessionCyberSecurite1.setMetaMatiere(metaMatiereCyberSecuriteSaved);
        Session sessionCyberSecurite1Saved = sessionRepository.save(sessionCyberSecurite1);

        Session sessionCyberSecurite2 = new Session();
        sessionCyberSecurite2.setDateHeure( Timestamp.valueOf("2020-11-13 10:00:00.000"));
        sessionCyberSecurite2.setDuree(2);
        sessionCyberSecurite2.setSalle("RZ242");
        sessionCyberSecurite2.setEnseignants(new HashSet<>());
        sessionCyberSecurite2.getEnseignants().add(enseignantCyberSecuriteSaved);
        sessionCyberSecurite2.setMetaMatiere(metaMatiereCyberSecuriteSaved);
        Session sessionCyberSecurite2Saved = sessionRepository.save(sessionCyberSecurite2);

        Session sessionCyberSecurite3 = new Session();
        sessionCyberSecurite3.setDateHeure( Timestamp.valueOf("2020-12-17 10:00:00.000"));
        sessionCyberSecurite3.setDuree(2);
        sessionCyberSecurite3.setSalle("RZ242");
        sessionCyberSecurite3.setEnseignants(new HashSet<>());
        sessionCyberSecurite3.getEnseignants().add(enseignantCyberSecuriteSaved);
        sessionCyberSecurite3.setMetaMatiere(metaMatiereCyberSecuriteSaved);
        Session sessionCyberSecurite3Saved = sessionRepository.save(sessionCyberSecurite3);

        PresenceSession presenceSession1Etudiant1 = new PresenceSession();
        presenceSession1Etudiant1.setIdSession(sessionCyberSecurite1Saved.getIdSession());
        presenceSession1Etudiant1.setIdEtudiant(etudiant1saved.getIdPersonne());
        presenceSession1Etudiant1.setPresent(true);
        PresenceSession presenceSession1Etudiant1Saved = presenceSessionRepository.save(presenceSession1Etudiant1);

        PresenceSession presenceSession2Etudiant1 = new PresenceSession();
        presenceSession2Etudiant1.setIdSession(sessionCyberSecurite2Saved.getIdSession());
        presenceSession2Etudiant1.setIdEtudiant(etudiant1saved.getIdPersonne());
        presenceSession2Etudiant1.setPresent(true);
        PresenceSession presenceSession2Etudiant1Saved = presenceSessionRepository.save(presenceSession2Etudiant1);

        PresenceSession presenceSession3Etudiant1 = new PresenceSession();
        presenceSession3Etudiant1.setIdSession(sessionCyberSecurite3Saved.getIdSession());
        presenceSession3Etudiant1.setIdEtudiant(etudiant1saved.getIdPersonne());
        presenceSession3Etudiant1.setPresent(true);
        PresenceSession presenceSession3Etudiant1Saved = presenceSessionRepository.save(presenceSession3Etudiant1);

        PresenceSession presenceSession1Etudiant2 = new PresenceSession();
        presenceSession1Etudiant2.setIdSession(sessionCyberSecurite1Saved.getIdSession());
        presenceSession1Etudiant2.setIdEtudiant(etudiant2saved.getIdPersonne());
        presenceSession1Etudiant2.setPresent(true);
        PresenceSession presenceSession1Etudiant2Saved = presenceSessionRepository.save(presenceSession1Etudiant2);

        PresenceSession presenceSession2Etudiant2 = new PresenceSession();
        presenceSession2Etudiant2.setIdSession(sessionCyberSecurite2Saved.getIdSession());
        presenceSession2Etudiant2.setIdEtudiant(etudiant2saved.getIdPersonne());
        presenceSession2Etudiant2.setPresent(false);
        PresenceSession presenceSession2Etudiant2Saved = presenceSessionRepository.save(presenceSession2Etudiant2);

        PresenceSession presenceSession3Etudiant2 = new PresenceSession();
        presenceSession3Etudiant2.setIdSession(sessionCyberSecurite3Saved.getIdSession());
        presenceSession3Etudiant2.setIdEtudiant(etudiant2saved.getIdPersonne());
        presenceSession3Etudiant2.setPresent(true);
        PresenceSession presenceSession3Etudiant2Saved = presenceSessionRepository.save(presenceSession3Etudiant2);

        PresenceSession presenceSession1Etudiant3 = new PresenceSession();
        presenceSession1Etudiant3.setIdSession(sessionCyberSecurite1Saved.getIdSession());
        presenceSession1Etudiant3.setIdEtudiant(etudiant3saved.getIdPersonne());
        presenceSession1Etudiant3.setPresent(false);
        PresenceSession presenceSession1Etudiant3Saved = presenceSessionRepository.save(presenceSession1Etudiant3);

        PresenceSession presenceSession2Etudiant3 = new PresenceSession();
        presenceSession2Etudiant3.setIdSession(sessionCyberSecurite2Saved.getIdSession());
        presenceSession2Etudiant3.setIdEtudiant(etudiant3saved.getIdPersonne());
        presenceSession2Etudiant3.setPresent(true);
        PresenceSession presenceSession2Etudiant3Saved = presenceSessionRepository.save(presenceSession2Etudiant3);

        PresenceSession presenceSession3Etudiant3 = new PresenceSession();
        presenceSession3Etudiant3.setIdSession(sessionCyberSecurite3Saved.getIdSession());
        presenceSession3Etudiant3.setIdEtudiant(etudiant3saved.getIdPersonne());
        presenceSession3Etudiant3.setPresent(true);
        PresenceSession presenceSession3Etudiant3Saved = presenceSessionRepository.save(presenceSession3Etudiant3);

        LOG.info("Données chargées");
    }

}