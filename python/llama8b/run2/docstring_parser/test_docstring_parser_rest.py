from docstring_parser.rest import _build_meta
import unittest
from docstring_parser import *
from docstring_parser import parse, Docstring, DocstringMeta, DocstringParam, DocstringReturns, DocstringRaises, ParseError


class TestDocstringParser(unittest.TestCase):
    def test_build_meta(self):
        args = ["param", "int", "x"]
        desc = "Description of x"
        meta = _build_meta(args, desc)
        self.assertIsInstance(meta, DocstringParam)
        self.assertEqual(meta.args, args)
        self.assertEqual(meta.description, desc)
        self.assertEqual(meta.arg_name, "x")
        self.assertEqual(meta.type_name, "int")
        self.assertIsNone(meta.default)

    def test_build_meta_optional(self):
        args = ["param", "int", "x"]
        desc = "Description of x"
        meta = _build_meta(args, desc)
        self.assertIsInstance(meta, DocstringParam)
        self.assertEqual(meta.args, args)
        self.assertEqual(meta.description, desc)
        self.assertEqual(meta.arg_name, "x")
        self.assertEqual(meta.type_name, "int")
        self.assertIsNone(meta.default)

    def test_build_meta_default(self):
        args = ["param", "int", "x"]
        desc = "Description of x defaults to 1"
        meta = _build_meta(args, desc)
        self.assertIsInstance(meta, DocstringParam)
        self.assertEqual(meta.args, args)
        self.assertEqual(meta.description, desc)
        self.assertEqual(meta.arg_name, "x")
        self.assertEqual(meta.type_name, "int")
        self.assertEqual(meta.default, "1")

    def test_build_meta_returns(self):
        args = ["returns", "int"]
        desc = "Description of returns"
        meta = _build_meta(args, desc)
        self.assertIsInstance(meta, DocstringReturns)
        self.assertEqual(meta.args, args)
        self.assertEqual(meta.description, desc)
        self.assertEqual(meta.type_name, "int")
        self.assertFalse(meta.is_generator)

    def test_build_meta_yields(self):
        args = ["yields", "int"]
        desc = "Description of yields"
        meta = _build_meta(args, desc)
        self.assertIsInstance(meta, DocstringReturns)
        self.assertEqual(meta.args, args)
        self.assertEqual(meta.description, desc)
        self.assertEqual(meta.type_name, "int")
        self.assertTrue(meta.is_generator)

    def test_build_meta_raises(self):
        args = ["raises", "Exception"]
        desc = "Description of raises"
        meta = _build_meta(args, desc)
        self.assertIsInstance(meta, DocstringRaises)
        self.assertEqual(meta.args, args)
        self.assertEqual(meta.description, desc)
        self.assertEqual(meta.type_name, "Exception")

    def test_parse(self):
        text = """
        :param x: int
        :param y: str
        :returns: int
        :yields: int
        :raises: Exception
        Description of the function
        """
        docstring = parse(text)
        self.assertIsInstance(docstring, Docstring)
        self.assertEqual(len(docstring.meta), 4)
        self.assertIsInstance(docstring.meta[0], DocstringParam)
        self.assertIsInstance(docstring.meta[1], DocstringParam)
        self.assertIsInstance(docstring.meta[2], DocstringReturns)
        self.assertIsInstance(docstring.meta[3], DocstringReturns)
        self.assertEqual(docstring.short_description, "Description of the function")
        self.assertEqual(docstring.long_description, "Description of the function")

    def test_parse_no_meta(self):
        text = """
        Description of the function
        """
        docstring = parse(text)
        self.assertIsInstance(docstring, Docstring)
        self.assertIsNone(docstring.short_description)
        self.assertIsNone(docstring.long_description)

    def test_parse_no_description(self):
        text = """
        :param x: int
        """
        docstring = parse(text)
        self.assertIsInstance(docstring, Docstring)
        self.assertIsNone(docstring.short_description)
        self.assertIsNone(docstring.long_description)

class TestDocstringParser(unittest.TestCase):
    def test_build_meta(self):
        args = ["param", "int", "x"]
        desc = "Description of x"
        meta = _build_meta(args, desc)
        self.assertIsInstance(meta, DocstringParam)
        self.assertEqual(meta.args, args)
        self.assertEqual(meta.description, desc)
        self.assertEqual(meta.arg_name, "x")
        self.assertEqual(meta.type_name, "int")
        self.assertIsNone(meta.default)

    def test_build_meta_optional(self):
        args = ["param", "int", "x"]
        desc = "Description of x"
        meta = _build_meta(args, desc)
        self.assertIsInstance(meta, DocstringParam)
        self.assertEqual(meta.args, args)
        self.assertEqual(meta.description, desc)
        self.assertEqual(meta.arg_name, "x")
        self.assertEqual(meta.type_name, "int")
        self.assertIsNone(meta.default)

    def test_build_meta_default(self):
        args = ["param", "int", "x"]
        desc = "Description of x defaults to 0"
        meta = _build_meta(args, desc)
        self.assertIsInstance(meta, DocstringParam)
        self.assertEqual(meta.args, args)
        self.assertEqual(meta.description, desc)
        self.assertEqual(meta.arg_name, "x")
        self.assertEqual(meta.type_name, "int")
        self.assertEqual(meta.default, "0")

    def test_build_returns(self):
        args = ["returns", "int"]
        desc = "Description of returns"
        meta = _build_meta(args, desc)
        self.assertIsInstance(meta, DocstringReturns)
        self.assertEqual(meta.args, args)
        self.assertEqual(meta.description, desc)
        self.assertEqual(meta.type_name, "int")
        self.assertFalse(meta.is_generator)

    def test_build_yields(self):
        args = ["yields", "int"]
        desc = "Description of yields"
        meta = _build_meta(args, desc)
        self.assertIsInstance(meta, DocstringReturns)
        self.assertEqual(meta.args, args)
        self.assertEqual(meta.description, desc)
        self.assertEqual(meta.type_name, "int")
        self.assertTrue(meta.is_generator)

    def test_build_raises(self):
        args = ["raises", "Exception"]
        desc = "Description of raises"
        meta = _build_meta(args, desc)
        self.assertIsInstance(meta, DocstringRaises)
        self.assertEqual(meta.args, args)
        self.assertEqual(meta.description, desc)
        self.assertEqual(meta.type_name, "Exception")

    def test_parse(self):
        text = """
        :param x: int
        :param y: str
        :returns: int
        :yields: int
        :raises: Exception
        Description of the function
        """
        docstring = parse(text)
        self.assertIsInstance(docstring, Docstring)
        self.assertEqual(len(docstring.meta), 4)
        self.assertIsInstance(docstring.meta[0], DocstringParam)
        self.assertIsInstance(docstring.meta[1], DocstringParam)
        self.assertIsInstance(docstring.meta[2], DocstringReturns)
        self.assertIsInstance(docstring.meta[3], DocstringReturns)
        self.assertIsInstance(docstring.meta[4], DocstringRaises)

    def test_parse_empty(self):
        text = ""
        docstring = parse(text)
        self.assertIsInstance(docstring, Docstring)
        self.assertEqual(len(docstring.meta), 0)

    def test_parse_invalid(self):
        text = """
        :param x: int
        :param y: str
        :invalid: int
        Description of the function
        """
        with self.assertRaises(ParseError):
            parse(text)

    def test_parse_invalid_meta(self):
        text = """
        :param x: int
        :param y: str
        :returns: int
        :param invalid: int
        Description of the function
        """
        with self.assertRaises(ParseError):
            parse(text)

if __name__ == '__main__':
    unittest.main()