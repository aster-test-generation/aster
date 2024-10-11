import unittest
from docstring_parser.common import Docstring, DocstringParam, DocstringReturns, DocstringDeprecated


class TestDocstring(unittest.TestCase):
    def test_init(self):
        docstring = Docstring()
        self.assertIsNone(docstring.short_description)
        self.assertIsNone(docstring.long_description)
        self.assertFalse(docstring.blank_after_short_description)
        self.assertFalse(docstring.blank_after_long_description)
        self.assertEqual(docstring.meta, [])

class TestDocstringParam(unittest.TestCase):
    def test_init(self):
        param = DocstringParam(["param", "arg"], "description", "arg_name", "type_name", False, "default")
        self.assertEqual(param.args, ["param", "arg"])
        self.assertEqual(param.description, "description")
        self.assertEqual(param.arg_name, "arg_name")
        self.assertEqual(param.type_name, "type_name")
        self.assertFalse(param.is_optional)
        self.assertEqual(param.default, "default")

class TestDocstringReturns(unittest.TestCase):
    def test_init(self):
        returns = DocstringReturns(["return", "returns"], "description", "type_name", False, "return_name")
        self.assertEqual(returns.args, ["return", "returns"])
        self.assertEqual(returns.description, "description")
        self.assertEqual(returns.type_name, "type_name")
        self.assertFalse(returns.is_generator)
        self.assertEqual(returns.return_name, "return_name")

class TestDocstringaises(unittest.TestCase):
    def test_init(self):
        raises = Docstringaises(["raises", "raise", "except", "exception"], "description", "type_name")
        self.assertEqual(raises.args, ["raises", "raise", "except", "exception"])
        self.assertEqual(raises.description, "description")
        self.assertEqual(raises.type_name, "type_name")

class TestDocstringDeprecated(unittest.TestCase):
    def test_init(self):
        deprecation = DocstringDeprecated(["deprecated"], "description", "version")
        self.assertEqual(deprecation.args, ["deprecated"])
        self.assertEqual(deprecation.description, "description")
        self.assertEqual(deprecation.version, "version")

if __name__ == '__main__':
    unittest.main()