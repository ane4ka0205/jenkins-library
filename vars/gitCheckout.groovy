// def printHello() {
//     sh 'echo "hello world from library"'
// }

// def printBye() {
//   sh 'echo "Bye"'
// }

class buildUtils {
    static def timedGradleBuild(script,tasks) {
        def gradleHome = script.tool 'gradle3.2'
        script.sh "echo Building for ${script.env.BUILD_TAG}"
        script.timestamps {
            script.sh "${gradleHome}/bin/gradle ${tasks}"
        }
    }
}


    
