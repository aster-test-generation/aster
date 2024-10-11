from string_utils import manipulatio
import unittest
from string_utils.manipulation import *


class TestRomanNumbers(unittest.TestCase):
    def test_encode(self):
        instance = __RomanNumbers()
        result = instance.encode(1)
        self.assertEqual(result, 'I')
        result = instance.encode(4)
        self.assertEqual(result, 'IV')
        result = instance.encode(5)
        self.assertEqual(result, 'V')
        result = instance.encode(9)
        self.assertEqual(result, 'IX')
        result = instance.encode(13)
        self.assertEqual(result, 'XIII')
        result = instance.encode(1999)
        self.assertEqual(result, 'MCMXCIX')

    def test_decode(self):
        instance = __RomanNumbers()
        result = instance.decode('I')
        self.assertEqual(result, 1)
        result = instance.decode('IV')
        self.assertEqual(result, 4)
        result = instance.decode('V')
        self.assertEqual(result, 5)
        result = instance.decode('IX')
        self.assertEqual(result, 9)
        result = instance.decode('XIII')
        self.assertEqual(result, 13)
        result = instance.decode('MCMXCIX')
        self.assertEqual(result, 1999)

    def test_encode_invalid_input(self):
        instance = __RomanNumbers()
        with self.assertRaises(ValueError):
            instance.encode('abc')
        with self.assertRaises(ValueError):
            instance.encode(-1)
        with self.assertRaises(ValueError):
            instance.encode(4000)

    def test_decode_invalid_input(self):
        instance = __RomanNumbers()
        with self.assertRaises(ValueError):
            instance.decode('')
        with self.assertRaises(ValueError):
            instance.decode('abc')
        with self.assertRaises(ValueError):
            instance.decode('XIIII')

if __name__ == '__main__':
    unittest.main()