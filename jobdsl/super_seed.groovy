job('super-seed') {
  scm {
    git {
      remote {
        url ('https://github.com/Jewel73/jenkins-dsl.git')
      }
    }
  }
  steps {
    dsl {
      external('jobdsl/**/*.groovy')
      removeAction('DELETE')
    }
  }
}
