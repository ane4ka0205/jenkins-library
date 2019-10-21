def call(str hello) {



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

    