import unittest
from youtube_dl.swfinterp import SWFInterpreter as _SWFInterpreter


class TestSWFInterpreter(unittest.TestCase):
    def test_init(self):
        code_tag = b'\x00\x00\x00\x00\x00\x00\x00\x00'
        interpreter = SWFInterpreter(code_tag)
        self.assertEqual(interpreter.constant_ints, [0])
        self.assertEqual(interpreter.constant_uints, [0])
        self.assertEqual(interpreter.constant_strings, [''])

    def test_patch_function(self):
        code_tag = b'\x00\x00\x00\x00\x00\x00\x00\x00'
        interpreter = SWFInterpreter(code_tag)
        interpreter.patch_function(None, None, None)

    def test_extract_class(self):
        code_tag = b'\x00\x00\x00\x00\x00\x00\x00\x00'
        interpreter = SWFInterpreter(code_tag)
        interpreter.extract_class('example_class')

if __name__ == '__main__':
    unittest.main()