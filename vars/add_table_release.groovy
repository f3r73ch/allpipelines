def call(){
	echo "here"

	withCredentials([usernameColonPassword(credentialsId: 'confluence-f3r73ch', variable: 'USERPASS')]) {
		def response = sh(
							script: '''
									  curl \
									  -u "$USERPASS" \
									  --request PUT \
									  --header 'Accept: application/json' \
									  -d@update-confluence.json \
									  https://f3r73ch.atlassian.net/wiki/rest/api/content/1540097
									''', 
							returnStdout: true
		)

		echo response

	}
}


