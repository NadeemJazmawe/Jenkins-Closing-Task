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
        
         stage("Run"){
            steps {
                sh 'java -jar target/*.jar'
                }
            }
    }

    post {
        failure {
            echo "Build failed"
        }
    }

}
