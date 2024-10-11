import unittest
from string_utils.generation import *



class TestUUID(unittest.TestCase):
    def test_uuid(self):
        result = uuid()
        self.assertIsInstance(result, str)

    def test_uuid_as_hex(self):
        result = uuid(as_hex=True)
        self.assertIsInstance(result, str)

class TestRandomString(unittest.TestCase):
    def test_random_string(self):
        result = random_string(1)
        self.assertIsInstance(result, str)

    def test_random_string_size(self):
        with self.assertRaises(ValueError):
            random_string(0)

class TestSecureRandomHex(unittest.TestCase):
    def test_secure_random_hex(self):
        result = secure_random_hex(1)
        self.assertIsInstance(result, str)

    def test_secure_random_hex_byte_count(self):
        with self.assertRaises(ValueError):
            secure_random_hex(0)

class TestRomanRange(unittest.TestCase):
    def test_roman_range(self):
        result = roman_range(1, 1, 0)
        self.assertIsInstance(result, Generator)

    def test_roman_range_stop(self):
        with self.assertRaises(ValueError):
            roman_range(0, 1, 1)

    def test_roman_range_start(self):
        with self.assertRaises(ValueError):
            roman_range(1, 0, 1)

    def test_roman_range_step(self):
        with self.assertRaises(ValueError):
            roman_range(1, 1, 0)

    def test_roman_range_forward_exceed(self):
        with self.assertRaises(OverflowError):
            roman_range(1, 2, 1)


class TestStringUtilsGeneration(unittest.TestCase):
    def test_uuid(self):
        result = uuid()
        self.assertEqual(len(result), 36)

    def test_random_string(self):
        result = random_string(10)
        self.assertEqual(len(result), 10)

    def test_secure_random_hex(self):
        result = secure_random_hex(10)
        self.assertEqual(len(result), 20)

    def test_roman_range(self):
        result = roman_range(10)
        self.assertEqual(len(result), 10)

if __name__ == '__main__':
    unittest.main()