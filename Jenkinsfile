pipeline{
	agent any
	tools{
		jdk 'java17'
		maven 'maven3'
	}
	stages{
		stage("test echo"){
			steps{
				echo "testing the pipeline"
			}
		}
		stage("checkout stage"){
			steps("checkout step"){
				git branch:'master', url:'https://github.com/AshishRajput1981/demo.git'
			}
		}
		stage("maven build"){
			steps{
				sh 'mvn clean package'
			}
		}
		stage("test stage"){
			steps{
				sh 'mvn test'
			}
		}
		stage("sonar check"){
			steps{
				withSonarQubeEnv('sonar') {
					sh 'mvn sonar:sonar'
					}
				
			}
		}
		
	}
}