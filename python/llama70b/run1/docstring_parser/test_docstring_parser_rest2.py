import unittest
from docstring_parser.rest import _build_meta, parse, Docstring, DocstringMeta, DocstringParam, DocstringRaises, DocstringReturns, ParseError

class TestDocstringParser(unittest.TestCase):
    def test__build_meta_param(self):
        args = ["param", "arg_name", "int"]
        desc = "This is a description"
        result = _build_meta(args, desc)
        self.assertIsInstance(result, DocstringParam)
        self.assertEqual(result.arg_name, "arg_name")
        self.assertEqual(result.type_name, "int")
        self.assertEqual(result.description, desc)

    def test__build_meta_returns(self):
        args = ["returns", "str"]
        desc = "This is a description"
        result = _build_meta(args, desc)
        self.assertIsInstance(result, DocstringReturns)
        self.assertEqual(result.type_name, "str")
        self.assertEqual(result.description, desc)

    def test__build_meta_raises(self):
        args = ["raises", "Exception"]
        desc = "This is a description"
        result = _build_meta(args, desc)
        self.assertIsInstance(result, DocstringRaises)
        self.assertEqual(result.type_name, "Exception")
        self.assertEqual(result.description, desc)

    def test_parse_empty(self):
        result = parse("")
        self.assertIsInstance(result, Docstring)
        self.assertIsNone(result.short_description)
        self.assertIsNone(result.long_description)
        self.assertEqual(result.meta, [])

    def test_parse_short_description(self):
        text = "This is a short description"
        result = parse(text)
        self.assertIsInstance(result, Docstring)
        self.assertEqual(result.short_description, text)
        self.assertIsNone(result.long_description)
        self.assertEqual(result.meta, [])

    def test_parse_long_description(self):
        text = "This is a short description\n\nThis is a long description"
        result = parse(text)
        self.assertIsInstance(result, Docstring)
        self.assertEqual(result.short_description, "This is a short description")
        self.assertEqual(result.long_description, "This is a long description")
        self.assertEqual(result.meta, [])

    def test_parse_meta(self):
        text = "This is a short description\n:param arg_name: int\n:returns: str"
        result = parse(text)
        self.assertIsInstance(result, Docstring)
        self.assertEqual(result.short_description, "This is a short description")
        self.assertIsNone(result.long_description)
        self.assertEqual(len(result.meta), 2)
        self.assertIsInstance(result.meta[0], DocstringParam)
        self.assertIsInstance(result.meta[1], DocstringReturns)

    def test_parse_error(self):
        text = "This is a short description\n:param arg_name"
        with self.assertRaises(ParseError):
            parse(text)

if __name__ == '__main__':
    unittest.main()