import unittest
from py_backwards.files import get_input_output_paths


class TestGetInputOutputPaths(unittest.TestCase):
    def test_invalid_input_output(self):
        with self.assertRaises(ValueError):
            list(get_input_output_paths('input.py', 'output', None))

    def test_input_doesnt_exist(self):
        with self.assertRaises(NameError):
            list(get_input_output_paths('nonexistent.py', 'output', None))

    def test_input_is_python_file(self):
        paths = list(get_input_output_paths('input.py', 'output.py', ''))
        self.assertEqual(len(paths), 1)
        self.assertEqual(paths[0].input, 'input.py')
        self.assertEqual(paths[0].output, 'output.py')

    def test_input_is_directory(self):
        paths = list(get_input_output_paths('input', 'output', None))
        self.assertEqual(len(paths), 2)
        self.assertEqual(paths[0].input, 'input/file1.py')
        self.assertEqual(paths[0].output, 'output/file1.py')
        self.assertEqual(paths[1].input, 'input/file2.py')
        self.assertEqual(paths[1].output, 'output/file2.py')

    def test_input_is_directory_with_root(self):
        paths = list(get_input_output_paths('input', 'output', 'input'))
        self.assertEqual(len(paths), 2)
        self.assertEqual(paths[0].input, 'input/file1.py')
        self.assertEqual(paths[0].output, 'output/file1.py')
        self.assertEqual(paths[1].input, 'input/file2.py')
        self.assertEqual(paths[1].output, 'output/file2.py')

if __name__ == '__main__':
    unittest.main()