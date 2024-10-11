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

class TestSTYLESDict(unittest.TestCase):
    def test_STYLES_keys(self):
        self.assertEqual(set(STYLES.keys()), {Style.auto, Style.google, Style.numpy, Style.restructuredtext})

    def test_STYLES_values(self):
        self.assertIsInstance(list(STYLES.values())[0], type)

class TestDocstringClass(unittest.TestCase):
    def test_Docstring_init(self):
        docstring = Docstring("Some docstring")
        self.assertEqual(docstring.meta, {})

    def test_Docstring_str(self):
        docstring = Docstring("Some docstring")
        self.assertEqual(str(docstring), "Some docstring")

    def test_Docstring_repr(self):
        docstring = Docstring("Some docstring")
        self.assertEqual(repr(docstring), "Docstring('Some docstring')")

class TestParseErrorClass(unittest.TestCase):
    def test_ParseError_init(self):
        error = ParseError("Some error message")
        self.assertEqual(error.args, ("Some error message",))

    def test_ParseError_str(self):
        error = ParseError("Some error message")
        self.assertEqual(str(error), "Some error message")

    def test_ParseError_repr(self):
        error = ParseError("Some error message")
        self.assertEqual(repr(error), "ParseError('Some error message')")

if __name__ == '__main__':
    unittest.main()