pipelineJob('naztech-starter') {
  definition {
    cpsScm {
        scm {
          git {
            remote {
              url ('https://github.com/Jewel73/jenkins-pipelines.git')
            }
          }
        }
        scriptPath("naztechstarter/Jenkinsfile")
    }
  }
}
