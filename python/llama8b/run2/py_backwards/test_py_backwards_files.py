import unittest
from pathlib import Path
from py_backwards.files import get_input_output_paths
from unittest.mock import patch


class TestGetInputOutputPaths(unittest.TestCase):
    def test_valid_input_output_paths(self):
        input_path = 'path/to/input.py'
        output_path = 'path/to/output.py'
        root = None
        result = list(get_input_output_paths(input_path, output_path, root))
        self.assertEqual(len(result), 1)
        self.assertEqual(result[0].input, Path(input_path))
        self.assertEqual(result[0].output, Path(output_path))

    def test_invalid_input_output_paths(self):
        input_path = 'path/to/input'
        output_path = 'path/to/output.py'
        root = None
        with self.assertRaises(FileNotFoundError):
            list(get_input_output_paths(input_path, output_path, root))

    def test_input_doesnt_exists(self):
        input_path = 'path/to/non_existent.py'
        output_path = 'path/to/output.py'
        root = None
        with self.assertRaises(FileNotFoundError):
            list(get_input_outputPaths(input_path, output_path, root))

    def test_root_provided(self):
        input_path = 'path/to/input.py'
        output_path = 'path/to/output'
        root = 'path/to/root'
        result = list(get_input_output_paths(input_path, output_path, root))
        self.assertEqual(len(result), 1)
        self.assertEqual(result[0].input, Path(input_path).relative_to(Path(root)))
        self.assertEqual(result[0].output, Path(output_path).joinpath(input_path.name))

    def test_nested_input_files(self):
        input_path = 'path/to/input_dir'
        output_path = 'path/to/output_dir'
        root = 'path/to/root'
        result = list(get_input_output_paths(input_path, output_path, root))
        self.assertEqual(len(result), 3)
        for i in range(3):
            self.assertEqual(result[i].input, Path(f'{input_path}/file{i}.py').relative_to(Path(root)))
            self.assertEqual(result[i].output, Path(f'{output_path}/file{i}.py'))

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