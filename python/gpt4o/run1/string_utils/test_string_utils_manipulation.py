import unittest
from string_utils.manipulation import camel_case_to_snake


class TestStringUtilsManipulation(unittest.TestCase):
    def test_roman_encode_with_integer(self):
        result = roman_encode(10)
        self.assertEqual(result, 'X')

    def test_roman_encode_with_string(self):
        result = roman_encode('10')
        self.assertEqual(result, 'X')

    def test_roman_decode(self):
        result = roman_decode('X')
        self.assertEqual(result, 10)

    def test_roman_encode_invalid_input(self):
        with self.assertRaises(InvalidInputError):
            roman_encode('invalid')

    def test_roman_decode_invalid_input(self):
        with self.assertRaises(InvalidInputError):
            roman_decode('invalid')

if __name__ == '__main__':
    unittest.main()