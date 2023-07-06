def call() {
    pipeline {
        agent any
        stages {
            prepareStage()
            checkStage()
            testStage()
            deploymentStage()
        }
    }
}

def prepareStage() {
    stage("prepare") {
        steps {
            echo "preparing your code"
        }
    }
}

def checkStage() {
    stage("check") {
        steps {
            echo "checking your code"
        }
    }
}

def testStage() {
    stage("test") {
        steps {
            echo "testing your code"
        }
    }
}

def deploymentStage() {
    stage("deployment") {
        steps {
            echo "your code is deployed right now"
            echo "this build number $BUILD_NUMBER"
        }
    }
}

