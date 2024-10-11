import unittest
from youtube_dl.swfinterp import _read_int


class Test_extract_tags(unittest.TestCase):
    def test_extract_tags(self):
        result = _extract_tags(file_contents)
        self.assertEqual(result, [])

class Test_read_int(unittest.TestCase):
    def test_read_int(self):
        result = _read_int(reader)
        self.assertEqual(result, 0)

class Test_u30(unittest.TestCase):
    def test_u30(self):
        result = _u30(reader)
        self.assertEqual(result, 0)

class Test_s32(unittest.TestCase):
    def test_s32(self):
        result = _s32(reader)
        self.assertEqual(result, 0)

class Test_s24(unittest.TestCase):
    def test_s24(self):
        result = _s24(reader)
        self.assertEqual(result, 0)

class Test_read_string(unittest.TestCase):
    def test_read_string(self):
        result = _read_string(reader)
        self.assertEqual(result, '')

class Test_read_bytes(unittest.TestCase):
    def test_read_bytes(self):
        result = _read_bytes(count, reader)
        self.assertEqual(result, b'')

class Test_read_byte(unittest.TestCase):
    def test_read_byte(self):
        result = _read_byte(reader)
        self.assertEqual(result, 0)

if __name__ == '__main__':
    unittest.main()