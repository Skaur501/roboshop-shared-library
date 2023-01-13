def call() {
    node {

        stage ('checkout code') {
            cleanWs()
            sh 'pwd'
            sh 'ls'
            git branch: 'main', url: "${env.REPO_URL}"
            sh 'pwd'
            sh 'ls'
        }

        stage ('code Compile') {
            echo 'Code Compile'
        }

        stage ('code quality') {
            echo 'code quality'
        }

        stage ('Test cases') {
            echo 'Test cases'
        }

        stage ('Publish a release') {
            echo 'Publish a release'
        }
    }
}