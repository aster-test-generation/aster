import unittest
from semantic_release.ci_checks import *


class TestCiChecks(unittest.TestCase):
    def test_travis_checker(self):
        os.environ["TRAVIS_BRANCH"] = "master"
        os.environ["TRAVIS_PULL_REQUEST"] = "false"
        travis("master")

    def test_semaphore_checker(self):
        os.environ["BRANCH_NAME"] = "master"
        os.environ["PULL_REQUEST_NUMBER"] = "12345"
        os.environ["SEMAPHORE_THREAD_RESULT"] = "passed"
        semaphore("master")

    def test_frigg_checker(self):
        os.environ["FRIGG_BUILD_BRANCH"] = "master"
        os.environ["FRIGG_PULL_REQUEST"] = "123"
        frigg("master")

    def test_circle_checker(self):
        os.environ["CIRCLE_BRANCH"] = "master"
        os.environ["CI_PULL_REQUEST"] = "100"
        circle("master")

    def test_gitlab_checker(self):
        os.environ["CI_COMMIT_REF_NAME"] = "master"
        gitlab("master")

    def test_bitbucket_checker(self):
        os.environ["BITBUCKET_BRANCH"] = "master"
        os.environ["BITBUCKET_PR_ID"] = "1"
        bitbucket("master")

    def test_jenkins_checker(self):
        os.environ["BRANCH_NAME"] = "master"
        os.environ["GIT_BRANCH"] = "master"
        os.environ["JENKINS_URL"] = "http://localhost"
        os.environ["CHANGE_ID"] = "I1234567890"
        jenkins("master")

    def test_check_function(self):
        os.environ["TRAVIS"] = "true"
        os.environ["TRAVIS_BRANCH"] = "master"
        os.environ["TRAVIS_PULL_REQUEST"] = "false"
        check("master")

if __name__ == '__main__':
    unittest.main()