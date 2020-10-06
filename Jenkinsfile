#!/usr/bin/env groovy

@Library('shared-library@master')_

pipeline{
    agent any

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
                filterLogs ('WARNING', 1)
        }
    }
}
}