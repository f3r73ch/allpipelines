def call(){
	withCredentials([usernameColonPassword(credentialsId: '', variable: 'USERPASS')]) {
		sh '''
		  set +x
		  curl -s \
			-u "$USERPASS" \
			--request GET \
			--url 'https://f3r73ch.atlassian.net/wiki/rest/api/content/229524?expand=body.storage' \
			--header 'Accept: application/json'
		'''
	}
}



