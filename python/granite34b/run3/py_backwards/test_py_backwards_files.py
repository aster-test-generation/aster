import unittest
from py_backwards.files import get_input_output_paths, InvalidInputOutput, InputDoesntExists
from pathlib import Path


class TestGetInputOutputPaths(unittest.TestCase):
    def test_invalid_input_output(self):
        with self.assertRaises(InvalidInputOutput):
            list(get_input_output_paths('input.txt', 'output.txt', ''))

    def test_input_doesnt_exist(self):
        with self.assertRaises(InputDoesntExists):
            list(get_input_output_paths('input.py', 'output.txt', None))

    def test_single_file_conversion(self):
        input_path = Path('input.py')
        output_path = Path('output.py')
        input_output = list(get_input_output_paths(str(input_path), str(output_path), None))
        self.assertEqual(len(input_output), 1)
        self.assertEqual(input_output[0].input_path, input_path)
        self.assertEqual(input_output[0].output_path, output_path)

    def test_directory_conversion(self):
        input_path = Path('input_dir')
        output_path = Path('output_dir')
        root_path = Path('root_dir')
        input_output = list(get_input_output_paths(str(input_path), str(output_path), str(root_path)))
        self.assertEqual(len(input_output), 2)
        self.assertEqual(input_output[0].input_path, input_path.joinpath('file1.py'))
        self.assertEqual(input_output[0].output_path, output_path.joinpath('file1.py'))
        self.assertEqual(input_output[1].input_path, input_path.joinpath('file2.py'))
        self.assertEqual(input_output[1].output_path, output_path.joinpath('file2.py'))

if __name__ == '__main__':
    unittest.main()