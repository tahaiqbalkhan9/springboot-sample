/* Jenkinsfile (Declarative Pipeline) */

pipeline {
    agent any
    environment {
        TEST_VARIABLE = 'blah*&&&*&*&&'
    }
    stages {
        stage('build') {
            steps {
                echo "Hello World from stage BUILD"
                java -version
                echo "the env variable is $TEST_VARIABLE"
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


