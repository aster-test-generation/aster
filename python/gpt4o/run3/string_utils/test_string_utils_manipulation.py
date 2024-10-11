import unittest
from string_utils.conversion import camel_case_to_snake


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

    def test_private_roman_encode(self):
        result = __RomanNumbers.encode(10)
        self.assertEqual(result, 'X')

    def test_private_roman_decode(self):
        result = __RomanNumbers.decode('X')
        self.assertEqual(result, 10)

if __name__ == '__main__':
    unittest.main()