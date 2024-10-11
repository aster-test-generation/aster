import unittest
from unittest.mock import patch
from py_backwards.files import get_input_output_paths

class TestGetInputOutputPaths(unittest.TestCase):
    @patch('pathlib.Path.exists')
    def test_input_doesnt_exists(self, mock_exists):
        mock_exists.return_value = False
        with self.assertRaises(InputDoesntExists):
            get_input_output_paths('input.py', 'output.py', None)

    @patch('pathlib.Path.exists')
    def test_output_ends_with_py_and_input_doesnt(self, mock_exists):
        mock_exists.return_value = True
        with self.assertRaises(InvalidInputOutput):
            get_input_output_paths('input', 'output.py', None)

    @patch('pathlib.Path.exists')
    def test_input_and_output_ends_with_py(self, mock_exists):
        mock_exists.return_value = True
        result = list(get_input_output_paths('input.py', 'output.py', None))
        self.assertEqual(len(result), 1)
        self.assertIsInstance(result[0], tuple)
        self.assertIsInstance(result[0][0], pathlib.Path)
        self.assertIsInstance(result[0][1], pathlib.Path)

    @patch('pathlib.Path.exists')
    def test_input_and_output_ends_with_py_with_root(self, mock_exists):
        mock_exists.return_value = True
        result = list(get_input_outputPaths('input.py', 'output', None, 'root'))
        self.assertEqual(len(result), 1)
        self.assertIsInstance(result[0], tuple)
        self.assertIsInstance(result[0][0], pathlib.Path)
        self.assertIsInstance(result[0][1], pathlib.Path)

    @patch('pathlib.Path.exists')
    def test_input_and_output_ends_with_py_without_root(self, mock_exists):
        mock_exists.return_value = True
        result = list(get_input_outputPaths('input.py', 'output', None))
        self.assertEqual(len(result), 1)
        self.assertIsInstance(result[0], tuple)
        self.assertIsInstance(result[0][0], pathlib.Path)
        self.assertIsInstance(result[0][1], pathlib.Path)

    @patch('pathlib.Path.exists')
    def test_input_and_output_ends_with_py_with_subdirectory(self, mock_exists):
        mock_exists.return_value = True
        result = list(get_input_outputPaths('input/subdirectory/input.py', 'output', None))
        self.assertEqual(len(result), 1)
        self.assertIsInstance(result[0], tuple)
        self.assertIsInstance(result[0][0], pathlib.Path)
        self.assertIsInstance(result[0][1], pathlib.Path)

if __name__ == '__main__':
    unittest.main()