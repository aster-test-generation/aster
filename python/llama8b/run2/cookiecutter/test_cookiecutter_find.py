from cookiecutter.find import NonTemplatedInputDirException
import unittest
from cookiecutter.find import find_template


class TestFindTemplate(unittest.TestCase):
    def test_find_template(self):
        result = find_template('/path/to/repo')
        self.assertEqual(result, '/path/to/repo/project_template')

    def test_find_template_non_existent(self):
        with self.assertRaises(NonTemplatedInputDirException):
            find_template('/path/to/non_existent_repo')

    def test_find_template_empty_dir(self):
        with self.assertRaises(NonTemplatedInputDirException):
            find_template('/path/to/empty_dir')

    def test_find_template_multiple_templates(self):
        with self.assertRaises(NonTemplatedInputDirException):
            find_template('/path/to/multiple_templates')

    def test_find_template_logger_debug(self):
        with self.assertLogs(level='DEBUG') as cm:
            find_template('/path/to/repo')
            self.assertEqual(len(cm.records), 2)

if __name__ == '__main__':
    unittest.main()