import unittest
from py_backwards.files import get_input_output_paths



class TestGetInputOutputPaths(unittest.TestCase):
    def test_get_input_output_paths(self):
        input_ = "input"
        output = "output"
        root = None
        result = get_input_output_paths(input_, output, root)
        self.assertEqual(result, get_input_output_paths())

    def test_get_input_output_paths_2(self):
        input_ = "input"
        output = "output"
        root = "root"
        result = get_input_output_paths(input_, output, root)
        self.assertEqual(result, [])

    def test_get_input_output_paths_3(self):
        input_ = "input"
        output = "output"
        root = "root"
        result = get_input_output_paths(input_, output, root)
        self.assertEqual(result, get_input_output_paths())

    def test_get_input_output_paths_4(self):
        input_ = "input"
        output = "output"
        root = "root"
        result = get_input_output_paths(input_, output, root)
        self.assertEqual(result, get_input_output_paths())

    def test_get_input_output_paths_5(self):
        input_ = "input"
        output = "output"
        root = "root"
        result = get_input_output_paths(input_, output, root)
        self.assertEqual(result, get_input_output_paths(input_dir, output_dir))

    def test_get_input_output_paths_6(self):
        input_ = "input"
        output = "output"
        root = "root"
        result = get_input_output_paths(input_, output, root)
        self.assertEqual(result, get_input_output_paths())

    def test_get_input_output_paths_7(self):
        input_ = "input"
        output = "output"
        root = "root"
        result = get_input_output_paths(input_, output, root)
        self.assertEqual(result, get_input_output_paths())

    def test_get_input_output_paths_8(self):
        input_ = "input"
        output = "output"
        root = "root"
        result = get_input_output_paths(input_, output, root)
        self.assertEqual(result, get_input_output_paths())

    def test_get_input_output_paths_9(self):
        input_ = "input"
        output = "output"
        root = "root"
        result = get_input_output_paths(input_, output, root)
        self.assertEqual(result, get_input_output_paths())

    def test_get_input_output_paths_10(self):
        input_ = "input"
        output = "output"
        root = "root"
        result = get_input_output_paths(input_, output, root)
        self.assertEqual(result, get_input_output_paths())

    def test_get_input_output_paths_11(self):
        input_ = "input"
        output = "output"
        root = "root"
        result = get_input_output_paths(input_, output, root)
        self.assertEqual(result, get_input_output_paths())

    def test_get_input_output_paths_12(self):
        input_ = "input"
        output = "output"
        root = "root"
        result = get_input_output_paths(input_, output, root)
        self.assertEqual(result, get_input_output_paths())

    def test_get_input_output_paths_13(self):
        input_ = "input"
        output = "output"
        root = "root"
        result = get_input_output_paths(input_, output, root)
        self.assertEqual(result, get_input_output_paths())

    def test_get_input_output_paths_14(self):
        input_ = "input"
        output = "output"
        root = "root"
        result = get_input_output_paths(input_, output, root)
        self.assertEqual(result, get_input_output_paths())

if __name__ == '__main__':
    unittest.main()