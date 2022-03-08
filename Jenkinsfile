pipeline {
    agent any
    
    stages {
    	stage('test') {
            agent {
                docker {
                    image 'maven:3.8-openjdk-11'
                }
            }
            steps {
                sh 'mvn test'
            }
    	}
    }
}
