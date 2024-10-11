import unittest
from semantic_release.ci_checks import *


class TestCiChecks(unittest.TestCase):
    def test_travis(self):
        os.environ['TRAVIS_BRANCH'] = 'test_branch'
        os.environ['TRAVIS_PULL_REQUEST'] = 'false'
        self.assertTrue(travis('test_branch'))

    def test_semaphore(self):
        os.environ['BRANCH_NAME'] = 'test_branch'
        os.environ['PULL_REQUEST_NUMBER'] = None
        os.environ['SEMAPHORE_THREAD_RESULT'] = 'success'
        self.assertTrue(semaphore('test_branch'))

    def test_frigg(self):
        os.environ['FRIGG_BUILD_BRANCH'] = 'test_branch'
        os.environ['FRIGG_PULL_REQUEST'] = ''
        self.assertTrue(frigg('test_branch'))

    def test_circle(self):
        os.environ['CIRCLE_BRANCH'] = 'test_branch'
        os.environ['CI_PULL_REQUEST'] = ''
        self.assertTrue(circle('test_branch'))

    def test_gitlab(self):
        os.environ['CI_COMMIT_REF_NAME'] = 'test_branch'
        self.assertTrue(gitlab('test_branch'))

    def test_bitbucket(self):
        os.environ['BITBUCKET_BRANCH'] = 'test_branch'
        os.environ['BITBUCKET_PR_ID'] = ''
        self.assertTrue(bitbucket('test_branch'))

    def test_jenkins(self):
        os.environ['BRANCH_NAME'] = 'test_branch'
        os.environ['JENKINS_URL'] = 'https://example.com'
        os.environ['CHANGE_ID'] = ''
        self.assertTrue(jenkins('test_branch'))

    def test_check(self):
        os.environ['TRAVIS'] = 'true'
        self.assertTrue(check('test_branch'))
        os.environ['SEMAPHORE'] = 'true'
        self.assertTrue(check('test_branch'))
        os.environ['FRIGG'] = 'true'
        self.assertTrue(check('test_branch'))
        os.environ['CIRCLECI'] = 'true'
        self.assertTrue(check('test_branch'))
        os.environ['GITLAB_CI'] = 'true'
        self.assertTrue(check('test_branch'))
        os.environ['JENKINS_URL'] = 'https://example.com'
        self.assertTrue(check('test_branch'))
        os.environ['BITBUCKET_BUILD_NUMBER'] = '1'
        self.assertTrue(check('test_branch'))

class TestCiChecks(unittest.TestCase):
    def test_travis(self):
        os.environ['TRAVIS_BRANCH'] = 'master'
        os.environ['TRAVIS_PULL_REQUEST'] = 'false'
        self.assertTrue(travis('master'))

    def test_semaphore(self):
        os.environ['BRANCH_NAME'] = 'master'
        os.environ['PULL_REQUEST_NUMBER'] = None
        os.environ['SEMAPHORE_THREAD_RESULT'] = 'success'
        self.assertTrue(semaphore('master'))

    def test_frigg(self):
        os.environ['FRIGG_BUILD_BRANCH'] = 'master'
        os.environ['FRIGG_PULL_REQUEST'] = None
        self.assertTrue(frigg('master'))

    def test_circle(self):
        os.environ['CIRCLE_BRANCH'] = 'master'
        os.environ['CI_PULL_REQUEST'] = None
        self.assertTrue(circle('master'))

    def test_gitlab(self):
        os.environ['CI_COMMIT_REF_NAME'] = 'master'
        self.assertTrue(gitlab('master'))

    def test_bitbucket(self):
        os.environ['BITBUCKET_BRANCH'] = 'master'
        os.environ['BITBUCKET_PR_ID'] = None
        self.assertTrue(bitbucket('master'))

    def test_jenkins(self):
        os.environ['BRANCH_NAME'] = 'master'
        os.environ['JENKINS_URL'] = 'https://example.com'
        os.environ['CHANGE_ID'] = None
        self.assertTrue(jenkins('master'))

    def test_check(self):
        os.environ['TRAVIS'] = 'true'
        self.assertTrue(check('master'))

    def test_check_semaphore(self):
        os.environ['SEMAPHORE'] = 'true'
        self.assertTrue(check('master'))

    def test_check_frigg(self):
        os.environ['FRIGG'] = 'true'
        self.assertTrue(check('master'))

    def test_check_circle(self):
        os.environ['CIRCLECI'] = 'true'
        self.assertTrue(check('master'))

    def test_check_gitlab(self):
        os.environ['GITLAB_CI'] = 'true'
        self.assertTrue(check('master'))

    def test_check_jenkins(self):
        os.environ['JENKINS_URL'] = 'https://example.com'
        self.assertTrue(check('master'))

    def test_check_bitbucket(self):
        os.environ['BITBUCKET_BUILD_NUMBER'] = '1'
        self.assertTrue(check('master'))

    def test_check_invalid(self):
        os.environ['TRAVIS'] = 'false'
        os.environ['SEMAPHORE'] = 'false'
        os.environ['FRIGG'] = 'false'
        os.environ['CIRCLECI'] = 'false'
        os.environ['GITLAB_CI'] = 'false'
        os.environ['JENKINS_URL'] = None
        os.environ['BITBUCKET_BUILD_NUMBER'] = None
        with self.assertRaises(CiVerificationError):
            check('master')

