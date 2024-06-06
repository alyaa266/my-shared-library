def call(String deploymentName, String namespace) {
    sh """
    kubectl rollout status deployment/${deploymentName} --namespace ${namespace}
    """
}

