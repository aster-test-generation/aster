import unittest
from semantic_release.ci_checks import *


class TestCiChecks(unittest.TestCase):
    def test_travis_checker(self):
        os.environ["TRAVIS_BRANCH"] = "master"
        os.environ["TRAVIS_PULL_REQUEST"] = "false"
        self.assertTrue(travis("master"))

    def test_semaphore_checker(self):
        os.environ["BRANCH_NAME"] = "master"
        os.environ["PULL_REQUEST_NUMBER"] = "12345"
        os.environ["SEMAPHORE_THREAD_RESULT"] = "passed"
        self.assertTrue(semaphore("master"))

    def test_frigg_checker(self):
        os.environ["FRIGG_BUILD_BRANCH"] = "master"
        os.environ["FRIGG_PULL_REQUEST"] = "1"
        self.assertTrue(frigg("master"))

    def test_circle_checker(self):
        os.environ["CIRCLE_BRANCH"] = "master"
        os.environ["CI_PULL_REQUEST"] = "12345"
        self.assertTrue(circle("master"))

    def test_gitlab_checker(self):
        os.environ["CI_COMMIT_REF_NAME"] = "master"
        self.assertTrue(gitlab("master"))

    def test_bitbucket_checker(self):
        os.environ["BITBUCKET_BRANCH"] = "master"
        os.environ["BITBUCKET_PR_ID"] = "12345"
        self.assertTrue(bitbucket("master"))

    def test_jenkins_checker(self):
        os.environ["JENKINS_URL"] = "http://localhost"
        os.environ["BRANCH_NAME"] = "master"
        os.environ["GIT_BRANCH"] = "master"
        os.environ["CHANGE_ID"] = "I123456789"
        self.assertTrue(jenkins("master"))

if __name__ == '__main__':
    unittest.main()