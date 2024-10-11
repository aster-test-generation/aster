import unittest
from youtube_dl.swfinterp import (
    _extract_tags, _read_int, _u30, _s32, _s24, _read_string, _read_bytes, _read_byte
)
from youtube_dl.utils import ExtractorError
import zlib
import io


class TestSWFInterp(unittest.TestCase):
    def test_extract_tags_valid_swf(self):
        file_contents = b'CWS\x0a\x00\x00\x00' + zlib.compress(b'\x78\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00')
        tags = list(_extract_tags(file_contents))
        self.assertEqual(tags, [])

    def test_extract_tags_invalid_swf_header(self):
        file_contents = b'XYZ'
        with self.assertRaises(ExtractorError):
            list(_extract_tags(file_contents))

    def test_extract_tags_unsupported_compression(self):
        file_contents = b'FWS\x0a\x00\x00\x00'
        with self.assertRaises(NotImplementedError):
            list(_extract_tags(file_contents))

    def test_read_int(self):
        reader = io.BytesIO(b'\x81\x01')
        result = _read_int(reader)
        self.assertEqual(result, 129)

    def test_u30(self):
        reader = io.BytesIO(b'\x81\x01')
        result = _u30(reader)
        self.assertEqual(result, 129)

    def test_s32_positive(self):
        reader = io.BytesIO(b'\x81\x01')
        result = _s32(reader)
        self.assertEqual(result, 129)

    def test_s32_negative(self):
        reader = io.BytesIO(b'\xff\xff\xff\xff\x0f')
        result = _s32(reader)
        self.assertEqual(result, -1)

    def test_s24_positive(self):
        reader = io.BytesIO(b'\x01\x02\x03')
        result = _s24(reader)
        self.assertEqual(result, 197121)

    def test_s24_negative(self):
        reader = io.BytesIO(b'\xff\xff\xff')
        result = _s24(reader)
        self.assertEqual(result, -1)

    def test_read_string(self):
        reader = io.BytesIO(b'\x03abc')
        result = _read_string(reader)
        self.assertEqual(result, 'abc')

    def test_read_bytes(self):
        reader = io.BytesIO(b'\x01\x02\x03')
        result = _read_bytes(3, reader)
        self.assertEqual(result, b'\x01\x02\x03')

    def test_read_byte(self):
        reader = io.BytesIO(b'\x01')
        result = _read_byte(reader)
        self.assertEqual(result, 1)

if __name__ == '__main__':
    unittest.main()