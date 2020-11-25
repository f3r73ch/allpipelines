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
        	}
        }

        stage('talk 2 telegram bot') {
            steps {
                telegramSend(message: 'Hello World', chatId: 1001281109)
            }
        }

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
