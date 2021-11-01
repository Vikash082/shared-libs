environment {
    def accpImage

    def remote = [:]
    remote.allowAnyHosts = true

    def configHost = [host: 'noiro-containers-ctrl']
    jumpHost = [:]
    // for openshift cluster, skip acc provisioning.
    skipAccProvisionClusters = ["fab3", "k8s-bm-1", "os-bm-1", "k8sbm2-bm"]
    hypOpenshift = ["os1", "os2", "os3", "os4", "os5"]
    hypK8s = []
    hyperflex = [openshift: false, k8s: false]

    base = "/home/noiro/acc-pytests-jobs-config"
}
