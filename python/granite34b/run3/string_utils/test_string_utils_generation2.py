import unittest
from string_utils.generation import *

class TestUUID(unittest.TestCase):
    def test_uuid_default(self):
        result = uuid()
        self.assertEqual(len(result), 36)

    def test_uuid_hex(self):
        result = uuid(as_hex=True)
        self.assertEqual(len(result), 32)

class TestRandomString(unittest.TestCase):
    def test_random_string_default(self):
        result = random_string(10)
        self.assertEqual(len(result), 10)

    def test_random_string_invalid_size(self):
        with self.assertRaises(ValueError):
            random_string(0)

class TestSecureRandomHex(unittest.TestCase):
    def test_secure_random_hex_default(self):
        result = secure_random_hex(10)
        self.assertEqual(len(result), 20)

    def test_secure_random_hex_invalid_size(self):
        with self.assertRaises(ValueError):
            secure_random_hex(0)

class TestRomanRange(unittest.TestCase):
    def test_roman_range_default(self):
        result = list(roman_range(10))
        self.assertEqual(result, ['I', 'II', 'III', 'IV', 'V', 'VI', 'VII', 'VIII', 'IX', 'X'])

    def test_roman_range_custom(self):
        result = list(roman_range(10, 5, -1))
        self.assertEqual(result, ['V', 'IV', 'III', 'II', 'I'])

    def test_roman_range_invalid_stop(self):
        with self.assertRaises(ValueError):
            list(roman_range(0))

    def test_roman_range_invalid_start(self):
        with self.assertRaises(ValueError):
            list(roman_range(10, 0))

    def test_roman_range_invalid_step(self):
        with self.assertRaises(ValueError):
            list(roman_range(10, step=0))

    def test_roman_range_overflow(self):
        with self.assertRaises(OverflowError):
            list(roman_range(10, 11, 1))

if __name__ == '__main__':
    unittest.main()