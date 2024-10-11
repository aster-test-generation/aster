import unittest
from py_backwards.files import get_input_output_paths, InputOutput


class TestGetInputOutputPaths(unittest.TestCase):
    def test_invalid_input_output(self):
        with self.assertRaises(ValueError):
            list(get_input_output_paths('input.py', 'output', None))

    def test_input_doesnt_exist(self):
        with self.assertRaises(NameError):
            list(get_input_output_paths('input.py', 'output', None))

    def test_input_is_python_file(self):
        paths = list(get_input_output_paths('input.py', 'output.py', None))
        self.assertEqual(len(paths), 1)
        self.assertIsInstance(paths[0], InputOutput)
        self.assertEqual(paths[0].input, Path('input.py'))
        self.assertEqual(paths[0].output, Path('output.py'))

    def test_input_is_directory(self):
        paths = list(get_input_output_paths('input', 'output', None))
        self.assertEqual(len(paths), 2)
        self.assertIsInstance(paths[0], InputOutput)
        self.assertEqual(paths[0].input, Path('input/input.py'))
        self.assertEqual(paths[0].output, Path('output/input.py'))
        self.assertIsInstance(paths[1], InputOutput)
        self.assertEqual(paths[1].input, Path('input/subdirectory/input.py'))
        self.assertEqual(paths[1].output, Path('output/subdirectory/input.py'))

if __name__ == '__main__':
    unittest.main()