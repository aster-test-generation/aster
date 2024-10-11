import unittest
from docstring_parser.common import *

class TestParseError(unittest.TestCase):
    def test_init(self):
        error = ParseError("Error message")
        self.assertEqual(error.args[0], "Error message")

class TestDocstringMeta(unittest.TestCase):
    def test_init(self):
        meta = DocstringMeta(["arg1", "arg2"], "Description")
        self.assertEqual(meta.args, ["arg1", "arg2"])
        self.assertEqual(meta.description, "Description")

class TestDocstringParam(unittest.TestCase):
    def test_init(self):
        param = DocstringParam(
            ["arg1", "arg2"],
            "Description",
            "arg_name",
            "type_name",
            True,
            "default",
        )
        self.assertEqual(param.args, ["arg1", "arg2"])
        self.assertEqual(param.description, "Description")
        self.assertEqual(param.arg_name, "arg_name")
        self.assertEqual(param.type_name, "type_name")
        self.assertEqual(param.is_optional, True)
        self.assertEqual(param.default, "default")

class TestDocstringReturns(unittest.TestCase):
    def test_init(self):
        returns = DocstringReturns(["arg1", "arg2"], "Description", "type_name", True)
        self.assertEqual(returns.args, ["arg1", "arg2"])
        self.assertEqual(returns.description, "Description")
        self.assertEqual(returns.type_name, "type_name")
        self.assertEqual(returns.is_generator, True)

class TestDocstringRaises(unittest.TestCase):
    def test_init(self):
        raises = DocstringRaises(["arg1", "arg2"], "Description", "type_name")
        self.assertEqual(raises.args, ["arg1", "arg2"])
        self.assertEqual(raises.description, "Description")
        self.assertEqual(raises.type_name, "type_name")

class TestDocstringDeprecated(unittest.TestCase):
    def test_init(self):
        deprecated = DocstringDeprecated(["arg1", "arg2"], "Description", "version")
        self.assertEqual(deprecated.args, ["arg1", "arg2"])
        self.assertEqual(deprecated.description, "Description")
        self.assertEqual(deprecated.version, "version")

class TestDocstring(unittest.TestCase):
    def test_init(self):
        docstring = Docstring()
        self.assertEqual(docstring.short_description, None)
        self.assertEqual(docstring.long_description, None)
        self.assertEqual(docstring.blank_after_short_description, False)
        self.assertEqual(docstring.blank_after_long_description, False)
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
        returns = DocstringReturns(["arg1", "arg2"], "Description", "type_name", True)
        docstring.meta.append(returns)
        self.assertEqual(docstring.returns, returns)

    def test_deprecation(self):
        docstring = Docstring()
        deprecated = DocstringDeprecated(["arg1", "arg2"], "Description", "version")
        docstring.meta.append(deprecated)
        self.assertEqual(docstring.deprecation, deprecated)

if __name__ == '__main__':
    unittest.main()