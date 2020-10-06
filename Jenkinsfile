#!/usr/bin/env groovy

@Library('shared-library@master')_

pipeline{
    agent {
        docker {
            image 'maven'
            args '-v 4HOME/.m2:/root/.2'
        }
    }

    stages{
        stage('maven build'){
            steps{
                script{
                    sh "mvn clean install"
                }
            }
        } 
        stage ('Check logs') {
            steps {
                filterlogs ('WARNING', 1)
        }
    }
}
}