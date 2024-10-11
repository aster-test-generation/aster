import unittest
from docstring_parser.parser import parse
from docstring_parser.common import Docstring, ParseError
from docstring_parser.styles import STYLES, Style



class TestParse(unittest.TestCase):
    def test_parse(self):
        text = "test"
        style = Style.auto
        result = parse(text, style)
        self.assertIsInstance(result, Docstring)

    def test_parse_style_not_auto(self):
        text = "test"
        style = Style.google
        result = parse(text, style)
        self.assertIsInstance(result, Docstring)

    def test_parse_style_auto(self):
        text = "test"
        style = Style.auto
        result = parse(text, style)
        self.assertIsInstance(result, Docstring)

    def test_parse_style_auto_error(self):
        text = "test"
        style = Style.auto
        with self.assertRaises(ParseError):
            parse(text, style)

    def test_parse_style_auto_error_not_raise(self):
        text = "test"
        style = Style.auto
        result = parse(text, style)
        self.assertIsInstance(result, Docstring)

    def test_parse_style_auto_error_not_raise_not_instance(self):
        text = "test"
        style = Style.auto
        result = parse(text, style)
        self.assertIsInstance(result, Docstring)

    def test_parse_style_auto_error_not_raise_not_instance_not_equal(self):
        text = "test"
        style = Style.auto
        result = parse(text, style)
        self.assertNotEqual(result, Docstring)

    def test_parse_style_auto_error_not_raise_not_instance_not_equal_not_isinstance(self):
        text = "test"
        style = Style.auto
        result = parse(text, style)
        self.assertIsInstance(result, Docstring)

    def test_parse_style_auto_error_not_raise_not_instance_not_equal_not_isinstance_not_isinstance(self):
        text = "test"
        style = Style.auto
        result = parse(text, style)
        import pytest

    def test_parse_style_auto_error_not_raise_not_instance_not_equal_not_isinstance_not_isinstance_not_equal(self):
        text = "test"
        style = Style.auto
        result = parse(text, style)
        self.assertNotEqual(result, Docstring)

    def test_parse_style_auto_error_not_raise_not_instance_not_equal_not_isinstance_not_isinstance_not_equal_not_isinstance(self):
        text = "test"
        style = Style.auto
        result = parse(text, style)
        self.assertIsInstance(result, Docstring)

    def test_parse_style_auto_error_not_raise_not_instance_not_equal_not_isinstance_not_isinstance_not_equal_not_isinstance_not_isinstance(self):
        text = "test"
        style = Style.auto
        result = parse(text, style)
        self.assertIsInstance(result, Docstring)

    def test_parse_style_auto_error_not_raise_not_instance_not_equal_not_isinstance_not_isinstance_not_equal_not_isinstance_not_isinstance_not_equal(self):
        text = "test"
        style = Style.auto
        result = parse(text, style)
        self.assertNotEqual(result, Docstring)

if __name__ == '__main__':
    unittest.main()