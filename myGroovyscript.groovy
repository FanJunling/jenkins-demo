#!/usr/bin/env groovy

def log = readFile("/home/jenkins/workspace/fantest/version.csv") 
def version = file.text.toString()
println version
