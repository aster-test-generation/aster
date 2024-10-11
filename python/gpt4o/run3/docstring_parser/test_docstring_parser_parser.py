import unittest
from docstring_parser.parser import parse
from docstring_parser.common import Docstring, ParseError
from docstring_parser.styles import STYLES, Style
from docstring_parser.common import ParseError, Docstring
from docstring_parser.styles import Style, STYLES


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

    def test_parse_with_invalid_text(self):
        text = "Invalid docstring"
        with self.assertRaises(SomeOtherError):
            parse(text, Style.auto)

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
        style = Style.numpy
        with self.assertRaises(ParseError):
            parse(text, style)

    def test_parse_with_no_valid_styles(self):
        text = "Invalid docstring"
        original_styles = STYLES.copy()
        try:
            # Temporarily replace STYLES with a version that always raises ParseError
            for key in STYLES:
                STYLES[key] = lambda x: (_ for _ in ()).throw(ParseError("Parsing failed"))
            with self.assertRaises(ParseError):
                parse(text, Style.auto)
        finally:
            # Restore the original STYLES
            STYLES.clear()
            STYLES.update(original_styles)

    def test_parse_returns_most_meta(self):
        text = "Example docstring"
        original_styles = STYLES.copy()
        try:
            # Mock STYLES to return different Docstring objects with varying meta lengths
            STYLES[Style.google] = lambda x: Docstring(meta=["meta1"])
            STYLES[Style.numpy] = lambda x: Docstring(meta=["meta1", "meta2"])
            result = parse(text, Style.auto)
            self.assertEqual(len(result.meta), 2)
        finally:
            # Restore the original STYLES
            STYLES.clear()
            STYLES.update(original_styles)

if __name__ == '__main__':
    unittest.main()