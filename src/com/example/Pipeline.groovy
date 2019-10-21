package com.example

stage('Git Checkout') {
    gitCheckout(
        branch: "master",
        url: "https://github.com/spring-projects/spring-petclinic.git"
    )
}