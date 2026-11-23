# Gestion des Tâches

Application Java Spring Boot de gestion des tâches, intégrée dans une chaîne CI/CD DevSecOps.

## Objectif

Ce projet illustre la mise en place d'une chaîne d'intégration et de déploiement continus (CI/CD) sécurisée :
- versionnement du code avec Git et GitHub ;
- compilation et tests avec Maven ;
- conteneurisation avec Docker ;
- déploiement sur Kubernetes (Minikube) ;
- analyse de qualité avec SonarQube.

## Prérequis

- Java 21
- Maven 3.9+
- Docker
- Minikube
- Jenkins (pour le pipeline CI/CD)
- SonarQube (pour l'analyse de code)


## Exécution locale

```bash
mvn clean package
java -jar target/*.jar

## Auteur
rahma hidri
