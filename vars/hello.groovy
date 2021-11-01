#!/usr/bin/env groovy

def call(String name = 'human') {
  echo "Hello, ${name}."
  world()
  println configHost
  println skipAccProvisionClusters
}
