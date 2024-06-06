def call(String imageName, String tag, String credentialsId) {
    docker.withRegistry('https://index.docker.io/v1/', credentialsId) {
        docker.image("${imageName}:${tag}").push()
    }
}

