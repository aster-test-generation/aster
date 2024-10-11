import io
import unittest
from youtube_dl.swfinterp import _extract_tags, _read_int, _u30, _s32, _s24, _read_string, _read_bytes, _read_byte


class TestSwfInterp(unittest.TestCase):
    def test__extract_tags(self):
        file_contents = b'WS'
        result = _extract_tags(file_contents)
        self.assertEqual(next(result), (0, b''))

    def test__read_int(self):
        reader = io.BytesIO(b'\x01')
        result = _read_int(reader)
        self.assertEqual(result, 1)

    def test__u30(self):
        reader = io.BytesIO(b'\x01')
        result = _u30(reader)
        self.assertEqual(result, 1)

    def test__s32(self):
        reader = io.BytesIO(b'\x01')
        result = _s32(reader)
        self.assertEqual(result, 1)

    def test__s24(self):
        reader = io.BytesIO(b'\x01')
        result = _s24(reader)
        self.assertEqual(result, 1)

    def test__read_string(self):
        reader = io.BytesIO(b'\x01')
        result = _read_string(reader)
        self.assertEqual(result, '1')

    def test__read_bytes(self):
        reader = io.BytesIO(b'\x01')
        result = _read_bytes(1, reader)
        self.assertEqual(result, b'\x01')

    def test__read_byte(self):
        reader = io.BytesIO(b'\x01')
        result = _read_byte(reader)
        self.assertEqual(result, 1)

if __name__ == '__main__':
    unittest.main()