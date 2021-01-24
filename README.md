# DNE
Projet Ac'Lab du Master 1 Semestre 1 III de la FGES

Fiche de présentation du projet :

https://univcatholille-my.sharepoint.com/:w:/g/personal/2020615893_lacatholille_fr/EWBPlhodHVNFgqU0OXsbYgUBGPk4Ai5FYFUrO44EmmdQXQ?rtime=egLWmZF52Eg

ConceptBoard :

https://app.conceptboard.com/board/di54-61k5-21gu-qpcr-4yik

# Consigne

# Instalation 
`docker run -it -p 8080:8080  julienm1/aclab-m1s1-dne-back:latest`

# Utilisation

- Un swagger est disponible sur http://localhost:8080/swagger-ui.html
- La classe `src/main/java/com/aclab/dne/bootstrap/DataLoader.java` vous donne des exemples d'identifiant.
- Afin de consulter la BDD vous pouvez vous rendre sur http://localhost:8080/h2-console/ `JDBC URL`: `jdbc:h2:mem:dne' ,'User Name` : `admin` , `Password`: `admin`.

# Architecture (Appli et BDD)

## MCD
<img src=https://github.com/AcLabM1/DNE-Documentation/blob/main/mcd_dne.jpg alt="mcd dne">

