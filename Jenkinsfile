#!/usr/bin/env groovy

@Library('shared-library@master')_

pipeline{
    agent master

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