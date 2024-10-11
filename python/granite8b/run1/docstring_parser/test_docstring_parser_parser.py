from docstring_parser.parser import ParseError
import unittest
from docstring_parser.parser import parse


class TestDocstringParser(unittest.TestCase):
    def test_parse_with_style(self):
        docstring = parse('"""This is a docstring."""', style='numpy')
        self.assertEqual(docstring.short_description, 'This is a docstring.')

    def test_parse_with_auto_style(self):
        docstring = parse('"""This is a docstring."""', style='numpy')
        self.assertEqual(docstring.short_description, 'This is a docstring.')

    def test_parse_with_invalid_style(self):
        with self.assertRaises(ParseError):
            parse('"""This is a docstring."""', style='numpy')

if __name__ == '__main__':
    unittest.main()