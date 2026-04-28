pipeline {

    agent any

    tools {
        maven 'Maven'
        jdk 'Java'
    }

    stages {

        stage('Clone') {
            steps {
                git 'https://github.com/TeflonSailor/chat-app.git'
            }
        }

        stage('Install frontend for chat-app') {
            steps {
                bat '''
                cd client
                npm install
                npm start &
                sleep 20
                '''
            }
        }

        stage('Run Selenium Tests') {
            steps {
                bat 'mvn clean test'
            }
        }

    }

    post {

        always {
            junit 'target/surefire-reports/*.xml'
        }

    }

}
