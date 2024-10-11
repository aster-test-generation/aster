import unittest
from docstring_parser.parser import parse, Style


class TestDocstringParser(unittest.TestCase):
    def test_parse_auto_style(self):
        docstring = parse("This is a docstring")
        self.assertIsInstance(docstring, list)
        self.assertEqual(len(docstring), 1)

    def test_parse_custom_style(self):
        docstring = parse("This is a docstring", style=Style.google)
        self.assertIsInstance(docstring, list)
        self.assertEqual(len(docstring), 1)

    def test_parse_multiple_styles(self):
        docstring = parse("This is a docstring", style=Style.auto)
        self.assertIsInstance(docstring, list)
        self.assertEqual(len(docstring), 1)

    def test_parse_error(self):
        with self.assertRaises(ParseError):
            parse("Invalid docstring")

    def test_parse_empty_string(self):
        with self.assertRaises(ParseError):
            parse("")

    def test_parse_single_style(self):
        docstring = parse("This is a docstring", style=Style.python)
        self.assertIsInstance(docstring, list)
        self.assertEqual(len(docstring), 1)

    def test_parse_multiple_styles_with_error(self):
        with self.assertRaises(ParseError):
            parse("Invalid docstring", style=Style.google)

if __name__ == '__main__':
    unittest.main()