def call() {
    pipeline {
        agent {label 'Ec2_instance01'}
        stages {
            stage("prepare") {
                steps {
                    prepareStage()
                }
            }

            stage("check") {
                steps {
                    checkStage()
                }
            }

            stage("test") {
                steps {
                    testStage()
                }
            }

            stage("deployment") {
                steps {
                    deploymentStage()
                }
            }
        }
    }
}

def prepareStage() {
    echo "preparing your code"
}

def checkStage() {
    echo "checking your code"
}

def testStage() {
    echo "testing your code"
}

def deploymentStage() {
    echo "your code is deployed right now"
    echo "this build number $BUILD_NUMBER"
}
