pipeline {
    agent any // Runs on your Windows Jenkins agent

    stages {
        stage('Checkout') {
            steps {
                // Pulls the code from your GitHub repository
                git branch: 'main', url: 'https://github.com/TeflonSailor/chat-app.git'
            }
        }
        
        stage('Install Dependencies') {
            steps {
                echo 'Installing dependencies...'
                // Using 'bat' instead of 'sh' for Windows
                bat 'npm install'
            }
        }
        
        stage('Test') {
            steps {
                echo 'Running tests...'
                // If you don't have tests yet, comment this out to prevent failures
                bat 'npm test' 
            }
        }
        
        stage('Build') {
            steps {
                echo 'Building the application...'
                bat 'npm run build'
            }
        }
        
        stage('Deploy') {
            steps {
                echo 'Deploying the chat-app...'
                // Example: Copying built files to an IIS server directory
                // bat 'xcopy /E /I /Y build\\* C:\\inetpub\\wwwroot\\chat-app'
            }
        }
    }
    
    post {
        success {
            echo '🎉 Pipeline completed successfully!'
        }
        failure {
            echo '❌ Pipeline failed. Please check the logs.'
        }
        always {
            echo 'Cleaning up workspace...'
            cleanWs()
        }
    }
}
