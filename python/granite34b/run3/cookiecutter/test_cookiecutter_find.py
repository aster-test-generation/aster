import logging
import os
from cookiecutter.exceptions import NonTemplatedInputDirException
from cookiecutter.find import find_template


logger = logging.getLogger(__name__)

def test_find_template_success():
    repo_dir = 'path/to/repo'
    project_template = find_template(repo_dir)
    assert project_template == 'path/to/repo/cookiecutter_template'

def test_find_template_failure():
    repo_dir = 'path/to/repo'
    with pytest.raises(NonTemplatedInputDirException):
        find_template(repo_dir)

def test_find_template_private_method():
    repo_dir = 'path/to/repo'
    result = find_template._private_method(repo_dir)
    assert result == 'private_result'

def test_find_template_protected_method():
    repo_dir = 'path/to/repo'
    result = find_template._protected_method(repo_dir)
    assert result == 'protected_result'

if __name__ == '__main__':
    unittest.main()