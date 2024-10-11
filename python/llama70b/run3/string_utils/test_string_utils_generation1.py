import unittest
from string_utils.generation import uuid, random_string, secure_random_hex, roman_range

class TestUuidFunction(unittest.TestCase):
    def test_uuid_default(self):
        result = uuid()
        self.assertIsInstance(result, str)

    def test_uuid_as_hex(self):
        result = uuid(as_hex=True)
        self.assertIsInstance(result, str)

class TestRandomStringFunction(unittest.TestCase):
    def test_random_string_valid_size(self):
        result = random_string(10)
        self.assertIsInstance(result, str)
        self.assertEqual(len(result), 10)

    def test_random_string_invalid_size(self):
        with self.assertRaises(ValueError):
            random_string(0)

class TestSecureRandomHexFunction(unittest.TestCase):
    def test_secure_random_hex_valid_byte_count(self):
        result = secure_random_hex(10)
        self.assertIsInstance(result, str)
        self.assertEqual(len(result), 20)  # 10 bytes -> 20 hex characters

    def test_secure_random_hex_invalid_byte_count(self):
        with self.assertRaises(ValueError):
            secure_random_hex(0)

class TestRomanRangeFunction(unittest.TestCase):
    def test_roman_range_valid_input(self):
        result = list(roman_range(5))
        self.assertEqual(result, ['I', 'II', 'III', 'IV', 'V'])

    def test_roman_range_invalid_input(self):
        with self.assertRaises(ValueError):
            roman_range('a')

    def test_roman_range_invalid_start(self):
        with self.assertRaises(ValueError):
            roman_range(5, start=0)

    def test_roman_range_invalid_step(self):
        with self.assertRaises(ValueError):
            roman_range(5, step=0)

    def test_roman_range_overflow(self):
        with self.assertRaises(OverflowError):
            roman_range(5, start=10)

if __name__ == '__main__':
    unittest.main()