class TestCiChecks(unittest.TestCase):
    def test_travis(self):
        os.environ['TRAVIS_BRANCH'] = 'test_branch'
        os.environ['TRAVIS_PULL_REQUEST'] = 'false'
        self.assertTrue(travis('test_branch'))

    def test_semaphore(self):
        os.environ['BRANCH_NAME'] = 'test_branch'
        os.environ['PULL_REQUEST_NUMBER'] = None
        os.environ['SEMAPHORE_THREAD_RESULT'] = 'success'
        self.assertTrue(semaphore('test_branch'))

    def test_frigg(self):
        os.environ['FRIGG_BUILD_BRANCH'] = 'test_branch'
        os.environ['FRIGG_PULL_REQUEST'] = None
        self.assertTrue(frigg('test_branch'))

    def test_circle(self):
        os.environ['CIRCLE_BRANCH'] = 'test_branch'
        os.environ['CI_PULL_REQUEST'] = None
        self.assertTrue(circle('test_branch'))

    def test_gitlab(self):
        os.environ['CI_COMMIT_REF_NAME'] = 'test_branch'
        self.assertTrue(gitlab('test_branch'))

    def test_bitbucket(self):
        os.environ['BITBUCKET_BRANCH'] = 'test_branch'
        os.environ['BITBUCKET_PR_ID'] = None
        self.assertTrue(bitbucket('test_branch'))

    def test_jenkins(self):
        os.environ['BRANCH_NAME'] = 'test_branch'
        os.environ['JENKINS_URL'] = 'http://example.com'
        os.environ['CHANGE_ID'] = None
        self.assertTrue(jenkins('test_branch'))

    def test_check(self):
        os.environ['TRAVIS'] = 'true'
        self.assertTrue(check('test_branch'))

    def test_check_semaphore(self):
        os.environ['SEMAPHORE'] = 'true'
        self.assertTrue(check('test_branch'))

    def test_check_frigg(self):
        os.environ['FRIGG'] = 'true'
        self.assertTrue(check('test_branch'))

    def test_check_circle(self):
        os.environ['CIRCLECI'] = 'true'
        self.assertTrue(check('test_branch'))

    def test_check_gitlab(self):
        os.environ['GITLAB_CI'] = 'true'
        self.assertTrue(check('test_branch'))

    def test_check_jenkins(self):
        os.environ['JENKINS_URL'] = 'http://example.com'
        self.assertTrue(check('test_branch'))

    def test_check_bitbucket(self):
        os.environ['BITBUCKET_BUILD_NUMBER'] = '1'
        self.assertTrue(check('test_branch'))

    def test_check_missing_environment_variable(self):
        os.environ.pop('TRAVIS', None)
        os.environ.pop('SEMAPHORE', None)
        os.environ.pop('FRIGG', None)
        os.environ.pop('CIRCLECI', None)
        os.environ.pop('GITLAB_CI', None)
        os.environ.pop('JENKINS_URL', None)
        os.environ.pop('BITBUCKET_BUILD_NUMBER', None)
        with self.assertRaises(CiVerificationError):
            check('test_branch')

if __name__ == '__main__':
    unittest.main()