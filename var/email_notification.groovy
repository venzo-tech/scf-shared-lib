def call(def projectname)
{
 def sonarprojectname=projectname
emailext attachLog: false,
  
body: '''
Hi Team,</br>
</br>
***This is auto generated mail from local machine Jenkins !!!***
</br>
CICD job for <b>$JOB_NAME</b> is <b>$BUILD_STATUS</b>
</br>
Please find the jenkins job url:
</br>
<b>JOB_URL : </b> $BUILD_URL
</br>
Please use below link for krediq result:
</br>
<b>KREDIQ   : </b>http://localhost:9000/
Regards,</br>
ANAND RAJ B</br>
VENZO TECH </br>

''', mimeType:'html',subject: '[ $JOB_NAME ]#BuildNumber : $BUILD_NUMBER #Status : $BUILD_STATUS', to: 'anandrajb@venzotechnologies.com'
}
