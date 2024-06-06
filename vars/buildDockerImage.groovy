def call(String imageName, String tag) {
    docker.build("${imageName}:${tag}").inside {
        sh 'echo "Docker image built"'
    }
}

