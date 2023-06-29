pipelineJob('clone-git') {
  definition {
    cpsScm {
        scm {
          git {
            remote {
              url ('https://github.com/Jewel73/jenkins-pipelines.git')
            }
          }
        }
        scriptPath("auth/Jenkinsfile")
    }
  }
}
