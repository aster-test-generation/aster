import unittest
from youtube_dl.swfinterp import _read_int


class TestYoutubeDLSwfinterp(unittest.TestCase):
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

    def test_zlib_decompress(self):
        self.assertEqual(_zlib_decompress(b'\x78\x9c\x63\x60\x60\x60\x00\x00\x00\x00\x00\x00'), b'ccc')
        self.assertEqual(_zlib_decompress(b'\x78\x9c\x63\x60\x60\x60\x00\x00\x00\x00\x00\x00\x00'), b'ccc')

if __name__ == '__main__':
    unittest.main()