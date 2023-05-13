pipeline {
    agent any

    stages {
        stage('Git') {
            steps {
                git 'https://github.com/giansantoro/inf335_jenkins'
            }
        }
        
        stage('Build') {
            steps {
                script {
                    def mavenHome = tool 'M3'
                    sh "${mavenHome}/bin/mvn -B -DskipTests clean package"
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    def mavenHome = tool 'M3'
                    sh "${mavenHome}/bin/mvn test"
                }
            }
        }
    }
}
