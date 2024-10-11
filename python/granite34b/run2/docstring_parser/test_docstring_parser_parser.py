import unittest
from docstring_parser.parser import parse


class TestDocstringParser(unittest.TestCase):
    def test_parse_function(self):
        docstring = parse("This is a test function.")
        self.assertEqual(docstring.short_description, "This is a test function.")

    def test_parse_class(self):
        docstring = parse("This is a test class.")
        self.assertEqual(docstring.short_description, "This is a test class.")

    def test_parse_method(self):
        docstring = parse("This is a test method.")
        self.assertEqual(docstring.short_description, "This is a test method.")

    def test_parse_private_method(self):
        docstring = parse("This is a private method.")
        self.assertEqual(docstring.short_description, "This is a private method.")

    def test_parse_protected_method(self):
        docstring = parse("This is a protected method.")
        self.assertEqual(docstring.short_description, "This is a protected method.")

    def test_parse_magic_method(self):
        docstring = parse("This is a magic method.")
        self.assertEqual(docstring.short_description, "This is a magic method.")

if __name__ == '__main__':
    unittest.main()