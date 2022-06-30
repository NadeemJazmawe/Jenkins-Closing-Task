pipeline {
    agent any

    stages {
        stage("Build") {
            steps{
                sh 'mvn clean package'
            }
        }

        stage("Save Artifact"){
            steps {
                archiveArtifacts artifacts: 'target/*.jar', followSymlinks: false
                }
            }
        
    }

    post {
        success {
            slackSend channel: 'jenkins_closing_task', message: 'Build Success'
        }
         
        failure {
            echo "Build failed"
        }
    }

}
