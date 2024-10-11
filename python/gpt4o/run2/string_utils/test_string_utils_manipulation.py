from string_utils.manipulation import InvalidInputError, camel_case_to_snake
import unittest
from string_utils.manipulation import roman_encode, roman_decode


class TestRomanEncode(unittest.TestCase):
    def test_roman_encode_with_integer(self):
        result = roman_encode(10)
        self.assertEqual(result, 'X')

    def test_roman_encode_with_string(self):
        result = roman_encode('10')
        self.assertEqual(result, 'X')

    def test_roman_encode_with_invalid_input(self):
        with self.assertRaises(InvalidInputError):
            roman_encode('invalid')

class TestRomanDecode(unittest.TestCase):
    def test_roman_decode_with_valid_roman(self):
        result = roman_decode('X')
        self.assertEqual(result, 10)

    def test_roman_decode_with_invalid_roman(self):
        with self.assertRaises(InvalidInputError):
            roman_decode('invalid')

if __name__ == '__main__':
    unittest.main()