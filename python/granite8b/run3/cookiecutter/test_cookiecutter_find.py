from cookiecutter.find import find_template
import unittest
import logging
import os
from cookiecutter.exceptions import NonTemplatedInputDirException


class TestFindTemplate(unittest.TestCase):
    def test_find_template_in_dir(self):
        repo_dir = 'path/to/repo'
        project_template = find_template(repo_dir)
        self.assertEqual(project_template, 'path/to/repo/cookiecutter')

    def test_find_template_in_subdir(self):
        repo_dir = 'path/to/repo'
        os.makedirs(os.path.join(repo_dir, 'subdirectory'), exist_ok=True)
        with open(os.path.join(repo_dir, 'subdirectory', 'cookiecutter'), 'w') as f:
            f.write('This is a project template.')
        project_template = find_template(repo_dir)
        self.assertEqual(project_template, 'path/to/repo/subdirectory/cookiecutter')

    def test_find_template_in_nested_subdir(self):
        repo_dir = 'path/to/repo'
        os.makedirs(os.path.join(repo_dir, 'subdirectory', 'subdirectory2'), exist_ok=True)
        with open(os.path.join(repo_dir, 'subdirectory', 'subdirectory2', 'cookiecutter'), 'w') as f:
            f.write('This is a project template.')
        project_template = find_template(repo_dir)
        self.assertEqual(project_template, 'path/to/repo/subdirectory/subdirectory2/cookiecutter')

    def test_find_template_in_parent_dir(self):
        repo_dir = 'path/to/repo'
        os.makedirs(os.path.join(repo_dir, '..', 'parent_dir'), exist_ok=True)
        with open(os.path.join(repo_dir, '..', 'parent_dir', 'cookiecutter'), 'w') as f:
            f.write('This is a project template.')
        project_template = find_template(repo_dir)
        self.assertEqual(project_template, 'path/to/repo/../parent_dir/cookiecutter')

    def test_find_template_in_grandparent_dir(self):
        repo_dir = 'path/to/repo'
        os.makedirs(os.path.join(repo_dir, '..', '..', 'grandparent_dir'))
        with open(os.path.join(repo_dir, '..', '..', 'grandparent_dir', 'cookiecutter'), 'w') as f:
            f.write('This is a project template.')
        project_template = find_template(repo_dir)
        self.assertEqual(project_template, 'path/to/repo/../..grandparent_dir/cookiecutter')

    def test_find_template_in_parent_and_grandparent_dir(self):
        repo_dir = 'path/to/repo'
        os.makedirs(os.path.join(repo_dir, '..', 'parent_dir'), exist_ok=True)
        os.makedirs(os.path.join(repo_dir, '..', '..', 'grandparent_dir'))
        with open(os.path.join(repo_dir, '..', 'parent_dir', 'cookiecutter'), 'w') as f:
            f.write('This is a project template.')
        with open(os.path.join(repo_dir, '..', '..', 'grandparent_dir', 'cookiecutter'), 'w') as f:
            f.write('This is a project template.')
        project_template = find_template(repo_dir)
        self.assertEqual(project_template, 'path/to/repo/../..grandparent_dir/cookiecutter')

    def test_find_template_in_current_dir(self):
        repo_dir = 'path/to/repo'
        with open(os.path.join(repo_dir, 'cookiecutter'), 'w') as f:
            f.write('This is a project template.')
        project_template = find_template(repo_dir)
        self.assertEqual(project_template, 'path/to/repo/cookiecutter')

if __name__ == '__main__':
    unittest.main()