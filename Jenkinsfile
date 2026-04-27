pipeline {
    agent any

    environment {
        MONGODB_URI = 'mongodb://localhost:27017/test'
        PORT = '5000'
    }

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
