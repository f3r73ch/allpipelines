pipeline {
  agent any
  /*  triggers {
   cron('H/15 * * * *')
  }*/
  stages {
    stage('echo') {
      steps {
        echo 'hello from the echo STAGE'
      }
    }
    stage('after TRIGGER') {
      steps {
        echo 'hello from the after TRIGGER STAGE f3r-now ppln elsewhere'
      }
    }

  }
}

