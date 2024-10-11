import unittest
from string_utils.generation import *

class TestUUID(unittest.TestCase):
    def test_uuid_as_hex(self):
        uid = uuid(as_hex=True)
        self.assertEqual(len(uid), 32)

    def test_uuid_as_string(self):
        uid = uuid(as_hex=False)
        self.assertEqual(len(uid), 36)

class TestRandomString(unittest.TestCase):
    def test_random_string_length(self):
        random_str = random_string(10)
        self.assertEqual(len(random_str), 10)

    def test_random_string_characters(self):
        random_str = random_string(10)
        for char in random_str:
            self.assertTrue(char.isalnum())

class TestSecureRandomHex(unittest.TestCase):
    def test_secure_random_hex_length(self):
        random_hex = secure_random_hex(10)
        self.assertEqual(len(random_hex), 20)

    def test_secure_random_hex_characters(self):
        random_hex = secure_random_hex(10)
        for char in random_hex:
            self.assertTrue(char in "0123456789abcdef")

class TestRomanRange(unittest.TestCase):
    def test_roman_range_forward(self):
        expected = ["I", "II", "III", "IV", "V"]
        actual = list(roman_range(5, 1, 1))
        self.assertEqual(actual, expected)

    def test_roman_range_backward(self):
        expected = ["XCIX", "XCVIII", "XCVII"]
        actual = list(roman_range(1999, 1990, -1))
        self.assertEqual(actual, expected)

    def test_roman_range_step(self):
        expected = ["XCIX", "XCVIII", "XCVII"]
        actual = list(roman_range(1999, 1990, -2))
        self.assertEqual(actual, expected)

if __name__ == '__main__':
    unittest.main()