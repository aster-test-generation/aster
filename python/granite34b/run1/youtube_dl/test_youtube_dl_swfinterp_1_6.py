import unittest
from youtube_dl.swfinterp import SWFInterpreter as _SWFInterpreter


class TestSWFInterpreter(unittest.TestCase):
    def test_init(self):
        interpreter = SWFInterpreter(b'example_file_contents')
        self.assertIsInstance(interpreter, SWFInterpreter)

    def test_patch_function(self):
        interpreter = SWFInterpreter(b'example_file_contents')
        interpreter.patch_function('example_class', 'example_method', lambda x: x + 1)
        self.assertEqual(interpreter._patched_functions[('example_class', 'example_method')](2), 3)

    def test_extract_class(self):
        interpreter = SWFInterpreter(b'example_file_contents')
        example_class = interpreter.extract_class('ExampleClass')
        self.assertEqual(example_class.name, 'ExampleClass')

if __name__ == '__main__':
    unittest.main()