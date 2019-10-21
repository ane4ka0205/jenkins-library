package com.example

def runPipeline() {

def branchName = "master"

    pipeline {
      agent any
      stages {
        stage('Hello') {
          steps {
            echo "Hello world"
        }
      }
    }
  }
}
return this