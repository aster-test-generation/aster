import unittest
from docstring_parser.rest import _build_meta, parse

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