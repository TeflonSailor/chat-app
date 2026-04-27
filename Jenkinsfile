pipeline {
    agent any

    stages {

        stage('Install Dependencies') {
            steps {
                bat 'npm install'
            }
        }

        stage('Build') {
            steps {
                bat 'npm run build'
            }
        }

        stage('Test') {
            steps {
                bat 'echo Running tests...'
            }
        }

        stage('Run') {
            steps {
                bat 'start /B npm start'
            }
        }

         stage('Verify App') {
            steps {
                bat '''
                timeout /t 15
                curl http://localhost:3000
                IF %ERRORLEVEL% NEQ 0 EXIT /B 1
                '''
            }
        }
    }
}
