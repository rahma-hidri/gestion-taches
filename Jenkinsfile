pipeline {
    agent any
    tools {
        jdk 'jdk21'
        maven 'maven3'
    }
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/rahma-hidri/gestion-taches.git'
            }
        }
        stage('Build & Test') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Docker Build') {
            steps {
                sh 'docker build -t gestion-taches:${BUILD_ID} .'
            }
        }
    }
    post {
        success {
            echo 'Pipeline terminé avec succès.'
        }
        failure {
            echo 'Échec de la pipeline.'
        }
    }
}

