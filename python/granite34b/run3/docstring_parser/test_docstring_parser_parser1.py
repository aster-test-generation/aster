import unittest
from docstring_parser.parser import parse
from docstring_parser.common import Docstring, ParseError
from docstring_parser.styles import STYLES, Style

class TestParse(unittest.TestCase):
    def test_parse_with_valid_input(self):
        text = "This is a test docstring"
        result = parse(text)
        self.assertIsInstance(result, Docstring)

    def test_parse_with_invalid_input(self):
        text = 123
        with self.assertRaises(ParseError):
            parse(text)

    def test_parse_with_auto_style(self):
        text = "This is a test docstring"
        result = parse(text, style=Style.auto)
        self.assertIsInstance(result, Docstring)

    def test_parse_with_specific_style(self):
        text = "This is a test docstring"
        result = parse(text, style=Style.google)
        self.assertIsInstance(result, Docstring)

    def test_parse_with_private_method(self):
        text = "This is a test docstring"
        result = parse(text)
        self.assertEqual(result._Docstring__private_method(), "private")

    def test_parse_with_protected_method(self):
        text = "This is a test docstring"
        result = parse(text)
        self.assertEqual(result._Docstring__protected_method(), "protected")

    def test_parse_with_magic_method(self):
        text = "This is a test docstring"
        result = parse(text)
        self.assertEqual(result.__str__(), "Docstring")

if __name__ == '__main__':
    unittest.main()