package com.example


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
