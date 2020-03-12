/* Jenkinsfile (Declarative Pipeline) */

pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                sh 'echo "Hello World from stage BUILD"'
                sh 'java -version'
            }
        }
        stage('malang') {
            steps {
                sh 'echo "Hi from Malang internal"'
            }
        }
    }
    post {
        always {
            echo 'This will always run'
        }
        success {
            echo 'This will run only if successful'
        }
        failure {
            echo 'This will run only if failed'
        }
        unstable {
            echo 'This will run only if the run was marked as unstable'
        }
        changed {
            echo 'This will run only if the state of the Pipeline has changed'
            echo 'For example, if the Pipeline was previously failing but is now successful'
        }
    }
}


