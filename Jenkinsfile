pipeline {
    agent any
    tools {
        maven 'apache-maven-3.5.4'
        jdk 'JDk8'
    }
    stages {
        stage ('Initialize') {
            steps {
                sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                '''
            }
        }

        stage ('Build') {
            steps {
                sh 'mvn -Dmaven.test.failure.ignore=true install' 
            }
             post {
        		success {
          			archiveArtifacts(artifacts: '**/target/*.jar', allowEmptyArchive: true)
        		}
      		}
        }
        
        stage ('Test') {
            steps {
                sh 'mvn test' 
            }
            post {
                success {
                    junit 'target/surefire-reports/**/*.xml' 
                }
            }
        }
    }
}