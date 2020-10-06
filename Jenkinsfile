#!/usr/bin/env groovy

@Library('shared-library@master')_

pipeline{
    agent {
        docker {
            image 'maven'
            args '-v 4HOME/.m2:/root/.2'
        }
    }

    stages ('Check logs') {
        steps {
            filterlogs ('WARNING', 1)
        }
    }
}
}