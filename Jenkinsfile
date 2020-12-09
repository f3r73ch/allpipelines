def now = new Date()
def email_recipient='mail19780704@gmail.com'

void notif_email(String p_email_recipient) {
    emailext body: 'Test Message',
                        subject: 'Test Subject',
                        to: email_recipient
}

pipeline {
    agent any
    stages {
        stage('gitcheckout') {
            steps {
                echo "this is a dummy placeholder : ${env.STAGE_NAME}"
                println now.format("yyMMdd.HHmmss", TimeZone.getTimeZone('UTC'))
            }
        }

/*        stage('telegramSend') {
        	steps {
                telegramSend(message: "Im stage : ${env.STAGE_NAME}")
        	}
        }*/

        stage('talk 2 EMAIL ') {
            steps {
                notif_email()
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
