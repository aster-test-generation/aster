from thonny.roughparse import C_NONE
import unittest
from thonny.roughparse import RoughParser


class TestRoughParser(unittest.TestCase):
    def test_set_str(self):
        parser = RoughParser(4, 4)
        parser.set_str("print('Hello, World!')\n")
        self.assertEqual(parser.str, "print('Hello, World!')\n")

    def test_find_good_parse_start(self):
        parser = RoughParser(4, 4)
        parser.set_str("def my_function():\n    return 'Hello, World!'\n")
        self.assertEqual(parser.find_good_parse_start(), 0)

    def test_set_lo(self):
        parser = RoughParser(4, 4)
        parser.set_str("print('Hello, World!')\n")
        parser.set_lo(1)
        self.assertEqual(parser.str, "int('Hello, World!')\n")

    def test_get_continuation_type(self):
        parser = RoughParser(4, 4)
        parser.set_str("print('Hello, World!')\n")
        self.assertEqual(parser.get_continuation_type(), C_NONE)

class TestRoughParser(unittest.TestCase):
    def test_set_str(self):
        parser = RoughParser(indent_width=4, tabwidth=8)
        parser.set_str("This is a test string\n")
        self.assertEqual(parser.str, "This is a test string\n")

    def test_find_good_parse_start(self):
        parser = RoughParser(indent_width=4, tabwidth=8)
        parser.set_str("This is a test string\n")
        parser.set_lo(0)
        self.assertEqual(parser.find_good_parse_start(), 0)

    def test_set_lo(self):
        parser = RoughParser(indent_width=4, tabwidth=8)
        parser.set_str("This is a test string\n")
        parser.set_lo(5)
        self.assertEqual(parser.str, "is a test string\n")

    def test_get_continuation_type(self):
        parser = RoughParser(indent_width=4, tabwidth=8)
        parser.set_str("This is a test string\n")
        parser.set_lo(0)
        parser._study1()
        self.assertEqual(parser.get_continuation_type(), C_NONE)

if __name__ == '__main__':
    unittest.main()