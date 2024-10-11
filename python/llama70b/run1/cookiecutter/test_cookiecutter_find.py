import os
import unittest
from cookiecutter.find import find_template, logger
from cookiecutter.exceptions import NonTemplatedInputDirException


class TestFindTemplateFunction(unittest.TestCase):
    def test_find_template_success(self):
        repo_dir = 'path/to/repo'
        os.listdir = lambda x: ['cookiecutter_{{}}_template']
        result = find_template(repo_dir)
        self.assertEqual(result, os.path.join(repo_dir, 'cookiecutter_{{}}_template'))

    def test_find_template_failure(self):
        repo_dir = 'path/to/repo'
        os.listdir = lambda x: ['not_a_template']
        with self.assertRaises(NonTemplatedInputDirException):
            find_template(repo_dir)

    def test_find_template_logger_debug(self):
        repo_dir = 'path/to/repo'
        os.listdir = lambda x: ['cookiecutter_{{}}_template']
        with self.assertLogs(logger, level='DEBUG') as cm:
            find_template(repo_dir)
        self.assertIn('Searching path/to/repo for the project template.', cm.output)

class TestLogger(unittest.TestCase):
    def test_logger_debug(self):
        logger.debug('Test debug message')
        self.assertTrue(True)  # just to make sure the logger doesn't raise an exception

if __name__ == '__main__':
    unittest.main()