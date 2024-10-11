
import unittest
from docstring_parser.rest import *

class TestParse(unittest.TestCase):
    def test_parse(self):
        result = parse("")
        self.assertEqual(result.short_description, None)
        self.assertEqual(result.blank_after_short_description, False)
        self.assertEqual(result.blank_after_long_description, False)
        self.assertEqual(result.long_description, None)
        self.assertEqual(result.meta, [])

    def test_parse_2(self):
        result = parse("test")
        self.assertEqual(result.short_description, "test")
        self.assertEqual(result.blank_after_short_description, False)
        self.assertEqual(result.blank_after_long_description, False)
        self.assertEqual(result.long_description, None)
        self.assertEqual(result.meta, [])

    def test_parse_3(self):
        result = parse("test\n\n")
        self.assertEqual(result.short_description, "test")
        self.assertEqual(result.blank_after_short_description, False)
        self.assertEqual(result.blank_after_long_description, True)
        self.assertEqual(result.long_description, None)
        self.assertEqual(result.meta, [])

    def test_parse_4(self):
        result = parse("test\n\n\n")
        self.assertEqual(result.short_description, "test")
        self.assertEqual(result.blank_after_short_description, False)
        self.assertEqual(result.blank_after_long_description, True)
        self.assertEqual(result.long_description, None)
        self.assertEqual(result.meta, [])

    def test_parse_5(self):
        result = parse("test\n\n\n\n")
        self.assertEqual(result.short_description, "test")
        self.assertEqual(result.blank_after_short_description, False)
        self.assertEqual(result.blank_after_long_description, True)
        self.assertEqual(result.long_description, None)
        self.assertEqual(result.meta, [])

    def test_parse_6(self):
        result = parse("test\n\n\n\n\n")
        self.assertEqual(result.short_description, "test")
        self.assertEqual(result.blank_after_short_description, False)
        self.assertEqual(result.blank_after_long_description, True)
        self.assertEqual(result.long_description, None)
        self.assertEqual(result.meta, [])

    def test_parse_7(self):
        result = parse("test\n\n\n\n\n\n")
        self.assertEqual(result.short_description, "test")
        self.assertEqual(result.blank_after_short_description, False)
        self.assertEqual(result.blank_after_long_description, True)
        self.assertEqual(result.long_description, None)
        self.assertEqual(result.meta, [])

    def test_parse_8(self):
        result = parse("test\n\n\n\n\n\n\n")
        self.assertEqual(result.short_description, "test")
        self.assertEqual(result.blank_after_short_description, False)
        self.assertEqual(result.blank_after_long_description, True)
        self.assertEqual(result.long_description, None)
        self.assertEqual(result.meta, [])

    def test_parse_9(self):
        result = parse("test\n\n\n\n\n\n\n\n")
        self.assertEqual(result.short_description, "test")
        self.assertEqual(result.blank_after_short_description, False)
        self.assertEqual(result.blank_after_long_description, True)
        self.assertEqual(result.long_description, None)
        self.assertEqual(result.meta, [])

if __name__ == '__main__':
    unittest.main()