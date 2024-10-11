import unittest
from docstring_parser.parser import parse, Style, STYLES
from docstring_parser.common import Docstring, ParseError


class TestParseFunction(unittest.TestCase):
    def test_parse_with_auto_style(self):
        result = parse("some docstring")
        self.assertIsInstance(result, Docstring)

    def test_parse_with_specific_style(self):
        result = parse("some docstring", Style.google)
        self.assertIsInstance(result, Docstring)

    def test_parse_with_invalid_style(self):
        with self.assertRaises(ValueError):
            parse("some docstring", "invalid_style")

    def test_parse_with_parse_error(self):
        with self.assertRaises(ParseError):
            parse("invalid docstring")

class TestStyleClass(unittest.TestCase):
    def test_Style_auto(self):
        self.assertEqual(Style.auto, Style.auto)

    def test_Style_repr(self):
        self.assertEqual(repr(Style.auto), "Style.auto")

    def test_Style_eq(self):
        self.assertTrue(Style.auto == Style.auto)

class TestSTYLESConstant(unittest.TestCase):
    def test_STYLES_values(self):
        self.assertIsInstance(STYLES.values(), dict_values)

    def test_STYLES_keys(self):
        self.assertIsInstance(STYLES.keys(), dict_keys)

class TestDocstringClass(unittest.TestCase):
    def test_Docstring_init(self):
        docstring = Docstring("some docstring")
        self.assertEqual(docstring.meta, {})

    def test_Docstring_repr(self):
        docstring = Docstring("some docstring")
        self.assertEqual(repr(docstring), "Docstring('some docstring')")

    def test_Docstring_eq(self):
        docstring1 = Docstring("some docstring")
        docstring2 = Docstring("some docstring")
        self.assertTrue(docstring1 == docstring2)

class TestParseErrorClass(unittest.TestCase):
    def test_ParseError_init(self):
        error = ParseError("some error message")
        self.assertEqual(error.args, ("some error message",))

    def test_ParseError_repr(self):
        error = ParseError("some error message")
        self.assertEqual(repr(error), "ParseError('some error message')")

    def test_ParseError_eq(self):
        error1 = ParseError("some error message")
        error2 = ParseError("some error message")
        self.assertTrue(error1 == error2)

if __name__ == '__main__':
    unittest.main()