import unittest
from py_backwards.files import get_input_output_paths, InputOutput


class TestGetInputOutputPaths(unittest.TestCase):
    def test_get_input_output_paths_py_to_py(self):
        result = list(get_input_output_paths('input.py', 'output.py', None))
        self.assertEqual(len(result), 1)
        self.assertIsInstance(result[0], InputOutput)

    def test_get_input_output_paths_py_to_dir(self):
        result = list(get_input_output_paths('input.py', 'output', None))
        self.assertEqual(len(result), 1)
        self.assertIsInstance(result[0], InputOutput)

    def test_get_input_output_paths_dir_to_dir(self):
        result = list(get_input_output_paths('input', 'output', None))
        self.assertEqual(len(result), 1)
        self.assertIsInstance(result[0], InputOutput)

    def test_get_input_output_paths_invalid_input_output(self):
        with self.assertRaises(InvalidInputOutput):
            list(get_input_output_paths('input.py', 'output.txt', None))

    def test_get_input_output_paths_input_doesnt_exist(self):
        with self.assertRaises(InputDoesntExists):
            list(get_input_output_paths('non_existent_input.py', 'output.py', None))

class TestInputOutput(unittest.TestCase):
    def test_init(self):
        input_path = Path('input.py')
        output_path = Path('output.py')
        io = InputOutput(input_path, output_path)
        self.assertEqual(io.input, input_path)
        self.assertEqual(io.output, output_path)

    def test_str_method(self):
        input_path = Path('input.py')
        output_path = Path('output.py')
        io = InputOutput(input_path, output_path)
        result = str(io)
        self.assertEqual(result, f"InputOutput({input_path}, {output_path})")

    def test_repr_method(self):
        input_path = Path('input.py')
        output_path = Path('output.py')
        io = InputOutput(input_path, output_path)
        result = repr(io)
        self.assertEqual(result, f"InputOutput({input_path!r}, {output_path!r})")

    def test_eq_method(self):
        input_path = Path('input.py')
        output_path = Path('output.py')
        io1 = InputOutput(input_path, output_path)
        io2 = InputOutput(input_path, output_path)
        self.assertEqual(io1, io2)

if __name__ == '__main__':
    unittest.main()