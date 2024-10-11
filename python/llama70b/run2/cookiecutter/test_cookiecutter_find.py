from cookiecutter.find import NonTemplatedInputDirException
import unittest
from cookiecutter.find import find_template, logger


class TestFindTemplateFunction(unittest.TestCase):
    def test_find_template(self):
        repo_dir = 'path/to/repo'
        result = find_template(repo_dir)
        self.assertIsInstance(result, str)

    def test_find_template_non_templated_input_dir(self):
        repo_dir = 'path/to/non-templated/repo'
        with self.assertRaises(NonTemplatedInputDirException):
            find_template(repo_dir)

    def test_find_template_logger_debug(self):
        repo_dir = 'path/to/repo'
        with self.assertLogs(logger, level='DEBUG') as cm:
            find_template(repo_dir)
        self.assertIn('Searching path/to/repo for the project template.', cm.output)

    def test_find_template_logger_debug_template_found(self):
        repo_dir = 'path/to/repo'
        with self.assertLogs(logger, level='DEBUG') as cm:
            find_template(repo_dir)
        self.assertIn('The project template appears to be path/to/repo/template', cm.output)

if __name__ == '__main__':
    unittest.main()