import unittest
from string_utils.generation import *


class TestUUID(unittest.TestCase):
    def test_uuid_default(self):
        uid = uuid()
        self.assertEqual(len(uid), 36)

    def test_uuid_hex(self):
        uid = uuid(as_hex=True)
        self.assertEqual(len(uid), 32)

class TestRandomString(unittest.TestCase):
    def test_random_string_default(self):
        random_str = random_string(10)
        self.assertEqual(len(random_str), 10)

    def test_random_string_custom_length(self):
        random_str = random_string(20)
        self.assertEqual(len(random_str), 20)

class TestSecureRandomHex(unittest.TestCase):
    def test_secure_random_hex_default(self):
        random_hex = secure_random_hex(10)
        self.assertEqual(len(random_hex), 20)

    def test_secure_random_hex_custom_length(self):
        random_hex = secure_random_hex(20)
        self.assertEqual(len(random_hex), 40)

class TestRomanRange(unittest.TestCase):
    def test_roman_range_default(self):
        roman_nums = list(roman_range(10))
        self.assertEqual(roman_nums, ['I', 'II', 'III', 'IV', 'V', 'VI', 'VII', 'VIII', 'IX', 'X'])

    def test_roman_range_custom_start_stop_step(self):
        roman_nums = list(roman_range(20, 5, 3))
        self.assertEqual(roman_nums, ['V', 'X', 'CXX', 'L'])

if __name__ == '__main__':
    unittest.main()