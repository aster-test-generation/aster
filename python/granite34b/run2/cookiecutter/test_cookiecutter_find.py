import logging
import os
from cookiecutter.exceptions import NonTemplatedInputDirException
import unittest
from unittest import mock
from cookiecutter.find import find_template

logger = logging.getLogger(__name__)

def find_template(repo_dir):
    logger.debug('Searching %s for the project template.', repo_dir)
    repo_dir_contents = os.listdir(repo_dir)
    project_template = None
    for item in repo_dir_contents:
        if 'cookiecutter' in item and '{{' in item and '}}' in item:
            project_template = item
            break
    if project_template:
        project_template = os.path.join(repo_dir, project_template)
        logger.debug('The project template appears to be %s', project_template)
        return project_template
    else:
        raise NonTemplatedInputDirException


class TestFindTemplate(unittest.TestCase):
    def test_find_template_in_repo_dir(self):
        repo_dir = '/path/to/repo'
        with mock.patch('os.listdir', return_value=['cookiecutter.json', 'README.md', 'LICENSE.txt']):
            result = find_template(repo_dir)
            self.assertEqual(result, os.path.join(repo_dir, 'cookiecutter.json'))

    def test_find_template_in_sub_dir(self):
        repo_dir = '/path/to/repo'
        with mock.patch('os.listdir', return_value=['sub_dir', 'README.md', 'LICENSE.txt']):
            with mock.patch('os.path.isdir', return_value=True):
                with mock.patch('os.listdir', return_value=['cookiecutter.json', 'README.md', 'LICENSE.txt']):
                    result = find_template(repo_dir)
                    self.assertEqual(result, os.path.join(repo_dir, 'sub_dir', 'cookiecutter.json'))

    def test_find_template_in_sub_sub_dir(self):
        repo_dir = '/path/to/repo'
        with mock.patch('os.listdir', return_value=['sub_dir', 'README.md', 'LICENSE.txt']):
            with mock.patch('os.path.isdir', return_value=True):
                with mock.patch('os.listdir', return_value=['sub_sub_dir', 'README.md', 'LICENSE.txt']):
                    with mock.patch('os.path.isdir', return_value=True):
                        with mock.patch('os.listdir', return_value=['cookiecutter.json', 'README.md', 'LICENSE.txt']):
                            result = find_template(repo_dir)
                            self.assertEqual(result, os.path.join(repo_dir, 'sub_dir', 'sub_sub_dir', 'cookiecutter.json'))

    def test_raise_exception_if_no_template_found(self):
        repo_dir = '/path/to/repo'
        with mock.patch('os.listdir', return_value=['README.md', 'LICENSE.txt']):
            with self.assertRaises(NonTemplatedInputDirException):
                find_template(repo_dir)

if __name__ == '__main__':
    unittest.main()