# cicd-jenkins-example
CICD jenkins example
<br/> Ttorial follwed: https://www.youtube.com/watch?v=1fPTOhn8fgk&ab_channel=TechPrimers
<br/> Jenkinsfile error- java.lang.NoSuchMethodError: No such DSL method 'withMaven' found among steps
<br/> Solution: https://stackoverflow.com/questions/47048960/jenkinsfile-error-java-lang-nosuchmethoderror-no-such-dsl-method-withmaven-f after changing the jenkinsfile go and add maven in jenkins-> manage global tools configuration -> (add local maven installation path)
<br/> Jenkins pipeline sh fail with “cannot run program nohup” on windows
<br/> Solution: https://stackoverflow.com/questions/45140614/jenkins-pipeline-sh-fail-with-cannot-run-program-nohup-on-windows

