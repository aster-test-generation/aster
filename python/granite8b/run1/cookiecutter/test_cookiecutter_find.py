import unittest
import logging
import os
from cookiecutter.exceptions import NonTemplatedInputDirException
from cookiecutter.find import find_template


class TestFind(unittest.TestCase):
    def test_find_template(self):
        repo_dir = '/path/to/repo'
        project_template = find_template(repo_dir)
        self.assertEqual(project_template, '/path/to/repo/cookiecutter.json')

    def test_find_template_with_subdirectory(self):
        repo_dir = '/path/to/repo/subdirectory'
        project_template = find_template(repo_dir)
        self.assertEqual(project_template, '/path/to/repo/subdirectory/cookiecutter.json')

    def test_find_template_with_multiple_files(self):
        repo_dir = '/path/to/repo'
        os.makedirs(os.path.join(repo_dir, 'subdirectory'), exist_ok=True)
        with open(os.path.join(repo_dir, 'cookiecutter.json'), 'w') as f:
            f.write('{}')
        with open(os.path.join(repo_dir, 'subdirectory', 'cookiecutter.json'), 'w') as f:
            f.write('{}')
        project_template = find_template(repo_dir)
        self.assertEqual(project_template, '/path/to/repo/subdirectory/cookiecutter.json')

    def test_find_template_with_no_template(self):
        repo_dir = '/path/to/repo'
        with self.assertRaises(NonTemplatedInputDirException):
            find_template(os.path.join(os.path.dirname(__file__), 'data', repo_dir))

if __name__ == '__main__':
    unittest.main()