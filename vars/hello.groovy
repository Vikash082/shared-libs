#!/usr/bin/env groovy

def call(String name = 'human') {
  echo "Hello, ${name}."
  world()
  println remote
  println hypOpenshift
  println base
}
