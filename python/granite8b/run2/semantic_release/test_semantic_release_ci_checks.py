import unittest
import os
from typing import Callable
from semantic_release.errors import CiVerificationError
from semantic_release.ci_checks import checker, travis, semaphore, frigg, circle, gitlab, bitbucket, jenkins, check


def checker(func: Callable) -> Callable:
    def func_wrapper(*args, **kwargs):
        try:
            func(*args, **kwargs)
            return True
        except AssertionError:
            raise CiVerificationError(
                "The verification check for the environment did not pass."
            )
    return func_wrapper

@checker
def travis(branch: str):
    assert os.environ.get("TRAVIS_BRANCH") == branch
    assert os.environ.get("TRAVIS_PULL_REQUEST") == "false"

@checker
def semaphore(branch: str):
    assert os.environ.get("BRANCH_NAME") == branch
    assert os.environ.get("PULL_REQUEST_NUMBER") is None
    assert os.environ.get("SEMAPHORE_THREAD_RESULT") != "failed"

@checker
def frigg(branch: str):
    assert os.environ.get("FRIGG_BUILD_BRANCH") == branch
    assert not os.environ.get("FRIGG_PULL_REQUEST")

@checker
def circle(branch: str):
    assert os.environ.get("CIRCLE_BRANCH") == branch
    assert not os.environ.get("CI_PULL_REQUEST")

@checker
def gitlab(branch: str):
    assert os.environ.get("CI_COMMIT_REF_NAME") == branch

@checker
def bitbucket(branch: str):
    assert os.environ.get("BITBUCKET_BRANCH") == branch
    assert not os.environ.get("BITBUCKET_PR_ID")

@checker
def jenkins(branch: str):
    branch_name = os.environ.get("BRANCH_NAME") or os.environ.get("GIT_BRANCH")
    assert os.environ.get("JENKINS_URL") is not None
    assert branch_name == branch
    assert not os.environ.get("CHANGE_ID")


def test_checker():
    @checker
    def func():
        pass
    assert callable(func)

def test_travis():
    assert travis.__name__ == "travis"
    assert travis.__doc__ == "Check if the current environment is Travis CI."
    assert travis.__annotations__ == {"branch": str}

def test_semaphore():
    assert semaphore.__name__ == "semaphore"
    assert semaphore.__doc__ == "Check if the current environment is Semaphore CI."
    assert semaphore.__annotations__ == {"branch": str}

def test_frigg():
    assert frigg.__name__ == "frigg"
    assert frigg.__doc__ == "Check if the current environment is Frigg CI."
    assert frigg.__annotations__ == {"branch": str}

def test_circle():
    assert circle.__name__ == "circle"
    assert circle.__doc__ == "Check if the current environment is CircleCI."
    assert circle.__annotations__ == {"branch": str}

def test_gitlab():
    assert gitlab.__name__ == "gitlab"
    assert gitlab.__doc__ == "Check if the current environment is GitLab CI."
    assert gitlab.__annotations__ == {"branch": str}

def test_bitbucket():
    assert bitbucket.__name__ == "bitbucket"
    assert bitbucket.__doc__ == "Check if the current environment is Bitbucket Pipelines."
    assert bitbucket.__annotations__ == {"branch": str}

def test_jenkins():
    assert jenkins.__name__ == "jenkins"
    assert jenkins.__doc__ == "Check if the current environment is Jenkins."
    assert jenkins.__annotations__ == {"branch": str}

if __name__ == '__main__':
    unittest.main()