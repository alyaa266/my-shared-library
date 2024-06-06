def call(String imageName, String tag, String deploymentFilePath) {
    sh """
    sed -i 's|image: .*|image: ${imageName}:${tag}|g' ${deploymentFilePath}
    kubectl apply -f ${deploymentFilePath} --namespace ${env.K8S_NAMESPACE}
    """
}

