import unittest
from unittest.mock import patch
from pathlib import Path
from py_backwards.files import get_input_output_paths



class InputOutput:
    def __init__(self, input_path, output_path):
        self.input_path = input_path
        self.output_path = output_path

class TestGetInputOutputPaths(unittest.TestCase):
    def test_get_input_output_paths_valid_input_output(self):
        input_path = 'path/to/input.py'
        output_path = 'path/to/output.py'
        root = None
        expected_output = [InputOutput(Path(input_path), Path(output_path))]
        with patch('pathlib.Path.exists', return_value=True):
            result = list(get_input_output_paths(input_path, output_path, root))
            self.assertEqual(result, [expected_output[0]])

    def test_get_input_output_paths_invalid_input_output(self):
        input_path = 'path/to/input'
        output_path = 'path/to/output.py'
        root = None
        with self.assertRaises(FileNotFoundError):
            get_input_output_paths(input_path, output_path, root)

    def test_get_input_output_paths_input_doesnt_exists(self):
        input_path = 'path/to/non_existent_input.py'
        output_path = 'path/to/output.py'
        root = None
        with self.assertRaises(FileNotFoundError):
            get_input_output_paths(input_path, output_path, root)

    def test_get_input_output_paths_nested_input(self):
        input_path = 'path/to/input_dir'
        output_path = 'path/to/output_dir'
        root = 'path/to/root'
        expected_output = [InputOutput(Path('path/to/input_dir/file1.py'), Path('path/to/output_dir/file1.py')),
                           InputOutput(Path('path/to/input_dir/file2.py'), Path('path/to/output_dir/file2.py'))]
        with patch('pathlib.Path.exists', return_value=True):
            result = list(get_input_output_paths(input_path, output_path, root))
            self.assertEqual(result, expected_output)

    def test_get_input_output_paths_root(self):
        input_path = 'path/to/input_dir'
        output_path = 'path/to/output_dir'
        root = 'path/to/root'
        expected_output = [InputOutput(Path('path/to/input_dir/file1.py'), Path('path/to/output_dir/file1.py')),
                           InputOutput(Path('path/to/input_dir/file2.py'), Path('path/to/output_dir/file2.py'))]
        with patch('pathlib.Path.exists', return_value=True):
            result = list(get_input_output_paths(input_path, output_path, root))
            self.assertEqual(result, expected_output)


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