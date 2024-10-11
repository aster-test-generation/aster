import unittest
from string_utils.generation import uuid, random_string, secure_random_hex, roman_range


class TestUuid(unittest.TestCase):
    def test_uuid_hex(self):
        uuid_hex = uuid(as_hex=True)
        self.assertEqual(len(uuid_hex), 32)
        self.assertTrue(uuid_hex.isalnum())

    def test_uuid_string(self):
        uuid_string = uuid(as_hex=False)
        self.assertEqual(len(uuid_string), 36)
        self.assertTrue(uuid_string.isalnum())

class TestRandomString(unittest.TestCase):
    def test_random_string_length(self):
        random_string_1 = random_string(10)
        self.assertEqual(len(random_string_1), 10)
        random_string_2 = random_string(20)
        self.assertEqual(len(random_string_2), 20)

class TestSecureRandomHex(unittest.TestCase):
    def test_secure_random_hex_length(self):
        random_hex_1 = secure_random_hex(10)
        self.assertEqual(len(random_hex_1), 20)
        random_hex_2 = secure_random_hex(20)
        self.assertEqual(len(random_hex_2), 40)

class TestRomanRange(unittest.TestCase):
    def test_roman_range_forward(self):
        roman_range_1 = list(roman_range(1, 10))
        self.assertEqual(roman_range_1, ['I', 'II', 'III', 'IV', 'V', 'VI', 'VII', 'VIII', 'IX'])
        roman_range_2 = list(roman_range(10, 20))
        self.assertEqual(roman_range_2, ['X', 'XX', 'XXX', 'XL', 'L', 'LX', 'LXX', 'LXXX', 'XC'])

    def test_roman_range_backward(self):
        roman_range_1 = list(roman_range(10, 1))
        self.assertEqual(roman_range_1, ['I', 'II', 'III', 'IV', 'V', 'VI', 'VII', 'VIII', 'IX', 'X'])
        roman_range_2 = list(roman_range(20, 10))
        self.assertEqual(roman_range_2, ['XX', 'XXX', 'XL', 'L', 'LX', 'LXX', 'LXXX', 'XC', 'C', 'CI', 'CII', 'CIII', 'CIV', 'CV', 'CVI', 'CVII', 'CVIII', 'CIX'])

if __name__ == '__main__':
    unittest.main()