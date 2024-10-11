import unittest
from docstring_parser.rest import _build_meta, parse


class TestDocstringParserRest(unittest.TestCase):
    def test_build_meta(self):
        self.assertEqual(_build_meta(["param", "x"], "Description of x").__dict__, {
            "args": ["param", "x"],
            "description": "Description of x",
            "arg_name": "x",
            "type_name": None,
            "is_optional": None,
            "default": None
        })
        self.assertEqual(_build_meta(["param", "x", "int"], "Description of x").__dict__, {
            "args": ["param", "x", "int"],
            "description": "Description of x",
            "arg_name": "x",
            "type_name": "int",
            "is_optional": None,
            "default": None
        })
        self.assertEqual(_build_meta(["param", "x", "int", "?"], "Description of x").__dict__, {
            "args": ["param", "x", "int", "?"],
            "description": "Description of x",
            "arg_name": "x",
            "type_name": "int",
            "is_optional": True,
            "default": None
        })
        self.assertEqual(_build_meta(["param", "x", "int", "?=10"], "Description of x").__dict__, {
            "args": ["param", "x", "int", "?=10"],
            "description": "Description of x",
            "arg_name": "x",
            "type_name": "int",
            "is_optional": True,
            "default": "10"
        })
        self.assertEqual(_build_meta(["returns", "int"], "Description of returns").__dict__, {
            "args": ["returns", "int"],
            "description": "Description of returns",
            "type_name": "int",
            "is_generator": False
        })
        self.assertEqual(_build_meta(["yields", "int"], "Description of yields").__dict__, {
            "args": ["yields", "int"],
            "description": "Description of yields",
            "type_name": "int",
            "is_generator": True
        })
        self.assertEqual(_build_meta(["raises", "ValueError"], "Description of raises").__dict__, {
            "args": ["raises", "ValueError"],
            "description": "Description of raises",
            "type_name": "ValueError"
        })

    def test_parse(self):
        self.assertEqual(parse(":short description").short_description, "short description")
        self.assertEqual(parse(":short description\n\nlong description").short_description, "short description")
        self.assertEqual(parse(":short description\n\nlong description").long_description, "long description")
        self.assertEqual(parse(":short description\n\nlong description").blank_after_short_description, True)
        self.assertEqual(parse(":short description\n\nlong description").blank_after_long_description, True)
        self.assertEqual(parse(":short description\n\nlong description\n\n:meta description").meta[0].__dict__, {
            "args": [],
            "description": "meta description"
        })

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