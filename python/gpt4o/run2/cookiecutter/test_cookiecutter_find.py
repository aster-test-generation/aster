import unittest
import os
from unittest.mock import patch, MagicMock
from cookiecutter.find import find_template
from cookiecutter.exceptions import NonTemplatedInputDirException


class TestFindTemplate(unittest.TestCase):
    @patch('cookiecutter.find.os.listdir')
    def test_find_template_success(self, mock_listdir):
        mock_listdir.return_value = ['cookiecutter-project{{cookiecutter}}']
        repo_dir = '/fake/dir'
        expected_template_path = os.path.join(repo_dir, 'cookiecutter-project{{cookiecutter}}')
        
        result = find_template(repo_dir)
        self.assertEqual(result, expected_template_path)

    @patch('cookiecutter.find.os.listdir')
    def test_find_template_failure(self, mock_listdir):
        mock_listdir.return_value = ['not_a_template']
        repo_dir = '/fake/dir'
        
        with self.assertRaises(NonTemplatedInputDirException):
            find_template(repo_dir)

    @patch('cookiecutter.find.os.listdir')
    def test_find_template_empty_dir(self, mock_listdir):
        mock_listdir.return_value = []
        repo_dir = '/fake/dir'
        
        with self.assertRaises(NonTemplatedInputDirException):
            find_template(repo_dir)

    @patch('cookiecutter.find.os.listdir')
    def test_find_template_multiple_templates(self, mock_listdir):
        mock_listdir.return_value = [
            'cookiecutter-project{{cookiecutter}}',
            'another-cookiecutter{{cookiecutter}}'
        ]
        repo_dir = '/fake/dir'
        expected_template_path = os.path.join(repo_dir, 'cookiecutter-project{{cookiecutter}}')
        
        result = find_template(repo_dir)
        self.assertEqual(result, expected_template_path)

if __name__ == '__main__':
    unittest.main()