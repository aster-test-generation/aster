import unittest
from youtube_dl.swfinterp import SWFInterpreter as _read_int


class TestSWFInterpreter(unittest.TestCase):
    def test_init(self):
        interpreter = SWFInterpreter(b'example_file_contents')
        self.assertIsInstance(interpreter, SWFInterpreter)

    def test_extract_function(self):
        interpreter = SWFInterpreter(b'example_file_contents')
        result = interpreter.extract_function('example_function')
        self.assertEqual(result, 'expected_result')

    def test_extract_function_private_method(self):
        interpreter = SWFInterpreter(b'example_file_contents')
        result = interpreter.extract_function('__private_method')
        self.assertEqual(result, 'expected_result')

    def test_extract_function_protected_method(self):
        interpreter = SWFInterpreter(b'example_file_contents')
        result = interpreter.extract_function('_protected_method')
        self.assertEqual(result, 'expected_result')

    def test_extract_function_magic_method(self):
        interpreter = SWFInterpreter(b'example_file_contents')
        result = interpreter.extract_function('__str__')
        self.assertEqual(result, 'expected_result')

if __name__ == '__main__':
    unittest.main()