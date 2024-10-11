import unittest
import os
import logging
from unittest.mock import patch, MagicMock
from cookiecutter.find import find_template
from cookiecutter.exceptions import NonTemplatedInputDirException


class TestFindTemplate(unittest.TestCase):
    @patch('os.listdir')
    @patch('os.path.join')
    @patch('cookiecutter.find.logger')
    def test_find_template_success(self, mock_logger, mock_path_join, mock_listdir):
        mock_listdir.return_value = ['cookiecutter-project{{cookiecutter}}']
        mock_path_join.return_value = '/fake/path/cookiecutter-project{{cookiecutter}}'
        
        result = find_template('/fake/path')
        
        mock_logger.debug.assert_called_with('The project template appears to be %s', '/fake/path/cookiecutter-project{{cookiecutter}}')
        self.assertEqual(result, '/fake/path/cookiecutter-project{{cookiecutter}}')

    @patch('os.listdir')
    @patch('cookiecutter.find.logger')
    def test_find_template_failure(self, mock_logger, mock_listdir):
        mock_listdir.return_value = ['not-a-template']
        
        with self.assertRaises(NonTemplatedInputDirException):
            find_template('/fake/path')
        
        mock_logger.debug.assert_called_with('Searching %s for the project template.', '/fake/path')

if __name__ == '__main__':
    unittest.main()