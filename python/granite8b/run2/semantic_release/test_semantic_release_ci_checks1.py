import os
from typing import Callable
from semantic_release.errors import CiVerificationError
from semantic_release.ci_checks import checker, travis, semaphore, frigg, circle, gitlab, bitbucket, jenkins, check

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