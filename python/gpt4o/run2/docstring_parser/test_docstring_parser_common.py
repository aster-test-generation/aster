import unittest
from docstring_parser.common import *


class TestParseError(unittest.TestCase):
    def test_parse_error(self):
        with self.assertRaises(ParseError):
            raise ParseError("Test error")

class TestDocstringMeta(unittest.TestCase):
    def test_init(self):
        meta = DocstringMeta(["arg1", "arg2"], "description")
        self.assertEqual(meta.args, ["arg1", "arg2"])
        self.assertEqual(meta.description, "description")

class TestDocstringParam(unittest.TestCase):
    def test_init(self):
        param = DocstringParam(
            ["arg1", "arg2"], "description", "arg_name", "type_name", True, "default"
        )
        self.assertEqual(param.arg_name, "arg_name")
        self.assertEqual(param.type_name, "type_name")
        self.assertTrue(param.is_optional)
        self.assertEqual(param.default, "default")

class TestDocstringReturns(unittest.TestCase):
    def test_init(self):
        returns = DocstringReturns(
            ["arg1", "arg2"], "description", "type_name", True, "return_name"
        )
        self.assertEqual(returns.type_name, "type_name")
        self.assertTrue(returns.is_generator)
        self.assertEqual(returns.return_name, "return_name")

class TestDocstringRaises(unittest.TestCase):
    def test_init(self):
        raises = DocstringRaises(
            ["arg1", "arg2"], "description", "type_name"
        )
        self.assertEqual(raises.type_name, "type_name")
        self.assertEqual(raises.description, "description")

class TestDocstringDeprecated(unittest.TestCase):
    def test_init(self):
        deprecated = DocstringDeprecated(
            ["arg1", "arg2"], "description", "version"
        )
        self.assertEqual(deprecated.version, "version")
        self.assertEqual(deprecated.description, "description")

class TestDocstring(unittest.TestCase):
    def test_init(self):
        docstring = Docstring()
        self.assertIsNone(docstring.short_description)
        self.assertIsNone(docstring.long_description)
        self.assertFalse(docstring.blank_after_short_description)
        self.assertFalse(docstring.blank_after_long_description)
        self.assertEqual(docstring.meta, [])

    def test_params(self):
        docstring = Docstring()
        param = DocstringParam(
            ["arg1", "arg2"], "description", "arg_name", "type_name", True, "default"
        )
        docstring.meta.append(param)
        self.assertEqual(docstring.params, [param])

    def test_raises(self):
        docstring = Docstring()
        raises = DocstringRaises(
            ["arg1", "arg2"], "description", "type_name"
        )
        docstring.meta.append(raises)
        self.assertEqual(docstring.raises, [raises])

    def test_returns(self):
        docstring = Docstring()
        returns = DocstringReturns(
            ["arg1", "arg2"], "description", "type_name", True, "return_name"
        )
        docstring.meta.append(returns)
        self.assertEqual(docstring.returns, returns)

    def test_deprecation(self):
        docstring = Docstring()
        deprecated = DocstringDeprecated(
            ["arg1", "arg2"], "description", "version"
        )
        docstring.meta.append(deprecated)
        self.assertEqual(docstring.deprecation, deprecated)

if __name__ == '__main__':
    unittest.main()