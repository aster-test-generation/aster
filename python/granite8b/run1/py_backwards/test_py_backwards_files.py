import unittest
from py_backwards.files import get_input_output_paths


class TestGetInputOutputPaths(unittest.TestCase):
    def test_invalid_input_output(self):
        with self.assertRaises(ValueError):
            get_input_output_paths('input.py', 'output', None)

    def test_input_doesnt_exist(self):
        with self.assertRaises(NameError):
            get_input_output_paths('nonexistent.py', 'output', None)

    def test_single_file_input_output(self):
        input_path = 'input.py'
        output_path = 'output.py'
        result = list(get_input_output_paths(input_path, output_path, None))
        self.assertEqual(len(result), 1)
        input_output = result[0]
        self.assertEqual(input_output.input_path, Path(input_path))
        self.assertEqual(input_output.output_path, Path(output_path))

    def test_directory_input_output(self):
        input_path = 'input'
        output_path = 'output'
        result = list(get_input_output_paths(input_path, output_path, None))
        self.assertEqual(len(result), 2)
        input_output_1 = result[0]
        self.assertEqual(input_output_1.input_path, Path(input_path).joinpath('input.py'))
        self.assertEqual(input_output_1.output_path, Path(output_path).joinpath('input.py'))
        input_output_2 = result[1]
        self.assertEqual(input_output_2.input_path, Path(input_path).joinpath('subdirectory', 'input.py'))
        self.assertEqual(input_output_2.output_path, Path(output_path).joinpath('subdirectory', 'input.py'))

if __name__ == '__main__':
    unittest.main()