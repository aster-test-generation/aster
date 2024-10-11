import unittest
from docstring_parser.common import *

class TestParseError(unittest.TestCase):
    def test_init(self):
        error = ParseError("Test error")
        self.assertEqual(str(error), "Test error")

class TestDocstringMeta(unittest.TestCase):
    def test_init(self):
        meta = DocstringMeta(["arg1", "arg2"], "Description")
        self.assertEqual(meta.args, ["arg1", "arg2"])
        self.assertEqual(meta.description, "Description")

class TestDocstringParam(unittest.TestCase):
    def test_init(self):
        param = DocstringParam(["arg1", "arg2"], "Description", "arg_name", "type_name", True, "default")
        self.assertEqual(param.args, ["arg1", "arg2"])
        self.assertEqual(param.description, "Description")
        self.assertEqual(param.arg_name, "arg_name")
        self.assertEqual(param.type_name, "type_name")
        self.assertEqual(param.is_optional, True)
        self.assertEqual(param.default, "default")

    def test_str_method(self):
        param = DocstringParam(["arg1", "arg2"], "Description", "arg_name", "type_name", True, "default")
        self.assertEqual(str(param), "DocstringParam(arg_name, type_name, True, default)")

class TestDocstringReturns(unittest.TestCase):
    def test_init(self):
        returns = DocstringReturns(["arg1", "arg2"], "Description", "type_name", True, "return_name")
        self.assertEqual(returns.args, ["arg1", "arg2"])
        self.assertEqual(returns.description, "Description")
        self.assertEqual(returns.type_name, "type_name")
        self.assertEqual(returns.is_generator, True)
        self.assertEqual(returns.return_name, "return_name")

    def test_str_method(self):
        returns = DocstringReturns(["arg1", "arg2"], "Description", "type_name", True, "return_name")
        self.assertEqual(str(returns), "DocstringReturns(type_name, True, return_name)")

class TestDocstringRaises(unittest.TestCase):
    def test_init(self):
        raises = DocstringRaises(["arg1", "arg2"], "Description", "type_name")
        self.assertEqual(raises.args, ["arg1", "arg2"])
        self.assertEqual(raises.description, "Description")
        self.assertEqual(raises.type_name, "type_name")

    def test_str_method(self):
        raises = DocstringRaises(["arg1", "arg2"], "Description", "type_name")
        self.assertEqual(str(raises), "DocstringRaises(type_name)")

class TestDocstringDeprecated(unittest.TestCase):
    def test_init(self):
        deprecated = DocstringDeprecated(["arg1", "arg2"], "Description", "version")
        self.assertEqual(deprecated.args, ["arg1", "arg2"])
        self.assertEqual(deprecated.description, "Description")
        self.assertEqual(deprecated.version, "version")

    def test_str_method(self):
        deprecated = DocstringDeprecated(["arg1", "arg2"], "Description", "version")
        self.assertEqual(str(deprecated), "DocstringDeprecated(version)")

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
        param1 = DocstringParam(["arg1", "arg2"], "Description", "arg_name", "type_name", True, "default")
        param2 = DocstringParam(["arg3", "arg4"], "Description", "arg_name", "type_name", True, "default")
        docstring.meta = [param1, param2]
        self.assertEqual(docstring.params, [param1, param2])

    def test_raises(self):
        docstring = Docstring()
        raises1 = DocstringRaises(["arg1", "arg2"], "Description", "type_name")
        raises2 = DocstringRaises(["arg3", "arg4"], "Description", "type_name")
        docstring.meta = [raises1, raises2]
        self.assertEqual(docstring.raises, [raises1, raises2])

    def test_returns(self):
        docstring = Docstring()
        returns = DocstringReturns(["arg1", "arg2"], "Description", "type_name", True, "return_name")
        docstring.meta = [returns]
        self.assertEqual(docstring.returns, returns)

    def test_deprecation(self):
        docstring = Docstring()
        deprecated = DocstringDeprecated(["arg1", "arg2"], "Description", "version")
        docstring.meta = [deprecated]
        self.assertEqual(docstring.deprecation, deprecated)

if __name__ == '__main__':
    unittest.main()