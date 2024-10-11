import unittest
from py_backwards.files import get_input_output_paths


class TestGetInputOutputPaths(unittest.TestCase):
    def test_valid_input_output(self):
        result = list(get_input_output_paths('input.py', 'output.py', None))
        self.assertEqual(len(result), 1)
        self.assertIsInstance(result[0], tuple)
        self.assertIsInstance(result[0][0], str)
        self.assertIsInstance(result[0][1], str)

    def test_invalid_input_output(self):
        with self.assertRaises(InvalidInputOutput):
            list(get_input_output_paths('input', 'output.py', None))

    def test_input_doesnt_exists(self):
        with self.assertRaises(InputDoesntExists):
            list(get_input_output_paths('non_existent_input.py', 'output.py', None))

    def test_root_directory(self):
        result = list(get_input_output_paths('input', 'output', 'root'))
        self.assertEqual(len(result), 1)
        self.assertIsInstance(result[0], tuple)
        self.assertIsInstance(result[0][0], str)
        self.assertIsInstance(result[0][1], str)

    def test_nested_input(self):
        result = list(get_input_output_paths('input_dir', 'output_dir', None))
        self.assertEqual(len(result), 2)
        self.assertIsInstance(result[0], tuple)
        self.assertIsInstance(result[0][0], str)
        self.assertIsInstance(result[0][1], str)
        self.assertIsInstance(result[1], tuple)
        self.assertIsInstance(result[1][0], str)
        self.assertIsInstance(result[1][1], str)

if __name__ == '__main__':
    unittest.main()