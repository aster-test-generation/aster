import unittest
from py_backwards.files import get_input_output_paths, InputOutput


class TestGetInputOutputPaths(unittest.TestCase):
    def test_valid_input_output(self):
        input_path = 'input.py'
        output_path = 'output.py'
        result = list(get_input_output_paths(input_path, output_path, None))
        self.assertEqual(len(result), 1)
        self.assertIsInstance(result[0], InputOutput)
        self.assertEqual(result[0].input, Path(input_path))
        self.assertEqual(result[0].output, Path(output_path))

    def test_invalid_input_output(self):
        input_path = 'input.txt'
        output_path = 'output.py'
        with self.assertRaises(InvalidInputOutput):
            list(get_input_output_paths(input_path, output_path, None))

    def test_input_doesnt_exist(self):
        input_path = 'non_existent_input.py'
        output_path = 'output.py'
        with self.assertRaises(InputDoesntExists):
            list(get_input_output_paths(input_path, output_path, None))

    def test_input_is_directory(self):
        input_path = 'input_dir'
        output_path = 'output.py'
        result = list(get_input_output_paths(input_path, output_path, None))
        self.assertEqual(len(result), 1)
        self.assertIsInstance(result[0], InputOutput)
        self.assertEqual(result[0].input, Path(input_path) / 'file.py')
        self.assertEqual(result[0].output, Path(output_path) / 'file.py')

    def test_root_directory(self):
        input_path = 'input_dir'
        output_path = 'output.py'
        root_path = 'root_dir'
        result = list(get_input_output_paths(input_path, output_path, root_path))
        self.assertEqual(len(result), 1)
        self.assertIsInstance(result[0], InputOutput)
        self.assertEqual(result[0].input, Path(input_path) / 'file.py')
        self.assertEqual(result[0].output, Path(output_path) / 'file.py')

class TestInputOutput(unittest.TestCase):
    def test_init(self):
        input_path = Path('input.py')
        output_path = Path('output.py')
        io = InputOutput(input_path, output_path)
        self.assertEqual(io.input, input_path)
        self.assertEqual(io.output, output_path)

    def test_str(self):
        input_path = Path('input.py')
        output_path = Path('output.py')
        io = InputOutput(input_path, output_path)
        self.assertEqual(str(io), f"InputOutput({input_path}, {output_path})")

    def test_repr(self):
        input_path = Path('input.py')
        output_path = Path('output.py')
        io = InputOutput(input_path, output_path)
        self.assertEqual(repr(io), f"InputOutput({input_path!r}, {output_path!r})")

    def test_eq(self):
        input_path = Path('input.py')
        output_path = Path('output.py')
        io1 = InputOutput(input_path, output_path)
        io2 = InputOutput(input_path, output_path)
        self.assertEqual(io1, io2)

if __name__ == '__main__':
    unittest.main()