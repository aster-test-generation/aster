import unittest
from youtube_dl.swfinterp import _read_int


class TestSWFInterpreter(unittest.TestCase):
    def test_init(self):
        code_tag = b'\x00\x00\x00\x00\x00\x00\x00\x00'
        interpreter = SWFInterpreter(code_tag)
        self.assertEqual(interpreter.constant_ints, [0])
        self.assertEqual(interpreter.constant_uints, [0])
        self.assertEqual(interpreter.constant_strings, [''])

    def test_patch_function(self):
        interpreter = SWFInterpreter(b'')
        interpreter.patch_function(TimerClass, 'addEventListener', lambda params: undefined)
        self.assertEqual(len(interpreter._patched_functions), 1)

    def test_extract_class(self):
        interpreter = SWFInterpreter(b'')
        res = interpreter.extract_class('String')
        self.assertEqual(res.name, 'String')
        self.assertEqual(res.constants, {})

if __name__ == '__main__':
    unittest.main()