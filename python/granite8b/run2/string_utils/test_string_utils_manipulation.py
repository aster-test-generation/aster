import unittest
from string_utils.manipulation import camel_case_to_snake


class TestRomanEncoding(unittest.TestCase):
    def test_roman_encode(self):
        self.assertEqual(roman_encode(1), 'I')
        self.assertEqual(roman_encode(2), 'II')
        self.assertEqual(roman_encode(3), 'III')
        self.assertEqual(roman_encode(4), 'IV')
        self.assertEqual(roman_encode(5), 'V')
        self.assertEqual(roman_encode(6), 'VI')
        self.assertEqual(roman_encode(7), 'VII')
        self.assertEqual(roman_encode(8), 'VIII')
        self.assertEqual(roman_encode(9), 'IX')
        self.assertEqual(roman_encode(10), 'X')
        self.assertEqual(roman_encode(11), 'XI')
        self.assertEqual(roman_encode(12), 'XII')
        self.assertEqual(roman_encode(13), 'XIII')
        self.assertEqual(roman_encode(14), 'XIV')
        self.assertEqual(roman_encode(15), 'XV')
        self.assertEqual(roman_encode(16), 'XVI')
        self.assertEqual(roman_encode(17), 'XVII')
        self.assertEqual(roman_encode(18), 'XVIII')
        self.assertEqual(roman_encode(19), 'XIX')
        self.assertEqual(roman_encode(20), 'XX')
        self.assertEqual(roman_encode(3999), 'MMMCMXCIX')

class TestRomanDecoding(unittest.TestCase):
    def test_roman_decode(self):
        self.assertEqual(roman_decode('I'), 1)
        self.assertEqual(roman_decode('II'), 2)
        self.assertEqual(roman_decode('III'), 3)
        self.assertEqual(roman_decode('IV'), 4)
        self.assertEqual(roman_decode('V'), 5)
        self.assertEqual(roman_decode('VI'), 6)
        self.assertEqual(roman_decode('VII'), 7)
        self.assertEqual(roman_decode('VIII'), 8)
        self.assertEqual(roman_decode('IX'), 9)
        self.assertEqual(roman_decode('X'), 10)
        self.assertEqual(roman_decode('XI'), 11)
        self.assertEqual(roman_decode('XII'), 12)
        self.assertEqual(roman_decode('XIII'), 13)
        self.assertEqual(roman_decode('XIV'), 14)
        self.assertEqual(roman_decode('XV'), 15)
        self.assertEqual(roman_decode('XVI'), 16)
        self.assertEqual(roman_decode('XVII'), 17)
        self.assertEqual(roman_decode('XVIII'), 18)
        self.assertEqual(roman_decode('XIX'), 19)
        self.assertEqual(roman_decode('XX'), 20)
        self.assertEqual(roman_decode('MMMCMXCIX'), 3999)

if __name__ == '__main__':
    unittest.main()