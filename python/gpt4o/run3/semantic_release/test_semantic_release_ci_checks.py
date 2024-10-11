import unittest
import os
from semantic_release.ci_checks import (
    travis, semaphore, frigg, circle, gitlab, bitbucket, jenkins, check
)
from semantic_release.errors import CiVerificationError


class TestCIChecks(unittest.TestCase):

    def setUp(self):
        self.original_environ = os.environ.copy()

    def tearDown(self):
        os.environ = self.original_environ

    def test_travis_pass(self):
        os.environ["TRAVIS_BRANCH"] = "main"
        os.environ["TRAVIS_PULL_REQUEST"] = "false"
        result = travis("main")
        self.assertTrue(result)

    def test_travis_fail(self):
        os.environ["TRAVIS_BRANCH"] = "main"
        os.environ["TRAVIS_PULL_REQUEST"] = "true"
        with self.assertRaises(CiVerificationError):
            travis("main")

    def test_semaphore_pass(self):
        os.environ["BRANCH_NAME"] = "main"
        os.environ["PULL_REQUEST_NUMBER"] = None
        os.environ["SEMAPHORE_THREAD_RESULT"] = "passed"
        result = semaphore("main")
        self.assertTrue(result)

    def test_semaphore_fail(self):
        os.environ["BRANCH_NAME"] = "main"
        os.environ["PULL_REQUEST_NUMBER"] = "123"
        os.environ["SEMAPHORE_THREAD_RESULT"] = "failed"
        with self.assertRaises(CiVerificationError):
            semaphore("main")

    def test_frigg_pass(self):
        os.environ["FRIGG_BUILD_BRANCH"] = "main"
        os.environ["FRIGG_PULL_REQUEST"] = ""
        result = frigg("main")
        self.assertTrue(result)

    def test_frigg_fail(self):
        os.environ["FRIGG_BUILD_BRANCH"] = "main"
        os.environ["FRIGG_PULL_REQUEST"] = "123"
        with self.assertRaises(CiVerificationError):
            frigg("main")

    def test_circle_pass(self):
        os.environ["CIRCLE_BRANCH"] = "main"
        os.environ["CI_PULL_REQUEST"] = ""
        result = circle("main")
        self.assertTrue(result)

    def test_circle_fail(self):
        os.environ["CIRCLE_BRANCH"] = "main"
        os.environ["CI_PULL_REQUEST"] = "123"
        with self.assertRaises(CiVerificationError):
            circle("main")

    def test_gitlab_pass(self):
        os.environ["CI_COMMIT_REF_NAME"] = "main"
        result = gitlab("main")
        self.assertTrue(result)

    def test_gitlab_fail(self):
        os.environ["CI_COMMIT_REF_NAME"] = "feature"
        with self.assertRaises(CiVerificationError):
            gitlab("main")

    def test_bitbucket_pass(self):
        os.environ["BITBUCKET_BRANCH"] = "main"
        os.environ["BITBUCKET_PR_ID"] = ""
        result = bitbucket("main")
        self.assertTrue(result)

    def test_bitbucket_fail(self):
        os.environ["BITBUCKET_BRANCH"] = "main"
        os.environ["BITBUCKET_PR_ID"] = "123"
        with self.assertRaises(CiVerificationError):
            bitbucket("main")

    def test_jenkins_pass(self):
        os.environ["BRANCH_NAME"] = "main"
        os.environ["JENKINS_URL"] = "http://jenkins"
        os.environ["CHANGE_ID"] = ""
        result = jenkins("main")
        self.assertTrue(result)

    def test_jenkins_fail(self):
        os.environ["BRANCH_NAME"] = "main"
        os.environ["JENKINS_URL"] = "http://jenkins"
        os.environ["CHANGE_ID"] = "123"
        with self.assertRaises(CiVerificationError):
            jenkins("main")

    def test_check_travis(self):
        os.environ["TRAVIS"] = "true"
        os.environ["TRAVIS_BRANCH"] = "main"
        os.environ["TRAVIS_PULL_REQUEST"] = "false"
        result = check("main")
        self.assertIsNotNone(result)

    def test_check_semaphore(self):
        os.environ["SEMAPHORE"] = "true"
        os.environ["BRANCH_NAME"] = "main"
        os.environ["PULL_REQUEST_NUMBER"] = None
        os.environ["SEMAPHORE_THREAD_RESULT"] = "passed"
        result = check("main")
        self.assertIsNotNone(result)

    def test_check_frigg(self):
        os.environ["FRIGG"] = "true"
        os.environ["FRIGG_BUILD_BRANCH"] = "main"
        os.environ["FRIGG_PULL_REQUEST"] = ""
        result = check("main")
        self.assertIsNotNone(result)

    def test_check_circle(self):
        os.environ["CIRCLECI"] = "true"
        os.environ["CIRCLE_BRANCH"] = "main"
        os.environ["CI_PULL_REQUEST"] = ""
        result = check("main")
        self.assertIsNotNone(result)

    def test_check_gitlab(self):
        os.environ["GITLAB_CI"] = "true"
        os.environ["CI_COMMIT_REF_NAME"] = "main"
        result = check("main")
        self.assertIsNotNone(result)

    def test_check_jenkins(self):
        os.environ["JENKINS_URL"] = "http://jenkins"
        os.environ["BRANCH_NAME"] = "main"
        os.environ["CHANGE_ID"] = ""
        result = check("main")
        self.assertIsNotNone(result)

    def test_check_bitbucket(self):
        os.environ["BITBUCKET_BUILD_NUMBER"] = "123"
        os.environ["BITBUCKET_BRANCH"] = "main"
        os.environ["BITBUCKET_PR_ID"] = ""
        result = check("main")
        self.assertIsNotNone(result)

if __name__ == '__main__':
    unittest.main()