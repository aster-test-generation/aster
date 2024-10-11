import unittest
from string_utils.manipulation import RomanNumbers


class TestRomanNumbers(unittest.TestCase):
    def test_encode_digit(self):
        self.assertEqual(__RomanNumbers.__encode_digit(0, 0), '')
        self.assertEqual(__RomanNumbers.__encode_digit(0, 1), 'I')
        self.assertEqual(__RomanNumbers.__encode_digit(0, 2), 'II')
        self.assertEqual(__RomanNumbers.__encode_digit(0, 3), 'III')
        self.assertEqual(__RomanNumbers.__encode_digit(0, 4), 'IV')
        self.assertEqual(__RomanNumbers.__encode_digit(0, 5), 'V')
        self.assertEqual(__RomanNumbers.__encode_digit(0, 6), 'VI')
        self.assertEqual(__RomanNumbers.__encode_digit(0, 7), 'VII')
        self.assertEqual(__RomanNumbers.__encode_digit(0, 8), 'VIII')
        self.assertEqual(__RomanNumbers.__encode_digit(0, 9), 'IX')
        self.assertEqual(__RomanNumbers.__encode_digit(0, 10), 'X')
        self.assertEqual(__RomanNumbers.__encode_digit(1, 1), 'X')
        self.assertEqual(__RomanNumbers.__encode_digit(1, 2), 'XX')
        self.assertEqual(__RomanNumbers.__encode_digit(1, 3), 'XXX')
        self.assertEqual(__RomanNumbers.__encode_digit(1, 4), 'XL')
        self.assertEqual(__RomanNumbers.__encode_digit(1, 5), 'L')
        self.assertEqual(__RomanNumbers.__encode_digit(1, 6), 'LX')
        self.assertEqual(__RomanNumbers.__encode_digit(1, 7), 'LXX')
        self.assertEqual(__RomanNumbers.__encode_digit(1, 8), 'LXXX')
        self.assertEqual(__RomanNumbers.__encode_digit(1, 9), 'XC')
        self.assertEqual(__RomanNumbers.__encode_digit(1, 10), 'C')
        self.assertEqual(__RomanNumbers.__encode_digit(2, 1), 'C')
        self.assertEqual(__RomanNumbers.__encode_digit(2, 2), 'CC')
        self.assertEqual(__RomanNumbers.__encode_digit(2, 3), 'CCC')
        self.assertEqual(__RomanNumbers.__encode_digit(2, 4), 'CD')
        self.assertEqual(__RomanNumbers.__encode_digit(2, 5), 'D')
        self.assertEqual(__RomanNumbers.__encode_digit(2, 6), 'DC')
        self.assertEqual(__RomanNumbers.__encode_digit(2, 7), 'DCC')
        self.assertEqual(__RomanNumbers.__encode_digit(2, 8), 'DCCC')
        self.assertEqual(__RomanNumbers.__encode_digit(2, 9), 'CM')
        self.assertEqual(__RomanNumbers.__encode_digit(2, 10), 'M')
        self.assertEqual(__RomanNumbers.__encode_digit(3, 1), 'M')
        self.assertEqual(__RomanNumbers.__encode_digit(3, 2), 'MM')
        self.assertEqual(__RomanNumbers.__encode_digit(3, 3), 'MMM')

if __name__ == '__main__':
    unittest.main()