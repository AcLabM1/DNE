[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=AcLabM1_DNE-API&metric=alert_status)](https://sonarcloud.io/dashboard?id=AcLabM1_DNE-API)
[![Circle](https://circleci.com/gh/AcLabM1/DNE-API.svg?style=shield)](https://app.circleci.com/pipelines/github/AcLabM1/DNE-API?branch=main)
# DNE
## Installation
### Via Docker
- A chaque évenement sur la branche main une nouvelle image docker est pushée, afin de la récupérer et la lancer vous pouvez utiliser ceci : 

`docker run -it -p 8080:8080  julienm1/aclab-m1s1-dne-back:latest`

### En clonant le repo :
`gh repo clone AcLabM1/DNE-API`

En passant par votre IDE préféré

`mvn spring-boot:run`

## Utilisation

- Un swagger est disponible sur http://localhost:8080/swagger-ui.html et vous permettra de tester chaque endpoint implémenté. Pour des demandes supplémentaires, merci de nous créer des issues.
- La classe `src/main/java/com/aclab/dne/bootstrap/DataLoader.java` permet de charger des données dans la base embarquée, en voici quelques exemples:

|Username|Password|Entité|
|:-:|:-:|:-:|
|nicolas.gouvy@univ-catholille.fr|L@Cath0l1ll€|Responsable Formation|
|julien.dudek@lacatholille.fr|L@Cath0l1ll€|Etudiant|
|morgan.lombard@lacatholille.fr|L@Cath0l1ll€|Etudiant|
|pierre.darcas@lacatholille.fr|L@Cath0l1ll€|Etudiant|
|pierre.2.lefebvre@saboite.com|L@Cath0l1ll€|Tuteur|
|stephanie.BEDIEZ@univ-catholille.fr|L@Cath0l1ll€|Administratif|

- Afin de consulter la BDD vous pouvez vous rendre sur http://localhost:8080/h2-console/ `JDBC URL`: `jdbc:h2:mem:dne' ,'User Name` : `admin` , `Password`: `admin`.

- Un [fichier Insomnia](https://github.com/AcLabM1/DNE-API/tree/main/insomnia) vous permettra de tester les différents services.

## Architecture (Appli et BDD)

### MCD
<img src=https://github.com/AcLabM1/DNE-Documentation/blob/main/mcd_dne.jpg alt="mcd dne">

