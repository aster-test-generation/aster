import unittest
from docstring_parser.parser import parse, Style, STYLES
from docstring_parser.common import Docstring, ParseError


class TestParseFunction(unittest.TestCase):
    def test_parse_with_auto_style(self):
        result = parse("Some docstring")
        self.assertIsInstance(result, Docstring)

    def test_parse_with_specific_style(self):
        result = parse("Some docstring", Style.google)
        self.assertIsInstance(result, Docstring)

    def test_parse_with_invalid_style(self):
        with self.assertRaises(ValueError):
            parse("Some docstring", "invalid_style")

    def test_parse_with_parse_error(self):
        with self.assertRaises(ParseError):
            parse("Invalid docstring")

class TestStyleClass(unittest.TestCase):
    def test_Style_auto(self):
        self.assertEqual(Style.auto, Style.auto)

    def test_Style_google(self):
        self.assertEqual(Style.google, Style.google)

    def test_Style_numpy(self):
        self.assertEqual(Style.numpy, Style.numpy)

    def test_Style_restructuredtext(self):
        self.assertEqual(Style.restructuredtext, Style.restructuredtext)

class TestSTYLESConstant(unittest.TestCase):
    def test_STYLES_values(self):
        self.assertIsInstance(STYLES, dict)
        self.assertGreater(len(STYLES), 0)

class TestDocstringClass(unittest.TestCase):
    def test_Docstring_init(self):
        docstring = Docstring("Some docstring")
        self.assertIsInstance(docstring, Docstring)

    def test_Docstring_meta(self):
        docstring = Docstring("Some docstring")
        self.assertIsInstance(docstring.meta, dict)

class TestParseErrorClass(unittest.TestCase):
    def test_ParseError_init(self):
        error = ParseError("Some error message")
        self.assertIsInstance(error, ParseError)

    def test_ParseError_str(self):
        error = ParseError("Some error message")
        self.assertEqual(str(error), "Some error message")

if __name__ == '__main__':
    unittest.main()