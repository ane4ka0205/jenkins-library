// def printHello() {
//     sh 'echo "hello world from library"'
// }

// def printBye() {
//   sh 'echo "Bye"'
// }

def call(args){
  sh "${tool 'M3'}/bin/mvn ${args}"
}


    
