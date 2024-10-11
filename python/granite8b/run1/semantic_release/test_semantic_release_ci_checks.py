import unittest
import os
from typing import Callable
from semantic_release.errors import CiVerificationError
from semantic_release.ci_checks import checker, travis, semaphore, frigg, circle, gitlab, bitbucket, jenkins, check


def test_checker_decorator():
    @checker
    def func():
        pass
    assert hasattr(func, "__wrapped__")
    assert callable(func)

def test_travis_checker():
    os.environ["TRAVIS_BRANCH"] = "master"
    os.environ["TRAVIS_PULL_REQUEST"] = "false"
    travis("master")

def test_semaphore_checker():
    os.environ["BRANCH_NAME"] = "master"
    os.environ["PULL_REQUEST_NUMBER"] = "0"
    os.environ["SEMAPHORE_THREAD_RESULT"] = "success"
    semaphore("master")

def test_frigg_checker():
    os.environ["FRIGG_BUILD_BRANCH"] = "master"
    os.environ["FRIGG_PULL_REQUEST"] = "false"
    frigg("master")

def test_circle_checker():
    os.environ["CIRCLE_BRANCH"] = "master"
    os.environ["CI_PULL_REQUEST"] = "false"
    circle("master")

def test_gitlab_checker():
    os.environ["CI_COMMIT_REF_NAME"] = "master"
    gitlab("master")

def test_bitbucket_checker():
    os.environ["BITBUCKET_BRANCH"] = "master"
    os.environ["BITBUCKET_PR_ID"] = "0"
    bitbucket("master")

def test_jenkins_checker():
    os.environ["BRANCH_NAME"] = "master"
    os.environ["GIT_BRANCH"] = "master"
    os.environ["JENKINS_URL"] = "http://jenkins.example.com"
    jenkins("master")

if __name__ == '__main__':
    unittest.main()