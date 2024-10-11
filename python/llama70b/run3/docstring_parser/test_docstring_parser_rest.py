import unittest
from docstring_parser.rest import _build_meta, parse, Docstring, DocstringMeta, DocstringParam, DocstringRaises, DocstringReturns, ParseError


class TestDocstringParser(unittest.TestCase):
    def test_build_meta_param(self):
        args = ["param", "arg_name", "int"]
        desc = "This is a description"
        result = _build_meta(args, desc)
        self.assertIsInstance(result, DocstringParam)
        self.assertEqual(result.arg_name, "arg_name")
        self.assertEqual(result.type_name, "int")
        self.assertEqual(result.description, desc)

    def test_build_meta_returns(self):
        args = ["returns", "str"]
        desc = "This is a description"
        result = _build_meta(args, desc)
        self.assertIsInstance(result, DocstringReturns)
        self.assertEqual(result.type_name, "str")
        self.assertEqual(result.description, desc)

    def test_build_meta_raises(self):
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
        self.assertEqual(len(result.meta), 2)
        self.assertIsInstance(result.meta[0], DocstringParam)
        self.assertIsInstance(result.meta[1], DocstringReturns)

    def test_parse_error(self):
        text = "This is a short description\n:param"
        with self.assertRaises(ParseError):
            parse(text)

class TestDocstring(unittest.TestCase):
    def test_init(self):
        docstring = Docstring()
        self.assertIsNone(docstring.short_description)
        self.assertIsNone(docstring.long_description)
        self.assertEqual(docstring.meta, [])

    def test_str(self):
        docstring = Docstring()
        self.assertEqual(str(docstring), "")

    def test_repr(self):
        docstring = Docstring()
        self.assertEqual(repr(docstring), "Docstring()")

class TestDocstringMeta(unittest.TestCase):
    def test_init(self):
        meta = DocstringMeta(args=["param", "arg_name"], description="This is a description")
        self.assertEqual(meta.args, ["param", "arg_name"])
        self.assertEqual(meta.description, "This is a description")

    def test_str(self):
        meta = DocstringMeta(args=["param", "arg_name"], description="This is a description")
        self.assertEqual(str(meta), "param arg_name: This is a description")

    def test_repr(self):
        meta = DocstringMeta(args=["param", "arg_name"], description="This is a description")
        self.assertEqual(repr(meta), "DocstringMeta(args=['param', 'arg_name'], description='This is a description')")

class TestDocstringParam(unittest.TestCase):
    def test_init(self):
        param = DocstringParam(args=["param", "arg_name", "int"], description="This is a description")
        self.assertEqual(param.arg_name, "arg_name")
        self.assertEqual(param.type_name, "int")
        self.assertEqual(param.description, "This is a description")

    def test_str(self):
        param = DocstringParam(args=["param", "arg_name", "int"], description="This is a description")
        self.assertEqual(str(param), "param arg_name: int - This is a description")

    def test_repr(self):
        param = DocstringParam(args=["param", "arg_name", "int"], description="This is a description")
        self.assertEqual(repr(param), "DocstringParam(args=['param', 'arg_name', 'int'], description='This is a description')")


if __name__ == '__main__':
    unittest.main()