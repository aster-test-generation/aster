import unittest
from docstring_parser.common import *


class TestDocstringParser(unittest.TestCase):
    def test_docstring_param(self):
        param = DocstringParam(["arg1"], "description", "arg_name", "type_name", True, "default")
        self.assertEqual(param.arg_name, "arg_name")
        self.assertEqual(param.type_name, "type_name")
        self.assertEqual(param.is_optional, True)
        self.assertEqual(param.default, "default")

    def test_docstring_returns(self):
        returns = DocstringReturns(["return"], "description", "type_name", True, "return_name")
        self.assertEqual(returns.type_name, "type_name")
        self.assertEqual(returns.is_generator, True)
        self.assertEqual(returns.return_name, "return_name")

    def test_docstring_raises(self):
        raises = DocstringRaises(["raises"], "description", "type_name")
        self.assertEqual(raises.type_name, "type_name")

    def test_docstring_deprecated(self):
        deprecated = DocstringDeprecated(["deprecated"], "description", "version")
        self.assertEqual(deprecated.version, "version")

    def test_docstring(self):
        docstring = Docstring()
        self.assertEqual(docstring.short_description, None)
        self.assertEqual(docstring.long_description, None)
        self.assertEqual(docstring.blank_after_short_description, False)
        self.assertEqual(docstring.blank_after_long_description, False)
        self.assertEqual(docstring.meta, [])
        self.assertEqual(docstring.params, [])
        self.assertEqual(docstring.raises, [])
        self.assertEqual(docstring.returns, None)
        self.assertEqual(docstring.deprecation, None)

if __name__ == '__main__':
    unittest.main()