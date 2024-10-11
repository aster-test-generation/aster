from docstring_parser.rest import _build_meta
import unittest
from docstring_parser import *


class TestDocstringParser(unittest.TestCase):
    def test_build_meta(self):
        args = ["param", "int", "x"]
        desc = "This is a description."
        meta = _build_meta(args, desc)
        self.assertIsInstance(meta, DocstringParam)
        self.assertEqual(meta.args, args)
        self.assertEqual(meta.description, desc)
        self.assertEqual(meta.arg_name, "x")
        self.assertEqual(meta.type_name, "int")
        self.assertIsNone(meta.default)

    def test_build_meta_optional(self):
        args = ["param", "int", "x"]
        desc = "This is a description."
        meta = _build_meta(args, desc)
        self.assertIsInstance(meta, DocstringParam)
        self.assertEqual(meta.args, args)
        self.assertEqual(meta.description, desc)
        self.assertEqual(meta.arg_name, "x")
        self.assertEqual(meta.type_name, "int")
        self.assertIsNone(meta.default)

    def test_build_meta_default(self):
        args = ["param", "int", "x"]
        desc = "This is a description. defaults to 0."
        meta = _build_meta(args, desc)
        self.assertIsInstance(meta, DocstringParam)
        self.assertEqual(meta.args, args)
        self.assertEqual(meta.description, desc)
        self.assertEqual(meta.arg_name, "x")
        self.assertEqual(meta.type_name, "int")
        self.assertEqual(meta.default, "0")

    def test_build_returns(self):
        args = ["returns", "int"]
        desc = "This is a description."
        meta = _build_meta(args, desc)
        self.assertIsInstance(meta, DocstringReturns)
        self.assertEqual(meta.args, args)
        self.assertEqual(meta.description, desc)
        self.assertEqual(meta.type_name, "int")
        self.assertFalse(meta.is_generator)

    def test_build_yields(self):
        args = ["yields", "int"]
        desc = "This is a description."
        meta = _build_meta(args, desc)
        self.assertIsInstance(meta, DocstringReturns)
        self.assertEqual(meta.args, args)
        self.assertEqual(meta.description, desc)
        self.assertEqual(meta.type_name, "int")
        self.assertTrue(meta.is_generator)

    def test_build_raises(self):
        args = ["raises", "ValueError"]
        desc = "This is a description."
        meta = _build_meta(args, desc)
        self.assertIsInstance(meta, DocstringRaises)
        self.assertEqual(meta.args, args)
        self.assertEqual(meta.description, desc)
        self.assertEqual(meta.type_name, "ValueError")

    def test_parse(self):
        text = """
        :param x: This is a description.
        :returns: int
        :yields: int
        :raises: ValueError
        This is a docstring.
        """
        docstring = parse(text)
        self.assertIsInstance(docstring, Docstring)
        self.assertEqual(docstring.short_description, "This is a docstring.")
        self.assertEqual(len(docstring.meta), 4)
        self.assertIsInstance(docstring.meta[0], DocstringParam)
        self.assertIsInstance(docstring.meta[1], DocstringReturns)
        self.assertIsInstance(docstring.meta[2], DocstringReturns)
        self.assertIsInstance(docstring.meta[3], DocstringRaises)

if __name__ == '__main__':
    unittest.main()