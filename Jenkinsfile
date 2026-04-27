pipeline {
    agent any

    stages {
        stage('Clone') {
            steps {
                git 'https://github.com/TeflonSailor/chat-app.git'
            }
        }

        stage('Install Dependencies') {
            steps {
                bat 'echo Installing dependencies...'
                bat 'npm install'
            }
        }

        stage('Build') {
            steps {
                bat 'echo Building project...'
                bat 'npm run build'
            }
        }

        stage('Test') {
            steps {
                bat 'echo Running tests...'
                // Add test command if available
                // bat 'npm test'
            }
        }

        stage('Run') {
            steps {
                bat 'echo Starting application...'
                bat 'npm start'
            }
        }
    }
}
