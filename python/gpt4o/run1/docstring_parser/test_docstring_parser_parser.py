import unittest
from docstring_parser.parser import parse
from docstring_parser.common import Docstring, ParseError
from docstring_parser.styles import STYLES, Style


class TestDocstringParser(unittest.TestCase):
    def test_parse_with_specific_style(self):
        text = "Example docstring"
        style = Style.google
        result = parse(text, style)
        self.assertIsInstance(result, Docstring)

    def test_parse_with_auto_style(self):
        text = "Example docstring"
        result = parse(text, Style.auto)
        self.assertIsInstance(result, Docstring)

    def test_parse_with_invalid_style(self):
        text = "Invalid docstring"
        with self.assertRaises(ParseError):
            parse(text, Style.NUMPY)

    def test_parse_with_empty_text(self):
        text = ""
        result = parse(text, Style.auto)
        self.assertIsInstance(result, Docstring)

    def test_parse_with_no_valid_parsers(self):
        text = "Invalid docstring"
        original_styles = STYLES.copy()
        try:
            # Temporarily replace STYLES with a dictionary that raises ParseError for all parsers
            STYLES.clear()
            STYLES[Style.google] = lambda x: (_ for _ in ()).throw(ParseError("Parsing error"))
            with self.assertRaises(ParseError):
                parse(text, Style.auto)
        finally:
            STYLES.update(original_styles)

if __name__ == '__main__':
    unittest.main()