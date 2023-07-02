pipelineJob('task-tracker') {
  definition {
    cpsScm {
        scm {
          git {
            remote {
              url ('https://github.com/Jewel73/jenkins-pipelines.git')
            }
          }
        }
        scriptPath("tasktracker/Jenkinsfile")
    }
  }
}