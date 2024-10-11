import unittest
from string_utils.generation import *

class TestStringUtils(unittest.TestCase):
    def test_uuid(self):
        result = uuid()
        self.assertIsInstance(result, str)
        self.assertEqual(len(result), 32)

    def test_uuid_as_hex(self):
        result = uuid(as_hex=True)
        self.assertIsInstance(result, str)
        self.assertEqual(len(result), 32)

    def test_random_string(self):
        result = random_string(10)
        self.assertIsInstance(result, str)
        self.assertEqual(len(result), 10)

    def test_secure_random_hex(self):
        result = secure_random_hex(10)
        self.assertIsInstance(result, str)
        self.assertEqual(len(result), 20)

    def test_roman_range(self):
        result = list(roman_range(10))
        self.assertIsInstance(result, list)
        self.assertEqual(len(result), 10)
        for roman in result:
            self.assertIsInstance(roman, str)

    def test_roman_range_start(self):
        result = list(roman_range(10, start=5))
        self.assertIsInstance(result, list)
        self.assertEqual(len(result), 6)
        for roman in result:
            self.assertIsInstance(roman, str)

    def test_roman_range_step(self):
        result = list(roman_range(10, step=2))
        self.assertIsInstance(result, list)
        self.assertEqual(len(result), 5)
        for roman in result:
            self.assertIsInstance(roman, str)

    def test_roman_range_invalid_start(self):
        with self.assertRaises(OverflowError):
            list(roman_range(1, start=4000))

    def test_roman_range_invalid_stop(self):
        with self.assertRaises(OverflowError):
            list(roman_range(1, stop=4000))

    def test_roman_range_invalid_step(self):
        with self.assertRaises(OverflowError):
            list(roman_range(1, step=-1))

if __name__ == '__main__':
    unittest.main()