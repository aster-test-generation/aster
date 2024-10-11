import unittest
from docstring_parser.rest import _build_meta, parse
from docstring_parser.common import (
    DocstringParam,
    DocstringReturns,
    DocstringRaises,
    DocstringMeta,
    ParseError,
    PARAM_KEYWORDS,
    RETURNS_KEYWORDS,
    YIELDS_KEYWORDS,
    RAISES_KEYWORDS,
    Docstring
)

class TestBuildMeta(unittest.TestCase):
    def test_build_meta_param_with_type_and_default(self):
        args = ["param", "int", "x"]
        desc = "An integer parameter, defaults to 10."
        result = _build_meta(args, desc)
        self.assertIsInstance(result, DocstringParam)
        self.assertEqual(result.arg_name, "x")
        self.assertEqual(result.type_name, "int")
        self.assertEqual(result.is_optional, False)
        self.assertEqual(result.default, "10")

    def test_build_meta_param_with_type_optional(self):
        args = ["param", "int?", "x"]
        desc = "An optional integer parameter."
        result = _build_meta(args, desc)
        self.assertIsInstance(result, DocstringParam)
        self.assertEqual(result.arg_name, "x")
        self.assertEqual(result.type_name, "int")
        self.assertEqual(result.is_optional, True)
        self.assertIsNone(result.default)

    def test_build_meta_param_without_type(self):
        args = ["param", "x"]
        desc = "A parameter without type."
        result = _build_meta(args, desc)
        self.assertIsInstance(result, DocstringParam)
        self.assertEqual(result.arg_name, "x")
        self.assertIsNone(result.type_name)
        self.assertIsNone(result.is_optional)
        self.assertIsNone(result.default)

    def test_build_meta_returns(self):
        args = ["returns", "int"]
        desc = "Returns an integer."
        result = _build_meta(args, desc)
        self.assertIsInstance(result, DocstringReturns)
        self.assertEqual(result.type_name, "int")
        self.assertFalse(result.is_generator)

    def test_build_meta_yields(self):
        args = ["yields", "int"]
        desc = "Yields an integer."
        result = _build_meta(args, desc)
        self.assertIsInstance(result, DocstringReturns)
        self.assertEqual(result.type_name, "int")
        self.assertTrue(result.is_generator)

    def test_build_meta_raises(self):
        args = ["raises", "ValueError"]
        desc = "Raises a ValueError."
        result = _build_meta(args, desc)
        self.assertIsInstance(result, DocstringRaises)
        self.assertEqual(result.type_name, "ValueError")

    def test_build_meta_invalid_param(self):
        args = ["param"]
        desc = "Invalid parameter."
        with self.assertRaises(ParseError):
            _build_meta(args, desc)

    def test_build_meta_invalid_returns(self):
        args = ["returns", "int", "extra"]
        desc = "Invalid returns."
        with self.assertRaises(ParseError):
            _build_meta(args, desc)

    def test_build_meta_invalid_raises(self):
        args = ["raises", "ValueError", "extra"]
        desc = "Invalid raises."
        with self.assertRaises(ParseError):
            _build_meta(args, desc)

class TestParse(unittest.TestCase):
    def test_parse_empty(self):
        result = parse("")
        self.assertIsInstance(result, Docstring)
        self.assertIsNone(result.short_description)
        self.assertIsNone(result.long_description)
        self.assertEqual(result.meta, [])

    def test_parse_short_description(self):
        text = "Short description."
        result = parse(text)
        self.assertEqual(result.short_description, "Short description.")
        self.assertIsNone(result.long_description)
        self.assertEqual(result.meta, [])

    def test_parse_long_description(self):
        text = "Short description.\n\nLong description."
        result = parse(text)
        self.assertEqual(result.short_description, "Short description.")
        self.assertEqual(result.long_description, "Long description.")
        self.assertEqual(result.meta, [])

    def test_parse_meta_param(self):
        text = "Short description.\n\n:param int x: An integer parameter."
        result = parse(text)
        self.assertEqual(result.short_description, "Short description.")
        self.assertEqual(len(result.meta), 1)
        self.assertIsInstance(result.meta[0], DocstringParam)
        self.assertEqual(result.meta[0].arg_name, "x")
        self.assertEqual(result.meta[0].type_name, "int")

    def test_parse_meta_returns(self):
        text = "Short description.\n\n:returns: An integer."
        result = parse(text)
        self.assertEqual(result.short_description, "Short description.")
        self.assertEqual(len(result.meta), 1)
        self.assertIsInstance(result.meta[0], DocstringReturns)
        self.assertIsNone(result.meta[0].type_name)

    def test_parse_meta_raises(self):
        text = "Short description.\n\n:raises ValueError: If an error occurs."
        result = parse(text)
        self.assertEqual(result.short_description, "Short description.")
        self.assertEqual(len(result.meta), 1)
        self.assertIsInstance(result.meta[0], DocstringRaises)
        self.assertEqual(result.meta[0].type_name, "ValueError")

    def test_parse_invalid_meta(self):
        text = "Short description.\n\n:invalid meta"
        with self.assertRaises(ParseError):
            parse(text)

if __name__ == '__main__':
    unittest.main()