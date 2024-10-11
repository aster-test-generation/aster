from thonny.roughparse import C_NONE
import unittest
from thonny.roughparse import RoughParser


class TestRoughParser(unittest.TestCase):
    def setUp(self):
        self.parser = RoughParser(indent_width=4, tabwidth=8)

    def test_set_str(self):
        self.parser.set_str("This is a test string\nwith multiple lines\n")
        self.assertEqual(self.parser.str, "This is a test string\nwith multiple lines\n")

    def test_find_good_parse_start(self):
        self.parser.set_str("This is a test string\nwith multiple lines\n")
        self.assertEqual(self.parser.find_good_parse_start(), None)

    def test_set_lo(self):
        self.parser.set_str("This is a test string\nwith multiple lines\n")
        self.parser.set_lo(20)
        self.assertEqual(self.parser.str, "with multiple lines\n")

    def test_get_continuation_type(self):
        self.parser.set_str("This is a test string\nwith multiple lines\n")
        self.assertEqual(self.parser.get_continuation_type(), C_NONE)

class TestRoughParser(unittest.TestCase):
    def test_set_str(self):
        parser = RoughParser(indent_width=4, tabwidth=8)
        parser.set_str("This is a test string\n")
        self.assertEqual(parser.str, "This is a test string\n")

    def test_find_good_parse_start(self):
        parser = RoughParser(indent_width=4, tabwidth=8)
        parser.set_str("This is a test string\n")
        def is_char_in_string(pos):
            return False
        self.assertEqual(parser.find_good_parse_start(is_char_in_string), None)

    def test_set_lo(self):
        parser = RoughParser(indent_width=4, tabwidth=8)
        parser.set_str("This is a test string\n")
        parser.set_lo(5)
        self.assertEqual(parser.str, "is a test string\n")

    def test_study1(self):
        parser = RoughParser(indent_width=4, tabwidth=8)
        parser.set_str("This is a test string\n")
        parser._study1()
        self.assertEqual(parser.continuation, C_NONE)

    def test_get_continuation_type(self):
        parser = RoughParser(indent_width=4, tabwidth=8)
        parser.set_str("This is a test string\n")
        parser._study1()
        self.assertEqual(parser.get_continuation_type(), C_NONE)

if __name__ == '__main__':
    unittest.main()