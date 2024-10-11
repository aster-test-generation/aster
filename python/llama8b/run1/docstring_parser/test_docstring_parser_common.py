import unittest
from docstring_parser.common import Docstring, DocstringParam, DocstringReturns, DocstringRaises, DocstringDeprecated, ParseError


class TestDocstring(unittest.TestCase):
    def test_init(self):
        docstring = Docstring()
        self.assertIsNone(docstring.short_description)
        self.assertIsNone(docstring.long_description)
        self.assertFalse(docstring.blank_after_short_description)
        self.assertFalse(docstring.blank_after_long_description)
        self.assertEqual(len(docstring.meta), 0)

    def test_params(self):
        docstring = Docstring()
        docstring.meta.append(DocstringParam([], "description", "arg_name", "type_name", True, "default"))
        self.assertEqual(len(docstring.params), 1)

    def test_raises(self):
        docstring = Docstring()
        docstring.meta.append(DocstringRaises([], "description", "type_name"))
        self.assertEqual(len(docstring.raises), 1)

    def test_returns(self):
        docstring = Docstring()
        docstring.meta.append(DocstringReturns([], "description", "type_name", True))
        self.assertEqual(len(docstring.returns), 1)

    def test_deprecation(self):
        docstring = Docstring()
        docstring.meta.append(DocstringDeprecated([], "description", "version"))
        self.assertEqual(len(docstring.deprecation), 1)

    def test_str(self):
        docstring = Docstring()
        docstring.short_description = "short description"
        docstring.long_description = "long description"
        self.assertEqual(str(docstring), "short description\n\nlong description")

    def test_repr(self):
        docstring = Docstring()
        self.assertEqual(repr(docstring), "Docstring()")

    def test_eq(self):
        docstring1 = Docstring()
        docstring2 = Docstring()
        self.assertTrue(docstring1 == docstring2)

    def test_ne(self):
        docstring1 = Docstring()
        docstring2 = object()
        self.assertTrue(docstring1 != docstring2)

if __name__ == '__main__':
    unittest.main()