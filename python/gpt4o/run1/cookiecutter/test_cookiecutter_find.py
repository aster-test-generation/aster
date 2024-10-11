import unittest
import os
import logging
from unittest.mock import patch, MagicMock
from cookiecutter.find import find_template
from cookiecutter.exceptions import NonTemplatedInputDirException


class TestFindTemplate(unittest.TestCase):
    @patch('cookiecutter.find.os.listdir')
    @patch('cookiecutter.find.logger')
    def test_find_template_success(self, mock_logger, mock_listdir):
        mock_listdir.return_value = ['cookiecutter-project{{cookiecutter}}']
        repo_dir = '/fake/dir'
        expected_template = os.path.join(repo_dir, 'cookiecutter-project{{cookiecutter}}')
        
        result = find_template(repo_dir)
        
        mock_logger.debug.assert_called_with('The project template appears to be %s', expected_template)
        self.assertEqual(result, expected_template)

    @patch('cookiecutter.find.os.listdir')
    @patch('cookiecutter.find.logger')
    def test_find_template_failure(self, mock_logger, mock_listdir):
        mock_listdir.return_value = ['not-a-template']
        repo_dir = '/fake/dir'
        
        with self.assertRaises(NonTemplatedInputDirException):
            find_template(repo_dir)
        
        mock_logger.debug.assert_called_with('Searching %s for the project template.', repo_dir)

if __name__ == '__main__':
    unittest.main()