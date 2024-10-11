from docstring_parser.rest import _build_meta
import unittest
from docstring_parser.rest import *


class TestDocstring(unittest.TestCase):
    def test_short_description(self):
        docstring = Docstring()
        self.assertEqual(docstring.short_description, None)

    def test_blank_after_short_description(self):
        docstring = Docstring()
        self.assertEqual(docstring.blank_after_short_description, None)

    def test_blank_after_long_description(self):
        docstring = Docstring()
        self.assertEqual(docstring.blank_after_long_description, None)

    def test_long_description(self):
        docstring = Docstring()
        self.assertEqual(docstring.long_description, None)

    def test_meta(self):
        docstring = Docstring()
        self.assertEqual(docstring.meta, None)

    def test_parse(self):
        text = ''
        result = parse(text)
        self.assertEqual(result, Docstring())

    def test_build_meta(self):
        args = []
        desc = ''
        result = _build_meta(args, desc)
        self.assertEqual(result, DocstringMeta(args=args, description=desc))

class TestParse(unittest.TestCase):
    def test_parse(self):
        text = "Test"
        result = parse(text)
        self.assertIsInstance(result, Docstring)

class TestBuildMeta(unittest.TestCase):
    def test_build_meta(self):
        args = ["Test"]
        desc = "Test"
        result = _build_meta(args, desc)
        self.assertIsInstance(result, DocstringMeta)

if __name__ == '__main__':
    unittest.main()