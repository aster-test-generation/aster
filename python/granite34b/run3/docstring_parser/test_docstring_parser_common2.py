import unittest
from docstring_parser.common import *

class TestDocstringParser(unittest.TestCase):
    def test_docstring_param(self):
        param = DocstringParam(["arg1"], "description", "arg_name", "type_name", True, "default")
        self.assertEqual(param.arg_name, "arg_name")
        self.assertEqual(param.type_name, "type_name")
        self.assertTrue(param.is_optional)
        self.assertEqual(param.default, "default")

    def test_docstring_returns(self):
        returns = DocstringReturns(["return"], "description", "type_name", True, "return_name")
        self.assertEqual(returns.type_name, "type_name")
        self.assertTrue(returns.is_generator)
        self.assertEqual(returns.return_name, "return_name")

    def test_docstring_raises(self):
        raises = DocstringRaises(["raises"], "description", "type_name")
        self.assertEqual(raises.type_name, "type_name")

    def test_docstring_deprecated(self):
        deprecated = DocstringDeprecated(["deprecated"], "description", "version")
        self.assertEqual(deprecated.version, "version")

    def test_docstring(self):
        docstring = Docstring()
        self.assertIsNone(docstring.short_description)
        self.assertIsNone(docstring.long_description)
        self.assertFalse(docstring.blank_after_short_description)
        self.assertFalse(docstring.blank_after_long_description)
        self.assertListEqual(docstring.meta, [])
        self.assertListEqual(docstring.params, [])
        self.assertListEqual(docstring.raises, [])
        self.assertIsNone(docstring.returns)
        self.assertIsNone(docstring.deprecation)

if __name__ == '__main__':
    unittest.main()