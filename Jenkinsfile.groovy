pipeline {
    agent any

    stages {

        stage('Git Checkout') {
            steps {
                echo 'Taking latest code from the git repo....'
                gitCheckout(
                        branch: "master",
                        url: "https://github.com/magicjoon/vertex-lib.git"
                )
            }
        }
        stage('Build') {
            steps {
                echo 'Building....'
                echo "Running the ${env.BUILD_ID} ${env.BUILD_DISPLAY_NAME} on ${evn.NODE_NAME} with ${env.BUILD_NAME}"
                echo " Run Unit tests also...."

            }
        }

        stage('Deploy') {
            steps {

                echo 'Deploying....'
            }
        }


    stage('Test') {
        steps {

            echo 'Testing...'
        }
    }
}
}