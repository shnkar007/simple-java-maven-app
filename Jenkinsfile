pipeline {
    agent {
           none
    }
    stages {
        stage('Build') { 
            steps {
                bat 'mvn -v -B -DskipTests clean package' 
            }
        }
    }
}
