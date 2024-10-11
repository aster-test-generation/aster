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

    def test_private_method(self):
        param = DocstringParam(["arg1", "arg2"], "Description", "arg_name", "type_name", True, "default")
        result = param._DocstringParam__init__(["arg1", "arg2"], "Description", "arg_name", "type_name", True, "default")
        self.assertIsNone(result)

class TestDocstringReturns(unittest.TestCase):
    def test_init(self):
        returns = DocstringReturns(["arg1", "arg2"], "Description", "type_name", True, "return_name")
        self.assertEqual(returns.args, ["arg1", "arg2"])
        self.assertEqual(returns.description, "Description")
        self.assertEqual(returns.type_name, "type_name")
        self.assertEqual(returns.is_generator, True)
        self.assertEqual(returns.return_name, "return_name")

    def test_private_method(self):
        returns = DocstringReturns(["arg1", "arg2"], "Description", "type_name", True, "return_name")
        result = returns._DocstringReturns__init__(["arg1", "arg2"], "Description", "type_name", True, "return_name")
        self.assertIsNone(result)

class TestDocstringRaises(unittest.TestCase):
    def test_init(self):
        raises = DocstringRaises(["arg1", "arg2"], "Description", "type_name")
        self.assertEqual(raises.args, ["arg1", "arg2"])
        self.assertEqual(raises.description, "Description")
        self.assertEqual(raises.type_name, "type_name")

    def test_private_method(self):
        raises = DocstringRaises(["arg1", "arg2"], "Description", "type_name")
        result = raises._DocstringRaises__init__(["arg1", "arg2"], "Description", "type_name")
        self.assertIsNone(result)

class TestDocstringDeprecated(unittest.TestCase):
    def test_init(self):
        deprecated = DocstringDeprecated(["arg1", "arg2"], "Description", "version")
        self.assertEqual(deprecated.args, ["arg1", "arg2"])
        self.assertEqual(deprecated.description, "Description")
        self.assertEqual(deprecated.version, "version")

    def test_private_method(self):
        deprecated = DocstringDeprecated(["arg1", "arg2"], "Description", "version")
        result = deprecated._DocstringDeprecated__init__(["arg1", "arg2"], "Description", "version")
        self.assertIsNone(result)

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
        param = DocstringParam(["arg1", "arg2"], "Description", "arg_name", "type_name", True, "default")
        docstring.meta.append(param)
        self.assertEqual(docstring.params, [param])

    def test_raises(self):
        docstring = Docstring()
        raises = DocstringRaises(["arg1", "arg2"], "Description", "type_name")
        docstring.meta.append(raises)
        self.assertEqual(docstring.raises, [raises])

    def test_returns(self):
        docstring = Docstring()
        returns = DocstringReturns(["arg1", "arg2"], "Description", "type_name", True, "return_name")
        docstring.meta.append(returns)
        self.assertEqual(docstring.returns, returns)

if __name__ == '__main__':
    unittest.main()