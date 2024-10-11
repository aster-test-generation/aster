import string
import unittest
from string_utils.generation import uuid, random_string, secure_random_hex, roman_range


class TestUuid(unittest.TestCase):
    def test_uuid_hex(self):
        uuid_hex = uuid(as_hex=True)
        self.assertEqual(len(uuid_hex), 32)

    def test_uuid_str(self):
        uuid_str = uuid(as_hex=False)
        self.assertEqual(len(uuid_str), 36)

class TestRandomString(unittest.TestCase):
    def test_random_string_length(self):
        random_str = random_string(10)
        self.assertEqual(len(random_str), 10)

    def test_random_string_chars(self):
        random_str = random_string(10)
        self.assertTrue(all(c in string.ascii_letters + string.digits for c in random_str))

class TestSecureRandomHex(unittest.TestCase):
    def test_secure_random_hex_length(self):
        random_hex = secure_random_hex(10)
        self.assertEqual(len(random_hex), 20)

    def test_secure_random_hex_chars(self):
        random_hex = secure_random_hex(10)
        self.assertTrue(all(c in '0123456789abcdef' for c in random_hex))

class TestRomanRange(unittest.TestCase):
    def test_roman_range_forward(self):
        roman_range_list = list(roman_range(10))
        self.assertEqual(roman_range_list, ['I', 'II', 'III', 'IV', 'V', 'VI', 'VII', 'VIII', 'IX', 'X'])

    def test_roman_range_backward(self):
        roman_range_list = list(roman_range(10, step=-1))
        self.assertEqual(roman_range_list, ['X', 'IX', 'VIII', 'VII', 'VI', 'V', 'IV', 'III', 'II', 'I'])

    def test_roman_range_invalid_config(self):
        with self.assertRaises(ZeroDivisionError):
            list(roman_range(1, 10, step=-1))

class TestSecureRandomHex(unittest.TestCase):
    def test_secure_random_hex_length(self):
        random_hex = secure_random_hex(10)
        self.assertEqual(len(random_hex), 20)

    def test_secure_random_hex_chars(self):
        random_hex = secure_random_hex(10)
        self.assertTrue(all(c in string.hexdigits for c in random_hex))

class TestRomanRange(unittest.TestCase):
    def test_roman_range_forward(self):
        roman_range_list = list(roman_range(10))
        self.assertEqual(roman_range_list, ['I', 'II', 'III', 'IV', 'V', 'VI', 'VII', 'VIII', 'IX', 'X'])

    def test_roman_range_backward(self):
        roman_range_list = list(roman_range(10, step=-1))
        self.assertEqual(roman_range_list, ['X', 'IX', 'VIII', 'VII', 'VI', 'V', 'IV', 'III', 'II', 'I'])

    def test_roman_range_invalid_step(self):
        with self.assertRaises(OverflowError):
            list(roman_range(10, step=0))

    def test_roman_range_invalid_start_stop(self):
        with self.assertRaises(OverflowError):
            list(roman_range(1, start=10000, step=1))

        with self.assertRaises(OverflowError):
            list(roman_range(10000, start=1, step=-1))

if __name__ == '__main__':
    unittest.main()