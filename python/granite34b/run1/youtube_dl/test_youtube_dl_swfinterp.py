import io
import unittest
from youtube_dl.swfinterp import _extract_tags, _u32, _u30, _s32, _s24, _read_string, _read_bytes, _read_byte


class TestSwfInterp(unittest.TestCase):
    def test_extract_tags(self):
        file_contents = b'WS'
        tags = _extract_tags(file_contents)
        self.assertEqual(list(tags), [])

    def test_read_int(self):
        reader = io.BytesIO(b'\x80')
        result = _read_int(reader)
        self.assertEqual(result, 128)

    def test_u30(self):
        reader = io.BytesIO(b'\x80')
        result = _u30(reader)
        self.assertEqual(result, 128)

    def test_s32(self):
        reader = io.BytesIO(b'\x80\x00\x00\x00')
        result = _s32(reader)
        self.assertEqual(result, -2147483520)

    def test_s24(self):
        reader = io.BytesIO(b'\x80\x00\x00')
        result = _s24(reader)
        self.assertEqual(result, -8388608)

    def test_read_string(self):
        reader = io.BytesIO(b'\x03abc')
        result = _read_string(reader)
        self.assertEqual(result, 'abc')

    def test_read_bytes(self):
        reader = io.BytesIO(b'abc')
        result = _read_bytes(2, reader)
        self.assertEqual(result, b'ab')

    def test_read_byte(self):
        reader = io.BytesIO(b'a')
        result = _read_byte(reader)
        self.assertEqual(result, 97)

if __name__ == '__main__':
    unittest.main()