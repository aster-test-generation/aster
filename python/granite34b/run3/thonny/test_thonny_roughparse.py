import unittest
from thonny.roughparse import *


class TestRoughParse(unittest.TestCase):
    def test_private_method(self):
        result = _is_char_in_string('10')
        self.assertEqual(result, 1)

    def test_protected_method(self):
        result = _build_char_in_string_func(5)(10)
        self.assertEqual(result, 1)

    def test_public_method(self):
        result = parse_source("print('Hello, world!')")
        self.assertEqual(result, ["print('Hello, world!')"])

    def test_magic_method(self):
        result = str()
        self.assertEqual(result, "ExampleClass")

if __name__ == '__main__':
    unittest.main()