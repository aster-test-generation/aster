import unittest
from thonny.roughparse import *


class TestRoughParse(unittest.TestCase):
    def test_private_method(self):
        self.assertEqual(_is_char_in_string(0), True)

    def test_protected_method(self):
        self.assertEqual(_build_char_in_string_func(0)(0), 0)

    def test_public_method(self):
        self.assertEqual(get_source_of_command("print('Hello, world!')"), "Hello, world!")

    def test_magic_method(self):
        self.assertEqual(RoughParser(), None)

    def test_function(self):
        self.assertEqual(get_main_scope("def my_function():\n    pass"), "global")

if __name__ == '__main__':
    unittest.main()