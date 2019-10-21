package com.example

def runPipeline() {

  def branchName = "master"

    stage ("Print hello") {
      echo "Hello world"
    }
return this