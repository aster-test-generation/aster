import unittest
from unittest.mock import patch
from py_backwards.files import get_input_output_paths

class TestGetInputOutputPaths(unittest.TestCase):
    def test_valid_input_output_paths(self):
        input_path = 'path/to/input.py'
        output_path = 'path/to/output.py'
        root = None
        result = list(get_input_output_paths(input_path, output_path, root))
        self.assertEqual(len(result), 1)
        self.assertEqual(result[0].input_path, Path(input_path))
        self.assertEqual(result[0].output_path, Path(output_path))

    def test_invalid_input_output_paths(self):
        input_path = 'path/to/input'
        output_path = 'path/to/output.py'
        root = None
        with self.assertRaises(InvalidInputOutput):
            list(get_input_output_paths(input_path, output_path, root))

    def test_input_doesnt_exists(self):
        input_path = 'path/to/non_existent_input.py'
        output_path = 'path/to/output.py'
        root = None
        with self.assertRaises(InputDoesntExists):
            list(get_input_output_paths(input_path, output_path, root))

    def test_root_path(self):
        input_path = 'path/to/input.py'
        output_path = 'path/to/output'
        root = 'path/to/root'
        result = list(get_input_output_paths(input_path, output_path, root))
        self.assertEqual(len(result), 1)
        self.assertEqual(result[0].input_path, Path(input_path))
        self.assertEqual(result[0].output_path, Path(output_path).joinpath(input_path.name))

    def test_nested_input_paths(self):
        input_path = 'path/to/input/subdir1/subdir2/input.py'
        output_path = 'path/to/output'
        root = 'path/to/root'
        result = list(get_input_output_paths(input_path, output_path, root))
        self.assertEqual(len(result), 1)
        self.assertEqual(result[0].input_path, Path(input_path))
        self.assertEqual(result[0].output_path, Path(output_path).joinpath(input_path.name))

    @patch('pathlib.Path.exists')
    def test_path_exists(self, mock_exists):
        input_path = 'path/to/input.py'
        output_path = 'path/to/output.py'
        root = None
        mock_exists.return_value = True
        result = list(get_input_output_paths(input_path, output_path, root))
        self.assertEqual(len(result), 1)
        self.assertEqual(result[0].input_path, Path(input_path))
        self.assertEqual(result[0].output_path, Path(output_path))

    @patch('pathlib.Path.exists')
    def test_path_doesnt_exists(self, mock_exists):
        input_path = 'path/to/non_existent_input.py'
        output_path = 'path/to/output.py'
        root = None
        mock_exists.return_value = False
        with self.assertRaises(InputDoesntExists):
            list(get_input_output_paths(input_path, output_path, root))

if __name__ == '__main__':
    unittest.main()