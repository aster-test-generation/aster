from cookiecutter.find import NonTemplatedInputDirException
import os
import unittest
from cookiecutter.find import find_template, logger


class TestFindTemplateFunction(unittest.TestCase):
    def test_find_template_success(self):
        repo_dir = 'path/to/repo'
        os.listdir = lambda x: ['cookiecutter_{{project}}']
        result = find_template(repo_dir)
        self.assertEqual(result, os.path.join(repo_dir, 'cookiecutter_{{project}}'))

    def test_find_template_failure(self):
        repo_dir = 'path/to/repo'
        os.listdir = lambda x: ['not_a_template']
        with self.assertRaises(NonTemplatedInputDirException):
            find_template(repo_dir)

    def test_find_template_logging(self):
        repo_dir = 'path/to/repo'
        os.listdir = lambda x: ['cookiecutter_{{project}}']
        with self.assertLogs(logger, level='DEBUG') as cm:
            find_template(repo_dir)
        self.assertIn('Searching path/to/repo for the project template.', cm.output)
        self.assertIn('The project template appears to be path/to/repo/cookiecutter_{{project}}', cm.output)

if __name__ == '__main__':
    unittest.main()