pipeline {
    agent any

    stages {
        stage('Install Backend') {
            steps {
                dir('backend') {
                    bat 'npm install'
                }
            }
        }

        stage('Run App') {
            steps {
                bat 'npm start'
            }
        }
    }
}
