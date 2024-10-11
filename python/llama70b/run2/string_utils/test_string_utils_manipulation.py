import unittest
from string_utils import manipulatio


class TestRomanNumbers(unittest.TestCase):
    def test_roman_encode(self):
        result = roman_encode(1)
        self.assertEqual(result, 'I')

    def test_roman_decode(self):
        result = roman_decode('I')
        self.assertEqual(result, 1)

    def test_roman_encode_invalid_input(self):
        with self.assertRaises(InvalidInputError):
            roman_encode('invalid input')

    def test_roman_decode_invalid_input(self):
        with self.assertRaises(InvalidInputError):
            roman_decode('invalid input')

if __name__ == '__main__':
    unittest.main()