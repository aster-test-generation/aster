import unittest
from string_utils.generation import *

class TestStringUtilsGeneration(unittest.TestCase):
    def test_uuid(self):
        result = uuid()
        self.assertEqual(len(result), 36)

    def test_random_string(self):
        result = random_string(10)
        self.assertEqual(len(result), 10)

    def test_secure_random_hex(self):
        result = secure_random_hex(10)
        self.assertEqual(len(result), 20)

    def test_roman_range(self):
        result = roman_range(10)
        self.assertEqual(len(result), 10)

if __name__ == '__main__':
    unittest.main()