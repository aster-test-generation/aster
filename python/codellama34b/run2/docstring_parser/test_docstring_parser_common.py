import unittest
from docstring_parser.common import *


class TestDocstringMeta(unittest.TestCase):
    def test_docstring_meta(self):
        args = []
        description = ""
        instance = DocstringMeta(args, description)
        self.assertEqual(instance.args, args)
        self.assertEqual(instance.description, description)

class TestDocstringParam(unittest.TestCase):
    def test_docstring_param(self):
        args = []
        description = ""
        arg_name = ""
        type_name = ""
        is_optional = False
        default = ""
        instance = DocstringParam(args, description, arg_name, type_name, is_optional, default)
        self.assertEqual(instance.args, args)
        self.assertEqual(instance.description, description)
        self.assertEqual(instance.arg_name, arg_name)
        self.assertEqual(instance.type_name, type_name)
        self.assertEqual(instance.is_optional, is_optional)
        self.assertEqual(instance.default, default)

class TestDocstringReturns(unittest.TestCase):
    def test_docstring_returns(self):
        args = []
        description = ""
        type_name = ""
        is_generator = False
        return_name = ""
        instance = DocstringReturns(args, description, type_name, is_generator, return_name)
        self.assertEqual(instance.args, args)
        self.assertEqual(instance.description, description)
        self.assertEqual(instance.type_name, type_name)
        self.assertEqual(instance.is_generator, is_generator)
        self.assertEqual(instance.return_name, return_name)

class TestDocstringRaises(unittest.TestCase):
    def test_docstring_raises(self):
        args = []
        description = ""
        type_name = ""
        instance = DocstringRaises(args, description, type_name)
        self.assertEqual(instance.args, args)
        self.assertEqual(instance.description, description)
        self.assertEqual(instance.type_name, type_name)

class TestDocstringDeprecated(unittest.TestCase):
    def test_docstring_deprecated(self):
        args = []
        description = ""
        version = ""
        instance = DocstringDeprecated(args, description, version)
        self.assertEqual(instance.args, args)
        self.assertEqual(instance.description, description)
        self.assertEqual(instance.version, version)

class TestDocstring(unittest.TestCase):
    def test_docstring(self):
        instance = Docstring()
        self.assertEqual(instance.short_description, None)
        self.assertEqual(instance.long_description, None)
        self.assertEqual(instance.blank_after_short_description, False)
        self.assertEqual(instance.blank_after_long_description, False)
        self.assertEqual(instance.meta, [])

    def test_params(self):
        instance = Docstring()
        self.assertEqual(instance.params, [])

    def test_raises(self):
        instance = Docstring()
        self.assertEqual(instance.raises, [])

    def test_returns(self):
        instance = Docstring()
        self.assertEqual(instance.returns, None)

    def test_deprecation(self):
        instance = Docstring()
        self.assertEqual(instance.deprecation, None)

if __name__ == '__main__':
    unittest.main()