pipeline {
  agent any
  stages {
    stage('SCM') {
      steps {
        script {
          checkout scm
        }
      }
    }
    stage('SonarQube Analysis') {
      steps {
        script {
          def scannerHome = tool 'sonarqubeScaner';
          withSonarQubeEnv() {
          sh "${scannerHome}/bin/sonar-scanner"
          }
        }
      }
    }
    stage('Quality Gate') {
      steps {
        script {
          sleep 100 //Wait for 100 seconds
        }
        timeout(time: 1, unit: 'HOURS') {
          waitForQualityGate abortPipeline: true
        }
        sh 'echo "Quality gate passed succesfully"'
      }
    }
    stage('Deploy') {
      steps {
        sh 'echo "Deployment is succesfully"'
      }
    }
  }
}