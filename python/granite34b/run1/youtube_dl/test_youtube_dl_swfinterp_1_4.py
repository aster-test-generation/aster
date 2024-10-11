import unittest
from youtube_dl.swfinterp import _read_int


class TestSwfInterp(unittest.TestCase):
    def test_u32(self):
        self.assertEqual(_u32(b'\x00\x00\x00\x01'), 1)
        self.assertEqual(_u32(b'\x00\x00\x01\x00'), 256)
        self.assertEqual(_u32(b'\x00\x01\x00\x00'), 65536)
        self.assertEqual(_u32(b'\x01\x00\x00\x00'), 16777216)

    def test_read_int(self):
        self.assertEqual(_read_int(b'\x00\x00\x00\x01'), 1)
        self.assertEqual(_read_int(b'\x00\x00\x01\x00'), 256)
        self.assertEqual(_read_int(b'\x00\x01\x00\x00'), 65536)
        self.assertEqual(_read_int(b'\x01\x00\x00\x00'), 16777216)

    def test_multiname(self):
        multiname = _Multiname(1)
        self.assertEqual(multiname.kind, 1)
        self.assertEqual(repr(multiname), '[MULTINAME kind: 0x1]')

if __name__ == '__main__':
    unittest.main()