pipeline{
	agent any
	stages{
		stage("test echo"){
			steps{
				echo "testing the pipeline"
			}
		}
		stage("checkout"){
			steps("checkout step"){
				git branch:'master', url:'https://github.com/AshishRajput1981/demo.git'
			}
		}
		
	}
}