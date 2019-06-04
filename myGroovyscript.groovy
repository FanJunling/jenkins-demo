#!/usr/bin/env groovy

import jenkins.model.*

def log = readFile("/home/jenkins/workspace/fantest/version.csv") 
def version = log.text
println version
