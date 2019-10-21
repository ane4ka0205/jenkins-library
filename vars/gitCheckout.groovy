// def printHello() {
//     sh 'echo "hello world from library"'
// }

// def printBye() {
//   sh 'echo "Bye"'
// }

def setCommand(commandToRun) {
  cmd = commandToRun
}

def getCommand() {
  cmd
}

def runCommand() {
  timestamps {
    cmdOut = sh (script:"${cmd}", returnStdout:true).trim()
  }
}

def getOutput() {
  cmdOut
}


    
