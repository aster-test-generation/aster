import unittest
from string_utils.manipulation import camel_case_to_snake
from string_utils.validation import is_integer, is_full_string


class TestRomanNumbers(unittest.TestCase):
    def test_encode_valid(self):
        result = __RomanNumbers.encode(1987)
        self.assertEqual(result, 'MCMLXXXVII')

    def test_encode_invalid_input_type(self):
        with self.assertRaises(ValueError):
            __RomanNumbers.encode('invalid')

    def test_encode_out_of_range_low(self):
        with self.assertRaises(ValueError):
            __RomanNumbers.encode(0)

    def test_encode_out_of_range_high(self):
        with self.assertRaises(ValueError):
            __RomanNumbers.encode(4000)

    def test_private_encode_digit(self):
        result = __RomanNumbers._RomanNumbers__encode_digit(0, 3)
        self.assertEqual(result, 'III')

    def test_private_encode_digit_zero(self):
        result = __RomanNumbers._RomanNumbers__encode_digit(0, 0)
        self.assertEqual(result, '')

    def test_private_encode_digit_four(self):
        result = __RomanNumbers._RomanNumbers__encode_digit(0, 4)
        self.assertEqual(result, 'IV')

    def test_private_encode_digit_five(self):
        result = __RomanNumbers._RomanNumbers__encode_digit(0, 5)
        self.assertEqual(result, 'V')

    def test_private_encode_digit_six(self):
        result = __RomanNumbers._RomanNumbers__encode_digit(0, 6)
        self.assertEqual(result, 'VI')

    def test_private_encode_digit_nine(self):
        result = __RomanNumbers._RomanNumbers__encode_digit(0, 9)
        self.assertEqual(result, 'IX')

    def test_decode_valid(self):
        result = __RomanNumbers.decode('MCMLXXXVII')
        self.assertEqual(result, 1987)

    def test_decode_invalid_input(self):
        with self.assertRaises(ValueError):
            __RomanNumbers.decode('')

    def test_private_index_for_sign_valid(self):
        result = __RomanNumbers._RomanNumbers__index_for_sign('I')
        self.assertEqual(result, 0)

    def test_private_index_for_sign_invalid(self):
        with self.assertRaises(ValueError):
            __RomanNumbers._RomanNumbers__index_for_sign('A')

if __name__ == '__main__':
    unittest.main()