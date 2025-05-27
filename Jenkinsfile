pipeline {
    agent any

    tools {
        jdk 'jdk-17'       // Your configured JDK name in Jenkins
        maven 'Maven'     // Your configured Maven name in Jenkins
    }

    stages {
        stage('Checkout') {
            steps {
                // Change this URL to your Maven project repo
                git branch: 'main', url: 'https://github.com/SupritaJogin/MaventoGradle.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                // Usually tests run as part of mvn install, but if you want separate test phase:
                bat 'mvn test'
            }
        }

        stage('Run Application') {
            steps {
                // If your Maven project has a run goal, otherwise adjust accordingly
                bat 'mvn exec:java'
            }
        }
    }

    post {
        success {
            echo 'Build and deployment successful!'
        }
        failure {
            echo 'Build failed!'
        }
    }
}