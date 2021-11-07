@Library('mylibrary') _

def configHost = [host: 'noiro-containers-ctrl']
// skipAccProvisionClusters = ["fab3", "k8s-bm-1", "os-bm-1", "k8sbm2-bm"]

// def check = "checkDef"
checkGlob = "checkGlob"

pipeline {
    agent any
    environment {
        IMAGE_NAME = 'noirolabs/acc-pytests'
    }
    stages {
        stage('Experiment') {
            steps {
                script {
                    echo "Hi there!"
                    env.IMAGE_TAG = 'my-tag'
                    env.skipAccProvisionClusters = ["fab3", "k8s-bm-1", "os-bm-1", "k8sbm2-bm"]
                    hello("Vikash", configHost)
                    println configHost
                }
            }
        }

        stage('Next Step') {
            steps {
                println IMAGE_TAG
            }
        }
    }
}
