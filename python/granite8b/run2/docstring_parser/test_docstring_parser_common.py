import unittest
from docstring_parser.common import Docstring, DocstringParam, DocstringReturns, DocstringRaises, DocstringDeprecated


class TestDocstring(unittest.TestCase):
    def test_docstring_init(self):
        docstring = Docstring()
        self.assertIsNone(docstring.short_description)
        self.assertIsNone(docstring.long_description)
        self.assertFalse(docstring.blank_after_short_description)
        self.assertFalse(docstring.blank_after_long_description)
        self.assertEqual(docstring.meta, [])

class TestDocstringParam(unittest.TestCase):
    def test_docstring_param_init(self):
        param = DocstringParam(["param"], "description", "arg_name", "type_name", True, "default")
        self.assertEqual(param.args, ["param"])
        self.assertEqual(param.description, "description")
        self.assertEqual(param.arg_name, "arg_name")
        self.assertEqual(param.type_name, "type_name")
        self.assertTrue(param.is_optional)
        self.assertEqual(param.default, "default")

class TestDocstringReturns(unittest.TestCase):
    def test_docstring_returns_init(self):
        returns = DocstringReturns(["return"], "description", "type_name", True, "return_name")
        self.assertEqual(returns.args, ["return"])
        self.assertEqual(returns.description, "description")
        self.assertEqual(returns.type_name, "type_name")
        self.assertTrue(returns.is_generator)
        self.assertEqual(returns.return_name, "return_name")

class TestDocstringRaises(unittest.TestCase):
    def test_docstring_raises_init(self):
        raises = DocstringRaises(["raises"], "description", "type_name")
        self.assertEqual(raises.args, ["raises"])
        self.assertEqual(raises.description, "description")
        self.assertEqual(raises.type_name, "type_name")

class TestDocstringDeprecated(unittest.TestCase):
    def test_docstring_deprecated_init(self):
        deprecated = DocstringDeprecated(["deprecated"], "description", "version")
        self.assertEqual(deprecated.args, ["deprecated"])
        self.assertEqual(deprecated.description, "description")
        self.assertEqual(deprecated.version, "version")

if __name__ == '__main__':
    unittest.main()