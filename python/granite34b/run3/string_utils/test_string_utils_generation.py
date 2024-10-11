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
        random_string = random_string(10)
        self.assertEqual(len(random_string), 10)

    def test_random_string_characters(self):
        random_string = random_string(10)
        for char in random_string:
            self.assertTrue(char.isalnum())

class TestSecureRandomHex(unittest.TestCase):
    def test_secure_random_hex_length(self):
        secure_random_hex = secure_random_hex(10)
        self.assertEqual(len(secure_random_hex), 20)

    def test_secure_random_hex_characters(self):
        secure_random_hex = secure_random_hex(10)
        for char in secure_random_hex:
            self.assertTrue(char in "0123456789abcdef")

class TestRomanRange(unittest.TestCase):
    def test_roman_range_positive_step(self):
        roman_range = list(roman_range(1, 10, 1))
        self.assertEqual(roman_range, ["I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"])

    def test_roman_range_negative_step(self):
        roman_range = list(roman_range(10, 10, 1))
        self.assertEqual(roman_range, ["X", "IX", "VIII", "VII", "VI", "V", "IV", "III", "II", "I"])

    def test_roman_range_invalid_start(self):
        with self.assertRaises(ValueError):
            list(roman_range(10, 0, 1))

    def test_roman_range_invalid_stop(self):
        with self.assertRaises(ValueError):
            list(roman_range(0, 1, 1))

    def test_roman_range_invalid_step(self):
        with self.assertRaises(ValueError):
            list(roman_range(10, 1, 0))

    def test_roman_range_overflow(self):
        with self.assertRaises(OverflowError):
            list(roman_range(10, 1, 3999))

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