 def jsonParameter = '''{
 "scm": {
            "execute": true,
            "integrationPoints": [{
                "method": "scm",
                "scm": {
                    "scmType": "GIT",
                    "scmUrl": "https://github.com/sakshi1689/Testing_Multibranch",
                    "scmBranch": "#CurrentGitBranchName#"
                }
            }]
        }
		}'''
