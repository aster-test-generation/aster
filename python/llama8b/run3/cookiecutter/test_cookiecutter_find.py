import unittest
from cookiecutter.find import find_template
from unittest.mock import patch, mock_open, Mock
from cookiecutter.exceptions import NonTemplatedInputDirException


class TestFindTemplate(unittest.TestCase):
    @patch('os.listdir')
    @patch('os.path.join')
    @patch('logging.getLogger')
    @patch('logging.debug')
    def test_find_template(self, mock_debug, mock_get_logger, mock_join, mock_listdir):
        mock_listdir.return_value = ['cookiecutter', 'template']
        mock_join.return_value = 'path/to/template'
        mock_get_logger.return_value = Mock()
        mock_get_logger().debug = mock_debug
        result = find_template('path/to/repo')
        mock_debug.assert_called_once_with('Searching path/to/repo for the project template.')
        self.assertEqual(result, 'path/to/template')

    @patch('os.listdir')
    @patch('os.path.join')
    @patch('logging.getLogger')
    @patch('logging.debug')
    def test_find_template_no_template(self, mock_debug, mock_get_logger, mock_join, mock_listdir):
        mock_listdir.return_value = []
        mock_join.return_value = 'path/to/template'
        mock_get_logger.return_value = Mock()
        mock_get_logger().debug = mock_debug
        with self.assertRaises(NonTemplatedInputDirException):
            find_template('path/to/repo')

    @patch('os.listdir')
    @patch('os.path.join')
    @patch('logging.getLogger')
    @patch('logging.debug')
    def test_find_template_template_not_found(self, mock_debug, mock_get_logger, mock_join, mock_listdir):
        mock_listdir.return_value = ['file1', 'file2']
        mock_join.return_value = 'path/to/template'
        mock_get_logger.return_value = Mock()
        mock_get_logger().debug = mock_debug
        with self.assertRaises(NonTemplatedInputDirException):
            find_template('path/to/repo')

    @patch('os.listdir')
    @patch('os.path.join')
    @patch('logging.getLogger')
    @patch('logging.debug')
    def test_find_template_template_found_with_subdir(self, mock_debug, mock_get_logger, mock_join, mock_listdir):
        mock_listdir.return_value = ['cookiecutter', 'template/subdir']
        mock_join.return_value = 'path/to/template/subdir'
        mock_get_logger.return_value = Mock()
        mock_get_logger().debug = mock_debug
        with self.assertRaises(NonTemplatedInputDirException):
            find_template('path/to/repo')

if __name__ == '__main__':
    unittest.main()