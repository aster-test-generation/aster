import unittest
from string_utils.generation import uuid, random_string, secure_random_hex, roman_range


class TestUUIDFunction(unittest.TestCase):
    def test_uuid_default(self):
        result = uuid()
        self.assertIsInstance(result, str)
        self.assertEqual(len(result), 36)

    def test_uuid_as_hex(self):
        result = uuid(as_hex=True)
        self.assertIsInstance(result, str)
        self.assertEqual(len(result), 32)

class TestRandomStringFunction(unittest.TestCase):
    def test_random_string(self):
        result = random_string(10)
        self.assertIsInstance(result, str)
        self.assertEqual(len(result), 10)

    def test_random_string_invalid_size(self):
        with self.assertRaises(ValueError):
            random_string(0)

class TestSecureRandomHexFunction(unittest.TestCase):
    def test_secure_random_hex(self):
        result = secure_random_hex(10)
        self.assertIsInstance(result, str)
        self.assertEqual(len(result), 20)

    def test_secure_random_hex_invalid_byte_count(self):
        with self.assertRaises(ValueError):
            secure_random_hex(0)

class TestRomanRangeFunction(unittest.TestCase):
    def test_roman_range(self):
        result = list(roman_range(5))
        self.assertEqual(result, ['I', 'II', 'III', 'IV', 'V'])

    def test_roman_range_invalid_stop(self):
        with self.assertRaises(ValueError):
            list(roman_range(-1))

    def test_roman_range_invalid_start(self):
        with self.assertRaises(ValueError):
            list(roman_range(5, start=0))

    def test_roman_range_invalid_step(self):
        with self.assertRaises(ValueError):
            list(roman_range(5, step=0))

    def test_roman_range_overflow(self):
        with self.assertRaises(OverflowError):
            list(roman_range(1, start=5, step=-1))

if __name__ == '__main__':
    unittest.main()