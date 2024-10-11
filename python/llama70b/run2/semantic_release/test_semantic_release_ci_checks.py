import unittest
from unittest.mock import patch, MagicMock
from semantic_release.ci_checks import *


class TestCiChecks(unittest.TestCase):
    def test_checker_decorator(self):
        def test_func():
            pass
        decorated_func = checker(test_func)
        self.assertTrue(callable(decorated_func))

    def test_travis(self):
        with patch('os.environ', {'TRAVIS_BRANCH': 'main', 'TRAVIS_PULL_REQUEST': 'false'}):
            self.assertTrue(travis('main'))

    def test_semaphore(self):
        with patch('os.environ', {'BRANCH_NAME': 'main', 'PULL_REQUEST_NUMBER': None, 'SEMAPHORE_THREAD_RESULT': 'passed'}):
            self.assertTrue(semaphore('main'))

    def test_frigg(self):
        with patch('os.environ', {'FRIGG_BUILD_BRANCH': 'main', 'FRIGG_PULL_REQUEST': 'false'}):
            self.assertTrue(frigg('main'))

    def test_circle(self):
        with patch('os.environ', {'CIRCLE_BRANCH': 'main', 'CI_PULL_REQUEST': 'false'}):
            self.assertTrue(circle('main'))

    def test_gitlab(self):
        with patch('os.environ', {'CI_COMMIT_REF_NAME': 'main'}):
            self.assertTrue(gitlab('main'))

    def test_bitbucket(self):
        with patch('os.environ', {'BITBUCKET_BRANCH': 'main', 'BITBUCKET_PR_ID': None}):
            self.assertTrue(bitbucket('main'))

    def test_jenkins(self):
        with patch('os.environ', {'BRANCH_NAME': 'main', 'GIT_BRANCH': 'main', 'JENKINS_URL': 'http://jenkins.com', 'CHANGE_ID': None}):
            self.assertTrue(jenkins('main'))

    def test_check_travis(self):
        with patch('os.environ', {'TRAVIS': 'true', 'TRAVIS_BRANCH': 'main', 'TRAVIS_PULL_REQUEST': 'false'}):
            self.assertTrue(check('main'))

    def test_check_semaphore(self):
        with patch('os.environ', {'SEMAPHORE': 'true', 'BRANCH_NAME': 'main', 'PULL_REQUEST_NUMBER': None, 'SEMAPHORE_THREAD_RESULT': 'passed'}):
            self.assertTrue(check('main'))

    def test_check_frigg(self):
        with patch('os.environ', {'FRIGG': 'true', 'FRIGG_BUILD_BRANCH': 'main', 'FRIGG_PULL_REQUEST': 'false'}):
            self.assertTrue(check('main'))

    def test_check_circle(self):
        with patch('os.environ', {'CIRCLECI': 'true', 'CIRCLE_BRANCH': 'main', 'CI_PULL_REQUEST': 'false'}):
            self.assertTrue(check('main'))

    def test_check_gitlab(self):
        with patch('os.environ', {'GITLAB_CI': 'true', 'CI_COMMIT_REF_NAME': 'main'}):
            self.assertTrue(check('main'))

    def test_check_bitbucket(self):
        with patch('os.environ', {'BITBUCKET_BUILD_NUMBER': '123', 'BITBUCKET_BRANCH': 'main', 'BITBUCKET_PR_ID': None}):
            self.assertTrue(check('main'))

    def test_check_jenkins(self):
        with patch('os.environ', {'JENKINS_URL': 'http://jenkins.com', 'BRANCH_NAME': 'main', 'GIT_BRANCH': 'main', 'CHANGE_ID': None}):
            self.assertTrue(check('main'))

if __name__ == '__main__':
    unittest.main()