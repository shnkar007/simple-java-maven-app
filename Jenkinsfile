pipeline {
    agent any
    stages {
        stage('Build') { 
            steps {
                bat 'mvn -v -B -DskipTests clean package' 
            }
        }
    }
}
