import unittest
from youtube_dl.swfinterp import _u32, _read_int, StringClass, ByteArrayClass, TimerClass, TimerEventClass, _builtin_classes, undefined, _AVMClass, _ScopeDict, _AVMClass_Object


class TestSwfInterp(unittest.TestCase):
    def test_u32(self):
        self.assertEqual(_u32(b'\x00\x00\x00\x00'), 0)
        self.assertEqual(_u32(b'\x00\x00\x00\x01'), 1)
        self.assertEqual(_u32(b'\x00\x00\x00\x7F'), 127)
        self.assertEqual(_u32(b'\x00\x00\x00\xFF'), 255)
        self.assertEqual(_u32(b'\x00\x00\x01\x00'), 256)
        self.assertEqual(_u32(b'\x00\x00\x7F\xFF'), 32767)
        self.assertEqual(_u32(b'\x00\x00\xFF\xFF'), 65535)
        self.assertEqual(_u32(b'\x00\x01\x00\x00'), 65536)
        self.assertEqual(_u32(b'\x7F\xFF\xFF\xFF'), 2147483647)
        self.assertEqual(_u32(b'\xFF\xFF\xFF\xFF'), 4294967295)

    def test_read_int(self):
        self.assertEqual(_read_int(b'\x00\x00\x00\x00'), 0)
        self.assertEqual(_read_int(b'\x00\x00\x00\x01'), 1)
        self.assertEqual(_read_int(b'\x00\x00\x00\x7F'), 127)
        self.assertEqual(_read_int(b'\x00\x00\x00\xFF'), 255)
        self.assertEqual(_read_int(b'\x00\x00\x01\x00'), 256)
        self.assertEqual(_read_int(b'\x00\x00\x7F\xFF'), 32767)
        self.assertEqual(_read_int(b'\x00\x00\xFF\xFF'), 65535)
        self.assertEqual(_read_int(b'\x00\x01\x00\x00'), 65536)
        self.assertEqual(_read_int(b'\x7F\xFF\xFF\xFF'), 2147483647)
        self.assertEqual(_read_int(b'\xFF\xFF\xFF\xFF'), -1)

    def test_string_class(self):
        string_class = StringClass
        self.assertEqual(string_class.name_idx, '(no name idx)')
        self.assertEqual(string_class.name, 'String')
        self.assertEqual(string_class.method_names, {})
        self.assertEqual(string_class.method_idxs, {})
        self.assertEqual(string_class.methods, {})
        self.assertEqual(string_class.method_pyfunctions, {})
        self.assertEqual(string_class.static_properties, {})
        self.assertEqual(string_class.variables, _ScopeDict(string_class))
        self.assertEqual(string_class.constants, {})

    def test_byte_array_class(self):
        byte_array_

if __name__ == '__main__':
    unittest.main()