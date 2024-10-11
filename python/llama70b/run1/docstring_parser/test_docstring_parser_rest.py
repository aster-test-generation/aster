import unittest
from docstring_parser.rest import _build_meta, parse, Docstring, DocstringMeta, DocstringParam, DocstringRaises, DocstringReturns, ParseError


class TestDocstringParser(unittest.TestCase):
    def test_build_meta_param(self):
        args = ["param", "arg_name", "type_name"]
        desc = "This is a description"
        result = _build_meta(args, desc)
        self.assertIsInstance(result, DocstringParam)

    def test_build_meta_returns(self):
        args = ["returns", "type_name"]
        desc = "This is a description"
        result = _build_meta(args, desc)
        self.assertIsInstance(result, DocstringReturns)

    def test_build_meta_raises(self):
        args = ["raises", "type_name"]
        desc = "This is a description"
        result = _build_meta(args, desc)
        self.assertIsInstance(result, DocstringRaises)

    def test_parse_empty_string(self):
        result = parse("")
        self.assertIsInstance(result, Docstring)

    def test_parse_short_description(self):
        text = "This is a short description"
        result = parse(text)
        self.assertEqual(result.short_description, text)

    def test_parse_long_description(self):
        text = "This is a short description\n\nThis is a long description"
        result = parse(text)
        self.assertEqual(result.long_description, "This is a long description")

    def test_parse_meta(self):
        text = ":param arg_name: This is a description"
        result = parse(text)
        self.assertEqual(len(result.meta), 1)
        self.assertIsInstance(result.meta[0], DocstringParam)

    def test_parse_error(self):
        text = ":invalid: This is a description"
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
        result = str(docstring)
        self.assertEqual(result, "")

    def test_repr(self):
        docstring = Docstring()
        result = repr(docstring)
        self.assertEqual(result, "Docstring(short_description=None, long_description=None, meta=[])")

class TestDocstringMeta(unittest.TestCase):
    def test_init(self):
        meta = DocstringMeta(args=["param", "arg_name"], description="This is a description")
        self.assertEqual(meta.args, ["param", "arg_name"])
        self.assertEqual(meta.description, "This is a description")

    def test_str(self):
        meta = DocstringMeta(args=["param", "arg_name"], description="This is a description")
        result = str(meta)
        self.assertEqual(result, "param arg_name: This is a description")

    def test_repr(self):
        meta = DocstringMeta(args=["param", "arg_name"], description="This is a description")
        result = repr(meta)
        self.assertEqual(result, "DocstringMeta(args=['param', 'arg_name'], description='This is a description')")

class TestDocstringParam(unittest.TestCase):
    def test_init(self):
        param = DocstringParam(args=["param", "arg_name", "type_name"], description="This is a description")
        self.assertEqual(param.arg_name, "arg_name")
        self.assertEqual(param.type_name, "type_name")
        self.assertEqual(param.description, "This is a description")

    def test_str(self):
        param = DocstringParam(args=["param", "arg_name", "type_name"], description="This is a description")
        result = str(param)
        self.assertEqual(result, "param arg_name: type_name - This is a description")

    def test_repr(self):
        param = DocstringParam(args=["param", "arg_name", "type_name"], description="This is a description")
        result = repr(param)
        self.assertEqual(result, "DocstringParam(args=['param', 'arg_name', 'type_name'], description='This is a description')")

class TestDocstringRaises(unittest.TestCase):
    def test_init(self):
        raises = DocstringRaises(args=["raises", "type_name"], description="This is a description")
        self.assertEqual(raises.type_name, "type_name")
        self.assertEqual(raises.description, "This is a description")

    def test_str(self):
        raises = DocstringRaises(args=["raises", "type_name"], description="This is a description")
        result = str(raises)
        self.assertEqual(result, "raises type_name: This is a description")

    def test_repr(self):
        raises = DocstringRaises(args=["raises", "type_name"], description="This is a description")
        result = repr(raises)
        self.assertEqual(result, "DocstringRaises(args=['raises', 'type_name'], description='This is a description')")

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