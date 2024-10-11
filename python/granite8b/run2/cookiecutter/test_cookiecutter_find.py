from cookiecutter.find import find_template
import unittest
import logging
import os
from cookiecutter.exceptions import NonTemplatedInputDirException


class TestFindTemplate(unittest.TestCase):
    def test_find_template_with_template(self):
        repo_dir = '/path/to/repo'
        os.makedirs(os.path.join(repo_dir, 'cookiecutter'))
        with open(os.path.join(repo_dir, 'cookiecutter', '{{cookiecutter.project_name}}'), 'w') as f:
            f.write('test')
        project_template = find_template(repo_dir)
        self.assertEqual(project_template, os.path.join(repo_dir, 'cookiecutter', '{{cookiecutter.project_name}}'))

if __name__ == '__main__':
    unittest.main()