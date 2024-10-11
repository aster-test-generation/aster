import unittest
from py_backwards.files import get_input_output_paths, InvalidInputOutput, InputDoesntExists
from pathlib import Path


class TestGetInputOutputPaths(unittest.TestCase):
    def test_get_input_output_paths_invalid_input_output(self):
        with self.assertRaises(InvalidInputOutput):
            list(get_input_output_paths("input.txt", "output.txt", "error.txt"))

    def test_get_input_output_paths_input_doesnt_exist(self):
        with self.assertRaises(InputDoesntExists):
            list(get_input_output_paths("input.py", "output.py", None))

    def test_get_input_output_paths_single_file(self):
        input_path = Path("input.py")
        output_path = Path("output.py")
        input_output = list(get_input_output_paths("input.py", "output.py", "input.py"))
        self.assertEqual(len(input_output), 1)
        self.assertEqual(input_output[0].input_path, input_path)
        self.assertEqual(input_output[0].output_path, output_path)

    def test_get_input_output_paths_directory(self):
        input_path = Path("input_directory")
        output_path = Path("output_directory")
        root_path = Path("root_directory")
        input_output = list(get_input_output_paths("input_directory", "output_directory", "root_directory"))
        self.assertEqual(len(input_output), 2)
        self.assertEqual(input_output[0].input_path, input_path.joinpath("file1.py"))
        self.assertEqual(input_output[0].output_path, output_path.joinpath("file1.py"))
        self.assertEqual(input_output[1].input_path, input_path.joinpath("file2.py"))
        self.assertEqual(input_output[1].output_path, output_path.joinpath("file2.py"))

if __name__ == '__main__':
    unittest.main()