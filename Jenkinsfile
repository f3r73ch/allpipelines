def now = new Date()

pipeline {
    agent any
    stages {
        stage('gitcheckout') {
            steps {
                echo "this is a dummy placeholder : ${env.STAGE_NAME}"
                println now.format("yyMMdd.HHmmss", TimeZone.getTimeZone('UTC'))
            }
        }

        stage('sleep here') {
        	steps {
	        	sh 'sleep 5'
	        	// next timestamp should be +5 sec ahead !
                telegramSend(message: "Im @ stage : ${env.STAGE_NAME}")
        	}
        }

        /*stage('talk 2 telegram bot') {
            steps {
                emailext body: 'Test Message',
                        subject: 'Test Subject',
                        to: 'mail19780704@gmail.com'
            }
        }*/

        stage('final_stage') {

            steps {
            	script{
	                def end_time = new Date()
	                println end_time.format("yyMMdd.HHmmss", TimeZone.getTimeZone('UTC'))
            	}
            }
        }
    }
}
