pipeline {
    agent any

    environment {
        MONGODB_URI = 'mongodb://localhost:27017/chatapp'
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

        stage('Build Check') {
            steps {
                echo 'Build successful'
            }
        }
    }
}
