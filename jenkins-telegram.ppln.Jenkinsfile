pipeline {
	agent any

	stages {
		stage('clone git repo') {
			steps {
				checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/f3r73ch/some_code/']]])
			}
		
		}
		stage('build it') {
			steps {
				sh '''chmod +x  testscript.sh
				./testscript.sh > log1'''
			}
		
		}
		stage('post build') {
			steps {
				archiveArtifacts artifacts: 'log1', followSymlinks: false
			}
		
		}
	}
}
