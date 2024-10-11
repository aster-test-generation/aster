import unittest
from docstring_parser.parser import parse


class TestDocstringParser(unittest.TestCase):
    def test_parse_auto_style(self):
        docstring = parse("This is a docstring")
        self.assertIsNotNone(docstring)

    def test_parse_custom_style(self):
        docstring = parse("This is a docstring", style=Style.google)
        self.assertIsNotNone(docstring)

    def test_parse_multiple_styles(self):
        docstring = parse("This is a docstring", style=Style.auto)
        self.assertIsNotNone(docstring)

    def test_parse_error(self):
        with self.assertRaises(ParseError):
            parse("Invalid docstring")

    def test_parse_multiple_parsers(self):
        docstring = parse("This is a docstring", style=Style.auto)
        self.assertIsNotNone(docstring)

    def test_parse_no_parsers(self):
        with self.assertRaises(ParseError):
            parse("This is a docstring", style=Style.none)

    def test_parse_empty_string(self):
        with self.assertRaises(ParseError):
            parse("")

    def test_parse_none(self):
        with self.assertRaises(ParseError):
            parse(None)

if __name__ == '__main__':
    unittest.main()