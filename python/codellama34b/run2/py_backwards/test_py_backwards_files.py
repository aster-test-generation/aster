import unittest
from py_backwards.files import get_input_output_paths


class TestGetInputOutputPaths(unittest.TestCase):
    def test_get_input_output_paths(self):
        result = get_input_output_paths('input_', 'output', 'root')
        self.assertEqual(result, get_input_output_paths())

class TestGetInputOutputPaths(unittest.TestCase):
    def test_get_input_output_paths(self):
        input_ = "input"
        output = "output"
        root = "root"
        result = list(get_input_output_paths(input_, output, root))
        self.assertEqual(result, [])

if __name__ == '__main__':
    unittest.main()