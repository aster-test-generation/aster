from docstring_parser.parser import ParseError
import unittest
from docstring_parser.parser import parse, Style


class TestDocstringParser(unittest.TestCase):
    def test_parse_auto_style(self):
        docstring = parse("This is a docstring.")
        self.assertIsNotNone(docstring)

    def test_parse_custom_style(self):
        docstring = parse("This is a docstring.", style=Style.google)
        self.assertIsNotNone(docstring)

    def test_parse_multiple_styles(self):
        docstring = parse("This is a docstring.")
        self.assertIsNotNone(docstring)

    def test_parse_error(self):
        with self.assertRaises(ParseError):
            parse("Invalid docstring.")

    def test_parse_empty_string(self):
        with self.assertRaises(ParseError):
            parse("")

    def test_parse_style_not_found(self):
        with self.assertRaises(KeyError):
            parse("This is a docstring.", style="InvalidStyle")

    def test_parse_sorted_by_length(self):
        docstring = parse("This is a docstring.")
        self.assertEqual(len(docstring.meta), 1)

    def test_parse_sorted_by_length_multiple(self):
        docstring = parse("This is a docstring. This is another docstring.")
        self.assertEqual(len(docstring.meta), 2)

if __name__ == '__main__':
    unittest.main()