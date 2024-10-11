import unittest
from docstring_parser.rest import parse
from docstring_parser.rest import _build_meta, parse


class TestParse(unittest.TestCase):
    def test_parse_short_description(self):
        docstring = "This is a short description."
        result = parse(docstring)
        self.assertEqual(result.short_description, "This is a short description.")

    def test_parse_long_description(self):
        docstring = "This is a short description.\n\nThis is a long description."
        result = parse(docstring)
        self.assertEqual(result.long_description, "This is a long description.")

    def test_parse_meta_info(self):
        docstring = ":param x: This is a parameter.\n:return: This is a return value."
        result = parse(docstring)
        self.assertEqual(len(result.meta), 2)
        self.assertEqual(result.meta[0].args, ["param", "x"])
        self.assertEqual(result.meta[0].description, "This is a parameter.")
        self.assertEqual(result.meta[1].args, ["return"])
        self.assertEqual(result.meta[1].description, "This is a return value.")

    def test_parse_private_method(self):
        docstring = ":param _x: This is a private parameter."
        result = parse(docstring)
        self.assertEqual(len(result.meta), 1)
        self.assertEqual(result.meta[0].args, ["param", "_x"])
        self.assertEqual(result.meta[0].description, "This is a private parameter.")

    def test_parse_protected_method(self):
        docstring = ":param _x: This is a protected parameter."
        result = parse(docstring)
        self.assertEqual(len(result.meta), 1)
        self.assertEqual(result.meta[0].args, ["param", "_x"])
        self.assertEqual(result.meta[0].description, "This is a protected parameter.")

    def test_parse_magic_method(self):
        docstring = ":param __x: This is a magic parameter."
        result = parse(docstring)
        self.assertEqual(len(result.meta), 1)
        self.assertEqual(result.meta[0].args, ["param", "__x"])
        self.assertEqual(result.meta[0].description, "This is a magic parameter.")

class TestDocstringParserRest(unittest.TestCase):
    def test_build_meta_param(self):
        param = _build_meta(["param", "name", "type"], "Description")
        self.assertEqual(param.args, ["param", "name", "type"])
        self.assertEqual(param.description, "Description")
        self.assertEqual(param.arg_name, "name")
        self.assertEqual(param.type_name, "type")
        self.assertEqual(param.is_optional, None)
        self.assertEqual(param.default, None)

    def test_build_meta_param_optional(self):
        param = _build_meta(["param", "name", "type", "?"], "Description")
        self.assertEqual(param.args, ["param", "name", "type", "?"])
        self.assertEqual(param.description, "Description")
        self.assertEqual(param.arg_name, "name")
        self.assertEqual(param.type_name, "type")
        self.assertEqual(param.is_optional, True)
        self.assertEqual(param.default, None)

    def test_build_meta_param_default(self):
        param = _build_meta(["param", "name", "type", "=default"], "Description")
        self.assertEqual(param.args, ["param", "name", "type", "=default"])
        self.assertEqual(param.description, "Description")
        self.assertEqual(param.arg_name, "name")
        self.assertEqual(param.type_name, "type")
        self.assertEqual(param.is_optional, False)
        self.assertEqual(param.default, "default")

    def test_build_meta_returns(self):
        returns = _build_meta(["returns", "type"], "Description")
        self.assertEqual(returns.args, ["returns", "type"])
        self.assertEqual(returns.description, "Description")
        self.assertEqual(returns.type_name, "type")
        self.assertEqual(returns.is_generator, False)

    def test_build_meta_yields(self):
        yields = _build_meta(["yields", "type"], "Description")
        self.assertEqual(yields.args, ["yields", "type"])
        self.assertEqual(yields.description, "Description")
        self.assertEqual(yields.type_name, "type")
        self.assertEqual(yields.is_generator, True)

    def test_build_meta_raises(self):
        raises = _build_meta(["raises", "type"], "Description")
        self.assertEqual(raises.args, ["raises", "type"])
        self.assertEqual(raises.description, "Description")
        self.assertEqual(raises.type_name, "type")

    def test_parse_short_description(self):
        docstring = parse("short description")
        self.assertEqual(docstring.short_description, "short description")

    def test_parse_long_description(self):
        docstring = parse("short description\n\nlong description")
        self.assertEqual(docstring.short_description, "short description")
        self.assertEqual(docstring.long_description, "long description")
        self.assertTrue(docstring.blank_after_short_description)
        self.assertTrue(docstring.blank_after_long_description)

    def test_parse_meta_param(self):
        docstring = parse(":param name: Description")
        self.assertEqual(len(docstring.meta), 1)
        param = docstring.meta[0]
        self.assertEqual(param.args, ["param", "name"])
        self.assertEqual(param.description, "Description")
        self.assertEqual(param.arg_name, "name")
        self.assertEqual(param.type_name, None)
        self.assertEqual(param.is_optional, None)
        self.assertEqual(param.default, None)

    def test_parse_meta_param_optional(self):
        docstring = parse(":param name: Description (optional)")
        self.assertEqual(len(docstring.meta), 1)
        param = docstring.meta[0]
        self.assertEqual(param.args, ["param", "name"])
        self.assertEqual(param.description, "Description (optional)")
        self.assertEqual(param.arg_name, "name")
        self.assertEqual(param.type_name, None)
        self.assertEqual(param.is_optional, True)
        self.assertEqual(param.default, None)

if __name__ == '__main__':
    unittest.main()