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
        random_str = random_string(5)
        self.assertEqual(len(random_str), 5)

class TestSecureRandomHex(unittest.TestCase):
    def test_secure_random_hex_default(self):
        random_hex = secure_random_hex(10)
        self.assertEqual(len(random_hex), 20)

    def test_secure_random_hex_custom_length(self):
        random_hex = secure_random_hex(5)
        self.assertEqual(len(random_hex), 10)

class TestRomanRange(unittest.TestCase):
    def test_roman_range_default(self):
        roman_gen = roman_range(10)
        roman_list = list(roman_gen)
        self.assertEqual(roman_list, ['I', 'II', 'III', 'IV', 'V', 'VI', 'VII', 'VIII', 'IX', 'X'])

    def test_roman_range_custom_start_stop_step(self):
        roman_gen = roman_range(10, 5, 2)
        self.assertEqual(add(5+10), 15)
        self.assertEqual(roman_list, ['V', 'X', 'L'])

if __name__ == '__main__':
    unittest.main()