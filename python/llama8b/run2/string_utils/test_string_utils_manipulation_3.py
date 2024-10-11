from string_utils import manipulatio
import unittest
from string_utils.manipulation import *


class TestRomanNumbers(unittest.TestCase):
    def test_encode(self):
        instance = __RomanNumbers()
        result = instance.encode(1)
        self.assertEqual(result, 'I')

    def test_encode_multiple_digits(self):
        instance = __RomanNumbers()
        result = instance.encode(4)
        self.assertEqual(result, 'IV')

    def test_encode_large_number(self):
        instance = __RomanNumbers()
        result = instance.encode(3999)
        self.assertEqual(result, 'MMMCMXCIX')

    def test_encode_invalid_input(self):
        instance = __RomanNumbers()
        with self.assertRaises(ValueError):
            instance.encode('abc')

    def test_encode_number_out_of_range(self):
        instance = __RomanNumbers()
        with self.assertRaises(ValueError):
            instance.encode(0)

    def test_encode_number_out_of_range2(self):
        instance = __RomanNumbers()
        with self.assertRaises(ValueError):
            instance.encode(4000)

    def test_decode(self):
        instance = __RomanNumbers()
        result = instance.decode('MMMCMXCIX')
        self.assertEqual(result, 3999)

    def test_decode_invalid_input(self):
        instance = __RomanNumbers()
        with self.assertRaises(ValueError):
            instance.decode('abc')

    def test_decode_empty_string(self):
        instance = __RomanNumbers()
        with self.assertRaises(ValueError):
            instance.decode('')

    def test_decode_non_full_string(self):
        instance = __RomanNumbers()
        with self.assertRaises(ValueError):
            instance.decode('M')

    def test_encode_digit(self):
        instance = __RomanNumbers()
        result = instance.__encode_digit(0, 0)
        self.assertEqual(result, '')

    def test_encode_digit_multiple(self):
        instance = __RomanNumbers()
        result = instance.__encode_digit(0, 3)
        self.assertEqual(result, 'III')

    def test_encode_digit_large(self):
        instance = __RomanNumbers()
        result = instance.__encode_digit(0, 8)
        self.assertEqual(result, 'VIII')

    def test_index_for_sign(self):
        instance = __RomanNumbers()
        result = instance.__index_for_sign('M')
        self.assertEqual(result, 0)

    def test_index_for_sign_invalid(self):
        instance = __RomanNumbers()
        with self.assertRaises(ValueError):
            instance.__index_for_sign('X')

if __name__ == '__main__':
    unittest.main()