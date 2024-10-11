import os
from typing import Callable
from semantic_release.errors import CiVerificationError
from semantic_release.ci_checks import checker, travis, semaphore, frigg, circle, gitlab, bitbucket, jenkins, check


class TestChecker:
    def test_checker_decorator(self):
        @checker
        def func():
            pass
        assert callable(func)
        assert hasattr(func, "__wrapped__")
        assert func.__wrapped__.__name__ == "func"

    def test_checker_decorator_with_args(self):
        @checker
        def func(arg):
            assert arg == "test"
        func("test")

    def test_checker_decorator_with_kwargs(self):
        @checker
        def func(**kwargs):
            assert kwargs == {"arg": "test"}
        func(arg="test")

class TestTravis:
    def test_travis_with_correct_env(self):
        os.environ["TRAVIS_BRANCH"] = "test"
        os.environ["TRAVIS_PULL_REQUEST"] = "false"
        travis("test")

    def test_travis_with_incorrect_env(self):
        os.environ["TRAVIS_BRANCH"] = "test"
        os.environ["TRAVIS_PULL_REQUEST"] = "false"
        with self.assertRaises(CiVerificationError) as cm:
            travis(" incorrect")

class TestSemaphore:
    def test_semaphore_with_correct_env(self):
        os.environ["BRANCH_NAME"] = "test"
        os.environ["PULL_REQUEST_NUMBER"] = "0"
        os.environ["SEMAPHORE_THREAD_RESULT"] = "0"
        semaphore("test")

    def test_semaphore_with_incorrect_env(self):
        os.environ["BRANCH_NAME"] = "test"
        os.environ["PULL_REQUEST_NUMBER"] = "0"
        os.environ["SEMAPHORE_THREAD_RESULT"] = "0"
        with self.assertRaises(CiVerificationError):
            semaphore(" incorrect")

class TestFrigg:
    def test_frigg_with_correct_env(self):
        os.environ["FRIGG_BUILD_BRANCH"] = "test"
        os.environ["FRIGG_PULL_REQUEST"] = "false"
        frigg("test")

    def test_frigg_with_incorrect_env(self):
        os.environ["FRIGG_BUILD_BRANCH"] = "test"
        os.environ["FRIGG_PULL_REQUEST"] = "false"
        with self.assertRaises(CiVerificationError) as cm:
            frigg(" incorrect")

class TestCircle:
    def test_circle_with_correct_env(self):
        os.environ["CIRCLE_BRANCH"] = "test"
        os.environ["CI_PULL_REQUEST"] = "false"
        circle("test")

    def test_circle_with_incorrect_env(self):
        os.environ["CIRCLE_BRANCH"] = "test"
        os.environ["CI_PULL_REQUEST"] = "false"
        with self.assertRaises(CiVerificationError) as cm:
            circle(" incorrect")

class TestGitlab:
    def test_gitlab_with_correct_env(self):
        os.environ["CI_COMMIT_REF_NAME"] = "test"
        gitlab("test")

    def test_gitlab_with_incorrect_env(self):
        os.environ["CI_COMMIT_REF_NAME"] = "test"
        with self.assertRaises(CiVerificationError) as cm:
            gitlab(" incorrect")

class TestBitbucket:
    def test_bitbucket_with_correct_env(self):
        os.environ["BITBUCKET_BRANCH"] = "test"
        os.environ["BITBUCKET_PR_ID"] = "0"
        bitbucket("test")

    def test_bitbucket_with_incorrect_env(self):
        os.environ["BITBUCKET_BRANCH"] = "test"
        os.environ["BITBUCKET_PR_ID"] = "0"
        with self.assertRaises(CiVerificationError) as cm:
            bitbucket(" incorrect")

class TestJenkins:
    def test_jenkins_with_correct_env(self):
        os.environ["BRANCH_NAME"] = "test"
        os.environ["JENKINS_URL"] = "test"
        jenkins("test")

if __name__ == '__main__':
    unittest.main()