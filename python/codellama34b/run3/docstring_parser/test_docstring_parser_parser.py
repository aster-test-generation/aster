import unittest
from docstring_parser.parser import parse, Docstring, ParseError
from docstring_parser.styles import STYLES, Style


class TestParse(unittest.TestCase):
    def test_parse(self):
        text = "This is a test text."
        style = Style.auto
        result = parse(text, style)
        self.assertIsInstance(result, Docstring)

    def test_parse_style_not_auto(self):
        text = "This is a test text."
        style = Style.google
        result = parse(text, style)
        self.assertIsInstance(result, Docstring)

    def test_parse_style_auto(self):
        text = "This is a test text."
        style = Style.auto
        result = parse(text, style)
        self.assertIsInstance(result, Docstring)

    def test_parse_style_auto_error(self):
        text = "This is a test text."
        style = Style.auto
        with self.assertRaises(ParseError):
            parse(text, style)


if __name__ == '__main__':
    unittest.main()