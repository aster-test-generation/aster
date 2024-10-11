import unittest
from youtube_dl.swfinterp import _read_int



class Test_u32(unittest.TestCase):
    def test_u32(self):
        result = _u32(1)
        self.assertEqual(result, 1)

class Test_read_int(unittest.TestCase):
    def test_read_int(self):
        result = _read_int(1)
        self.assertEqual(result, 1)

class Test_read_u32(unittest.TestCase):
    def test_read_u32(self):
        result = _read_u32(1)
        self.assertEqual(result, 1)

class Test_read_u16(unittest.TestCase):
    def test_read_u16(self):
        result = _read_u16(1)
        self.assertEqual(result, 1)

class Test_read_u8(unittest.TestCase):
    def test_read_u8(self):
        result = _read_u8(1)
        self.assertEqual(result, 1)

class Test_read_d64(unittest.TestCase):
    def test_read_d64(self):
        result = _read_d64(1)
        self.assertEqual(result, 1)

class Test_read_string(unittest.TestCase):
    def test_read_string(self):
        result = _read_string(1)
        self.assertEqual(result, 1)

class Test_read_string_u32(unittest.TestCase):
    def test_read_string_u32(self):
        result = _read_string_u32(1)
        self.assertEqual(result, 1)

class Test_read_string_u16(unittest.TestCase):
    def test_read_string_u16(self):
        result = _read_string_u16(1)
        self.assertEqual(result, 1)

class Test_read_string_u8(unittest.TestCase):
    def test_read_string_u8(self):
        result = _read_string_u8(1)
        self.assertEqual(result, 1)

class Test_read_string_d64(unittest.TestCase):
    def test_read_string_d64(self):
        result = _read_string_d64(1)
        self.assertEqual(result, 1)

class Test_read_string_u32_u32(unittest.TestCase):
    def test_read_string_u32_u32(self):
        result = _read_string_u32_u32(1)
        self.assertEqual(result, 1)

class Test_read_string_u16_u32(unittest.TestCase):
    def test_read_string_u16_u32(self):
        result = _read_string_u16_u32(1)
        self.assertEqual(result, 1)

class Test_read_string_u8_u32(unittest.TestCase):
    def test_read_string_u8_u32(self):
        result = _read_string_u8_u32(1)
        self.assertEqual(result, 1)

class Test_read_string_d64_u32(unittest.TestCase):
    def test_read_string_d64_u32(self):
        result = _read_string_d64_u32(1)
        self.assertEqual(result, 1)

class Test_read_string_u32_u16(unittest.TestCase):
    def test_read_string_u32_u16(self):
        result = _read_string_u32_u16(1)
        self.assertEqual(result, 1)


if __name__ == '__main__':
    unittest.main()