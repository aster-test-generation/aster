from cookiecutter.find import NonTemplatedInputDirException
import unittest
from cookiecutter.find import find_template


class TestFindTemplate(unittest.TestCase):
    def test_find_template_in_repo_dir(self):
        repo_dir = 'path/to/repo'
        project_template = find_template(repo_dir)
        self.assertIsNotNone(project_template)

    def test_find_template_in_empty_repo_dir(self):
        repo_dir = 'path/to/empty/repo'
        with self.assertRaises(NonTemplatedInputDirException):
            find_template(repo_dir)

    def test_find_template_in_repo_dir_with_no_template(self):
        repo_dir = 'path/to/repo/with/no/template'
        with self.assertRaises(NonTemplatedInputDirException):
            find_template(repo_dir)

if __name__ == '__main__':
    unittest.main()