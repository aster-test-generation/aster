import unittest
from youtube_dl.swfinterp import _read_int


class TestSwfinterp(unittest.TestCase):
    def test_extract_tags(self):
        file_contents = b'WS'
        result = _extract_tags(file_contents)
        self.assertEqual(result, [])

    def test_read_int(self):
        reader = io.BytesIO(b'')
        result = _read_int(reader)
        self.assertEqual(result, 0)

    def test_u30(self):
        reader = io.BytesIO(b'')
        result = _u30(reader)
        self.assertEqual(result, 0)

    def test_s32(self):
        reader = io.BytesIO(b'')
        result = _s32(reader)
        self.assertEqual(result, 0)

    def test_s24(self):
        reader = io.BytesIO(b'')
        result = _s24(reader)
        self.assertEqual(result, 0)

    def test_read_string(self):
        reader = io.BytesIO(b'')
        result = _read_string(reader)
        self.assertEqual(result, '')

    def test_read_bytes(self):
        count = 0
        reader = io.BytesIO(b'')
        result = _read_bytes(count, reader)
        self.assertEqual(result, b'')

    def test_read_byte(self):
        reader = io.BytesIO(b'')
        result = _read_byte(reader)
        self.assertEqual(result, 0)

if __name__ == '__main__':
    unittest.main()