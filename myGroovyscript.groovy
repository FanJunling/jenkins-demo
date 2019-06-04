#!/usr/bin/env groovy

File file = new File("/home/jenkins/workspace/fantest/version.csv") 
def version = file.text.toString()
print version
