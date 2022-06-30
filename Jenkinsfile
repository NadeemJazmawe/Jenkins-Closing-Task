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
        failure {
            echo "Build failed"
        }
    }

}