import unittest
from docstring_parser.rest import _build_meta, parse

class TestDocstringParserRest(unittest.TestCase):
    def test_build_meta_param(self):
        self.assertEqual(_build_meta(["param", "arg_name"], "Description").__class__.__name__, "DocstringParam")
        self.assertEqual(_build_meta(["param", "arg_name", "type_name"], "Description").__class__.__name__, "DocstringParam")
        self.assertEqual(_build_meta(["param", "arg_name", "type_name?"], "Description").__class__.__name__, "DocstringParam")
        self.assertEqual(_build_meta(["param", "arg_name", "type_name", "default"], "Description").__class__.__name__, "DocstringParam")

    def test_build_meta_returns(self):
        self.assertEqual(_build_meta(["returns"], "Description").__class__.__name__, "DocstringReturns")
        self.assertEqual(_build_meta(["returns", "type_name"], "Description").__class__.__name__, "DocstringReturns")

    def test_build_meta_yields(self):
        self.assertEqual(_build_meta(["yields"], "Description").__class__.__name__, "DocstringReturns")
        self.assertEqual(_build_meta(["yields", "type_name"], "Description").__class__.__name__, "DocstringReturns")

    def test_build_meta_raises(self):
        self.assertEqual(_build_meta(["raises"], "Description").__class__.__name__, "DocstringRaises")
        self.assertEqual(_build_meta(["raises", "type_name"], "Description").__class__.__name__, "DocstringRaises")

    def test_parse(self):
        self.assertEqual(parse(":short description").short_description, "short description")
        self.assertEqual(parse(":short description\n:long description").short_description, "short description")
        self.assertEqual(parse(":short description\n:long description").long_description, "long description")
        self.assertEqual(parse(":short description\n:long description\n\n:meta").meta[0].args, ["short", "description"])
        self.assertEqual(parse(":short description\n:long description\n\n:meta").meta[0].description, "description")
        self.assertEqual(parse(":short description\n:long description\n\n:meta").meta[0].__class__.__name__, "DocstringMeta")

if __name__ == '__main__':
    unittest.main()