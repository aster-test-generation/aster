import unittest
from docstring_parser.rest import _build_meta, parse, Docstring, DocstringMeta, DocstringParam, DocstringRaises, DocstringReturns, ParseError

class TestDocstringParser(unittest.TestCase):
    def test_build_meta_param(self):
        args = ["param", "arg_name", "int"]
        desc = "description"
        result = _build_meta(args, desc)
        self.assertIsInstance(result, DocstringParam)
        self.assertEqual(result.arg_name, "arg_name")
        self.assertEqual(result.type_name, "int")
        self.assertEqual(result.description, "description")

    def test_build_meta_returns(self):
        args = ["returns", "str"]
        desc = "description"
        result = _build_meta(args, desc)
        self.assertIsInstance(result, DocstringReturns)
        self.assertEqual(result.type_name, "str")
        self.assertEqual(result.description, "description")

    def test_build_meta_raises(self):
        args = ["raises", "Exception"]
        desc = "description"
        result = _build_meta(args, desc)
        self.assertIsInstance(result, DocstringRaises)
        self.assertEqual(result.type_name, "Exception")
        self.assertEqual(result.description, "description")

    def test_parse_empty(self):
        result = parse("")
        self.assertIsInstance(result, Docstring)
        self.assertIsNone(result.short_description)
        self.assertIsNone(result.long_description)
        self.assertEqual(result.meta, [])

    def test_parse_short_description(self):
        text = "Short description"
        result = parse(text)
        self.assertIsInstance(result, Docstring)
        self.assertEqual(result.short_description, "Short description")
        self.assertIsNone(result.long_description)
        self.assertEqual(result.meta, [])

    def test_parse_long_description(self):
        text = "Short description\n\nLong description"
        result = parse(text)
        self.assertIsInstance(result, Docstring)
        self.assertEqual(result.short_description, "Short description")
        self.assertEqual(result.long_description, "Long description")
        self.assertEqual(result.meta, [])

    def test_parse_meta(self):
        text = "Short description\n:param arg_name: int\n:returns str"
        result = parse(text)
        self.assertIsInstance(result, Docstring)
        self.assertEqual(result.short_description, "Short description")
        self.assertIsNone(result.long_description)
        self.assertEqual(len(result.meta), 2)
        self.assertIsInstance(result.meta[0], DocstringParam)
        self.assertIsInstance(result.meta[1], DocstringReturns)

    def test_parse_error(self):
        text = "Invalid docstring"
        with self.assertRaises(ParseError):
            parse(text)

    def test_DocstringMeta_init(self):
        args = ["param", "arg_name", "int"]
        desc = "description"
        result = DocstringMeta(args, desc)
        self.assertEqual(result.args, args)
        self.assertEqual(result.description, desc)

    def test_DocstringParam_init(self):
        args = ["param", "arg_name", "int"]
        desc = "description"
        result = DocstringParam(args, desc, "arg_name", "int", False, None)
        self.assertEqual(result.arg_name, "arg_name")
        self.assertEqual(result.type_name, "int")
        self.assertEqual(result.description, desc)

    def test_DocstringRaises_init(self):
        args = ["raises", "Exception"]
        desc = "description"
        result = DocstringRaises(args, desc, "Exception")
        self.assertEqual(result.type_name, "Exception")
        self.assertEqual(result.description, desc)

    def test_DocstringReturns_init(self):
        args = ["returns", "str"]
        desc = "description"
        result = DocstringReturns(args, desc, "str", False)
        self.assertEqual(result.type_name, "str")
        self.assertEqual(result.description, desc)

if __name__ == '__main__':
    unittest.main()