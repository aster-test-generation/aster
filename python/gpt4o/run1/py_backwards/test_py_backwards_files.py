import unittest
from pathlib import Path
from py_backwards.files import get_input_output_paths
from py_backwards.types import InputOutput
from py_backwards.exceptions import InvalidInputOutput, InputDoesntExists


class TestGetInputOutputPaths(unittest.TestCase):
    def test_invalid_input_output(self):
        with self.assertRaises(InvalidInputOutput):
            list(get_input_output_paths('input.txt', 'output.py', None))

    def test_input_doesnt_exist(self):
        with self.assertRaises(InputDoesntExists):
            list(get_input_output_paths('nonexistent.py', 'output.py', None))

    def test_single_file_to_single_file(self):
        input_path = 'test_input.py'
        output_path = 'test_output.py'
        Path(input_path).touch()
        try:
            result = list(get_input_output_paths(input_path, output_path, None))
            self.assertEqual(result, [InputOutput(Path(input_path), Path(output_path))])
        finally:
            Path(input_path).unlink()

    def test_single_file_to_directory(self):
        input_path = 'test_input.py'
        output_dir = 'test_output_dir'
        Path(input_path).touch()
        Path(output_dir).mkdir()
        try:
            result = list(get_input_output_paths(input_path, output_dir, None))
            self.assertEqual(result, [InputOutput(Path(input_path), Path(output_dir).joinpath(Path(input_path).name))])
        finally:
            Path(input_path).unlink()
            Path(output_dir).rmdir()

    def test_directory_to_directory(self):
        input_dir = 'test_input_dir'
        output_dir = 'test_output_dir'
        Path(input_dir).mkdir()
        Path(output_dir).mkdir()
        (Path(input_dir) / 'file1.py').touch()
        (Path(input_dir) / 'file2.py').touch()
        try:
            result = list(get_input_output_paths(input_dir, output_dir, None))
            expected = [
                InputOutput(Path(input_dir) / 'file1.py', Path(output_dir) / 'file1.py'),
                InputOutput(Path(input_dir) / 'file2.py', Path(output_dir) / 'file2.py')
            ]
            self.assertEqual(result[0], expected[0])
        finally:
            (Path(input_dir) / 'file1.py').unlink()
            (Path(input_dir) / 'file2.py').unlink()
            Path(input_dir).rmdir()
            Path(output_dir).rmdir()

    def test_directory_to_directory_with_root(self):
        root_dir = 'root_dir'
        input_dir = 'root_dir/test_input_dir'
        output_dir = 'test_output_dir'
        Path(root_dir).mkdir()
        Path(input_dir).mkdir(parents=True)
        Path(output_dir).mkdir()
        (Path(input_dir) / 'file1.py').touch()
        (Path(input_dir) / 'file2.py').touch()
        try:
            result = list(get_input_output_paths(input_dir, output_dir, root_dir))
            expected = [
                InputOutput(Path(input_dir) / 'file1.py', Path(output_dir) / 'test_input_dir/file1.py'),
                InputOutput(Path(input_dir) / 'file2.py', Path(output_dir) / 'test_input_dir/file2.py')
            ]
            self.assertEqual(result[0].input, expected[0].input)
        finally:
            (Path(input_dir) / 'file1.py').unlink()
            (Path(input_dir) / 'file2.py').unlink()
            Path(input_dir).rmdir()
            Path(root_dir).rmdir()
            Path(output_dir).rmdir()

if __name__ == '__main__':
    unittest.main()