package com.aclab.dne.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {



    @Bean
    public Docket authTokenSecuredApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.aclab.dne.controllers"))
                .paths(PathSelectors.any())
                .build()
                .tags(new Tag(ADMINISTRATIF,"Opérations possibles avec le personnel Administratif."))
                .tags(new Tag(DIPLOME,"Opérations autour des diplômes."))
                .tags(new Tag(EMPLOYE,"Opérations autour des employé(e)s."))
                .tags(new Tag(ENSEIGNANT,"Opérations possibles avec le personnel Enseignant."))
                .tags(new Tag(ETUDIANT,"Autour des étudiants."))
                .tags(new Tag(INTERNEUNIV,"Les internes à l'université."))
                .tags(new Tag(MATIERE,"Tout ce qui concerne les matières."))
                .tags(new Tag(NOTE,"Les notes, bonnnes ou moins bonnes sont par ici."))
                .tags(new Tag(PROMOTION,"Gestion des promotions ..les années passent."))
                .tags(new Tag(RESPONSABLE,"La place du BIG BOSS : tout sur le responsable."))
                .tags(new Tag(SESSION,"Les sessions de cours sont gérées ici."))
                .tags(new Tag(TUTEUR,"Sans tuteur l'étudiant ne pourrait pas être alternant."))
                .tags(new Tag(UE,"Les matières se regroupent en UE et les UE sont ici!"))
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("Dossier Numérique Étudiant")
                .description("<h2>ACLAB - M1 III - S1</h2>"+
                        "<h3>POC Application de gestion du Dossier Numérique Étudiant</h3>"+
                        "<a href=\"mailto:julien.dudek@lacatholille.fr\">Julien Dudek</a></br>" +
                        "<a href=\"mailto:pierre.darcas@lacatholille.fr\">Pierre Darcas</a></br>" +
                        "<a href=\"mailto:morgan.lombard@lacatholille.fr\">Morgan Lombard</a></br>"+
                        "<div>Parie Front effectué par :</div>"+
                        "<a href=\"mailto:gianni.giudice@lacatholille.fr\">Gianni Giudice</a></br>"+
                        "<a href=\"mailto:gautier.couture@lacatholille.fr\">Gautier Couture</a></br>"+
                        "<a href=\"mailto:tristan.coussaert@lacatholille.fr\">Tristant Coussaert</a></br>"
                        )
                .version(version).build();
    }

    @Value("${project.version}")
    private String version;
    public static final String ADMINISTRATIF = "Administratif controller";
    public static final String DIPLOME = "Diplome Controller";
    public static final String EMPLOYE = "Employe Controller";
    public static final String ENSEIGNANT = "Enseignant Controller";
    public static final String ETUDIANT = "Etudiant Controller";
    public static final String INTERNEUNIV = "Interne univ' Controller";
    public static final String MATIERE = "Matière Conroller";
    public static final String NOTE = "Note Controller";
    public static final String PROMOTION = "Promotion Controller";
    public static final String RESPONSABLE = "Responsable Controller";
    public static final String SESSION = "Session Controller";
    public static final String TUTEUR = "Tuteur Controller";
    public static final String UE = "UE Controller";
}