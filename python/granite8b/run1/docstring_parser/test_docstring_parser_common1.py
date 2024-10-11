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

    def test_docstring_params(self):
        docstring = Docstring()
        docstring.meta.append(DocstringParam(["param"], "description", "arg_name", "type_name", True, "default"))
        self.assertEqual(len(docstring.params), 1)
        self.assertIsInstance(docstring.params[0], DocstringParam)
        self.assertEqual(docstring.params[0].arg_name, "arg_name")
        self.assertEqual(docstring.params[0].type_name, "type_name")
        self.assertTrue(docstring.params[0].is_optional)
        self.assertEqual(docstring.params[0].default, "default")

    def test_docstring_raises(self):
        docstring = Docstring()
        docstring.meta.append(DocstringRaises(["raises"], "description", "type_name"))
        self.assertEqual(len(docstring.raises), 1)
        self.assertIsInstance(docstring.raises[0], DocstringRaises)
        self.assertEqual(docstring.raises[0].type_name, "type_name")
        self.assertEqual(docstring.raises[0].description, "description")

    def test_docstring_returns(self):
        docstring = Docstring()
        docstring.meta.append(DocstringReturns(["return"], "description", "type_name", False, "return_name"))
        self.assertEqual(len(docstring.returns), 1)
        self.assertIsInstance(docstring.returns[0], DocstringReturns)
        self.assertEqual(docstring.returns[0].type_name, "type_name")
        self.assertEqual(docstring.returns[0].return_name, "return_name")
        self.assertFalse(docstring.returns[0].is_generator)

    def test_docstring_deprecation(self):
        docstring = Docstring()
        docstring.meta.append(DocstringDeprecated(["deprecated"], "description", "version"))
        self.assertEqual(len(docstring.deprecation), 1)
        self.assertIsInstance(docstring.deprecation[0], DocstringDeprecated)
        self.assertEqual(docstring.deprecation[0].version, "version")
        self.assertEqual(docstring.deprecation[0].description, "description")

if __name__ == '__main__':
    unittest.main()