#!/usr/bin/env groovy

def call(name, configHost) {
  echo "Hello, ${name}."
  world.callWorld()
  world.callMyWorld()
  println configHost
  configHost.setHello = true
  println env.IMAGE_NAME
  println env.IMAGE_TAG
  env.IMAGE_TAG = 'changed-tag'
  println env.skipAccProvisionClusters
  println env.whatIsMyName
}
