import unittest
from unittest.mock import patch, Mock
from semantic_release.ci_checks import *


class TestCiChecks(unittest.TestCase):
    def test_checker_decorator(self):
        @checker
        def test_func():
            pass
        self.assertTrue(callable(test_func))

    def test_travis(self):
        with patch('os.environ', {'TRAVIS_BRANCH': 'master', 'TRAVIS_PULL_REQUEST': 'false'}):
            self.assertTrue(travis('master'))

    def test_semaphore(self):
        with patch('os.environ', {'BRANCH_NAME': 'master', 'PULL_REQUEST_NUMBER': None, 'SEMAPHORE_THREAD_RESULT': 'passed'}):
            self.assertTrue(semaphore('master'))

    def test_frigg(self):
        with patch('os.environ', {'FRIGG_BUILD_BRANCH': 'master', 'FRIGG_PULL_REQUEST': 'false'}):
            self.assertTrue(frigg('master'))

    def test_circle(self):
        with patch('os.environ', {'CIRCLE_BRANCH': 'master', 'CI_PULL_REQUEST': 'false'}):
            self.assertTrue(circle('master'))

    def test_gitlab(self):
        with patch('os.environ', {'CI_COMMIT_REF_NAME': 'master'}):
            self.assertTrue(gitlab('master'))

    def test_bitbucket(self):
        with patch('os.environ', {'BITBUCKET_BRANCH': 'master', 'BITBUCKET_PR_ID': None}):
            self.assertTrue(bitbucket('master'))

    def test_jenkins(self):
        with patch('os.environ', {'BRANCH_NAME': 'master', 'GIT_BRANCH': 'master', 'JENKINS_URL': 'http://example.com', 'CHANGE_ID': None}):
            self.assertTrue(jenkins('master'))

    def test_check_travis(self):
        with patch('os.environ', {'TRAVIS': 'true', 'TRAVIS_BRANCH': 'master', 'TRAVIS_PULL_REQUEST': 'false'}):
            self.assertTrue(check('master'))

    def test_check_semaphore(self):
        with patch('os.environ', {'SEMAPHORE': 'true', 'BRANCH_NAME': 'master', 'PULL_REQUEST_NUMBER': None, 'SEMAPHORE_THREAD_RESULT': 'passed'}):
            self.assertTrue(check('master'))

    def test_check_frigg(self):
        with patch('os.environ', {'FRIGG': 'true', 'FRIGG_BUILD_BRANCH': 'master', 'FRIGG_PULL_REQUEST': 'false'}):
            self.assertTrue(check('master'))

    def test_check_circle(self):
        with patch('os.environ', {'CIRCLECI': 'true', 'CIRCLE_BRANCH': 'master', 'CI_PULL_REQUEST': 'false'}):
            self.assertTrue(check('master'))

    def test_check_gitlab(self):
        with patch('os.environ', {'GITLAB_CI': 'true', 'CI_COMMIT_REF_NAME': 'master'}):
            self.assertTrue(check('master'))

    def test_check_bitbucket(self):
        with patch('os.environ', {'BITBUCKET_BUILD_NUMBER': '123', 'BITBUCKET_BRANCH': 'master', 'BITBUCKET_PR_ID': None}):
            self.assertTrue(check('master'))

    def test_check_jenkins(self):
        with patch('os.environ', {'JENKINS_URL': 'http://example.com', 'BRANCH_NAME': 'master', 'GIT_BRANCH': 'master', 'CHANGE_ID': None}):
            self.assertTrue(check('master'))

if __name__ == '__main__':
    unittest.main()