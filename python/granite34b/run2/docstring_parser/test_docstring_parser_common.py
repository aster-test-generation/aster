import unittest
from docstring_parser.common import *


class TestDocstringParser(unittest.TestCase):
    def test_docstring_meta(self):
        meta = DocstringMeta(["arg1", "arg2"], "description")
        self.assertEqual(meta.args, ["arg1", "arg2"])
        self.assertEqual(meta.description, "description")

    def test_docstring_param(self):
        param = DocstringParam(
            ["arg1", "arg2"],
            "description",
            "arg_name",
            "type_name",
            True,
            "default",
        )
        self.assertEqual(param.args, ["arg1", "arg2"])
        self.assertEqual(param.description, "description")
        self.assertEqual(param.arg_name, "arg_name")
        self.assertEqual(param.type_name, "type_name")
        self.assertEqual(param.is_optional, True)
        self.assertEqual(param.default, "default")

    def test_docstring_returns(self):
        returns = DocstringReturns(
            ["arg1", "arg2"],
            "description",
            "type_name",
            True,
            "return_name",
        )
        self.assertEqual(returns.args, ["arg1", "arg2"])
        self.assertEqual(returns.description, "description")
        self.assertEqual(returns.type_name, "type_name")
        self.assertEqual(returns.is_generator, True)
        self.assertEqual(returns.return_name, "return_name")

    def test_docstring_raises(self):
        raises = DocstringRaises(
            ["arg1", "arg2"],
            "description",
            "type_name",
        )
        self.assertEqual(raises.args, ["arg1", "arg2"])
        self.assertEqual(raises.description, "description")
        self.assertEqual(raises.type_name, "type_name")

    def test_docstring_deprecated(self):
        deprecated = DocstringDeprecated(
            ["arg1", "arg2"],
            "description",
            "version",
        )
        self.assertEqual(deprecated.args, ["arg1", "arg2"])
        self.assertEqual(deprecated.description, "description")
        self.assertEqual(deprecated.version, "version")

if __name__ == '__main__':
    unittest.main()