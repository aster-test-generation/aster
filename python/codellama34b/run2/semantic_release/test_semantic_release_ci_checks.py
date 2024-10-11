import unittest
from semantic_release.ci_checks import *



class TestChecker(unittest.TestCase):
    def test_checker(self):
        def func(*args, **kwargs):
            pass
        result = checker(func)
        self.assertEqual(result.__name__, "func_wrapper")

class TestTravis(unittest.TestCase):
    def test_travis(self):
        os.environ["TRAVIS_BRANCH"] = "master"
        os.environ["TRAVIS_PULL_REQUEST"] = "false"
        result = travis("master")
        self.assertEqual(result, True)

class TestSemaphore(unittest.TestCase):
    def test_semaphore(self):
        os.environ["BRANCH_NAME"] = "master"
        os.environ["PULL_REQUEST_NUMBER"] = "1"
        os.environ["SEMAPHORE_THREAD_RESULT"] = "passed"
        result = semaphore("master")
        self.assertEqual(result, True)

class TestFrigg(unittest.TestCase):
    def test_frigg(self):
        os.environ["FRIGG_BUILD_BRANCH"] = "master"
        os.environ["FRIGG_PULL_REQUEST"] = "None"
        result = frigg("master")
        self.assertEqual(result, True)

class TestCircle(unittest.TestCase):
    def test_circle(self):
        os.environ["CIRCLE_BRANCH"] = "master"
        os.environ["CI_PULL_REQUEST"] = "None"
        result = circle("master")
        self.assertEqual(result, True)

class TestGitlab(unittest.TestCase):
    def test_gitlab(self):
        os.environ["CI_COMMIT_REF_NAME"] = "master"
        result = gitlab("master")
        self.assertEqual(result, True)

class TestBitbucket(unittest.TestCase):
    def test_bitbucket(self):
        os.environ["BITBUCKET_BRANCH"] = "master"
        os.environ["BITBUCKET_PR_ID"] = "None"
        result = bitbucket("master")
        self.assertEqual(result, True)

class TestJenkins(unittest.TestCase):
    def test_jenkins(self):
        os.environ["BRANCH_NAME"] = "master"
        os.environ["GIT_BRANCH"] = "master"
        os.environ["JENKINS_URL"] = "master"
        os.environ["CHANGE_ID"] = "None"
        result = jenkins("master")
        self.assertEqual(result, True)



class TestChecker(unittest.TestCase):
    def test_checker(self):
        def func(x):
            return x + 1
        result = checker(func)(1)
        self.assertEqual(result, 2)

class TestSemaphore(unittest.TestCase):
    def test_semaphore(self):
        os.environ["BRANCH_NAME"] = "master"
        os.environ["PULL_REQUEST_NUMBER"] = None
        os.environ["SEMAPHORE_THREAD_RESULT"] = "success"
        result = semaphore("master")
        self.assertEqual(result, True)

class TestFrigg(unittest.TestCase):
    def test_frigg(self):
        os.environ["FRIGG_BUILD_BRANCH"] = "master"
        os.environ["FRIGG_PULL_REQUEST"] = None
        result = frigg("master")
        self.assertEqual(result, True)

class TestCircle(unittest.TestCase):
    def test_circle(self):
        os.environ["CIRCLE_BRANCH"] = "master"
        os.environ["CI_PULL_REQUEST"] = None
        result = circle("master")
        self.assertEqual(result, True)

class TestBitbucket(unittest.TestCase):
    def test_bitbucket(self):
        os.environ["BITBUCKET_BRANCH"] = "master"
        os.environ["BITBUCKET_PR_ID"] = None
        result = bitbucket("master")
        self.assertEqual(result, True)

class TestJenkins(unittest.TestCase):
    def test_jenkins(self):
        os.environ["JENKINS_URL"] = "http://jenkins.com"
        os.environ["BRANCH_NAME"] = "master"
        os.environ["GIT_BRANCH"] = "master"
        os.environ["CHANGE_ID"] = None
        result = jenkins("master")
        self.assertEqual(result, True)

class TestCheck(unittest.TestCase):
    def test_check(self):
        os.environ["TRAVIS"] = "true"
        os.environ["TRAVIS_BRANCH"] = "master"
        os.environ["TRAVIS_PULL_REQUEST"] = "false"
        result = check("master")
        self.assertEqual(result, True)

if __name__ == '__main__':
    unittest.main()