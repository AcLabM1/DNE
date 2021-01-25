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
    private final MetaMatiereRepository metaMatiereRepository;

    public DataLoader(AdministratifRepository administratifRepository, DiplomeRepository diplomeRepository, EtudiantRepository etudiantRepository, MatiereRepository matiereRepository, PromotionRepository promotionRepository, ResponsableFormationRepository responsableFormationRepository, TuteurRepository tuteurRepository, UeRepository ueRepository, SessionRepository sessionRepository, NoteRepository noteRepository, InscriptionRepository inscriptionRepository, MetaMatiereRepository metaMatiereRepository) {
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
        etudiant2.setEmailUniv("julien.dudek@lacatholille.fr");
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

        Tuteur tuteur = new Tuteur();
        tuteur.setNom("Lefebvreeeee");
        tuteur.setPrenom("Pierrrre");
        tuteur.setEmailPro("pierre.2.lefebvre@saboite.com");
        tuteur.setSociete("Worldline");
        tuteur.setTelephonePro("0320000083");
        tuteur.setUsername(tuteur.getEmailPro());//TODO voir pour la structure de l'username.
        tuteur.setPassword(passwordEncoder.encode("L@Cath0l1ll€"));
        Tuteur tuteurSaved = tuteurRepository.save(tuteur);

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

        Inscription inscription = new Inscription();
        inscription.setIdEtudiant(etudiant2saved.getIdPersonne());
        inscription.setIdPromotion(promotionSaved.getIdPromotion());
        inscription.setIdTuteur(tuteurSaved.getIdPersonne());
        inscription.setIdDiplome(diplomeSaved.getIdDiplome());
        Inscription inscriptionSaved = inscriptionRepository.save(inscription);

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
        noteCyberSecurite1.setDate(Date.valueOf("2020-11-25"));
        noteCyberSecurite1.setCoef(2);
        noteCyberSecurite1.setType("QCM");
        noteCyberSecurite1.setInscription(inscriptionSaved);
        noteCyberSecurite1.setMetaMatiere(metaMatiereCyberSecuriteSaved);
        Note noteCyberSecurite1Saved = noteRepository.save(noteCyberSecurite1);

        Note noteCyberSecurite2 = new Note();
        noteCyberSecurite2.setNoteAttribuee(12.0F);
        noteCyberSecurite2.setDate(Date.valueOf("2020-12-13"));
        noteCyberSecurite2.setCoef(2);
        noteCyberSecurite2.setType("QCM");
        noteCyberSecurite2.setInscription(inscriptionSaved);
        noteCyberSecurite2.setMetaMatiere(metaMatiereCyberSecuriteSaved);
        Note noteCyberSecurite2Saved = noteRepository.save(noteCyberSecurite2);

        Note noteCyberSecurite3 = new Note();
        noteCyberSecurite3.setNoteAttribuee(13.5F);
        noteCyberSecurite3.setDate(Date.valueOf("2021-01-19"));
        noteCyberSecurite3.setCoef(2);
        noteCyberSecurite3.setType("PROJET");
        noteCyberSecurite3.setInscription(inscriptionSaved);
        noteCyberSecurite3.setMetaMatiere(metaMatiereCyberSecuriteSaved);
        Note noteCyberSecurite3Saved = noteRepository.save(noteCyberSecurite3);

        Session session = new Session();
        session.setDateHeure( Timestamp.valueOf("2020-10-25 10:00:00.000"));
        session.setDuree(2);
        session.setSalle("RZ242");
        Session sessionSaved = sessionRepository.save(session);

        LOG.info("Données chargées");
    }
}