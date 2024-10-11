import unittest
from youtube_dl.swfinterp import SWFInterpreter as _SWFInterpreter


class TestSWFInterpreter(unittest.TestCase):
    def test_init(self):
        interpreter = SWFInterpreter(b'example_file_contents')
        self.assertEqual(interpreter.constant_ints, [0])
        self.assertEqual(interpreter.constant_uints, [0])
        self.assertEqual(interpreter.constant_strings, [''])
        self.assertEqual(interpreter.multinames, [''])

    def test_extract_function(self):
        interpreter = SWFInterpreter(b'example_file_contents')
        function = interpreter.extract_function('example_class', 'example_function')
        self.assertEqual(function([1, 2, 3]), 6)

if __name__ == '__main__':
    unittest.main()