import unittest
from docstring_parser.numpydoc import NumpydocParser


class TestNumpydocParser(unittest.TestCase):
    def test_parse_short_description(self):
        parser = NumpydocParser()
        docstring = parser.parse("This is a short description.")
        self.assertEqual(docstring.short_description, "This is a short description.")

    def test_parse_long_description(self):
        parser = NumpydocParser()
        docstring = parser.parse("This is a short description.\n\nThis is a long description.")
        self.assertEqual(docstring.long_description, "This is a long description.")

    def test_parse_param(self):
        parser = NumpydocParser()
        docstring = parser.parse("This is a short description.\n\n:param x: This is a parameter.")
        self.assertEqual(docstring.meta[0].arg_name, "a")
        self.assertEqual(docstring.meta[0].description, "This is a parameter.")

    def test_parse_return(self):
        parser = NumpydocParser()
        docstring = parser.parse("This is a short description.\n\n:return: This is a return value.")
        self.assertEqual(docstring.meta[0].description, "This is a return description.")

    def test_parse_private_method(self):
        parser = NumpydocParser()
        docstring = parser.parse("This is a short description.\n\n:private_method: This is a private method.")
        self.assertEqual(docstring.meta[0].description, "This is a private method.")

    def test_parse_protected_method(self):
        parser = NumpydocParser()
        docstring = parser.parse("This is a short description.\n\n:protected_method: This is a protected method.")
        self.assertEqual(docstring.meta[0].description, "This is a protected method.")

    def test_parse_magic_method(self):
        parser = NumpydocParser()
        docstring = parser.parse("This is a short description.\n\n:magic_method: This is a magic method.")
        self.assertEqual(docstring.meta[0].description, "This is a magic method.")

if __name__ == '__main__':
    unittest.main()