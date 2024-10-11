import unittest
from string_utils.generation import uuid, random_string, secure_random_hex, roman_range
from string_utils.manipulation import roman_encode


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
    def test_random_string_valid_size(self):
        result = random_string(10)
        self.assertIsInstance(result, str)
        self.assertEqual(len(result), 10)

    def test_random_string_invalid_size(self):
        with self.assertRaises(ValueError):
            random_string(0)

    def test_random_string_non_integer_size(self):
        with self.assertRaises(ValueError):
            random_string("ten")

class TestSecureRandomHexFunction(unittest.TestCase):
    def test_secure_random_hex_valid_byte_count(self):
        result = secure_random_hex(10)
        self.assertIsInstance(result, str)
        self.assertEqual(len(result), 20)

    def test_secure_random_hex_invalid_byte_count(self):
        with self.assertRaises(ValueError):
            secure_random_hex(0)

    def test_secure_random_hex_non_integer_byte_count(self):
        with self.assertRaises(ValueError):
            secure_random_hex("ten")

class TestRomanRangeFunction(unittest.TestCase):
    def test_roman_range_valid(self):
        result = list(roman_range(5))
        expected = [roman_encode(i) for i in range(1, 6)]
        self.assertEqual(result, expected)

    def test_roman_range_with_start(self):
        result = list(roman_range(5, start=3))
        expected = [roman_encode(i) for i in range(3, 6)]
        self.assertEqual(result, expected)

    def test_roman_range_with_step(self):
        result = list(roman_range(5, start=1, step=2))
        expected = [roman_encode(i) for i in range(1, 6, 2)]
        self.assertEqual(result, expected)

    def test_roman_range_invalid_stop(self):
        with self.assertRaises(ValueError):
            list(roman_range(4000))

    def test_roman_range_invalid_start(self):
        with self.assertRaises(ValueError):
            list(roman_range(5, start=4000))

    def test_roman_range_invalid_step(self):
        with self.assertRaises(ValueError):
            list(roman_range(5, step=4000))

    def test_roman_range_invalid_step_configuration(self):
        with self.assertRaises(OverflowError):
            list(roman_range(5, start=1, step=-1))

if __name__ == '__main__':
    unittest.main()