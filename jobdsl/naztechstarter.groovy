pipelineJob('naztech-starter') {
  definition {
    cpsScm {
        scm {
          git {
            remote {
              url ('https://github.com/Jewel73/naztech-starter.git')
            }
          }
        }
        scriptPath("Jenkinsfile")
    }
  }
  
  triggers {
    pollSCM('* * * * *')
  }
   

}
