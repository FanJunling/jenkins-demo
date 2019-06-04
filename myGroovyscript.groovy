#!/usr/bin/env groovy

import jenkins.model.*
jenkins = Jenkins.instance

def log = readFile("/home/jenkins/workspace/fantest/version.csv") 
def version = log.text
println version
