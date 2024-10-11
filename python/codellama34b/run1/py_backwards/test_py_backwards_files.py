import unittest
from py_backwards.files import *


class TestGetInputOutputPaths(unittest.TestCase):
    def test_get_input_output_paths(self):
        result = get_input_output_paths('input_', 'output', 'root')
        self.assertEqual(result, [])

    def test_get_input_output_paths_invalid_input_output(self):
        with self.assertRaises(InvalidInputOutput):
            get_input_output_paths('input_', 'output', 'root')

    def test_get_input_output_paths_input_doesnt_exists(self):
        with self.assertRaises(InputDoesntExists):
            get_input_output_paths('input_', 'output', 'root')

    def test_get_input_output_paths_input_endswith_py(self):
        result = get_input_output_paths('input_.py', 'output', 'root')
        self.assertEqual(result, [])

    def test_get_input_output_paths_output_endswith_py(self):
        result = get_input_output_paths('input_', 'output.py', 'root')
        self.assertEqual(result, [])

    def test_get_input_output_paths_input_endswith_py_output_endswith_py(self):
        result = get_input_output_paths('input_.py', 'output.py', 'root')
        self.assertEqual(result, [])

    def test_get_input_output_paths_input_endswith_py_output_endswith_py_root_is_none(self):
        result = get_input_output_paths('input_.py', 'output.py', None)
        self.assertEqual(result, [])

    def test_get_input_output_paths_input_endswith_py_output_endswith_py_root_is_not_none(self):
        result = get_input_output_paths('input_.py', 'output.py', 'root')
        self.assertEqual(result, [])

    def test_get_input_output_paths_input_endswith_py_output_endswith_py_root_is_not_none_child_input_py(self):
        result = get_input_output_paths('input_.py', 'output.py', 'root')
        self.assertEqual(result, [])

    def test_get_input_output_paths_input_endswith_py_output_endswith_py_root_is_not_none_child_input_py_child_output_py(self):
        result = get_input_output_paths('input_.py', 'output.py', 'root')
        self.assertEqual(result, [])

if __name__ == '__main__':
    unittest.main()