@Library('mylibrary') _

def configHost = [host: 'noiro-containers-ctrl']
skipAccProvisionClusters = ["fab3", "k8s-bm-1", "os-bm-1", "k8sbm2-bm"]


pipeline {
    agent any
    stages {
        stage('Experiment') {
            steps {
                script {
                    echo "Hi there!"
                    hello("Vikash", configHost)
                    println configHost
                }
            }
        }
    }
}
