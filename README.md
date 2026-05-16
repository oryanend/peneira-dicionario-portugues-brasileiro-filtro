<h1 align="center"><a href="https://dicionario-portugues-brasileiro-filtro.onrender.com" target="_blank">Dicionário Filtro | PT-BR</a></h1>

<p align='center'> 
    <img src="https://img.shields.io/badge/Spring_Boot-F2F4F9?style=for-the-badge&logo=spring-boot"/>
    <img src="https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white"/>
</p>

## 🔍 Visão Geral

Essa **API** tem como objetivo fornecer palavras do **dicionário da língua portuguesa (Brasil)**, permitindo que o usuário defina **filtros**, como a **quantidade de palavras** a serem retornadas e o **número máximo de letras** que cada palavra deve possuir.

## Índice

- 🌎 [Endpoints](#-endpoints)
- 💻 [Tecnologias utilizadas](#-tecnologias-utilizadas)
- 👥 [Autor](#-autor)

## 🌎 Endpoints

Os endpoints não são muito complexos, sendo eles:

### Visão geral

| Endpoint                             | Visão geral                                                                 |
| ------------------------------------ | ---------------------------------------------------------------------------- |
| **GET** `/api/v1/words`                     | Retorna uma palavra aleatória                                               |
| **GET** `/api/v1/words?charSize=x`          | Retorna uma palavra aleatória contendo `x` caracteres                        |
| **GET** `/api/v1/words?minChar=x`           | Retorna uma palavra aleatória contendo no mínimo `x` caracteres            |
| **GET** `/api/v1/words?maxChar=x`           | Retorna uma palavra aleatória contendo no máximo `x` caracteres             |
| **GET** `/api/v1/words?minChar=x&minChar=y` | Retorna uma palavra aleatória cujo tamanho esteja entre `x` e `y` caracteres |
| **GET** `/api/v1/status` | Retorna os status do sistema |

## 💻 Tecnologias utilizadas

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white) ![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white) ![IntelliJ IDEA](https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white) ![Apache Maven](https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white) ![Postman](https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white) ![Postgresql](https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white) ![Node](https://img.shields.io/badge/Node%20js-339933?style=for-the-badge&logo=nodedotjs&logoColor=white) ![NPM](https://img.shields.io/badge/npm-CB3837?style=for-the-badge&logo=npm&logoColor=white) ![CommitLint](https://img.shields.io/badge/commitlint-white?style=for-the-badge&logo=commitlint&logoColor=3c3c43) ![Render](https://img.shields.io/badge/Render-46E3B7?style=for-the-badge&logo=render&logoColor=white) ![SonarQube](https://img.shields.io/badge/Sonarqube-5190cf?style=for-the-badge&logo=sonarqube&logoColor=white)

# 👥 Autor

| [Ryan Oliveira](https://github.com/oryanend) |
| :------------------------------------------: |

